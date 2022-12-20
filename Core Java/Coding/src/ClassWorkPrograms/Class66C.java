package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	Stream API
 	==========
 ->Java 8 streams are used to manipulate data of collections.
 ->Stream API is not IO streams.
 ->Stream is not a data structure instead it takes input from 
    the collections and provide functional style approach(Lambda expression) to manipulate data.
 ->Streams are used for reading elements but not for storing them.
 ->When used properly stream api allows us to reduce a huge amount of code.
 
 
 Stream API methods
 	a)stream()
 	b)filter()
 	c)Map()
 	d)count()
 	e)sorted()
 	f)collect()
 	g)Collector Class
 	
Consumer vs predicate Function vs Supplier

Type		Abstract Methods			Input				Returns Result as
--------------------------------------------------------------------------------------

Consumer	void accept(T t)		Accepts one				it returns no result
									 Arguments
Predicate	boolean test(T t)		Accepts one				it returns a value i.e
									 Arguments				either true or false
									 
Function	R apply(T t)			Accepts one 			it returns some values
									 Argument			
									 
Supplier	T get()					NILL					It returns some value.

Note:- All these are functional Interfaces,which are present 
		in Java.util.function package which been introduced in java 1.8 



 */
public class Class66C {
	void meth1()
	{
		System.out.println("Implementing Stream API");
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 Integer Objects");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println(al);
		sc.close();
		System.out.println("-------------------------------------------------");
		/*Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		System.out.println("Retriving the data using Stream API");
		al.forEach(x->System.out.println(x));
	}
	public static void main(String[] args) {
		new Class66C().meth1();
	}
}
