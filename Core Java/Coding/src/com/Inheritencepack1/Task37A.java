package com.Inheritencepack1;

public class Task37A extends Task37 {
	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	Task37A()//main method called
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}
	Task37A(int a)
	{//go to super class default constructor
		System.out.println("==> "+(a+++show(50)));
	}
	public static void main(String[] args) {
		new Task37A().display();
	}
}
