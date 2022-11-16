package com.TasksInClass;
/*task is about the increment and decrement operator*/

public class Taskin14 {
	void meth1()
	{
		int a=10;//
		a++;//10 a=11
		System.out.println(++a); //a=12 a=12
		System.out.println(++a); //a=13 a=13
		System.out.println(a++); //a=13 a=14
		a++;//a=14 a=15
		System.out.println(a--);//15 a=14
		System.out.println(a);//14   a=14
		--a; //a=13
		System.out.println(++a);//14  a=14
		System.out.println(--a);//13  a=13
		a=a++ + ++a;// a=13 a=14 + a=15 a=15 ===>13 + 15=28
		System.out.println(a);//28
	}
	public static void main(String[] args) {
		new Taskin14().meth1();
	}

}
