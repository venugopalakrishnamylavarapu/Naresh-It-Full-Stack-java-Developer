package com.ClassWorkPrograms;
/*static variable and static block are given the most priority by compiler during 
  execution.yes even if the main method exists in the program priority will be given 
  to the static variables or static method see the below code to understand it better.
  */
public class Class17A {
	static int a=Class17A.meth1();//static variable called first which contained a method
	static int meth1()
	{
		System.out.println("meth1() called");
		return 100;
	}
	public static void main(String[] args) {
		System.out.println("main() called : "+a);
	}
	static {
		System.out.println("static block called : "+a);
	}
}
