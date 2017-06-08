package controllers;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import utils.MongoClientUtils;

public class MyMongoClient {
	// MongoClient mongoClient;
	// MongoDatabase hereThere;
	//
	//
	// MongoCollection<Document> orderAddress =
	// hereThere.getCollection("orderAddress");
	// MongoCollection<Document> orderStatus =
	// hereThere.getCollection("orderStatus");
	// MongoCollection<Document> senderDetails =
	// hereThere.getCollection("senderDetails");
	//
	// public MyMongoClient() {
	// mongoClient = new MongoClient("localhost", 27017);
	// hereThere = mongoClient.getDatabase("hereThere");
	//
	// }
	//
	// public void closeClient() {
	// mongoClient.close();
	// }
	//
	// public MongoCollection<Document> getCollection(String collectionName) {
	// return hereThere.getCollection(collectionName);
	//
	// }


	private MongoClient getMongoClient() {
		MongoClient mongoClient = new MongoClient(MongoClientUtils.LOCALHOST, MongoClientUtils.PORT_NUMBER);
		return mongoClient;
	}

	private MongoDatabase getMongoDatabse() {
		MongoDatabase mongoDatabase = getMongoClient().getDatabase(MongoClientUtils.HERE_THERE);
		return mongoDatabase;
	}

	public MongoCollection<Document> getMongoCollection(String collectionName) {
		MongoCollection<Document> collection = getMongoDatabse().getCollection(collectionName);
		
		return collection;
	}

}
