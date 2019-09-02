package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class ShowAllDatabase {
	public static void main(String[] args) throws UnknownHostException {
		MongoClient client = new MongoClient("localhost",27017);
		
		// MongoCredential credential;
		// credential = MongoCredential.createPlainCredential("root", "School", "root".toCharArray());
		System.out.println("Connected to the database successfully");
		// DB database = client.getDB("School");

		System.out.println(client.getDatabaseNames());
		
	}
}
