package com.TasksInClass;
/*  
another task as a homework 

3)WAP using switch statement that takes three inputs from the method as parameters:operator(+,-,/,*)
and 2 numbers.it performs calculation based on number and operator entered.Then the result is displayed on the screen.
 
 */

public class Task23A {
	void meth1()
	{int input=4;
	//break;
		switch(input)
		{
		default:
			System.out.print(4);
		case 1:
			System.out.print(" 1 ");
		case 2:
			System.out.print("2");
		}
	}

	public static void main(String[] args) {
new Task23A().meth1();
	}

}
