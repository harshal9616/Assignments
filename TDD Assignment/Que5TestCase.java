package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que5;

public class Que5TestCase {

	@Test
	public void test() {
		assertEquals(true,Que5.pythagoras(6,8,10));
	}

	@Test
	public void test1() {
		assertEquals(false,Que5.pythagoras(1,2,3));
	}

}
