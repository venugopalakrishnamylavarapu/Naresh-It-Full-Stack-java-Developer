package com.junitdemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerManagerTest {
	
	private static String expectedOrganizationName = "";
	private CustomerManager manager = null;
	@BeforeAll
	public static void intializeCommonData() {
		System.out.println("in intializeCommonData");
		expectedOrganizationName = "Airtel";
	}
	
	@BeforeEach
	public void initializeDataBeforeTest() {
		System.out.println("in initializeDataBeforeTest");
		manager = new CustomerManager();
	}
	
	@Test
	public void addCustomerTest() {
		System.out.println("in test method addCustomerTest");
		//1. define input to be passed to addCustomer method
		String id = "C100"; 
		String firstName = "Pradeep";
		String lastName = "kumar";
		String phoneNumber = "784748558";
		
		//2.define expected Output
	    //the expected output is the customer object whose id is C100
		String expectedCustomerId = "C100";
		
		//3. get the actual output
		
		Customer actualCustomer = manager.addCustomer(id, firstName, lastName, phoneNumber);
		
		//4. compare expected output with actual output
		//if expectedCustomerId is equal to actualCustomerId, the test case is passed
		//else failed
		assertEquals(expectedCustomerId,actualCustomer.getCustomerId());
		
		Collection<Customer> list = manager.getAllCustomers();
		
		//assertFalse will expect the inside value to be false to make test case pass
		//otherwise failed
		//if list.isEmpty is false, then test case is passed, else failed
		
		//test case is passed because list.isEmpty() is false
		assertFalse(list.isEmpty());
		
		//assertTrue will expect the inside value to be true to make test case pass
		//otherwise failed
		
		//test case is failed, because list.isEmpty() is false
		//assertTrue(list.isEmpty());
		
		
		//test case is failed because !list.isEmpty() as true
		//assertFalse(!list.isEmpty());
		
		//test case is passed because !list.isEmpty() as true
		assertTrue(!list.isEmpty());
		
		assertEquals(expectedOrganizationName,manager.getOrganizationName());
		
	}
	
	@Test
	public void checkForCustomerIsNotNull() {
		System.out.println("in test method checkForCustomerIsNotNull");
		//1. define the input
		String id = "C100";
		String firstName = "Pradeep";
		String lastName = "kumar";
		String mobile = "46558565";
		
		//2.actaul output
		Customer customer = manager.addCustomer(id, firstName, lastName, mobile);
		
		//3.test for customer object is null or not
		//assertNull will expect the object to be null, if it is null test case is passed
		//else failed
		assertNull(customer);
		
		//assertNotNull will expect  object to be not null, if it is not null
		//test case is passed else failed
		assertNotNull(customer);
		
		assertEquals(expectedOrganizationName,manager.getOrganizationName());
		
	}
	
	@AfterEach
	public void clearDatAfterEach() {
		System.out.println("in clearDatAfterEach");
		manager = null;
	}
	
	@AfterAll
	public static void clearDatAfterAll() {
		System.out.println("in clearDatAfterAll");
		expectedOrganizationName = null;
	}
	
}