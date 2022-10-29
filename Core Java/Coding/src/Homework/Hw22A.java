package Homework;
/*
 task for homework 2 questions given.

1)A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.Take
a Parameterized method which takes users salary and year of service and print the bonus amount & Update Salary.
 
*/
public class Hw22A {
	static void meth1(int salary,int service)
	{
		if(service>5)
		{
			System.out.println("the bonus amount and updated salary is :"+(salary+(salary/100)*5));
		}
		else
			System.out.println("You are not eligible for the bonus of 5%");
	}
public static void main(String[] args) {
	Hw22A obj=new Hw22A();
	obj.meth1(50000, 2);
}
}
