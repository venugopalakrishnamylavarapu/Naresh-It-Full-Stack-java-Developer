package com.TasksInClass;

public class Task22B {
	/*WAP take values of length and breadth of a rectangle from a parameterized method and check if it is square or not*/
	    static void meth1(int length,int breadth)
	    {
	        if(length==breadth)
	            System.out.println("the figure is a square");
	        else
	            System.out.println("the figure is not a square");
	    }
	    public static void main(String[] args) {
	        meth1(3,5);
	    }
	  /*
	   this is also one type of method!!

	   String meth1(int length,int breadth)
	    {
	        if(length==breadth)
	            return "it is a square";
	        return "it is a rectangle";
	    }*/
}
