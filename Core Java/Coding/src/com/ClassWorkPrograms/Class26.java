package com.ClassWorkPrograms;

/*
 
 
 
 */

public class Class26 {
	void meth1()
	{
		int arr[]= {10,20,30,40,50};//length is 5 & index position starts with 0
		System.out.println(arr[0]);
		System.out.println("Retriving the data from an array by using for-loop");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Retriving the data from an array in Reverse order");
		for(int i=3;i>=1;i--)
		{
			System.out.print(arr[i]+" ");
		}
		//for loop will be working on INDEXvalues of an array.
		//for each loop will be working on STREAMING data
		System.out.println();
		System.out.println("Retriving the data from an array by using for-each loop");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		String arr2[]= {"Java","Oracle","Spring","Html"};
		for(String str:arr2)
		{
			System.out.println(str);
		}

	}

	public static void main(String[] args) {
		new Class26().meth1();
	}
}
