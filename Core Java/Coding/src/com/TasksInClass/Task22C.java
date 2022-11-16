package com.TasksInClass;
/*we need to apply the 10% discount to a price if it exceeds 1000rs.and parameter
* shud be taken with units and each unit is equal to 100.*/

public class Task22C {

	    static void meth1(int price)
	    {
	        int realprice=price*100;
	        if(realprice>=1000)
	        {
	            System.out.println("The price with 10% discount is "+(realprice-(realprice/100)*10));
	        }
	        else
	        {
	            System.out.println("Kisan sir u just lost >.< "+realprice+" rs");
	        }
	    }
	    public static void main(String[] args) {
	        meth1(15);
	    }
	    /*
	    this is type showed by kisan sir

	    void cost(int unit)
	    {
	        int bill=unit*100;
	        if(bill>=1000)
	        {
	            int discount=(bill/100)*10;
	            System.out.println("Your final bill is : "+(bill-discount));
	            System.out.println("You saved "+discount+" on your final bill");
	        }
	        else
	        {
	            System.out.println("Your Final bill is : "+bill);
	            System.out.println("if you done more "+(1000-bill)+" rs shopping you will receive 10% discount");
	        }*/
	    }

