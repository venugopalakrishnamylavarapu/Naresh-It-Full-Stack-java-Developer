package ClassWorkPrograms;

import java.util.Scanner;

/* 
 Todays class is about Exception handling 
 its mostly theory...
 
*Error
 =====
-> If our program is having an error,it will be terminated & we can't save our program.
   Means we can't handle errors

 
 Errors are three types.They are
  a)Compile time errors
  	->These errors occurs due to the wrong syntax (Syntactical Errors).
  	
  b)Run time errors
  	->These errors occurs due to the inefficient of the machine.
  	
  c)Logical errors
  	->These errors occurs due to the bad logic in the program.
  	
  
*Exception
 =========
->if our program is having an exception,It will be terminated.But we can save our program by
   handling that exception.In simple Exceptions can be Handled.
 
 Exceptions are of two types.They are
 a)Checked Exceptions
 	->the exceptions which are detected at compilation time by the java compiler are known as 
 	  Checked exception.
 	  
 b)Unchecked Exceptions
 	->the exceptins which are detected at run time by the jvm are known as unchecked exception.
 	
 
 NotePoint
 ========
 1)An Exception always occurs only inside a method or inside a block.
 2)An Exception always occurs during runtime only but some exceptions are detected at compilation time
   and some are detected at runtime.
   
-----------------------------------------------------------------------------------------------------   
 Q)What happens if an exception occured in our program.
 A)
 	Java method(had an exception)---->what it will do is
   ->Create an Exception Object.it consists of 
	 	1)Name of the exception.
	 	2)Reason of the exception.
	 	3)Complete info about the exception.
  ->After this excpetion object will be sent to the jvm.
  ->then jvm will take the help of "Default Exception Handler"
-------------------------------------------------------------------------------------------------------
  Exception Hierarchy will be in the google classroom so check it out 
  
 Exception Handling
 ==================
 ->Exceptin Handling means not removing the exception (or) not resolving the exception,
   we are providing an alternative way to continue the program execution.

Q)How to handle an excpetion?
A)we can handle an exception by using "try-catch-finally blocks"
	Syntax:
	======
			try		<--try block
			{
			  //Inside the try block we need to write suspicious code. 
			}
			catch(Exception e)	<--catch block
			{
			  //Inside the catch block we need to catch the exception which occured in the try block.
			}
			finally
			{
			  //finally block will be executed always irrespective of the exception
			}

 
 */
public class Class47
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(10);
		try {
			System.out.println("try block executed");
			System.out.println("Enter a number");
			System.out.println("==>"+20/sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block executed");
		}
		finally {
			System.out.println("finally block executed");
		}
		System.out.println(30);
	}
	public static void main(String[] args) {
		new Class47().meth1();
	}
}
