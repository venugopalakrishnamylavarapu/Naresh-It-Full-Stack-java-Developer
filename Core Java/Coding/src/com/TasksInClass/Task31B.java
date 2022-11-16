package com.TasksInClass;
/*
 given an array of ints,return true if 6 appears as either the first or last element in the array.
 the array will be length 1 or more.
 
 */
public class Task31B {
public boolean firstLast6(int[] nums)
{
	if(nums[0]==6 || nums[nums.length-1]==6)
		return true;//this statement belongs to if block
	return false;//this statement belongs to method.
}
public static void main(String[] args) {
Task31B obj=new Task31B();
int arr[]= {1,2,6};
int arr1[]= {6,1,2,3};
int arr2[]= {13,6,1,2,3};
int arr3[]= {8,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,8};
System.out.println(obj.firstLast6(arr));
System.out.println(obj.firstLast6(arr1));
System.out.println(obj.firstLast6(arr2));
System.out.println(obj.firstLast6(arr3));

}
}
