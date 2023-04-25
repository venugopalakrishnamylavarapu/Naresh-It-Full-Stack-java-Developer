package com.junitdemo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//this class will add customers to the HashMap(hashmap is our database)
public class CustomerManager {
	
	
	private Map<String, Customer> customerList = new HashMap<String,Customer>();
	private String organizationName = "Airtel";
	
	public String getOrganizationName() {
		return organizationName;
	}
	//add customer data into HashMap
	public Customer addCustomer(String id, String firstName, String lastName, String phoneNumber) {
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPhoneNumber(phoneNumber);
		boolean exists = checkIfCustomerAlreadyExists(customer);
		if(!exists) {
			customerList.put(id, customer);
		}
		customer = null;
		return customer;
	}
	private boolean checkIfCustomerAlreadyExists(Customer customer) {
		if(customerList.containsKey(customer.getCustomerId())) {
			return true;
		}
		return false;
	}
	
	public Collection<Customer> getAllCustomers() {
		return customerList.values();
	}

}
