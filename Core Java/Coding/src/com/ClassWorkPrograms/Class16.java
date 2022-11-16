package com.ClassWorkPrograms;
/*
 Understanding static keyword
============================
1)static key word in java is mainly used for memory management.
2)we can use static in 3 ways
  a)a variable can be declared as a static
  b)a method can be declared as a static
  c)a block can be declared as a static
  
  static variable
  ---------------
  1)a variable which is declared as static with static keyword is known as variable.
  2)static variables can never be local variables.
  3)there will be only one copy of static variable available in the entire program.
  4)we can access a static variable in 3 ways.[by using identifierName,by using ClassObject & by using ClassName]
  5)for final static variables JVM will not provide any default values,it is the responsibility of the programmer to initialize a final static
  variable .if we are not initializing a final static variable we will be getting an compile time error.[Whether we are using it or not]
  
  static Method
  -------------
  1)a method which is declared as static with the help of static keyword is known as static method.
  2)just like a static variable we can access static method also in three ways.[by using IdentifierName,ClassObject,ClassName]
  3)we can access a no static variable inside a static method but we need to access it(Instance variable) using ClassObject.
  
  Differences between Instance Method and static Method:-
  -------------------------------------------------------
  Instance Method:-
  ----------------
  1)U can call a instance method in 2 ways
  	a)by Identifier
  	b)by CLassobject
  2)we can access static and non-static variable easily in instance method.
  3)a method which is declared as static is known as static method
  =================================================================================================
  Static Method:-
  --------------
  1)u can call a instance method in 3 ways
  	a)by ClassName
  	b)by ClassObject
  	c)by Identifier
  2)we can access static variable easily but in order to call a non static variable we need to call it with classobject.
  3)a method which is not declared as static is known as Instance method

 */

public class Class16 {
	int a;
	static int b;
	Class16()
	{
		a++;
		b++;
		System.out.println("Instance Variable : "+a);
		System.out.println("static variable : "+b);
	}
	public static void main(String[] args) {
		new Class16();
		System.out.println("------------------------------");
		new Class16();
		System.out.println("------------------------------");
		new Class16();
	}

}
