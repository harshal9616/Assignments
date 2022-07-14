package com.yash.tddassignment;

public class Que10 {

	
	 String str="";
	    public String ConcateStringInArray(String[] string) {
	        int a=string.length-1;
	    for(int i=0;i<string.length;i++) {
	        if(i==a) {
	            str =str+string[i];
	        }else {
	            str=str+string[i]+"-";
	        }


	    }
	    System.out.println(str);
	        return str;
	    }
}
