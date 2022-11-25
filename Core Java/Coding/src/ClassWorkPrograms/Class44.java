package ClassWorkPrograms;
/*
 Continuation of the multithreading
 
 
Thread Schedular
================
It will decide which Thread should start its execution basing on TWO aspects
 ==>Thread Prorities
 ==>Underlying OS
 
Thread Prorities
================
The Prorites of a Thread varies between 1 to 10
	-->Minimum Priority is : 1
	-->Maximum Priority is :10
	-->Default /Normal Priority is : 5


methods
=======

join()
-----
1)join() method allows the current executing thread to wait for the completion of another thread
2)Every join() method throws inturrupted exception Hence compulsury we should handle either by try-catch or
  by throws keyword otherwise we will be getting compile time error.
 
sleep()
-------
1)if we want a thread to pause performing any actions for a given amount of time then we should use sleep() method
2)This is an efficient means of making processor time available to the other threads of an application.
3)we can pause the execution of a thread by using '2' predefined methods.
4)However these sleep times are not garunted to be precise,Because they are highly system dependent.






*/
public class Class44 extends Thread {
@Override
public void run()
{
	String name=Thread.currentThread().getName();
	int priority=Thread.currentThread().getPriority();
	for(int i=0;i<=5;i++)
	{
		System.out.println(name+"("+priority+")"+" has executed Run method : "+i);
	}
}
public static void main(String[] args) {
	Class44 obj=new Class44();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	t1.setName("First-Name");
	t2.setName("Second-Thread");
	
	
	t1.setPriority(MIN_PRIORITY);
	t2.setPriority(10);
	
	t1.start();
t2.start();
	obj.start();
	
}
}

