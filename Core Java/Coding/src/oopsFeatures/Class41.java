package oopsFeatures;
/*
 
 InterfaceA,InterfaceB and Class41 are interlinked
 
 
 In Todays class we are going to discuss about "Interfaces".
 
 Java Interface:-
 ---------------
 1)Interface is not a class,it is a blue print of a class.
 2)Syntax:-
   <AcessModifier>interface<InterfaceName>
   {
   
   }
 3)Every method in interface is by default public abstract.
 4)Every variable in interface is by default public static final.
 5)From Java 1.8 version onwards we can write default methods inside an interface.
 6)From Java 1.8 version onwards we can write static methods also inside an interface.[including main()]
 7)From Java 1.8 version onwards we can write private methods inside an interface.
 8)Just like an abstract class we can not instantiate an interface,means we cannot
   create an object for interface.
 9)inside an interface we cannot write constructors,because interface is not a class
10)if we want to inderit an interface into a class we need to use the keyword implements.
11)if we are inheriting an interface into a class 100% in the child class we need to provide 
   implementation(by using Method Overridding) for all the abstract methods which are present
   in the interface,otherwise we will be getting an compile time error. 
12)if we dont want to provide implementation for all the abstract methods present in the interface
   then we need to make our child class also as abstract.
  
 
 
 Funtional Interface
 ===================
 1)A functional interface is an interface which is having only one abstract method.
 2)inside a functional interface we can write any number of default methods,private method,static methods including main method
   but there should be only one abstract method.
 Ex:-runnable interface,consumer interface,supplier interface,comparable interface,comparator interface etc.
 
 Marker Interface
 ================
 1)A Marker intrerface will not have any varibles,any methods.it is just an empty interface.
 2)if a class is inheriting this marker interface it will achieve some special properties.
 Ex:-clonable interface,serializable interface.


 */
public class Class41 extends Class41A implements InterfaceA,InterfaceB
{
public void meth1()
{
	System.out.println("Interface A abstract method overridden");
}
public void show()
{
	System.out.println("Interface B abstract method overridden");
}
public static void main(String[] args) {
	InterfaceA obj=new Class41();
	obj.meth1();
	obj.meth2();
	//obj.meth3();//C.E because it is a private method
	InterfaceA.meth3();
	//obj.meth4();//C.E beacuse it is a private method
	
	System.out.println("------------------------------------------------");
	
	InterfaceB obj2=new Class41();
	obj2.show();
	
	System.out.println("------------------------------------------------");
	new Class41().display();
}
}
