package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.feth.play.module.pa.PlayAuthenticate;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;
import service.UserProvider;
import utils.HttpRequestsUtils;
import utils.MongoClientUtils;
import views.html.*;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_EXCLUSIONPeer;

import play.api.mvc.Request;
import play.core.routing.Param;
import play.mvc.*;

public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";
	public static final String ADMIN_ROLE = "admin";

	private final PlayAuthenticate auth;

	private final MyUsernamePasswordAuthProvider provider;

	private final UserProvider userProvider;

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

	@Inject
	public Application(final PlayAuthenticate auth, final MyUsernamePasswordAuthProvider provider,
			final UserProvider userProvider) {
		this.auth = auth;
		this.provider = provider;
		this.userProvider = userProvider;
	}

	public Result index() {
		return ok(index.render(this.userProvider, ""));
	}

	public Result termsAndCondition() {
		return ok(termsAndCondition.render(this.userProvider));
	}

	public Result contactUs() {
		return ok(contactUs.render(this.userProvider, "amitawinash@gmail.com"));
	}

	public Result aboutUs() {
		return ok(aboutUs.render(this.userProvider, ""));
	}

	// Below line is commnented because it can be use in application for user
	// ROLE.
	// @Restrict(@Group({Application.USER_ROLE, Application.ADMIN_ROLE}))
	public Result sendSomething() {

		String emailId = request().body().asFormUrlEncoded().get(HttpRequestsUtils.EMAIL_ID)[0];
		String password = request().body().asFormUrlEncoded().get(HttpRequestsUtils.PASSWORD)[0];
//
//		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
//		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
//
//		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);
//		
//		

		MyMongoClient mongoClient = new MyMongoClient();
		MongoCollection<Document> senderDetails = mongoClient.getMongoCollection(MongoClientUtils.SENDER_DETAILS);

		try {

			MongoCursor<Document> cursor = senderDetails.find(new Document(HttpRequestsUtils.USER_EMAIL_ID, emailId))
					.iterator();

			List<String> listOfOrderId = new LinkedList<>();
			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(emailId) && article.containsValue(password)) {

					return ok(sendSomething.render(this.userProvider, emailId, password));

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageError.render(this.userProvider, "Email or passord did not matched."));
	}

	public Result findByEmail(play.mvc.Http.Request request) {

		String userEmailId = request().getQueryString(HttpRequestsUtils.VALUE);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);

		MongoCursor<Document> cursor = senderDetails.find(new Document(HttpRequestsUtils.USER_EMAIL_ID, userEmailId))
				.iterator();

		List<String> listOfOrders = new LinkedList<>();

		try {
			while (cursor.hasNext()) {
				Document article = cursor.next();
				List<String> orderId = (List<String>) article.get("listOfOrder");
				if (!article.containsValue(userEmailId)) {
					return ok(unSuccess.render(this.userProvider, userEmailId + " is not correct."));
				}
				listOfOrders.clear();
				listOfOrders.addAll(orderId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		String numberOfOrders = Integer.toString(listOfOrders.size());
		return ok(findOrderId.render(this.userProvider, userEmailId, numberOfOrders, listOfOrders.toString()));
	}

	public Result findByState(play.mvc.Http.Request request) {

		String state = request().getQueryString(HttpRequestsUtils.VALUE);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);

		MongoCursor<Document> cursor = orderAddress.find(new Document(HttpRequestsUtils.STATE, state)).iterator();

		List<String> orderId = new LinkedList<>();
		try {

			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(state)) {
					orderId.add(article.getObjectId("_id").toString());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		if (orderId.equals(null) || orderId.isEmpty()) {
			return ok(unSuccess.render(this.userProvider, "Pincode" + state + " is not correct."));
		}
		String numberOfOrders = Integer.toString(orderId.size());
		return ok(findOrderId.render(this.userProvider, state, numberOfOrders, orderId.toString()));

	}

	public Result findByPincode(play.mvc.Http.Request request) {

		String pincode = request().getQueryString(HttpRequestsUtils.VALUE);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);

		MongoCursor<Document> cursor = orderAddress.find(new Document(HttpRequestsUtils.TO_PINCODE, pincode))
				.iterator();

		List<String> orderId = new LinkedList<>();
		try {

			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(pincode)) {
					orderId.add(article.getObjectId("_id").toString());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		if (orderId.equals(null) || orderId.isEmpty()) {
			return ok(unSuccess.render(this.userProvider, "Pincode" + pincode + " is not correct."));
		}
		String numberOfOrders = Integer.toString(orderId.size());
		return ok(findOrderId.render(this.userProvider, pincode, numberOfOrders, orderId.toString()));
	}

	public Result getAllOrderId() {
		String userEmailId = request().getQueryString(HttpRequestsUtils.USER_EMAIL_ID);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);

		MongoCursor<Document> cursor = senderDetails.find().iterator();

		List<String> listOfOrders = new ArrayList<>();

		try {

			while (cursor.hasNext()) {

				Document article = cursor.next();
				List<String> orderId = (List<String>) article.get("listOfOrder");
				if (article.containsValue(userEmailId)) {
					listOfOrders.clear();
					listOfOrders.addAll(orderId);
					String numberOfOrders = Integer.toString(listOfOrders.size());
					return ok(getAllOrderId.render(userEmailId, numberOfOrders, listOfOrders));

				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		return ok(hereThereHomePageError.render(this.userProvider, userEmailId + " is not correct."));
	}

	public Result success() {

		String userEmailId = request().getQueryString(HttpRequestsUtils.USER_EMAIL_ID);
		String newPassword = request().getQueryString(HttpRequestsUtils.NEW_PASSWORD);
		String confirmPassword = request().getQueryString(HttpRequestsUtils.CONFIRM_PASSWORD);

		MyMongoClient mongoClient = new MyMongoClient();
		MongoCollection<Document> senderDetails = mongoClient.getMongoCollection(MongoClientUtils.SENDER_DETAILS);

		try {
			MongoCursor<Document> cursor = senderDetails.find().iterator();

			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(userEmailId)) {
					if (newPassword.equals(confirmPassword)) {

						Bson arg0 = new Document(HttpRequestsUtils.USER_EMAIL_ID, userEmailId);

						Bson arg1 = new Document(HttpRequestsUtils.PASSWORD, newPassword);

						Bson updateOpration = new Document("$set", arg1);

						senderDetails.updateOne(arg0, updateOpration);
						return ok(successUser.render("Password has changed for email id : " + userEmailId));
					}
				}
			}
			cursor.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		return ok(successUser.render("Password has not changed.Kindly check your email Id."));
	}

	public Result newPassword() {
		String userEmailId = request().getQueryString(HttpRequestsUtils.USER_EMAIL_ID);
		String oldPassword = request().getQueryString(HttpRequestsUtils.OLD_PASSWORD);
		String sequrityAnswer = request().getQueryString(HttpRequestsUtils.SEQURITY_ANSWER);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);

		try {
			MongoCursor<Document> cursor = senderDetails
					.find(new Document(HttpRequestsUtils.USER_EMAIL_ID, userEmailId)).iterator();

			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(userEmailId) && article.containsValue(oldPassword)) {
					return ok(changePassword.render(userEmailId));
				}
				if (article.containsValue(userEmailId) && article.containsValue(sequrityAnswer)) {
					return ok(changePassword.render(userEmailId));
				}
			}

			cursor.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		return ok(forgetPasswordError.render(this.userProvider, "Email or Answer did not match."));
	}

	public Result forgetPassword() {

		return ok(forgetPassword.render(this.userProvider));
	}

	public Result changePassword() {

		return ok(changePassword2.render(this.userProvider));
	}

	public Result transactionDetails(play.mvc.Http.Request request) {
		String orderId = request().getQueryString(HttpRequestsUtils.ORDER_ID);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderStatusTable = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);
		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);

		try {
			MongoCursor<Document> orderStatusCursor = orderStatusTable.find().iterator();
			MongoCursor<Document> orderAddressCursor = orderAddress.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				Document documentorderAddress = orderAddressCursor.next();
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderId)) {

					Bson findArgument = new Document("_id", document.getObjectId("_id"));
					String updatedValue = "Payment has done";
					Bson updateArgument = new Document(MongoClientUtils.STATUS_OF_ORDER, updatedValue);
					Bson updateOpration = new Document("$set", updateArgument);
					orderStatusTable.updateOne(findArgument, updateOpration);
					// Variables are created but not used because UI is not
					// ready
					String fromPincode = documentorderAddress.getString(HttpRequestsUtils.FROM_PINCODE);
					String toPincode = documentorderAddress.getString(HttpRequestsUtils.TO_PINCODE);
					String shipmentType = documentorderAddress.getString(HttpRequestsUtils.SHIPMENT_TYPE);
					String emailId = documentorderAddress.getString(HttpRequestsUtils.EMAIL_ID);
					String reciverName = documentorderAddress.getString(HttpRequestsUtils.RECEIVER_NAME);
					String state = documentorderAddress.getString(HttpRequestsUtils.STATE);
					String area = documentorderAddress.getString(HttpRequestsUtils.AREA);
					String street = documentorderAddress.getString(HttpRequestsUtils.STATE);
					String houseNumber = documentorderAddress.getString(HttpRequestsUtils.HOUSE_NUMBER);
					String contactNumber = documentorderAddress.getString(HttpRequestsUtils.CONTACT_NUMBER);
					String orderStatus = document.getString("orderStatus");
					return ok(transactions.render(document.getString("statusOfOrder"), fromPincode, toPincode,
							shipmentType));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccessUser.render("Error Occered "));
		} finally {
			mongoClient.close();
		}

		System.out.println("Track");
		return ok(unSuccessUser.render("Order Id is wrong."));
	}

	public Result transactionCancle(play.mvc.Http.Request request) {
		return ok(hereThereHomePageError.render(this.userProvider, "Your have cancled your Order."));
	}

	public Result transactions() {
		String action = request().getQueryString(HttpRequestsUtils.ACTION);
		if (action.equals("Make Payment")) {

			return transactionDetails(request());
		} else if (action.equals("Cancle Order")) {
			return transactionCancle(request());

		} else {

			return getEstimatedDate(request());
		}

	}

	public Result findOrderId() {
		String findByKey = request().getQueryString(HttpRequestsUtils.FIND_BY_KEY);
		if (findByKey.equals("findByEmail")) {

			return findByEmail(request());
		} else if (findByKey.equals("findByState")) {
			return findByState(request());
		} else if (findByKey.equals("findByPincode")) {
			return findByPincode(request());
		}
		return ok(findOrderId.render(this.userProvider, "", "", ""));

	}

	public Result newUser() {
		String userEmailId = request().getQueryString(HttpRequestsUtils.USER_EMAIL_ID);
		String password = request().getQueryString(HttpRequestsUtils.PASSWORD);
		String confirmPassword = request().getQueryString(HttpRequestsUtils.CONFIRM_PASSWORD);
		String sequrityAnswer = request().getQueryString(HttpRequestsUtils.SEQURITY_ANSWER);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);

		try {
			MongoCursor<Document> cursor = senderDetails
					.find(new Document(HttpRequestsUtils.USER_EMAIL_ID, userEmailId)).iterator();

			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(userEmailId)) {

					return ok(hereThereHomePageError.render(this.userProvider,
							"User Email ID " + userEmailId + " is already exists."));

				}

			}
			if (password.equals(confirmPassword)) {
				Document document = new Document(HttpRequestsUtils.USER_EMAIL_ID, userEmailId)
						.append(HttpRequestsUtils.PASSWORD, password)
						.append(HttpRequestsUtils.SEQURITY_ANSWER, sequrityAnswer);

				senderDetails.insertOne(document);

			} else {
				return ok(hereThereHomePageError.render(this.userProvider, "Passwords did not match."));

			}
			cursor.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageSuccess.render(this.userProvider, "Email id : " + userEmailId + " is added."));
	}

	public Result getEstimatedDate(play.mvc.Http.Request request) {

		String orderNumber = request().getQueryString(HttpRequestsUtils.ORDER_NUMBER);
		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderStatus = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);

		try {
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderNumber)) {

					System.out.println("Inside If");

					document.getString("orderStatus");
					return ok(hereThereHomePageSuccess.render(this.userProvider,
							"Estimated Date of Delivery is : " + document.getString("estimatedDate")));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(hereThereHomePageError.render(this.userProvider, "Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageError.render(this.userProvider, "Oupps...Order Id is wrong."));
	}

	public Result estimatedDate() {
		String orderNumber = request().getQueryString(HttpRequestsUtils.ORDER_NUMBER);
		String estimatedDate = request().getQueryString(HttpRequestsUtils.ESTIMATED_DATE);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderStatus = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);

		try {
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				ObjectId id = document.getObjectId("_id");

				if (id.toString().equals(orderNumber)) {

					if (!document.containsValue("delivered")) {
						Bson arg1 = new Document("_id", document.getObjectId("_id"));

						Bson arg0 = new Document("estimatedDate", estimatedDate);

						Bson updateOpration = new Document("$set", arg0);
						orderStatus.updateOne(arg1, updateOpration);
						return ok(success.render(this.userProvider, "Shipment date is updated."));
					}

					else {

						return ok(unSuccess.render(this.userProvider, "Order Is already delivered"));

					}

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render(this.userProvider, "Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(unSuccess.render(this.userProvider, "Order Number not found"));
	}

	public Result payBill(play.mvc.Http.Request request) {
		return ok(successUser.render("Pay Bill"));
	}

	public Result track(play.mvc.Http.Request request) {

		String orderNumber = request().getQueryString(HttpRequestsUtils.ORDER_NUMBER);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderStatus = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);

		try {
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderNumber)) {

					System.out.println("Inside If");

					document.getString("orderStatus");
					return ok(hereThereHomePageSuccess.render(this.userProvider,
							"Order Status is : " + document.getString("statusOfOrder")));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(hereThereHomePageError.render(this.userProvider, "Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageError.render(this.userProvider, "Order Id " + orderNumber + " is wrong."));
	}

	public Result hereThere() {

		return ok(hereThereHomePage.render(this.userProvider));
	}

	// will be use in application for user or admin role/access.
	@Restrict(@Group(Application.ADMIN_ROLE))
	public Result shipment() {
		return ok(shipment.render(this.userProvider));
	}

	public Result updateOrderStatus() {

		String orderNumber = request().getQueryString(HttpRequestsUtils.ORDER_NUMBER);
		String shipmentStatus = request().getQueryString(HttpRequestsUtils.SHIPMENT_STATUS);

		System.out.println("Order Number : " + orderNumber + " Order Status : " + shipmentStatus);
		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);
		MongoCollection<Document> orderStatus = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				ObjectId id = document.getObjectId("_id");

				if (id.toString().equals(orderNumber)) {

					if (!document.containsValue("delivered")) {
						Bson arg1 = new Document("_id", document.getObjectId("_id"));

						Bson arg0 = new Document("statusOfOrder", shipmentStatus);

						Bson updateOpration = new Document("$set", arg0);
						orderStatus.updateOne(arg1, updateOpration);
						return ok(success.render(this.userProvider, "Order Stauts is updated."));
					}

					else {

						return ok(unSuccess.render(this.userProvider, "Order Is already delivered"));

					}

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render(this.userProvider, "Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(unSuccess.render(this.userProvider, "Order Number not found"));
	}

	public Result orderStatus() {

		String action = request().getQueryString(HttpRequestsUtils.ACTION);

		if (action.equals("Track")) {

			return track(request());
		} else if (action.equals("Pay Bill")) {
			return payBill(request());

		} else {

			return getEstimatedDate(request());
		}

	}

	public Result payment() {

		String shipmentType = request().getQueryString(HttpRequestsUtils.SHIPMENT_TYPE);
		String orderId = request().getQueryString(HttpRequestsUtils.ORDER_ID);
		String price = null;
		if (shipmentType.equals("DHL")) {
			price = "100";
		}
		if (shipmentType.equals("DTDC")) {
			price = "200";
		}
		if (shipmentType.equals("AirPost")) {
			price = "300";
		}

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);
		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
		ObjectId orderNumber = null;

		MongoCursor<Document> orderAddresssCursor = orderAddress.find().iterator();

		try {

			while (orderAddresssCursor.hasNext()) {

				Document document = orderAddresssCursor.next();
				ObjectId id = document.getObjectId("_id");

				if (!document.containsValue("delivered")) {

					Bson arg1 = new Document("_id", document.getObjectId("_id"));

					Bson arg0 = new Document("reciverName", shipmentType);

					Bson updateOpration = new Document("$set", arg0);
					orderAddress.updateOne(arg1, updateOpration);
					return ok(payment.render(orderId, price));

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			orderAddresssCursor.close();
			mongoClient.close();
		}
		return ok(payment.render(orderId, price));
	}

	@SuppressWarnings("unchecked")
	public Result checkAvailability() {

		String fromPincode = request().getQueryString(HttpRequestsUtils.FROM_PINCODE);
		String toPincode = request().getQueryString(HttpRequestsUtils.TO_PINCODE);
		String shipmentType = request().getQueryString(HttpRequestsUtils.SHIPMENT_TYPE);
		String emailId = request().getQueryString(HttpRequestsUtils.EMAIL_ID);
		String password = request().getQueryString(HttpRequestsUtils.PASSWORD);
		String reciverName = request().getQueryString(HttpRequestsUtils.RECEIVER_NAME);
		String state = request().getQueryString(HttpRequestsUtils.STATE);
		String area = request().getQueryString(HttpRequestsUtils.AREA);
		String street = request().getQueryString(HttpRequestsUtils.STREET);
		String houseNumber = request().getQueryString(HttpRequestsUtils.HOUSE_NUMBER);
		String contactNumber = request().getQueryString(HttpRequestsUtils.CONTACT_NUMBER);

		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, 27017);
		MongoDatabase hereThere = mongoClient.getDatabase(MongoClientUtils.HERE_THERE);

		MongoCollection<Document> pinCodes = hereThere.getCollection(MongoClientUtils.PINCODES);
		MongoCollection<Document> orderAddress = hereThere.getCollection(MongoClientUtils.ORDER_ADDRESS);
		MongoCollection<Document> orderStatus = hereThere.getCollection(MongoClientUtils.ORDER_STATUS);
		MongoCollection<Document> senderDetails = hereThere.getCollection(MongoClientUtils.SENDER_DETAILS);
		ObjectId orderNumber = null;

		BsonDocument queryJson = new BsonDocument();
		queryJson.append("pincode", new BsonString(fromPincode));

		BsonDocument queryJson1 = new BsonDocument();
		queryJson1.append("pincode", new BsonString(toPincode));

		FindIterable<Document> senderDoc = pinCodes.find(queryJson);
		FindIterable<Document> receiverDoc = pinCodes.find(queryJson1);

		senderDoc.forEach(new Block<Document>() {

			@Override
			public void apply(final Document document) {
				System.out.println(document);

			}
		});

		receiverDoc.forEach(new Block<Document>() {

			@Override
			public void apply(final Document document) {
				System.out.println(document);

			}
		});

		List<String> matchedProducts = new ArrayList<>();
		for (Document senderOprator : senderDoc) {

			List<String> senderProducts = new ArrayList<>();
			senderProducts = senderOprator.get("products", senderProducts.getClass());

			for (Document receiverOperator : receiverDoc) {
				List<String> receiverProduct = new ArrayList<>();
				receiverProduct = receiverOperator.get("products", senderProducts.getClass());

				for (String senderProductName : senderProducts) {

					for (String receiverProductName : receiverProduct) {
						if (senderProductName.equals(receiverProductName)) {
							matchedProducts.add(senderProductName);
						}

					}

				}

			}

		}

		if (matchedProducts.equals(null) || matchedProducts.isEmpty()) {

			return ok(unSuccessUser.render("No Service For Given Pincode."));
		}
		String orderId = null;
		try {

			MongoCursor<Document> cursor = senderDetails.find(new Document(HttpRequestsUtils.USER_EMAIL_ID, emailId))
					.iterator();
			List<String> listOfOrderId = new LinkedList<>();
			while (cursor.hasNext()) {

				Document article = cursor.next();
				if (article.containsValue(emailId) && article.containsValue(password)) {

					Document document = new Document(HttpRequestsUtils.FROM_PINCODE, fromPincode)
							.append("toPincode", toPincode).append("shipmentType", shipmentType)
							.append("emailId", emailId).append("reciverName", reciverName).append("state", state)
							.append("area", area).append("street", street).append("houseNumber", houseNumber)
							.append("contactNumber", contactNumber);

					orderAddress.insertOne(document);
					String statusOfOrder = "Payment has not completed";
					String estimatedDate = "under process";
					orderStatus.insertOne(new Document("_id", document.getObjectId("_id"))
							.append("statusOfOrder", statusOfOrder).append("estimatedDate", estimatedDate));

					if (!article.containsKey("listOfOrder")) {
						listOfOrderId.add(document.getObjectId("_id").toString());
						Bson arg1 = new Document(HttpRequestsUtils.USER_EMAIL_ID, emailId);

						Bson arg0 = new Document("listOfOrder", listOfOrderId);
						Bson updateOpration = new Document("$set", arg0);
						senderDetails.updateOne(arg1, updateOpration);

					}

					else {

						List<String> vals = (List<String>) article.get("listOfOrder");

						listOfOrderId.add(document.getObjectId("_id").toString());
						vals.addAll(listOfOrderId);

						Bson arg0 = new Document(HttpRequestsUtils.USER_EMAIL_ID, emailId);
						Bson arg1 = new Document("listOfOrder", vals);
						Bson updateOpration = new Document("$set", arg1);

						senderDetails.updateOne(arg0, updateOpration);

					}

					orderId = document.getObjectId("_id").toString();

					System.out.println("productList : " + matchedProducts);

					Gson gson = new GsonBuilder().create();
					JsonElement jsonTree = gson.toJsonTree(matchedProducts);

					JsonArray productListToJsonArray = jsonTree.getAsJsonArray();
					return ok(selectCourierService.render(this.userProvider, matchedProducts, orderId));

				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		System.out.println("productList : " + matchedProducts);

		Gson gson = new GsonBuilder().create();
		JsonElement jsonTree = gson.toJsonTree(matchedProducts);

		JsonArray productListToJsonArray = jsonTree.getAsJsonArray();

		return ok(unSuccessUser.render("Your email id is not registered."));

	}

	@Restrict(@Group(Application.ADMIN_ROLE))
	public Result restricted() {
		final User localUser = this.userProvider.getUser(session());
		return ok(restricted.render(this.userProvider, localUser));
	}

	@Restrict(@Group(Application.ADMIN_ROLE))
	public Result profile() {
		final User localUser = userProvider.getUser(session());
		return ok(profile.render(this.auth, this.userProvider, localUser));
	}

	public Result login() {
		return ok(login.render(this.auth, this.userProvider, this.provider.getLoginForm()));
	}

	public Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = this.provider.getLoginForm().bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(login.render(this.auth, this.userProvider, filledForm));
		} else {
			return this.provider.handleLogin(ctx());
		}
	}

	public Result signup() {
		return ok(signup.render(this.auth, this.userProvider, this.provider.getSignupForm()));
	}

	public Result jsRoutes() {
		return ok(play.routing.JavaScriptReverseRouter.create("jsRoutes", routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");

	}

	public Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = this.provider.getSignupForm().bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(signup.render(this.auth, this.userProvider, filledForm));
		} else {

			return this.provider.handleSignup(ctx());
		}
	}
}