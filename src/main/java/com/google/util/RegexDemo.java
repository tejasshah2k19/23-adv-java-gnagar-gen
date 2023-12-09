package com.google.util;

public class RegexDemo {

	public static void main(String[] args) {
		String digit = "[0-9]+";//1-N 
		String pwd = "[0-9]{8}";
		String alpha = "[a-zA-Z]+";
		String userName = "[a-zA-Z0-9$_-]+";// 
		String emailReg = "[a-zA-Z0-9_-.]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}$";//XXX@xxx.XX 
			//royal@edu.in.edu  
		
		//+{1-N}  *{0-N} .{1}  ?{0-1}  
		String ans1 = "29k";
		String ans2 = "29";
		String ans3 = "23234a";//01 

		System.out.println("\\n"); 
		System.out.println(ans3.matches(digit));
	
	}
}
