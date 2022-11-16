package com.ClassWorkPrograms;
/*Constructors
 =============
 1)Constructors are used to initialize a class object.
 2)Constructors are used to provide values for the Instance Variables
 
 syntax of Constructor
 =====================
 <AccessModifier><ClassName>()
 {
 
 }
 
 rules to define a Constructor
 =============================
 1)Constructor name should be same as ClassName.
 2)Constructor should not be having any return type;
 
 Types of Constructors
 =====================
 1)Predefined Constructors
 		a)parameterized Predefined Constructors
 		b)non-parameterized Predefined Constructors
 2)Userdefined Constructors
 		a)parameterized Userdefined Constructors
 		b)non-parameterized Userdefined Constructors
 		
 Q)How to call a java Constructor is called?
   ========================================
 A)A Java Constructor will be called simultaneously when ever we are creating an Object.
 
 
 
 */

public class Class11 {
	Class11()
	{
		System.out.println("Non-Parameterized Constructor Called");
	}
	Class11(int a,int b)
	{
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Parameterized Constructor called :"+(a+b));
		new Class11().meth2();
	}
	void meth1() {
		System.out.println("meth1() called");
	}
	void meth2() {
		System.out.println("meth2() called");
	}
	public static void main(String[] args) {
		new Class11(99,1).meth1();
	}
	
}
