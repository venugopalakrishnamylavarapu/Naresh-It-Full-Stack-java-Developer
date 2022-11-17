package com.Inheritencepack1;

public class Class37A extends Class37 {
		void meth2()
		{
			new Class37A();
			System.out.println("Class37A method");
			super.meth1();
		}
		void meth3()
		{
			System.out.println("meth3() called");
		}
		Class37A()
		{
			System.out.println("Class37A Default constructor");
		}
		Class37A(int a)
		{
			//this();//C.E
			super(99,1);
			super.meth1();
			this.meth3();
			System.out.println("Class 37A parameterized constructor : "+a);
		}
		public static void main(String[] args) {
			Class37A obj=new Class37A(500);
			obj.meth2();
		}

}
