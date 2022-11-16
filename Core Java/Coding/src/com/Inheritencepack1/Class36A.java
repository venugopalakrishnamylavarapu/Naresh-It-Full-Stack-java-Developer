package com.Inheritencepack1;

public class Class36A extends Class36 {
 public void meth2()
 {
	 System.out.println("Class36A method");
	 System.out.println("==>"+new Class36A().hashCode());
 }
 public static void main(String[] args) {
	Class36 obj=new Class36();//Has-A-relation
	obj.meth1();
	//obj.meth2();//C.E
	
	Class36 obj1=new Class36A();
	obj1.meth1();
	//obj1.meth2();//C.E
	
	Class36A obj2=new Class36A();//Is-A-Relation
	obj2.meth1();
	obj2.meth2();
	//Class36B obj3=new Class36();//C.E
 }
}
//Class36  ======> Parent Class
//Class36A ======> Child Class
