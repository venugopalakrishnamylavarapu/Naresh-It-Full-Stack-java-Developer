package com.Homework;

import java.util.Scanner;

/*
 homework
=========
enter name using scanner
empName
empId
empSal
empAddress
and print them in the exact manner
 
 */
public class Hw27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name :-");
	String empName=sc.nextLine();
	System.out.println("Enter the Id :-");
	int empId=sc.nextInt();
	System.out.println("Enter the Salary :-");
	int empSal=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Address :-");
	String empAddress=sc.nextLine();
	System.out.println(empName);
	System.out.println(empId);
	System.out.println(empSal);
	System.out.println(empAddress);

}
}
