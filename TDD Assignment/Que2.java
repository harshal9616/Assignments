package com.yash.tddassignment;

public class Que2 {

	
	public static boolean Palindrome(String str){
	String newstr=str.toLowerCase();
	        StringBuilder sb=new StringBuilder(newstr);
	        sb.reverse();
	        String rev=sb.toString();
	        if(newstr.equals(rev))
	            return true;
	        else	       
	            return false;
	        
	    }
}
