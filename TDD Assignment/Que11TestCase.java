package com.yash.tdd.testcase;
import com.yash.tddassignment.Que11;
import static org.junit.Assert.*;
 
import org.junit.Test;

public class Que11TestCase {

	@Test
	public void test() {
		Que11 instance1 = Que11.getInstance();
		Que11 instance2 = Que11.getInstance();
	        
	         assertEquals(true, instance1==instance2);

	}

}
