package com.TasksInClass;
/*print 2 table using for loop*/
public class Task26A {
	static void meth1(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" * "+i+" = "+(num*i));
			
		}
	}
public static void main(String[] args) {
	meth1(2);
}
}
