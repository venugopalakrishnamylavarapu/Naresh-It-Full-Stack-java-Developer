package ClassWorkPrograms;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

/*
 Hashtable:
 ==========
 ->insertion order is not maintained
 ->Null Key & Null Values are not allowed
 ->Synchronized
 ->available from Java 1.0v[Legacy class]
 
 TreeMap
 =======
 ->Insertion order is not maintained but sorting order is maintained by the keys in ascending order
 ->null keys are not allowed & Null Values are allowed
 ->Not Synchronized
 ->available from Java 1.5v
 
 LinkedHashMap
 =============
 ->Insertion order is maintained.
 ->Null keys and Null values are allowed
 ->Not synchronized
 ->available from Java 1.5v

 
 HashMap
 ======
 ->Insertion order is not maintained but sorting order is maintained
 ->null keys and null values are allowed.
 ->Not Synchronized
 ->available from Java 1.2v


Difference between Comparable and Comparator(Very Very Important)
--------------------------------------------
		
		Comparable												Comparator
->it is an interface present in							->It is an interface present in the java.util
  the java.lang package									  package
->it is used fro defining the natural 					->it is used to compare objects in a way that 
  sorting order of the object							  might not align with the natural ordering
														  [Custom sorting order]
->Uses compareTo()										->Uses compare()
		
		
			
		
 */

public class Class63
{
	void meth1()
	{
	Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(101, "Java");//Insertion order is not maintained
		ht.put("Java", "Java");//Heterogeneous keys are allowed &&Heterogeneous values are allowed
		//ht.put(null, null);//null keys && null values Both are not allowed
		ht.put(107, "Java");//Duplicate values are allowed
		ht.put(104, "Python");//It is available from Java 1.0v[Legacy Class]
		ht.put(105, "C++");//Its default Capacity is 11,Load Factor is 0.75
		ht.put(109, "Oracle");//its size increases by double
		ht.put(110, ".Net");//it is synchronized(Just Like Vector)
		System.out.println(ht);
		System.out.println();
		System.out.println("--------------------------------");
		
		HashSet<Object> hs=new HashSet<Object>(ht.entrySet());
		Iterator<Object> i=hs.iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
	public static void main(String[] args) {
		new Class63().meth1();
	}
}
