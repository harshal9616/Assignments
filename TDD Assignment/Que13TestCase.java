package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yash.tddassignment.Que13;

public class Que13TestCase {

	
private Que13 objCalTest;
	
	@Before
	public void setup() {
		objCalTest= new Que13();
	}
	
	@Test
	public void calAdditionTest() {
		int a= -5, b=2;
		int expectedResult=-3;
		long result= objCalTest.addition(a,b);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void calSubstractionTest() {
		int a= -5, b=-2;
		int expectedResult=-3;
		long result= objCalTest.substraction(a,b);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void cal_Multiply_Test() {
		int a= 5, b=0;
		int expectedResult= -0;
		int result= objCalTest.multiplycal(a,b);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void cal_Division_Test() {
		double a= 6, b=2;
		double expectedResult=3;
		double result= objCalTest.divisioncal(a,b);
		assertEquals(expectedResult, result,0.0000005);
	}
	
	@Test
	public void TestModulus() {
		int a=5, b=3;
		int expectedResult=2;
		int result= objCalTest.Modulus(a,b);
		assertEquals(expectedResult, result);
	}

	@Test
	public void Test_power() {
		int a= 6, b=2;
		long expectedResult=36;
		long result= objCalTest.powerFun(a,b);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void cal_squareRoot_Test() {
		double a= 4;
		double expectedResult=2;
		double result= objCalTest.SquareRoot(a);
		assertEquals(expectedResult, result,0.0000005);
	}
	
	@Test
	public void cal_cubeRoot_Test() {
		double a= 27;
		double expectedResult=3;
		double result= objCalTest.cubeRoot(a);
		assertEquals(expectedResult, result,0.000000);
	}
		
	}


