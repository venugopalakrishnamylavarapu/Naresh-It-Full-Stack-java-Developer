package com.ClassWorkPrograms;
/*From next CLass onwards we start OOPS Concepts so it will be in different package so check it out*/
public class Class34C {
	   void meth1()
	    {
	        StringBuffer sb=new StringBuffer();
	        //Default capacity of String Buffer is 16
	        System.out.println("Capacity : "+sb.length());//16
	        System.out.println("size() : "+sb.length());//0

	        sb.append("abcdefghijklmnop");
	        System.out.println("sb : "+sb);
	        System.out.println("Capacity : "+sb.capacity());//16
	        System.out.println("size() : "+sb.length());//16

	        sb.append("q");
	        System.out.println("sb : "+sb);
	        //(currencapacity+1)*2   <----------formula
	        System.out.println("Capacity : "+sb.capacity());//34
	        System.out.println("size() : "+sb.length());//17

	        System.out.println("charAt() : "+sb.charAt(0));//a
	        System.out.println("reverse() : "+sb.reverse());
	        System.out.println("charAt() : "+sb.charAt(0));//q
	    }

	    public static void main(String[] args) {
	        Class34C obj=new Class34C();
	        obj.meth1();
	    }
}
