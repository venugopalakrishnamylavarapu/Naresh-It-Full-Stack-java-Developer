package com.ClassWorkPrograms;
/*data types specifies size and type of values that can be stored in an 
 * identifier 
 * ==>in java there are two types of data types are there
 	1)Primitive data types
 	2)Non-primitive or user defined or reference data types
 	examples:-strings,arrays,abstract class,interfaces etc
 	========
 	
 	we focus on primitive data type in this class
 	
 	==>Primitive are classified into 3 types
 	   ---------
 	a)Numeric dt
 	b)Boolean dt
 	c)Character dt
 	
 	==>a)numeric dt are classified into 2 types
 	1)Integral dt
 	--------------
 	byte,short,int,long
 	range of byte is -128 to 127
 	range of short is
 	range of int is
 	range of long is 	
 	
 	2)Floating dt
 	-------------
 	float,double
 	
 	==>b)Character dt
 	---------------
 	char
 	
 	==>c)Boolean dt
 	-------------
 	boolean
 
 	*/

public class Class9 {

	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	void meth1()
	{
		System.out.println("Printing the default values of the data types:=");
		System.out.println("int value : "+ i); //0
		System.out.println("byte value : "+ b);//0
		System.out.println("short value : "+ s);//0
		System.out.println("long value : "+ l);//0
		
		
		
		System.out.println("float value : "+ f);//0.0
		System.out.println("double value : "+ d);//0.0
		
		
		System.out.println("char value : "+ c);//u0000(  ) ==>NPC(Non printable character)
		
		System.out.println("boolean value : "+ flag);// false
	}
	void meth2()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("c value :"+c);
		
		byte b1=10;
		byte b2=20; //byte range is -128 to 127
		byte b3=(byte)(b1+b2); //10+20=30 //EXPLICIT TYPE CASTING(to be discussed later)
		System.out.println("b3 value :"+b3);
		
		//by default every number in java is considered as int by the compiler
		//by defautl ecery decimal value in java is considered as double by the compiler
		
		float f=10.9F;		//we need to add F to the end cause compiler takes it as int
		System.out.println("f value :"+f);
		
		long x=2147483648L;		//we need to add L to the end cause compiler takes it as int
		System.out.println("x value :"+x);
	}
public static void main(String[] args) {
	Class9 obj=new Class9();
	obj.meth1();
	System.out.println("-----------------------------");
	obj.meth2();
}
}
/*variables
 =========
 ==> variables are reserved memory locations to store values
 ==> in java variables are divided into 3 types
 1)instance variables
 2)static variables
 3)local variables
 
 this will be int the next class
 
 */
