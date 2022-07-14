package com.yash.tddassignment;

public class Que9 {

	
	 public static String removechar(String str)
	 {  
	        str = str.replaceAll("[@$]", " "); 
	        str = str.replaceAll("[-]", ""); 
	        return str;
	    }
}
