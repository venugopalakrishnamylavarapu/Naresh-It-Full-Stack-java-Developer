package com.ClassWorkPrograms;

/*Key points in constructors
 ===========================
 1)constructors name should be same as classname
 2)constructors should not be having any return type
 3)we need to initialize the class object with
   the available Constructors present in the class.
 4)if we are not writing any constructors in our class(i.e either parameterized constructors (or)
   Non -parameterized constructors),then compiler will automatically provides our program with a default constructor.
 5)Default construxtor is exactly same like non parameterized contructor,but it will bw provided by the compiler
   
   *Default Constructors ===> provided by the compiler.
   *Non-Parameterized Constructors ===>provided by the programmer 
   
   
 6)for the constructors which are provided by the programmers we can use all the 4 access modifiers.
 7)for the default constructor which is provided by the compiler there is an option to use only 3 access modifiers,
 	because a java class can be declared as either public or default.
 8)if we want to restrict creating an object of our class in other classes we need to make ALL our class constructors as private.
 9)just like a void methods we can write a return statement inside a constructor,without returning anything.
 10)Constructor Overloading ==>  is Possible.
 	Constructor Overridding ==> is NOT Possible.
 	
 
 DIFFERENCE BETWEEN CONSTRUCTOR AND A METHOD!!
 ==============================================
 (these points are my own btw)
 Method
 ======
 1)can have 4 access specifiers
 2)can have a return type and can return anything
 3)can have the same name as class name or not its not mandatory
 4)default methods will have different access modifiers
 
 Constructor
 ============
 1)shud be having the same name as class name.its mandatory.
 2)must not have return type
 3)a default constructor will have the access modifier of the class
 4)when programmer defined constuctor it will be given first prority in place of default compiler.
 
 some original points i missed
 =============================

  Constructor
 ===========
 1)the java compiler provides a default constructor if you dont have any constructor.
 2)Constructor is invoked implicitly.
 3)Constructor is used to initialize the state of an object
 
 Method
 ======
 1)method is not provided by the compiler in any case.
 2)Method must have return type.
 3)method is used to expose behaviour of an object.
 */
public class Class13 {
	void meth1()
	{
		System.out.println("meth1() called");
	}
	Class13()
	{
		System.out.println("hi");
	}
	Class13(int a)
	{
		System.out.println(a);
	}
	Class13(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Class13().meth1();
		new Class13(10).meth1();
		new Class13("hello").meth1();
		//new Class13("hi",100).meth1(); //C.E
	}

}
