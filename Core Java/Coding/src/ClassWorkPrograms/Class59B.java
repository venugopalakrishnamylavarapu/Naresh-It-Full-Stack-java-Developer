package ClassWorkPrograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


public class Class59B {
	void meth1()
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(10);//Insertion order is not maintained but sorting is maintained
		//ts.add("Java");//C.E  Heterogeneous data is not allowed
		//ts.add(null);//C.E null values are not allowed
		ts.add(17);//C.E Available from java 1.2v
		ts.add(10);//Duplicates are not allowed[if entered it will not be shown in the output]
		ts.add(25);//it is NOT SYNCHRONIZED
		ts.add(86);//its size is increased by DOUBLE
		ts.add(42);//its default capacity is 16 LOAD FACTOR :0.75
		System.out.println(ts);
		System.out.println("----------------------------------------");
		
		System.out.println("Retriving the data using Iterator interface");
		Iterator<Object> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Retriving the data using ListIterator interface");
		ArrayList<Object> al=new ArrayList<Object>(ts);
		System.out.println("Retriving the data in forward direction using listIterator");
		ListIterator<Object> lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.print(lt.next()+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("Retriving the data in backward direction using listIterator");
		while(lt.hasPrevious())
		{
			System.out.print(lt.previous()+" ");
		}
		System.out.println();
		System.out.println("Retriving the data using DescendingIterator()");
		Iterator<Object> it2=ts.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		System.out.println("==============METHODS================");
		System.out.println("headset() : "+ts.headSet(25));//[10,17]
		System.out.println("taileset() : "+ts.tailSet(25));//[25,42,86]
		
		
	}
	public static void main(String[] args) {
		new Class59B().meth1();
	}
}
