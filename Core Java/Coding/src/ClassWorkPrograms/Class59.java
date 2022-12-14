package ClassWorkPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
//here the methods are same for hash set except insertion order in not maintained thats why we didnt wrote the program for the second time
public class Class59 {
	void meth1()
	{
		System.out.println("Implementing Set Classes");
		
		//HashSet<Object> set=new HashSet<Object>(); //Insertion Order is not maintained.
		LinkedHashSet<Object> set =new LinkedHashSet<Object>();//Insertion order is maintained[Java 1.4v]
		
		set.add(10);//Insertion order is maintained.
		set.add("Java");//Heterogeneous data is not allowed.
		set.add(null);//null is allowed.
		set.add(1);//Duplicates are not allowed.
		set.add(56);//Available from java 1.4v.
		set.add(85);//Default capacity :16 //LOAD FACTOR:0.75.
		set.add(10);//its size is increased by DOUBLE
		set.add(25);//it is not synchronized method.
		System.out.println(set);
		System.out.println("----------------------------------------------");

		System.out.println("Retriving the data by using Iterator Interface");
		Iterator<Object> it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		System.out.println("Retriving the data by using List Interface");
		ArrayList<Object> al=new ArrayList<Object>(set);
		ListIterator<Object> lt=al.listIterator();
		System.out.println("Retriving the data in forward directin using listIterator\n\t\t\t ||\n\t\t\t \\/");
		while(lt.hasNext())
		{
			System.out.print(lt.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Retriving the data in backward direction using listIterator");
		while(lt.hasPrevious())

		{
			System.out.print(lt.previous()+" ");
		}
	}
	public static void main(String[] args) {
		new Class59().meth1();
	}
}
