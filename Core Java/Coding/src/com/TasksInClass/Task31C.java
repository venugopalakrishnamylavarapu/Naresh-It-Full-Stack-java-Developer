package com.TasksInClass;
/*given an array of ints,returns true if the array is length 1 or more,and the first 
 element and the last element are equal.
 
 
 
 */
public class Task31C {
	public boolean sameFirstLast6(int[] nums)
	{
		if(nums.length>=1)
		{
		if(nums[0]==nums[nums.length-1])
			return true;//this statement belongs to if block
		}
		return false;//this statement belongs to method.
	}
	public static void main(String[] args) {
	Task31C obj=new Task31C();
	int arr[]= {1,2,3,4,5,1};
	System.out.println(obj.sameFirstLast6(arr));

	}
}
