package com.TasksInClass;
//in task12 we were asked to create a class name programming but for my convienience 
//i created as usual classname.
/*1Q)Write a program to print the name of a student by creating a Student Class
 	if no value is passed to object then value shud be "i love programmig languages" 
 	if a String  value is passed then the value should be the String value*/


public class Task12A {
Task12A(){
	System.out.println("I love programming languages");
}
Task12A(String s){
	System.out.println("I love "+s);
}
public static void main(String[] args) {
	Task12A obj1=new Task12A();
	Task12A obj2=new Task12A("Java Especially");
}
}
