package com.cog.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JunitTest {

	@BeforeAll
	public static void setUpBeforeClass() {
		System.out.println("before ALL");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@Test
	public void addNumbers() {
		System.out.println("test case for addition of two values");
		assertEquals(15, Sample1.add(10, 5));

	}
	
	@Test
	public void reverseString() {
		System.out.println("test case for reversing the string");
		assertEquals("elppa", Sample1.reverseString("apple"));

	}

	@Test
	@Disabled
	public void multiplyNumbers() {
		System.out.println("test case for multiplication of two values");
		assertEquals(50, Sample1.multiply(10, 5));

	}

	@AfterAll
	public static void setUpAfterClass() {
		System.out.println("After ALL");
	}

	@AfterEach
	public void setUpAfterEach() throws Exception {
		System.out.println("After each test");
	}

}
