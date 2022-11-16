package com.inheritenceGlimpse;
//uses extends to inherit data from parent class to child class 
//an need to be in a same package if not import the package;

public class ClassA {
	void meth1() {
		System.out.println("Class a is accessed");
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		new ClassA().meth1();
		
	}

}
