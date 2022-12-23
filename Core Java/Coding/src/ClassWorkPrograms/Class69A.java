package ClassWorkPrograms;
import ClassWorkPrograms.Days;
/*
 ->A java enum is nothing but a list of instance variables,methods(just like a class).
 ->These are a group of constants(public,static and final
 	we cannot change them and we cannot override them)
 ->An enum cannot be used to create objects and it cannot be extend to other classes.
 ->Syntax of an enum
 	AccessModifier enum enumName{
 	statements;
 	}
 */
public class Class69A {
	void meth1()
	{
		System.out.println("Implementing enum in our program");
		Days d=Days.friday;
		System.out.println("Today is "+d);
		
		switch(d)
		{
		case friday:
				System.out.println("Today is the last class");
				break;
		case saturday:
			System.out.println("Today is the last class");
			break;
		case sunday:
			System.out.println("Today is the last class");
			break;
			default :
				System.out.println("Invalid Input");
		}
		System.out.println("=====================================");
		System.out.println("Retriving the data from enum");
		
		Days arr[]=Days.values();
		for(Days x:arr)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		new Class69A().meth1();
	}
}
