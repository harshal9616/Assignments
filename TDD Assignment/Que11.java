package com.yash.tddassignment;

public class Que11 {
	private static  Que11 singletonInstance = new Que11();

    private Que11() {

    }

    public static Que11 getInstance() {
        // TODO Auto-generated method stub
        return singletonInstance;
    }
}

