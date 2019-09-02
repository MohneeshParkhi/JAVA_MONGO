package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class DeletingDocument {
	public static void main(String[] args) throws UnknownHostException {
		MongoClient client = new MongoClient("localhost",27017);
		

		MongoCredential credential;
		credential = MongoCredential.createPlainCredential("root", "School", "root".toCharArray());
		System.out.println("Connected to the database successfully");
		DB database = client.getDB("School");

		DBCollection collection = database.getCollection("Student");
		
		// This method selects first document from Collection and provide reference to it.
		DBObject col= collection.findOne();

		
		collection.remove(col);
		
		System.out.println("Deletion of Document is successfull");
		
	}
}
