package com.OopsTasks;

import java.util.Scanner;

public class Task35A {
	static void meth1()
	{
		Scanner sc=new Scanner(System.in);
		Task35 obj=new Task35();
		System.out.println("Enter the employee Name : ");
		obj.setEmpName(sc.nextLine());
		
		System.out.println("Enter the employee Experience : ");
		obj.setEmpExperience(sc.nextInt());
		
		System.out.println("Enter the employee Sal : ");
		obj.setEmpSalary(sc.nextInt());
		
		System.out.println("Data Entered by the user is :");
		System.out.println("Employee name : "+obj.getEmpName());
		System.out.println("Employee Experience : "+obj.getEmpExperience());
		System.out.println("Employee Salary : "+obj.getEmpSalary());
		
		
		
		sc.close();
	}
public static void main(String[] args) {
	meth1();
}
}
