package com.ClassWorkPrograms;

import java.util.Scanner;

/*
 Understanding Scanner Class
 ===========================
1)Scanner class is present in java.util package.
2)Scanner class provides methods which will take input from the keyboard at run time.
3)if we are creating an Object for a Scanner class 100% we need to use import statement.

homework
=========
enter name using scanner
empName
empId
empSal
empAddress
and print them in the exact manner

check Hw27 in homework package

 
 
 */
public class Class27 {
	static	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("Please enter 1st number");
		int a=sc.nextInt();
		System.out.println("User entered a value : "+a);
		
		System.out.println("Please enter 2nd number");
		int b=sc.nextInt();
		System.out.println("User entered b value : "+b);
		int c=a+b;
		System.out.println("c value is : "+c);
	}
	void meth2()
	{
		System.out.println("Please enter your name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Dear"+name+" please enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println(name+" you are eligible to vote");
		}
		else
			System.out.println(name+" you are not eligible to vote");
	}
	void meth3(int exp)
	{
		System.out.println("Candidate is having "+exp+" years of experience");
		switch(exp)
		{
		case 5:
			System.out.println("Ask questions related to 5 years of experience");
			sc.nextLine();
			String Question1=sc.nextLine();
			System.out.println("Please answer below question");
			System.out.println("Ques: "+Question1);
			String ans=sc.nextLine();
			System.out.println("user has given the below answer");
			System.out.println("Ans : "+ans);
			break;
		default:
			System.out.println("not a valid number");
			break;
		}
	}

public static void main(String[] args) {
	Class27 obj=new Class27();
	obj.meth1();
	System.out.println("-----------------------------------");
	obj.meth2();
	System.out.println("-----------------------------------");
	System.out.println("Please enter your experience");
	obj.meth3(sc.nextInt());
}
}
