package com.yash.tdd.testcase;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.yash.tddassignment.Que14Item;

public class Que14ItemTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		 Que14Item i=new Que14Item(123,"harshal",100,150,LocalDate.of(2022, 11, 23),LocalDate.of(2023, 12, 27));
	        assertEquals(true,i.createObject(i));
	}

}
