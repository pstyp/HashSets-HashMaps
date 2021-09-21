package com.qa.qacommunity;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {

		
// CREATE	   
		Set<String> hashSet = new HashSet<>();

// ADD	   
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("F");

		System.out.println(hashSet);

// SIZE	   
		System.out.println(hashSet.size());

//// isEmpty	   
		System.out.println(hashSet.isEmpty());

//// REMOVE	   
		hashSet.remove("C");
		System.out.println(hashSet);
////
//// CONTAINS 	   
		System.out.println(hashSet.contains("X"));
//		

//// CLEAR	   
//		hashSet.clear();
//		System.out.println(hashSet);
//		System.out.println(hashSet.isEmpty());
		
		
		
		for(String handle : hashSet) {
			System.out.println(handle);
		}

	

	}
}
