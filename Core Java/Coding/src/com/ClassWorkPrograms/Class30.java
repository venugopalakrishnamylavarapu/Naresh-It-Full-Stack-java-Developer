package com.ClassWorkPrograms;

import java.util.Arrays;

/*
 Array:
 =====
 Array collects multiple elements of similar data-types in a continous block of memory
 
 Drawbacks
 =========
 1)Array is having fixed length.
 2)Array accepts only Homogeneous.
 3)There is no method support.
 
 Difference between length variable and length() method
 
 				length									length()
 				======									========
 	1)it is the final variable 					1)it is a final method applicable for String
 	  applicable only for arrays.					objects.
 	2)it represents the size of the 			2)it returns the number of characters present 
 	  array.										in the String.
 	3)int[] rollNumber=new int[30];				3)String s="Java";
 	  sysout(rollNumber.length());//error			sysout(s.length);//error
 	  sysout(rollNumber.length);//30				sysout(s.length());//4
 				
 
 */
public class Class30 {
void meth1()
{
	System.out.println("Implementing Java Array");
	int arr1[];
	arr1=new int[5];
	int arr2[]=new int[4];
	int []arr3= {100,200,300};
	int arr4[]=new int[] {15,25,35,45,55,65};
	
	String s="Java";
	
	System.out.println("--------Length----------");
	System.out.println("length of s: "+s.length());//4
	
	System.out.println("length of arr1 : "+arr1.length);//5
	System.out.println("length of arr2 : "+arr2.length);//4
	System.out.println("length of arr3 : "+arr3.length);//3
	System.out.println("length of arr4 : "+arr4.length);//6
	
	System.out.println("-------retriving the data----------");
	System.out.println(arr1[0]);//0
	arr1[1]=20;
	arr1[3]=40;
	System.out.println("arr1 data : "+Arrays.toString(arr1));
	System.out.println("arr2 data : "+Arrays.toString(arr2));
	System.out.println("arr3 data : "+Arrays.toString(arr3));
	System.out.println("arr4 data : "+Arrays.toString(arr4));

	//Arrays.toString() method is used to VIEW the data which is present in the array.
	
	System.out.println(arr2[3]);//0
	//System.out.println(arr3[arr2.length-1]);//AIOB exception
	System.out.println(arr4[arr1.length-arr3.length]);//35
	System.out.println(arr4['A'-60]);//65
	
	System.out.println("---------------------------------------------");
	System.out.println("Retriveing the data in reverse order from arr4");
	for(int i=arr4.length-1;i>=0;i--)
	{
		System.out.print(arr4[i]+" ");
	}
	System.out.println();
	System.out.println("-------------------------------");
	for(int i=1;i<=arr3.length-1;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	System.out.println();
	System.out.println("--------------------------------");
	for(int x:arr1)
	{
		System.out.print(x+" ");
	}
	//for loop will be working on index values
	//for-each loop will be working on streaming data.
}
public static void main(String[] args) {
	Class30 obj=new Class30();
	obj.meth1();
}
}
