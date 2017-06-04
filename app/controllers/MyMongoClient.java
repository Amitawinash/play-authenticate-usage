package controllers;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MyMongoClient {
	MongoClient mongoClient;
	MongoDatabase hereThere;

	public static final String HERE_THERE = "hereThere";
	public static final String SENDER_DETAILS = "senderDetails";
	public static final String PINCODES = "pincodes";
	public static final String ORDER_ADDRESS = "orderAddress";
	public static final String ORDER_STATUS = "orderStatus";
	public static final String STATUS_OF_ORDER= "statusOfOrder";
	
	
	public static final String LOCALHOST = "localhost";

	MongoCollection<Document> orderAddress = hereThere.getCollection("orderAddress");
	MongoCollection<Document> orderStatus = hereThere.getCollection("orderStatus");
	MongoCollection<Document> senderDetails = hereThere.getCollection("senderDetails");

	public MyMongoClient() {
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
