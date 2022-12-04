package ClassWorkPrograms;
//this class is about garbage collector
/*
 Garbage Collection
 ==================
 1)Garbage collection is a process of re-aqiring the heap space by destroying all the unused or unreferences Objects
   from the heap area.
 2)Garbage collection is done by a daemon thread known as Garbage Collector.
 3)Garbage collector is  going to use mark and sweep algorithm for destroying all the unused variables and objects.
 4)Garbage collector is going to mark all the live objects and destroys all unmarked objects.
 5)Garbage collector will be working in the background of every Java Program,we no need to call it manually.
 6)If we want to call garbage collector manually also we can do that by using System class or Runtime class.
 7)If Garbage Collector is acting on our program it will internally call the finalize() which is present in object class.
 8)finalize() is going to terminate the connection which were associated with that object in our class.
 
 
 Question:- When an object is eligible for destuction by garbage collection.
 Answer:-
 		   1.By Re-assigning the reference variable:-
 		   -----------------------------------------
 		   ->If we are reassigning an object reference to another object then automatically the first object is available 
 		     for Garbage Collection.
 		     
 		   2.By Nullifying the reference variable:-
 		   ----------------------------------------
 		   ->If we are assign null value to the object reference,then that particular object is eligible for Garbage Collection.
 		   
 		   3.All Objects created inside method:-
 		   -------------------------------------
 		   ->All objects created inside any method are by default eligible for Garbage Collection,provided after completion of the
 		     method implementation.
 		     
 		   
 Question:-What is the difference between final,finally,finalize??
 Answer:-
 			(Own Definitions)
 			 final:-
 			 ------
 			 final is a keyword which make a variable or method as constant.we cannot change any the variable value or method statements
 			 once we use final key word with them
 			 (Restrict the user in modifications of variables or methods)
 			 
 			 finally:-
 			 --------
 			 finally is a block which is used in ExceptionHandling to execute the statements in it no matter regarding the  exceptions.
 			 it is used to close the connections.
 			 ()
 			 finalize:-
 			 --------
 			 finalize is a predefined method present in object class.it will be invoaked when an object is eligible for garbage collection.
 		
 
 Next topic I/O streams
 IO-Stream
 ---------
 */
public class Class51 {
	void meth1()
	{
		System.out.println("meth1() called");
		Class51 obj=new Class51();//3rd way
	}
	@Override
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) {
		Class51 obj1=new Class51();
		Class51 obj2=new Class51();
		
		//obj2=obj1;  //1st way
		//obj1=null;  //2nd way
		
		System.gc(); //calling garbage collector manually
		/*
		 Runtime r=Runtime.getRuntime();
		 r.gc();
		 */
	}
	
}
