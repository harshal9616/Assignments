package com.yash.tddassignment;

public class Que6 {

	
	public static boolean countvowel(String str) {
		str = str.toLowerCase();
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                count++;
            }
        }
        if(count == 2)
        	return true;
        else 
        	return false;
	}
}
