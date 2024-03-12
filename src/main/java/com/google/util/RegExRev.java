package com.google.util;

public class RegExRev {

	public static void main(String[] args) {

		// format of the data ->

		// regEx

		String firstName = "RaAAAm";// alphabet => a-z A-Z
		String age = "12a";// number - digit

		String regEx = "[AA-Za-z0-9]+";// from this all i will accept min:1 and max:n
		// wild ->  
		//+ min : 1 , max : n 
		//* min : 0 , max : n 
		//? min : 0 , max : 1 
		
		
		String alpha = "[a-zA-Z]+";
		String digit  = "[0-9]+"; 
		
		//min:2,max:8 -> userName 
		
		String userName = "[a-zA-Z0-9]{2,8}";//min:2 max:8 
		

		//email-> XXXXX@XXXX.XXX 
		
		String email = "[a-zA-Z0-9_]+@[a-zA-Z]+.[a-zA-Z]{2,4}";
		
		//XXX@XXX 
		boolean ans = firstName.matches(regEx);// all good => true | otherwise => false

		System.out.println(ans);// false
		
		//java 
		
		//[???]
		//91-9510141151
		//919510141151
		//                  +91[-]?[0-9]{10} 
		
		
		
	}
}



