package ClassWorkPrograms;

import java.io.FileReader;
import java.util.Scanner;

//continuation of Exception handling...
/*
 Important points for interview and programming
 
 Key points in Exception Handling
 ---------------------------------
 1)We can handle an exception using try,catch,finally blocks.
 2)Whenever we are using the all the three blocks we should 100% maintain the order.
 	try-finally-catch  ---->Invalid
 	finally-try-catch  ---->Invalid
 	catch-try-finally  ---->Invalid
 	
 	try-catch-finally  ---->Valid
 3)Inside try block always we need to write minimum code.[Write only the suspicious code inside the try block].
 4)If there is an exception occured in the try block then immediately the compiler will be coming to its respective
   catch block.Remaining code which is present inside the try block.
 5)A catch block will be executed only if there is an exception occured in the try block and we are catching that 
   respective exception or its parent exception
 6)If we are catching the parent Exception of all the exception classes i.e,[Exception] then every Exception will be handled.
 7)A single try block never exists.[vv important point]
 8)try block should be followed with either catch block (or) finally block or both.
 	try-catch -->valid   try-finally-->valid  catch-finally --> invalid  try-catch-finally -->valid  try-->invalid
 9)If we are not writing catch block in our program then we will not be having any error but if there is an exception occured
   in our program it will not be handled.
 10)finally block is used to close the existing database/server connections.
 11)Between try-catch-finally block there should not be any individual statements.
 12)we can handle multiple execeptions by using multiple catch blocks.
 13)For a single try block we can write multiple catch blocks but we need to write a single finally block.
 14)Multiple catch blocks are allowed but multiple finally blocks are not allowed.
 15)Whenever we are using multiple catch blocks always parent exception should be handled in the last catch block.
 16)If we are using multiple catch blocks duplicate exception handling is not allowed.[We will be getting an Compile Time error].
 17)From java 1.7v onwards we can write a single try block also. try(Resources){  }
 18)From java 1.7v onwards we can handle multiple exceptions by using a single catch block.But those exceptions should not have
    any parent child relation ship.
 
 */
public class Class48 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		String s=null;
		System.out.println(10);
		try {
			System.out.println("try block exectuted");
			System.out.println("==>"+20/sc.nextInt());
			System.out.println("Length of s : "+s.length());
			System.out.println("Hello world");
		}
		//System.out.println("hi");//C.E
	/*	catch(ArithmeticException e)
		{
			System.out.println("1st catch block exceuted");
		}
		//System.out.println("Hello");//C.E
		catch(NullPointerException e)
		{
			System.out.println("2nd catch block executed");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("catch block executed");
			//System.out.println(e.getMessage());//gives the reaason of the exeception
			//System.out.println(e.toString());//gives the name & reason of the exception.
			e.printStackTrace();//gives the complete info about the exception ==> Highly Recommended
		}*/
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("catch block executed");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println(30);
	}
	void meth2() throws Exception//see we can write a single try block(form java 1.7v but it need to have resources in the paranthesis)
	{
		System.out.println("meth2() called");
		try(FileReader fr=new FileReader("filePath"))
		{
			//code for reading the data
		}
	}
	public static void main(String[] args) {
		new Class48().meth1();
	}
}
