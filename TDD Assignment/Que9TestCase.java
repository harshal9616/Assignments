package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddassignment.Que9;

public class Que9TestCase {

	@Test
	public void test() {
		 assertEquals("My name is Rahul.",Que9.removechar("--My@name$is@Rahul--."));
	}

}
