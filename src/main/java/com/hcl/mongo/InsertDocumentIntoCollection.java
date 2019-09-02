package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
// import org.bson.Document;

public class InsertDocumentIntoCollection {
	public static void main(String[] args) throws UnknownHostException {
		MongoClient client = new MongoClient("localhost", 27017);

		MongoCredential credential;
		credential = MongoCredential.createPlainCredential("root", "School", "root".toCharArray());
		System.out.println("Connected to the database successfully");
		DB database = client.getDB("School");

		DBCollection collection = database.getCollection("Student");

		System.out.println("Student Collection is selected successfully");

		
		  DBObject document = new BasicDBObject(); document.put("name","Mohneesh");
		  document.put("designation","Software Professional"); 
		  document.put("Company","HCL"); 
		  collection.insert(document);
		  
		 
		/*
		 * BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
		 * .add("name", "lokesh") .add("website", "howtodoinjava.com");
		 * 
		 * BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder.start()
		 * .add("addressLine1", "Some address") .add("addressLine2", "Karol Bagh")
		 * .add("addressLine3", "New Delhi, India");
		 * 
		 * documentBuilder.add("address", documentBuilderDetail.get());
		 * 
		 * collection.insert(documentBuilder.get());
		 */

		System.out.println("Inserting a document into a Collection");

	}
}
