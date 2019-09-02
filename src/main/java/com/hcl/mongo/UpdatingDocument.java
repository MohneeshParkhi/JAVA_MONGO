package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class UpdatingDocument {
public static void main(String[] args) throws UnknownHostException {
	MongoClient client = new MongoClient("localhost",27017);
	

	MongoCredential credential;
	credential = MongoCredential.createPlainCredential("root", "School", "root".toCharArray());
	System.out.println("Connected to the database successfully");
	DB database = client.getDB("School");

	DBCollection collection = database.getCollection("Student");
	DBObject col= collection.findOne();
	
	DBObject colUpdate = new BasicDBObject();
	
	colUpdate.put("name", "mohneesh");
	colUpdate.put("designation","software Professional");
	colUpdate.put("salary", "1 crore"); 
	colUpdate.put("Company", "Microsoft" );
	
	collection.update(col, colUpdate);
	
	System.out.println("Updation of record is successfull");
	
	
}
}
