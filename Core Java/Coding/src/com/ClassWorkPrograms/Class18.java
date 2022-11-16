package com.ClassWorkPrograms;

/*Type Casting
 =============
 Type casting means converting one data type to another data type(Except boolean).
 
 There are two types of type casting 
 1)Implicit Type Casting
 2)Explicit Type Casting 
 
 
 1)Implicit Type Casting(Widening)
 =======================
 ==>Converting smaller data type into Larger Data type[smaller data type--->Larger data type]
 1)Implicit Type casting will be done by the compiler auto automatically
 2)in Implicit type casting there is no chance of loss of information.
 
 2)Explicit Type Casting(Narrowing)
 ========================
 ==>Converting Larger data type into Smaller Data type[larger data type--->Smaller data type]
 1)Explicit Type casting will not be done by the compiler it is the responsibility of the programmer.
 2)in explicit type casting there chance of loss of information.
 
 
 */

public class Class18 {
	void implicit()
	{
		System.out.println("Performing Implicit Type Casting");
		//smaller data type to larger data type
		byte b=10;
		int i=b;
		System.out.println("byte value : "+b);
		System.out.println("int value : "+i);
		System.out.println("------------------------------");
		
		char c='a';
		int x=c;
		System.out.println("char value : "+c);//a
		System.out.println("int value : "+x);//97
		//int & char both are compatible datatypes.
	}
	void explicit()
	{
		System.out.println("Performing Explicit Type Casting");
		int i1=500;
		byte b1=(byte)i1;//converted int to byte value===>byte range :-128 to 127
		System.out.println("int value : "+i1);//i2=500
		System.out.println("byte value : "+b1);
		/*[minimumRange + (result -maximumRange - 1)]
		  [-128 +(500)-127-1]
		  [-128+500-128]
		  [500-256]
		  [244]==>still exceeds the bytee range
		  
		  [-128+244-128]
		  [-128+116]
		  [-12]
		  */
		float f=10.99999f;
		byte b3=(byte)f;
		System.out.println("float value : "+f);//10.99999
		System.out.println("byte value : "+b3);//10
	}
	void meth1(byte b)
	{
		System.out.println("meth1() called");
		System.out.println(b);
	}
	public static void main(String[] args) {
		Class18 obj=new Class18();
		obj.implicit();
		System.out.println("=============================");
		obj.explicit();
		System.out.println("=============================");
		obj.meth1((byte)50);
		
	}

}
