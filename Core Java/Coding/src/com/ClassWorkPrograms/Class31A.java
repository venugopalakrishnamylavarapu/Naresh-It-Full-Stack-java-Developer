package com.ClassWorkPrograms;

import java.util.Arrays;

public class Class31A {
void meth1(int arr[])
{
	System.out.println("meth1() called");
	System.out.println(Arrays.toString(arr));
}
int[] meth2()
{
	System.out.println("meth3() called");
	int data[]= {100,200,300};
	return data;
}
public static void main(String[] args) {
	int input[]= {10,20,30};
	new Class31A().meth1(input);
	int result[]=new Class31A().meth2();
	System.out.println(Arrays.toString(result));
}
}
