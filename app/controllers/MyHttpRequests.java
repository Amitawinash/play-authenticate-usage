package controllers;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MyHttpRequests {
	MongoClient mongoClient;
	MongoDatabase hereThere;

	

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
