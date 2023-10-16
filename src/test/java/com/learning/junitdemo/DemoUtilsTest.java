package com.learning.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DemoUtilsTest {
	
	DemoUtils demo;
	
	@BeforeAll
	static void beforeAllTestCase() {
		System.out.println("this method is annotated with BeforeAll, so it will run before all the test cases");
	}
	
	@BeforeEach
	void beforeEachTestCase() {
		
		 demo = new DemoUtils();
		 System.out.println("this is running before each test case");
		
	}
	
	@AfterEach
	void afterEachTestCase() {
		
		 System.out.println("this is running after each test case");
		
	}
	
	
	
	@AfterAll
	static void afterAllTestCase() {
		System.out.println("this method is annotated with @AfterAll, so it will run after all the test cases");
	}
	
	

	@Test
	void testEqualsNotEquals() {
		assertEquals(6, demo.add(2, 4), "2+4 must be 6");
		
		assertNotEquals(6, demo.add(1, 9), "1+9 must be not equal to 6");
	}
	
	@Test
	void testNullAndNotNull() {
		
		String str1 = null;
		String str2 = "String Object created using String Literal";
		
		assertNull(demo.checkNull(str1), "Object should be Null");
		
		assertNotNull(demo.checkNull(str2), "Object should not be null");
		
	}
}
