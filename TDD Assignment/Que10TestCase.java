package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que10;

public class Que10TestCase {

	@Test
	public void test() {
		
		Que10 obj= new Que10();
	
		  assertEquals("Welcome-To-Yash",obj.ConcateStringInArray(new String[] {"Welcome", "To","Yash"}));

}
		
}