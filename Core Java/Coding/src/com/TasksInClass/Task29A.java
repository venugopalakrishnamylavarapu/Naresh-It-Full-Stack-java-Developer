package com.TasksInClass;
//Understand the flow of program
//and theres is a Hw program check that in the Hw section
public class Task29A {
	 String name;
	    Task29A()
	    {
	        this("Abdul Kalam Azad");
	        this.display();
	    }
	    Task29A(String name)
	    {
	        this.name=name;
	    }
	    void display()
	    {
	        System.out.println("Task1A Name is ="+name);
	    }

	    public static void main(String[] args) {
	        Task29A obj=new Task29A();
	    }

}
