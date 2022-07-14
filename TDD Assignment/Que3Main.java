package com.yash.tddassignment;

import java.util.ArrayList;
import java.util.List;

public class Que3Main {

	
	 static List<Que3> a=new ArrayList<>();
	    public static void main(String[] args) {
	        System.out.println();
	    }
	     public static boolean checkEmailPassword(String email,String password) {

	    	    a.add(new Que3("ajinkya@gmail.com","ajinkya123"));
	    	    a.add(new Que3("rahul@gmail.com","rahul123"));
	            a.add(new Que3("neha@gmail.com","neha123"));
	            a.add(new Que3("mansi@gmail.com","mansi123"));
	            a.add(new Que3("namdev@gmail.com","namdev123"));


	            for(int i=0;i<=a.size()-1;i++) {
	                if(a.get(i).email.contains(email)&&a.get(i).password.contains(password)) {
	                    return true;
	                }
	            }
	            return false;
	    }
}
