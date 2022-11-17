package com.Inheritencepack1;
/*Inheritance continuation
 
 
 Note:-
 --> constructors does not participate in inheritance.
 
 
 differences between super and this keyword
 ===========================================
 
 			this							super
 ->it is a keyword					->it is a keyword
 ->non-static variable				->non-static variable
 ->used to access current			->use to access parent object
   class object functionality		  functionality from child class
 ->must be used in non-static		->must be used in non-static
   context							  context
 ->it holds object address			->it doesn't hold any object address
 
 
 differences between super() and this()
 =======================================
 
 			super()								this()
 ->used to invoke parent class			->used to invoke current 
   class constructor					  class constructor
 ->Must be used only inside the			->must be used inside another constructor 
   child class constructor				  of same class
 ->it must be first statement			->it must be the first statement
 
 
 
 differences between constructor calls(super(),this()) and key words(super,this)
 ===============================================================================
 
 			super(),this()								super,this
->these are constructor calls						->these are keywords
->we can use these to invoke super class			->we can use these to refers parent class
  &current constructors directly						  and current class instance members
->we should use only inside constructors as			->we can use anywhere(i.e instances area)
 first line,if we are using outside if 				  except static area,otherwise we will get
 constructors we will be getting compile time 		  compile time error
 error
 
 
 
 */
public class Class37 {
	//constructors does not participate in inheritance
		void meth1()
		{
		System.out.println("Class37 method");	
		}
		Class37()
		{
		System.out.println("Class37 Default Constructor");
		}
		Class37(int a,int b)
		{
			this();//calling present class constructor
			System.out.println("Class 37 Parameterized constructor : "+(a+b));
		}
}
