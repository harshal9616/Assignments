package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que2;

public class Que2TestCase {

	@Test
	public void test() {
		assertEquals(true,Que2.Palindrome("radar"));
	}

	@Test
	public void test1() {
		assertEquals(true,Que2.Palindrome("Radar"));
	}

}
