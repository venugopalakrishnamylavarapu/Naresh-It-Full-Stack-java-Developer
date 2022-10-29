package TasksInClass;

/*A school has following rules for grading system
a.Below 25-F
b.25 to Below 45 - E
c.45 to Below 50 - D
d.50 to Below 60 - C
e.60 to Below 80 - B
f.Above 80-A
Take a parameterized method which takes marks as input and print the corresponding grade.
------------------------------------------------------------------------------------------

task for homework 2 questions given.

1)A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.Take
a Parameterized method which takes users salary and year of service and print the bonus amount & Update Salary.


2)A Student will not be allowed to sit in exam if his/her  attendance is less than 75%.
Take a parameterized method which takes
=========>Number of classes held.
=========>Number of classes attended.
And the print percentage of class attended is student is allowed to sit in exam or not.

Check the homework section for answers


*/

public class Task22D {

	    static void meth1(int result)
	    {
	        if(result>=80)
	        {
	            System.out.println("A grade");
	        }
	        if(result>=60 && result<80)
	        {
	            System.out.println("B grade");
	        }
	        if(result>=50 && result<60)
	    {
	        System.out.println("C grade");
	    }
	        if(result>=45 && result<50)
	        {
	            System.out.println("D grade");
	        }
	        if(result>=25 && result<45)
	    {
	        System.out.println("E grade");
	    }
	      if(result<25) {
	            System.out.println("F-grade(better luck next time brother)");
	        }
	    }
	    public static void main(String[] args) {
	meth1(60);
	    }


}
