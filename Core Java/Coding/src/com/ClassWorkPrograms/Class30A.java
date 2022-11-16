package com.ClassWorkPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Class30A {
void meth1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome how many tickets you need?");
	String names[]=new String[sc.nextInt()];
	System.out.println("You need "+names.length+" tickets");
	System.out.println("Please enter "+names.length+" names");
	for(int i=0;i<names.length;i++)
	{
		names[i]=sc.next();
	}
	System.out.println("Tickets are booked for : "+Arrays.toString(names));
	sc.close();
}
public static void main(String[] args) {
	Class30A obj=new Class30A();
	obj.meth1();
}
}
