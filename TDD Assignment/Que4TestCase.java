package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que4;

public class Que4TestCase {

	@Test
	public void test() {
		assertEquals(false,Que4.armstrongno(23));
	}
		@Test
		public void test1() {
			assertEquals(true,Que4.armstrongno(153));
		}
		
		@Test
		public void test2() {
			assertEquals(true,Que4.armstrongno(370));
		}
	}


