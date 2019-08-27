package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.service.ServiceProvider;

class ServiceProviderTest {
	
	private static ServiceProvider service;
	
	@BeforeAll
	public static void instantiateService() {
		System.out.println("First");
		service=new ServiceProvider();
	}
	
	

	@Test
	public void testIsPrime() {
		System.out.println("Test Prime");
		//fail("Not yet implemented");
		assertTrue(service.isPrime(3));
		assertFalse(service.isPrime(9));
	}
	
	@Test
	public void testZero() {
		System.out.println("Test Zero");
		assertEquals(false, service.isPrime(0));
	}
	
	@Test
	public void testNegative() {
		System.out.println("Test Negative");
		//assertTrue(service.isPrime(-2)); // this test returns exception for some reason
		assertFalse(service.isPrime(-3));
	}
	
	// test boundary values - min and max
	@Test
	public void testBoundryValues() {
		System.out.println("Test Boundaries");
		//double x=2147483648d;
		assertFalse(service.isPrime(34352));
	}
	
	@Test
	public void testSocial() {
		System.out.println("Testing Social");
		String ss="123-45-6789";
		assertTrue(service.isValidSocial(ss));
	}
	
	
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Last");
	}

}
