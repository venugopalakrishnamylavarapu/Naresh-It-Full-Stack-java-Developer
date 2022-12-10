package ClassWorkPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

//This is the concept about Linked list
public class Class58A {
	 void meth1()
	 {
		 System.out.println("Implementing LinkedList");//In LinkedList data will be stored in the NODES
		 LinkedList<Object> ll=new LinkedList<Object>();
		 ll.add(10);//Insertion order is maintained
		 ll.add("Java");//Null values are allowed
		 ll.add('A');//Heterogenous values are allowed
		 ll.add(10);//it is availble from java 1.2v
		 ll.add(null);//it is NOT SYNCHRONIZED
		 ll.add(23);//Default capacity of the LinkedList is 0
		 ll.add(0);//Size increases by double
		 ll.add(28.4);//Duplicates are allowed
		 System.out.println(ll);
		 
		 System.out.println("Retriving the data using ListIterator interface");
		 ListIterator <Object> llit=ll.listIterator();
		 System.out.println("Retriving the data in forward direction");
		 while(llit.hasNext())
		 {
			 System.out.print(llit.next()+" ");
		 }
		 System.out.println();
		 System.out.println("Retriving the data in backward direction");
		 while(llit.hasPrevious())
		 {
			 System.out.print(llit.previous()+" ");
		 }
		 System.out.println();
		 System.out.println("Removing the data using remove()");
		 System.out.println(ll);
	 }
	 public static void main(String[] args) {
		new Class58A().meth1();
	}
}
