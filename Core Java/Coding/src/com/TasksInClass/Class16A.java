package com.TasksInClass;

public class Class16A {
	int a=10;
	static int b=20;
	void meth1()
	{
		System.out.println("Instance Variable : "+a);
		System.out.println("Static Variable : "+b);
	}
	static void meth2()
	{
		System.out.println("Instance Variable : "+new Class16A().a);
		System.out.println("Static Variable : "+b);
	}
	public static void main(String[] args) {
		Class16A obj=new Class16A();
		obj.meth1();
		System.out.println("------------------------");
		obj.meth2();//using class object
		Class16A.meth2();//using class name
		meth2();//using identifier name
	}

}
