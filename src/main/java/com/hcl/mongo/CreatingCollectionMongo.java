package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class CreatingCollectionMongo {
	public static void main(String[] args) throws UnknownHostException {
		
		MongoClient client = new MongoClient("localhost",27017);
		
		//MongoCredential cred = MongoCredential.createPlainCredential("School", "root", null);
		
		System.out.println("Connected to Database successfully");
		
		DB database = client.getDB("School");
		
		//boolean auth = database.authenticate("root", "root".toCharArray());
		
//		 database.createCollection("Student",new BasicDBObject());
//		  database.createCollection("Teacher",null);
		 database.createCollection("Subjects",new BasicDBObject());
		 System.out.println("Created Collection");
				
		
	
	}
}
