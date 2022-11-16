package com.TasksInClass;

public class Task26B {
	void display(int n)
	{
		for(int i=0;i<n;i++)
		{
//			for(int j=i;j>=0;j--)
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	new Task26B().display(5);
}
}
