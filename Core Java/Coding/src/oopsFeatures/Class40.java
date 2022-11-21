package oopsFeatures;
/*

Abstraction
===========
it is a process of hiding the implementation details from the user and showing only neccesary details
to the user.
 
 We can achieve abstraction by using two cases
 1)by using Abstract Class.
 2)using Interfaces.
 
 abstractMethod
 ===============
 understanding the abstract Method:-
 
 1)a method which is declared as abstract with abstract keywrod is known as abstract method.
 2)an abstract method always ends with a semi colon(;).
 3)for an abstract method there will not be any method body.
 4)implementation for an abstract method should be given in the next class by 
   using method overridding concept.
   
 keywords we should not use with abstract
 ----------------------------------------
 private,static,native,strictfp,synchronize,final
 we cant use the above combinations with abstract keword-->they will be considered as invalid combinations
 
 syntax for abstract method
 --------------------------
 <AcessModifier>abstract<ReturnType><MethodName>();
 
 
 abstract Class
 ==============
 1)A class which is declared as abstract with abstract keyword is known as abstract class.
 2)Inside an abstract class we can have BOTH normal methods and abstract methods.
 3)It is not mandatory to write atleast one abstract method inside an abstract class.
 4)Writing abstract methods inside an abstract class is always optional.
 5)if we are writing an abstract method inside a normal class then 100% that class should be declared 
   as abstract class otherwise we will be getting an compile time error.
 6)inside an abstract class we can write main method,constructors,normal methods,abstracts methods 
   including static methods also.  
 7)abstract class cant be instantiated  means we cannot create an object for an abstract class.
 8)if we are inheriting an abstract class then in the child class 100% we need to provide implementation(Method Body)
   for all the abstract methods which are present in the abstract class other wise we will be getting an
   compile time error in the child class.
 9)if we are not overridding all the abstract methods present in the abstract class then we will be 
   getting an compile time error(C.E).
10)in the child class if we dont want to provide implementation for the abstract methods present in the abstract class
   then we need to make our child class also as abstract.
   
 
 */
public abstract class Class40 
{
	abstract void meth1();
	abstract void meth1(String str);
	void meth2()
	{
		System.out.println("meth2() called");
	}
	static void meth3()
	{
		System.out.println("static meth3() called");
	}
	Class40()
	{
		System.out.println("abstract class constructor called");
	}
	public static void main(String[] args) {
		
	}
}
