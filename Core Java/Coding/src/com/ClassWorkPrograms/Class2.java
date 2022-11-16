package com.ClassWorkPrograms;
//inheritence glimpse of the concept
//uses extends keyword
//check the inheritenceglimpsepackage

/*->object vclass:
 *	object class is present in java.lang package and it is the first 
 * class in the java hierarchy
 * -> for every java class i.e either pre defined or user defined class 
 * object class acts as a parent class by default
 * -> the methods which are present in the object class can be accessed by
 * every other class objects
 * why because(object class is the parent class for all the classes)
 * object class contains .hashcode,.equals,.toString,.getClass etc
 * hashCode():
 * 1)hashcode method will not provide the address location of object
 * 2)it provides a qunique id number for the 
 * objects to differentiate btw two objects*/

public class Class2 {
	void meht2()
	{
		System.out.println("CLass2 is called");
	}
	public static void main(String[] args) {
		
		Class2 obj1=new Class2();//hash code produces unique id for obj (not address!!)
		Class2 obj2=new Class2();
		int k=obj1.hashCode();//produced different hashcode
		int j=obj2.hashCode();//produced different hashcode see?
		System.out.println("obj1 hashcode:- "+k);
		System.out.println("obj2 hashcode:- "+j);
	}

}
