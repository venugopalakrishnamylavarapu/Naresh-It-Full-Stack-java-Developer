package ClassWorkPrograms;

import oopsFeatures.InterfaceA;
/*
 ->Java Introduced a new feature called method reference which is used as an implementation
 	to a functional interface.
 ->it is a simplest way of defining lambda expression for *existing method logic *
 ->There are three types of referencing 
 		a)static Method referencing(FI)
 		b)constructor referencing(FI)
 		c)Non-static method referencing(FI)
 */
public class Class66A{
	void display()
	{
		System.out.println("Implementing Method References");
		InterfaceA x=new Class66()::checkAge; //Refering a non-static method
//		InterfaceA x=Class66::msg;//Referencing a statiac method.
//		InterfaceA x=Class66::new;//Referencing a constructor
		x.meth1();
	}
	public static void main(String[] args) {
		new Class66A().display();
	}
}
