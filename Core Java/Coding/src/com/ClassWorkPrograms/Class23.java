package com.ClassWorkPrograms;
/* 
 
 UNDERSTANDING SWITCH CASE STATEMENT
 ===================================
 1)Unlike if-else switch will have multiple possible executions.
 
 syntax of switch
 ----------------
 
 switch(Key)
 {
 		case label1:
 			-------------;
 			-------------;
 	    case label2:
 			-------------;
 			-------------;
 		case label3:
 			-------------;
 			-------------;
 }
 
 2)upto java 1.4 version switch accepts int,byte,short,char data types
 3)from java 1.5 version onwards switch started accepting Their Respective wrapper classes also.
 4)from java 1.7 version onwards switch started accepting String also.
 5)inside switch case we can write any number of case labels.
 6)if a case label got matched with the key value then from that case all the cases which were
   present inside the switch will be getting executed.
 7)in order to avoid this situation,if we want only the case which got matched with the key value to
   be executed then we need to use break statements.
 8)whenever the compiler came across break statement the program will not terminated the compiler
   will just come out from the block.
 9)if no case label is matching with key value then we can write default case.
 10)default case will be getting executed only if no case label is matching with the key value
    IRRESPECTIVE OF ITS POSITION.
 11)we can write default case anywhere inside the switch case statement.
 12)individual statements are not allowed in switch case.i.e every statement should be belonging to a particular case.
 13)Duplicate case labels are not allowed in switch.
 14)Key data type and the case label data types should be compatible.
 14)Case values range should be within the key range.
 15)we can write expressions also at key and labels.
 16)inside switch case we can write any valid java code.
 17)Every case label value should be compile time constant.
 18)All the cases including break and default case are optional in switch.
 
 
 */


public class Class23 {
	void meth1()
	{
		System.out.println("Implement switch case");
		int a=65;
		byte b=20;
		final int x=10;
		switch(b+45)
		{
		case x:
			System.out.println("Case 10 executed");
			break;
		case 200:
			System.out.println("Case 20 executed");
			break;
		case 'A'-5:
			System.out.println("int & char both are compatible data types");
			break;
		case 40+25:
			System.out.println("Case 65 executed");
			if(a<=100)
			{
				System.out.println("if block executed");
				new Class23().meth2();
			}
			else
			{
				System.out.println("else block executed");
				new Class23().meth3();
			}
			break;
			default:
				System.out.println("No case label is matching with the key value");
			break;
		}
		System.out.println("Compiler came out from switch case");
	}
	void meth2()
	{
		System.out.println("meth2() called");
	}
	void meth3()
	{
		System.out.println("meth3() called");
	}

public static void main(String[] args) {
	Class23 obj=new Class23();
	obj.meth1();
}
}