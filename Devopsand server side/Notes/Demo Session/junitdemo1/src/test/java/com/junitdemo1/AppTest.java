package com.junitdemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//writing the unit test code  using Junit
//for testing the sum method of App.java present in the main folder
//this is test class to test the main code
class AppTest {
	
	//this annotation indicates that this method is a test method
	//and Junit library see this annotation and executes this method
	@Test
	public void testSum() {
		
		//1. Define the input to be passed to the sum method
		int x= 20;
		int y = 30;
		
		//2. Define the expected output from the method
		int expectedOutput = 50;
		
		//3. get the actual output by calling the sum method of App.java by passing required input
		App app = new App();
		int actualOutput = app.sum(x,y);
		
		//4. compare the expected output and actual output
		//assertEquals will compare expectedOutput and actualOutput
		//and if they are equal, this makes test method pass else test method fail
		assertEquals(expectedOutput,actualOutput);
		
	}
	
	@Test
	public void testProduct() {
		//1.define input to be passed
		int x = 5;
		int y = 10;
		
		//2. define expected ouptut from the method
		int expectedOutput = 50;
		
		//3. get the actual output by calling the product method of App.java by passing the required input
		App app = new App();
		int actualOutput = app.product(x, y);
		
		//4. compare expected output and actual output
		//assertEquals will compare expectedoutput and actualoutput
		//and if they are equal, this makes test method pass else test method fail
		assertEquals(expectedOutput,actualOutput);
		
		
	}
	
}