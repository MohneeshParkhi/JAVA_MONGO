package com.hcl.mongo;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;


/*
 * 
 * use testingPurposeDatabase;
 * 
 * To list the database, need to insert atleast one document.
 * db.testingPurposeDatabase.insert({id:1,"name":"mohneesh"});

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


public class DropDatabase {
	public static void main(String[] args) throws UnknownHostException {
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("Connection is successfull");
		
		client.dropDatabase("testingPurposeDatabase");
		System.out.println("Droping database is successfull");
	}
}
