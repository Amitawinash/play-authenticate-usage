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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import play.core.routing.Param;
import play.mvc.*;

public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";

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
		return ok(index.render(this.userProvider));
	}

	public Result hereThere() {
		return ok(hereThereHomePage.render(this.userProvider));
	}

	public Result shipment() {
		return ok(updateOrderStatus.render(this.userProvider));
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

						Bson arg0 = new Document("orderStatus", shipmentStatus);

						Bson updateOpration = new Document("$set", arg0);
						orderStatus.updateOne(arg1, updateOpration);
						return ok(success.render("Order Stauts is updated."));
					}

					else {

						return ok(unSuccess.render("Order Is already delivere"));

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

		String orderNumber = request().getQueryString("orderNumber");

		System.out.println("Order Number : " + orderNumber);
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

					System.out.println("Inside If");

					document.getString("orderStatus");
					return ok(success.render("Order Status is : " + document.getString("orderStatus")));

				}

			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render("Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(unSuccess.render("To do "));
	}

	public Result orderAddress() {

		String reciverName = request().getQueryString("reciverName");
		String state = request().getQueryString("state");
		String area = request().getQueryString("area");
		String street = request().getQueryString("street");
		String houseNumber = request().getQueryString("houseNumber");
		String contactNumber = request().getQueryString("contactNumber");

		System.out.println("value of ID " + "reciverName " + reciverName + "state " + state + "area " + area + "street "
				+ street + "houseNumber " + houseNumber + "  contactNumber " + contactNumber);

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase hereThere = mongoClient.getDatabase("hereThere");
		MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
		MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
		ObjectId orderNumber = null;
		try {
			System.out.println("Inside try  : ");

			Document document = new Document("reciverName", reciverName).append("state", state).append("area", area)
					.append("street", street).append("houseNumber", houseNumber).append("contactNumber", contactNumber);

			orderAddress.insertOne(document);
			String status = "Order is registered";
			System.out.println("_id " + document.getObjectId("_id"));
			orderStatus.insertOne(new Document("orderStatus", status).append("_id", document.getObjectId("_id")));

			orderNumber = document.getObjectId("_id");
		}

		catch (Exception e) {
			e.printStackTrace();
			return ok(unSuccess.render("Error Occered "));
		} finally {
			mongoClient.close();
		}

		return ok(payment.render("your Order id : " + orderNumber));
	}

	public Result checkAvailability() {

		String fromPincode = request().getQueryString("fromPincode");
		String toPincode = request().getQueryString("toPincode");

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase db = mongoClient.getDatabase("hereThere");

		MongoCollection<Document> pinCodes = db.getCollection("pincodes");

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

		System.out.println("productList : " + list);

		Gson gson = new GsonBuilder().create();
		JsonElement jsonTree = gson.toJsonTree(list);

		JsonArray productListToJsonArray = jsonTree.getAsJsonArray();

		return ok(selectCourierService.render(productListToJsonArray.toString()));

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