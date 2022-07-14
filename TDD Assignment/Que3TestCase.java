package com.yash.tdd.testcase;

import static org.junit.Assert.*;
import org.junit.Test;
import com.yash.tddassignment.Que3Main;

public class Que3TestCase {

	@Test
	public void test() {
		  assertEquals(true,Que3Main.checkEmailPassword("rahul@gmail.com","rahul123"));
	}

	
	@Test
	public void test1() {
		  assertEquals(false,Que3Main.checkEmailPassword("raj@gmail.com", "raj123"));
	}

}
