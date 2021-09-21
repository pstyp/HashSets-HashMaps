package com.qa.qacommunity;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<String, Integer> nameAndAge = new HashMap<>();

		
// PUT 
		nameAndAge.put("Jordan", 26);
		nameAndAge.put("Alan", 52);
		nameAndAge.put("Pawel", 52);
		
		

		
		
		System.out.println(nameAndAge);
		
// GET
		System.out.println(nameAndAge.get("Jordan"));
		
//// SIZE 		
		System.out.println(nameAndAge.size());
		
//// REMOVE		
		nameAndAge.remove("Alan");
		System.out.println(nameAndAge);
//		
//// FOR-LOOPS	
		
		for (String i : nameAndAge.keySet()) {
		    System.out.println(i);
		}
		for (Integer i : nameAndAge.values()) {
		    System.out.println(i);
		}
		
		for (Entry<String, Integer> i : nameAndAge.entrySet()) {
		    System.out.println(i);
		}
		
}
//
}