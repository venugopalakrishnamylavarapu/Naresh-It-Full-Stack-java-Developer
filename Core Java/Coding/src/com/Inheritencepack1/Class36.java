package com.Inheritencepack1;
/*so todays class is about Inheritance

there was a small glimpse of inheritance when we discussed about object class

Definition
=========
Acquiring the properties of one class into another class.

->if we want to perform inheritance we need to use either "extends" or "implements" Keyword.

Keypoints in inheritance
========================
1)We can hold a parent class Object with a parent class reference & with that
  reference we can ONLY parent class methods.
  ex:-
  ClassA obj=new ClassA();[ParentClass]

2)We can hold a child class Object with a parent class reference & with that
  reference we can call ONLY parent class methods.
  ex:-
  ClassA obj=new ClassB();[ParentClass]
 
3)We can hold a child class Object with a child class reference & with that
  we can call BOTH parent & child class methods
  ex:-
  ClassB obj=new ClassB();[ParentClass & ChildClass]
 
4)We CANNOT hold a parent class object with a child class reference .if we 
  are holding a parent class object with a child class reference we will be
  getting an compile time error
  
  ex:-
  ClassB obj=new ClassA() -->invalid
  
  check the Class36,Class36A,Class36B in inheritance packages
  
  
  Types of Inheritance
  ====================
  1)Single Inheritance  -->  Single inheritance means only one level of inheritance .There should be 
  							only one parent & one child.By default every java class will single 
  							inheritance.(Because Object class is the parent class for all the classes)
  							
  2)Multi-Level inheritance  -->  In multilevel inheritance child class object should be able to access
  								BOTH parent class methods & grand parent class methods.
  								
  3)Heirarchial inheritance -->  Sharing the properties of objects to multiple child objects is called Hierarhcial inhertance
  
  4)Hybrid inheritance -->   Hybrid inheritance means it is a combination of two or more inheritances(For example take our Class36
  							it is a multiple inheritance & it is a hierarchial inheritance)
  							
 *5)Multiple inheritance  -->  Java DOESNOT support multiple inheritance *because of Ambiguity problem*,but we can achieve  it through 
  							    "Interfaces".

 */
public class Class36 {
	public void meth1()
	{
		System.out.println("Class36 method");
	}

}
