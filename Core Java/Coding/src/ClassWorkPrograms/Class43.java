package ClassWorkPrograms;
/* 
 
 in this class we discuss about multithreading
 
 first we need to understand about multitasking.
 
 Multitasking
 ============
 "it means performing multiple tasks at a same time by a single processor in order to optimize the
 utilization of CPU".
 
 
 we can perform mutitasking in two ways
 1)Process Based Multitasking[Multi-processing]
 2)Thread Based Multitasking[Multi-threading]
 
 -->let us assume process is a program for now
 
 q)What is a thread?
 a)1)A thread is a smallest unit of a process
   2)Process acts as a HOST for Thread
   3)Atleast one process is required to create a Thread.(vvv important)
   4)Threads share same address locations(vvv important)
   5)Context-switching is easy in Threads.
   
q)How to create a thread?(important question)
a:-we can create a Thread in TWO ways
   =>By extending Thread Class
   =>By implementing Runnable Interface
 
 both runnable interface and thread class are present in java.lang package
 
 Note:-
 ====
 Whenever we are starting a Thread with the help of start(), every Thread by default 
 executes run() method
 run method:-
 -----------
 public void run()
 {
 
 }
 
 
STEPS TO CREATE A THREAD
========================
step-1:-Write a class that extends Thread class or implements Runnable interface this is available in lang package

step-2:-Write public void run() method in that class,this is the method by default executed by any thread

step-3:-Create an object to that class(Inside main())

step-4:-Create a Thread Class Object and attach it to your class object.

step-5:-Start running the thread.

 
 
 t1.start()
 ----------
 New Thread will be generated which is respionsible for the execution of ClassA run() method.
 
 t1.run()
 --------
 No new Thread will be generated but ClassA run() method will be called just like a normal method call.
 
 t2.start()
 ----------
 A new Thread will be generated which is respinsible for the implementation of Thread Class run() method.
 
 t2.run()
 --------
 No new Thread will be generated but Thread class run() method will be called just like a normal call.
 
 
 
  */

//this is the class created by my own method
public class Class43 extends Thread {
public void run()
{
	for(int i=0;i<=10;i++)
	{
		System.out.print(i+" ");
	}
}
public static void main(String[] args) {
	Class43 obj=new Class43();
	Thread obj1=new Class43();
	obj1.start();
}
}


/*
 public class CLassA extends Thread
 {
 public void run()
 {
 	for(int i=1;i<=5;i++)
 	{
 		sysout("Run method executed : "+i);
 	}
 }
 public static void main(String[] args)
 {
 	ClassA obj=new ClassA();
 	Thread t=new Thread(obj);
 	t.start();
 }
 }
 
 
 */
