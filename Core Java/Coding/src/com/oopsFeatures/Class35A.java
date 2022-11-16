package com.oopsFeatures;

import java.util.Scanner;

public class Class35A {
	void meth1()
	{
		Class35 obj=new Class35();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Name");
		//obj.studentName=sc.next(); //C.E because we can't access private variables
		obj.setStudentName(sc.next());
		
		System.out.println("Please enter your RollNo");
		//obj.setStudentRollNumber=sc.next(); //C.E because we can't access private variables
		obj.setStudentRollNumber(sc.nextInt());
		
		System.out.println("Please enter your Dept");
		//obj.setStudentDept=sc.next(); //C.E because we can't access private variables
		obj.setStudentDept(sc.next());
		
		System.out.println("Data entered by the user");
		//System.out.println("Student Name : "+obj.studentName);//C.E
		System.out.println("Student Name : "+obj.getStudentName());
		
		//System.out.println("Student RollNumber : "+obj.studentRollNumber);//C.E
		System.out.println("Student Roll no : "+obj.getStudentRollNumber());
		
		//System.out.println("Student Name : "+obj.studentDept);//C.E
		System.out.println("Student Dept : "+obj.getStudentDept());
		
		sc.close();
	}
	
public static void main(String[] args) {
	new Class35A().meth1();
}
}
