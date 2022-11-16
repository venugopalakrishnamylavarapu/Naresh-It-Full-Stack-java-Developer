package com.ClassWorkPrograms;

/*
 
 
  static block
  ============
  1)in our java program if we are having a static block and main method then
    the first priority will be given to the static block.
  2)we can write any number of static blocks in our program.
  3)static blocks will be getting executed in the defined order,we cannot call a static block.
  4)before java 1.5 version we were able to execute a java program  with the help of static block
 	without writing main block. but after java 1.5 version it got mandatory to create a main method to print hello world.
 5)final static variables we are supposed to initialize them at time of declaration (or) inside a static block,
 anywhere else if we are truing to  initialize them we will be getting an compile time error.
 
  */

public class Class17 {
	static int a;
	final static int b;
	static void meth1()
	{
		a=10;
		//b=10; //C.E
		System.out.println("meth1() called");
	}
	static void meth2()
	{
		//b=50 //C.E
		System.out.println("static meth2() called");
	}
	static
	{
		b=50;
		System.out.println("1st static block executed");
	}
	public static void main(String[] args) {
		System.out.println("main() called");
		Class17 obj=new Class17();
		obj.meth1();
		System.out.println("a value : "+a);
		System.out.println("b value : "+b);
	}
	static
	{
		//b=100; //C.E because final variables are constants.once declared we cannot change them.
		System.out.println("2nd static block executed");
		meth2();
	}
}
