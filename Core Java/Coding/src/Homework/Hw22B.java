package Homework;
/*

*Formula(i collected it from internet)*
======================================
				Use the formula below to calculate attendance percentage,
				
Attendance percentage = (No. of days a student is present / Total no. of days of attendance) x 100



2)A Student will not be allowed to sit in exam if his/her  attendance is less than 75%.
Take a parameterized method which takes
=========>Number of classes held.
=========>Number of classes attended.
And the print percentage of class attended by student is allowed to sit in exam or not.

*/
public class Hw22B {
	static void meth1(float classesA,float classesH)
	{
		float aPercent=(classesA/classesH)*100;
		if(aPercent>75)
		{
			System.out.println("You are allowed to write exam since ur percentage is "+aPercent+"%.So,best of luck");
		}
		else
		{
			System.out.println("You need "+(75-aPercent)+"% to sit in the exam!!");
		}
	}
public static void main(String[] args) {
	meth1(113,150);
}
}
