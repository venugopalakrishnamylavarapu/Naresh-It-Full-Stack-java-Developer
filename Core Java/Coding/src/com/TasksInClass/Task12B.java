package com.TasksInClass;
/*in class 12 we were tasked to create a class Student class 
 * but asusually i named by class by class order
 2Q)Write a program to print the name of a student by creating a Student Class
 	if no value is passed to object then value shud be UNKNOWN 
 	if a String  value is passed then the value should be the String value*/

public class Task12B {
	Task12B(){
	System.out.println("Student name is Unknown");
	}
	Task12B(String s)
	{
		System.out.println("Student name is "+s);
	}
	public static void main(String[] args) {
		Task12B obj1=new Task12B();
		Task12B obj2=new Task12B("Venu");
	}

}
