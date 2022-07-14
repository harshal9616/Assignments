package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que7;

public class Que7TestCase {

	@Test
	public void test() {
		assertEquals(true,Que7.palindromeno(121));  
	}

	
	@Test
	public void test1() {
		assertEquals(true,Que7.palindromeno(454));  
	}

}
