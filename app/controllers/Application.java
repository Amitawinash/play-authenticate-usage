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
		return ok(index.render(this.userProvider,""));
	}
	public Result termsAndCondition() {
		return ok(termsAndCondition.render(this.userProvider));
	}
	
	
	public Result contactUs() {
		return ok(index.render(this.userProvider,""));
	}
	public Result aboutUs() {
		return ok(index.render(this.userProvider,""));
	}
	
	
	

	// @Restrict(@Group({Application.USER_ROLE, Application.ADMIN_ROLE}))
	public Result sendSomething() {

		String emailId = request().body().asFormUrlEncoded().get("emailId")[0];
		String password = request().body().asFormUrlEncoded().get("password")[0];
		System.out.println("Value from UI :" + "  userEmailId : " + emailId);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");
		try {

			MongoCursor<Document> cursor = null;
			cursor = senderDetails.find(new Document("userEmailId", emailId)).iterator();
			System.out.println("Inside try  : " + cursor);

			List<String> listOfOrderId = new LinkedList<>();
			while (cursor.hasNext()) {

				Document article = cursor.next();
				System.out.println("inside While loop ::: " + article.containsValue(emailId));
				if (article.containsValue(emailId) && article.containsValue(password)) {

					return ok(sendSomething.render(this.userProvider,emailId, password));

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageError.render(this.userProvider,"Email or passord did not matched."));
	}

	public Result findByEmail(play.mvc.Http.Request request) {

		String userEmailId = request().getQueryString("value");

		System.out.println("Value from UI :" + "  userEmailId " + userEmailId);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

		System.out.println("Outside try  : ");
		MongoCursor<Document> cursor = null;
		cursor = senderDetails.find(new Document("userEmailId", userEmailId)).iterator();
		List<String> listOfOrders = new LinkedList<>();

		try {
			while (cursor.hasNext()) {
				Document article = cursor.next();
				List<String> orderId = (List<String>) article.get("listOfOrder");
				if (!article.containsValue(userEmailId)) {
					return ok(unSuccess.render(userEmailId + " is not correct."));
				}
				System.out.println(" Inside else :: " + article.getString("userEmailId"));

				System.out.println("val :: " + orderId);
				listOfOrders.clear();
				listOfOrders.addAll(orderId);
				System.out.println("Number Of Orders ::" + listOfOrders.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		String numberOfOrders = Integer.toString(listOfOrders.size());
		return ok(findOrderId.render(userEmailId, numberOfOrders, listOfOrders.toString()));
	}

	public Result findByState(play.mvc.Http.Request request) {

		String state = request().getQueryString("value");

		System.out.println("Value from UI :" + "  state " + state);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");

		System.out.println("Outside try  : ");
		MongoCursor<Document> cursor = null;
		cursor = orderAddress.find(new Document("state", state)).iterator();
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
			return ok(unSuccess.render("Pincode" + state + " is not correct."));
		}
		String numberOfOrders = Integer.toString(orderId.size());
		return ok(findOrderId.render(state, numberOfOrders, orderId.toString()));

	}

	public Result findByPincode(play.mvc.Http.Request request) {

		String pincode = request().getQueryString("value");

		System.out.println("Value from UI :" + "  pincode:  " + pincode);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");

		System.out.println("Outside try  : ");
		MongoCursor<Document> cursor = null;
		cursor = orderAddress.find(new Document("toPincode", pincode)).iterator();
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
			return ok(unSuccess.render("Pincode" + pincode + " is not correct."));
		}
		String numberOfOrders = Integer.toString(orderId.size());
		return ok(findOrderId.render(pincode, numberOfOrders, orderId.toString()));
	}

	public Result getAllOrderId() {
		String userEmailId = request().getQueryString("userEmailId");

		System.out.println("Value from UI :" + "  userEmailId " + userEmailId);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

		System.out.println("Outside try  : ");
		MongoCursor<Document> cursor = null;
		cursor = senderDetails.find().iterator();
		List<String> listOfOrders = new ArrayList<>();

		try {

			while (cursor.hasNext()) {

				Document article = cursor.next();
				List<String> orderId = (List<String>) article.get("listOfOrder");
				if (article.containsValue(userEmailId)) {
					System.out.println(" Inside else :: " + article.getString("userEmailId"));

					// List<String> vals = (List<String>)
					// article.get("dateOfAttendedClasses");
					System.out.println("val :: " + orderId);
					listOfOrders.clear();
					listOfOrders.addAll(orderId);
					System.out.println("Number Of Orders ::" + listOfOrders.size());
					String numberOfOrders = Integer.toString(listOfOrders.size());
					return ok(getAllOrderId.render(userEmailId, numberOfOrders, listOfOrders));

				}

				// String numberOfPresentday =
				// Integer.toString(dateOfAttendedClasses.size());

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
		return ok(hereThereHomePageError.render(this.userProvider,userEmailId + " is not correct."));
	}

	public Result success() {

		String userEmailId = request().getQueryString("userEmailId");
		String newPassword = request().getQueryString("newPassword");
		String confirmPassword = request().getQueryString("confirmPassword");

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

		try {
			MongoCursor<Document> cursor = null;
			cursor = senderDetails.find().iterator();
			System.out.println("Inside try  : " + cursor.toString());

			while (cursor.hasNext()) {

				Document article = cursor.next();
				System.out.println("inside While loop ::: " + article);
				if (article.containsValue(userEmailId)) {
					if (newPassword.equals(confirmPassword)) {
						System.out.println("Id exists");

						Bson arg0 = new Document("userEmailId", userEmailId);

						Bson arg1 = new Document("password", newPassword);

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
		String userEmailId = request().getQueryString("userEmailId");
		String oldPassword = request().getQueryString("oldPassword");
		String sequrityAnswer = request().getQueryString("sequrityAnswer");

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

		try {
			MongoCursor<Document> cursor = null;
			cursor = senderDetails.find(new Document("userEmailId", userEmailId)).iterator();
			System.out.println("Inside try  : " + cursor.toString());

			while (cursor.hasNext()) {

				Document article = cursor.next();
				System.out.println("inside While loop ::: " + article);
				if (article.containsValue(userEmailId) && article.containsValue(oldPassword)) {
					System.out.println("Id exists");
					return ok(changePassword.render(userEmailId));
				}
				if (article.containsValue(userEmailId) && article.containsValue(sequrityAnswer)) {
					System.out.println("Id exists");
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
		return ok(forgetPasswordError.render(this.userProvider,"Email or Answer did not match."));
	}

	public Result forgetPassword() {

		return ok(forgetPassword.render(this.userProvider));
	}

	public Result changePassword() {

		return ok(changePassword2.render(this.userProvider));
	}

	public Result transactionDetails(play.mvc.Http.Request request) {
		String orderId = request().getQueryString("orderId");

		System.out.println("Order Number : " + orderId);
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderStatusTable = hereThere.getCollection("orderStatus");
		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatusTable.find().iterator();
			MongoCursor<Document> orderAddressCursor = orderAddress.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				Document documentorderAddress = orderAddressCursor.next();
				System.out.println("Inside While :" + document.containsValue(orderId));
				System.out.println("Order Id : " + document.getObjectId("_id"));
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderId)) {

					System.out.println("id : " + orderId);
					Bson findArgument = new Document("_id", document.getObjectId("_id"));
					String updatedValue = "Payment has done";
					Bson updateArgument = new Document("statusOfOrder", updatedValue);
					Bson updateOpration = new Document("$set", updateArgument);
					orderStatusTable.updateOne(findArgument, updateOpration);

					System.out.println("Inside If");
					String fromPincode = documentorderAddress.getString("fromPincode");
					String toPincode = documentorderAddress.getString("toPincode");
					String shipmentType = documentorderAddress.getString("shipmentType");
					String emailId = documentorderAddress.getString("emailId");
					String reciverName = documentorderAddress.getString("reciverName");
					String state = documentorderAddress.getString("state");
					String area = documentorderAddress.getString("area");
					String street = documentorderAddress.getString("street");
					String houseNumber = documentorderAddress.getString("houseNumber");
					String contactNumber = documentorderAddress.getString("contactNumber");
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
		return ok(successUser.render("transactionCancle"));
	}

	public Result transactions() {
		String action = request().getQueryString("action");
		System.out.println("action value : " + action);
		if (action.equals("Make Payment")) {

			return transactionDetails(request());
		} else if (action.equals("Cancle Order")) {
			return transactionCancle(request());

		} else {

			return getEstimatedDate(request());
		}

	}

	public Result findOrderId() {
		String findByKey = request().getQueryString("findByKey");
		if (findByKey.equals("findByEmail")) {

			return findByEmail(request());
		} else if (findByKey.equals("findByState")) {
			return findByState(request());
		} else if (findByKey.equals("findByPincode")) {
			return findByPincode(request());
		}
		return ok(findOrderId.render("yoo", "noo", "poo"));

	}

	public Result newUser() {
		String userEmailId = request().getQueryString("userEmailId");
		String password = request().getQueryString("password");
		String confirmPassword = request().getQueryString("confirmPassword");
		String sequrityAnswer = request().getQueryString("sequrityAnswer");

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

		try {
			MongoCursor<Document> cursor = null;
			cursor = senderDetails.find(new Document("userEmailId", userEmailId)).iterator();
			System.out.println("Inside try  : " + cursor.toString());

			while (cursor.hasNext()) {

				Document article = cursor.next();
				System.out.println("inside While loop ::: " + article);
				if (article.containsValue(userEmailId)) {

					System.out.println("Id exists");

					return ok(hereThereHomePageError.render(this.userProvider,"User Email ID " + userEmailId + " is already exists."));

				}

			}
			if (password.equals(confirmPassword)) {
				Document document = new Document("userEmailId", userEmailId).append("password", password)
						.append("sequrityAnswer", sequrityAnswer);

				senderDetails.insertOne(document);

			} else {
				return ok(hereThereHomePageError.render(this.userProvider,"Passwords did not match."));

			}
			cursor.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		return ok(hereThereHomePageSuccess.render(this.userProvider,"Email id : " + userEmailId + " is added."));
	}

	public Result getEstimatedDate(play.mvc.Http.Request request) {

		String orderNumber = request().getQueryString("orderNumber");

		System.out.println("Order Number : " + orderNumber);
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				System.out.println("Inside While :" + document.containsValue(orderNumber));
				System.out.println("Order Id : " + document.getObjectId("_id"));
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderNumber)) {

					System.out.println("Inside If");

					document.getString("orderStatus");
					return ok(hereThereHomePageSuccess
							.render(this.userProvider,"Estimated Date of Delivery is : " + document.getString("estimatedDate")));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(hereThereHomePageError.render(this.userProvider,"Error Occered "));
		} finally {
			mongoClient.close();
		}

		System.out.println("Track");
		return ok(hereThereHomePageError.render(this.userProvider,"Oupps...Order Id is wrong."));
	}

	public Result estimatedDate() {
		String orderNumber = request().getQueryString("orderNumber");
		String estimatedDate = request().getQueryString("estimatedDate");

		System.out.println("Order Number : " + orderNumber);
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				System.out.println("Inside While :" + document.containsValue(orderNumber));
				System.out.println("Order Id : " + document.getObjectId("_id"));
				ObjectId id = document.getObjectId("_id");

				if (id.toString().equals(orderNumber)) {

					if (!document.containsValue("delivered")) {
						System.out.println("Inside If");
						Bson arg1 = new Document("_id", document.getObjectId("_id"));

						Bson arg0 = new Document("estimatedDate", estimatedDate);

						Bson updateOpration = new Document("$set", arg0);
						orderStatus.updateOne(arg1, updateOpration);
						return ok(success.render("Order estimated date is updated."));
					}

					else {

						return ok(unSuccess.render("Order Is already delivered"));

					}

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render("Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(unSuccess.render("Order Number not found"));
	}

	public Result payBill(play.mvc.Http.Request request) {
		System.out.println("Pay Bill");
		return ok(successUser.render("Pay Bill"));
	}

	public Result track(play.mvc.Http.Request request) {

		String orderNumber = request().getQueryString("orderNumber");

		System.out.println("Order Number : " + orderNumber);
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				System.out.println("Inside While :" + document.containsValue(orderNumber));
				System.out.println("Order Id : " + document.getObjectId("_id"));
				ObjectId id = document.getObjectId("_id");
				if (id.toString().equals(orderNumber)) {

					System.out.println("Inside If");

					document.getString("orderStatus");
					return ok(hereThereHomePageSuccess.render(this.userProvider,"Order Status is : " + document.getString("statusOfOrder")));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(hereThereHomePageError.render(this.userProvider,"Error Occered "));
		} finally {
			mongoClient.close();
		}

		System.out.println("Track");
		return ok(hereThereHomePageError.render(this.userProvider,"Order Id " + orderNumber + " is wrong."));
	}

	public Result hereThere() {

		return ok(hereThereHomePage.render(this.userProvider));
	}

	@Restrict(@Group(Application.USER_ROLE))
	public Result shipment() {
		return ok(shipment.render(this.userProvider));
	}

	public Result updateOrderStatus() {

		String orderNumber = request().getQueryString("orderNumber");
		String shipmentStatus = request().getQueryString("shipmentStatus");

		System.out.println("Order Number : " + orderNumber + " Order Status : " + shipmentStatus);
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");

		try {
			System.out.println("Inside try  : ");
			MongoCursor<Document> orderStatusCursor = orderStatus.find().iterator();

			while (orderStatusCursor.hasNext()) {

				Document document = orderStatusCursor.next();
				System.out.println("Inside While :" + document.containsValue(orderNumber));
				System.out.println("Order Id : " + document.getObjectId("_id"));
				ObjectId id = document.getObjectId("_id");

				if (id.toString().equals(orderNumber)) {

					if (!document.containsValue("delivered")) {
						System.out.println("Inside If");
						Bson arg1 = new Document("_id", document.getObjectId("_id"));

						Bson arg0 = new Document("statusOfOrder", shipmentStatus);

						Bson updateOpration = new Document("$set", arg0);
						orderStatus.updateOne(arg1, updateOpration);
						return ok(success.render("Order Stauts is updated."));
					}

					else {

						return ok(unSuccess.render("Order Is already delivered"));

					}

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render("Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(unSuccess.render("Order Number not found"));
	}

	public Result orderStatus() {

		String action = request().getQueryString("action");

		if (action.equals("Track")) {

			return track(request());
		} else if (action.equals("Pay Bill")) {
			return payBill(request());

		} else {

			return getEstimatedDate(request());
		}

		// return ok(unSuccess.render("To do "));
	}

	public Result payment() {

		String shipmentType = request().getQueryString("shipmentType");
		String orderId = request().getQueryString("orderId");
		String price = null;
		if (shipmentType.equals("DHL")) {
			System.out.println(shipmentType == "DHL");
			price = "100";
		}
		if (shipmentType.equals("DTDC")) {
			System.out.println(shipmentType == "DTDC");
			price = "200";
		}
		if (shipmentType.equals("AirPost")) {
			System.out.println(shipmentType == "AirPost");
			price = "300";
		}
		System.out.println("value of ID " + " shipmentType: " + shipmentType);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
		ObjectId orderNumber = null;

		MongoCursor<Document> orderAddresssCursor = orderAddress.find().iterator();

		try {

			while (orderAddresssCursor.hasNext()) {

				Document document = orderAddresssCursor.next();
				ObjectId id = document.getObjectId("_id");

				if (!document.containsValue("delivered")) {

					System.out.println("Order Id : " + document.getObjectId("_id"));

					System.out.println("Inside If");
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

		String fromPincode = request().getQueryString("fromPincode");
		String toPincode = request().getQueryString("toPincode");
		String shipmentType = request().getQueryString("shipmentType");
		String emailId = request().getQueryString("emailId");
		String password = request().getQueryString("password");
		String reciverName = request().getQueryString("reciverName");
		String state = request().getQueryString("state");
		String area = request().getQueryString("area");
		String street = request().getQueryString("street");
		String houseNumber = request().getQueryString("houseNumber");
		String contactNumber = request().getQueryString("contactNumber");

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> pinCodes = hereThere.getCollection("pincodes");
		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
		MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");
		ObjectId orderNumber = null;

		BsonDocument queryJson = new BsonDocument();
		queryJson.append("pincode", new BsonString(fromPincode));

		BsonDocument queryJson1 = new BsonDocument();
		queryJson1.append("pincode", new BsonString(toPincode));

		FindIterable<Document> findIterable = pinCodes.find(queryJson);
		FindIterable<Document> findIterable2 = pinCodes.find(queryJson1);

		findIterable.forEach(new Block<Document>() {

			@Override
			public void apply(final Document document) {
				System.out.println(document);

			}
		});

		findIterable2.forEach(new Block<Document>() {

			@Override
			public void apply(final Document document) {
				System.out.println(document);

			}
		});

		List<String> list = new ArrayList<>();
		for (Document document : findIterable) {

			List<String> productList = new ArrayList<>();
			productList = document.get("products", productList.getClass());

			for (Document document2 : findIterable2) {
				List<String> productList2 = new ArrayList<>();
				productList2 = document2.get("products", productList.getClass());

				for (String p1 : productList) {

					for (String p2 : productList2) {
						if (p1.equals(p2)) {
							list.add(p1);
						}

					}

				}

			}

		}

		if (list.equals(null) || list.isEmpty()) {

			return ok(unSuccessUser.render("No Service For Given Pincode."));
		}
		String orderId = null;
		try {

			MongoCursor<Document> cursor = null;
			cursor = senderDetails.find(new Document("userEmailId", emailId)).iterator();
			System.out.println("Inside try  : " + cursor);

			List<String> listOfOrderId = new LinkedList<>();
			while (cursor.hasNext()) {

				Document article = cursor.next();
				System.out.println("inside While loop ::: " + article.containsValue(emailId));
				if (article.containsValue(emailId) && article.containsValue(password)) {

					System.out.println("Id exists " + article.containsValue(emailId));

					System.out.println("Inside try  : ");

					Document document = new Document("fromPincode", fromPincode).append("toPincode", toPincode)
							.append("shipmentType", shipmentType).append("emailId", emailId)
							.append("reciverName", reciverName).append("state", state).append("area", area)
							.append("street", street).append("houseNumber", houseNumber)
							.append("contactNumber", contactNumber);

					orderAddress.insertOne(document);
					String statusOfOrder = "Payment has not completed";
					String estimatedDate = "under process";
					System.out.println("_id " + document.getObjectId("_id"));
					orderStatus.insertOne(new Document("_id", document.getObjectId("_id"))
							.append("statusOfOrder", statusOfOrder).append("estimatedDate", estimatedDate));

					if (!article.containsKey("listOfOrder")) {
						System.out.println("Inside 2nd if ::" + article.containsKey("listOfOrder"));
						listOfOrderId.add(document.getObjectId("_id").toString());
						System.out.println("Id value ::" + document.getObjectId("_id").toString());
						Bson arg1 = new Document("userEmailId", emailId);

						Bson arg0 = new Document("listOfOrder", listOfOrderId);
						System.out.println("value of listOfOrderId " + listOfOrderId);
						Bson updateOpration = new Document("$set", arg0);
						senderDetails.updateOne(arg1, updateOpration);

					}

					else {

						List<String> vals = (List<String>) article.get("listOfOrder");

						// List<String> vals = new ArrayList<>();
						// vals.add(article.get("listOfOrder"));
						System.out.println("inside Else Value of vals ::  " + vals);

						listOfOrderId.add(document.getObjectId("_id").toString());
						vals.addAll(listOfOrderId);
						System.out.println("Number Of Order ::" + listOfOrderId.size());

						Bson arg0 = new Document("userEmailId", emailId);
						Bson arg1 = new Document("listOfOrder", vals);
						System.out.println("Final value of vals:: " + vals);
						Bson updateOpration = new Document("$set", arg1);

						senderDetails.updateOne(arg0, updateOpration);

					}

					orderId = document.getObjectId("_id").toString();

					System.out.println("productList : " + list);

					Gson gson = new GsonBuilder().create();
					JsonElement jsonTree = gson.toJsonTree(list);

					JsonArray productListToJsonArray = jsonTree.getAsJsonArray();
					return ok(selectCourierService.render(this.userProvider,list, orderId));

				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}

		System.out.println("productList : " + list);

		Gson gson = new GsonBuilder().create();
		JsonElement jsonTree = gson.toJsonTree(list);

		JsonArray productListToJsonArray = jsonTree.getAsJsonArray();

		return ok(unSuccessUser.render("Your email id is not registered."));

	}

	@Restrict(@Group(Application.USER_ROLE))
	public Result restricted() {
		final User localUser = this.userProvider.getUser(session());
		return ok(restricted.render(this.userProvider, localUser));
	}

	@Restrict(@Group(Application.USER_ROLE))
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
			// User did not fill everything properly
			return badRequest(login.render(this.auth, this.userProvider, filledForm));
		} else {
			// Everything was filled
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
			// User did not fill everything properly
			return badRequest(signup.render(this.auth, this.userProvider, filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup
			return this.provider.handleSignup(ctx());
		}
	}
}