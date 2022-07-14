package com.yash.tddassignment;

public class Que12 {

	
	 String name;
	    String lastname;
	    public Que12(String name, String lastname) {

	        this.name = name;
	        this.lastname = lastname;
	    }


	    @Override
	    public  boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass())
	        	return false;
	        Que12 that = (Que12) o;
	        return name.equals(that.name) &&
	          lastname.equals(that.lastname);
	    }

}
