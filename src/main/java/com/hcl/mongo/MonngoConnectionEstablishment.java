package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class MonngoConnectionEstablishment {
	public static void main(String[] args) throws UnknownHostException {

		// Creating a client
		MongoClient client = new MongoClient("localhost", 27017);

		// Creating crednetials
		MongoCredential credentials;

		credentials = MongoCredential.createPlainCredential("root", "school", "root".toCharArray());

		System.out.println("Connected to database successfully");

		DB database = client.getDB("school");

		System.out.println("Credentials" + credentials);

		System.out.println("Fetching database name using database instance ::   " + database.getName());

	}
}
