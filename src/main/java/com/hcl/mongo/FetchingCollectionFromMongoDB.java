package com.hcl.mongo;

import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class FetchingCollectionFromMongoDB {
	
	
	public static void main(String[] args) throws UnknownHostException {
		
		MongoClient client = new MongoClient("localhost", 27017);
		
		DB database = client.getDB("School");
		
		 //DBCollection collection = database.getCollection("Test");
		
		 // System.out.println("Fetched Collection Name "+ collection.getName());

		 
	    Set<String> col = database.getCollectionNames();	 

	    System.out.println(col);
	    
		/*
		 * System.out.println("Fetching all collection names");
		 * 
		 * Iterator<String> itr = col.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
	           
	    
	}
}
