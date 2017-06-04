package controllers;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MyHttpRequests {
	MongoClient mongoClient;
	MongoDatabase hereThere;

	public static final String EMAIL_ID = "emailId";
	public static final String USER_EMAIL_ID = "userEmailId";
	public static final String PASSWORD = "password";
	public static final String CONFIRM_PASSWORD = "confirmPassword";
	public static final String OLD_PASSWORD = "oldPassword";
	public static final String _PASSWORD = "newPassword";
	public static final String SEQURITY_ANSWER = "sequrityAnswer";
	
	

	public static final String VALUE = "value";

	public static final String TO_PINCODE = "toPincode";
	public static final String FROM_PINCODE = "fromPincode";
	public static final String SHIPMENT_TYPE = "shipmentType";
	public static final String SHIPMENT_STATUS = "shipmentStatus";

	public static final String RECEIVER_NAME = "reciverName";
	public static final String STATE = "state";
	public static final String ESTIMATED_DATE = "estimatedDate";

	public static final String AREA = "area";
	public static final String STREET = "street";
	public static final String HOUSE_NUMBER = "houseNumber";
	public static final String CONTACT_NUMBER = "contactNumber";

	public static final String ORDER_ID = "orderId";
	public static final String ORDER_NUMBER = "orderNumber";

	public static final String ACTION = "action";
	public static final String FIND_BY_KEY = "findByKey";

	MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
	MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
	MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

	public MyHttpRequests() {
		mongoClient = new MongoClient("localhost", 27017);
		hereThere = mongoClient.getDatabase("hereThere");

	}

	public void closeClient() {
		mongoClient.close();
	}

	public MongoCollection<Document> getCollection(String collectionName) {
		return hereThere.getCollection(collectionName);

	}
}
