package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que12;

import junit.framework.Assert;

public class Que12TestCase {

	@Test
	public void test() {
		
		Que12 q=new Que12("harshal","jadhav");
		Que12 q1=new Que12("harshal","jadhav");
        Assert.assertEquals(q, q1);
    }
	}


