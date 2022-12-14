package ClassWorkPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Vector;
/*
 Understanding Map Interface
 ===========================
 1)Map is not the child class for Collection Interface.
 2)it is one of the root interfaces of collection framework.
 3)in Map implementation classes data will be stored in the form of KEY-VALUE pairs.
 4)Key should be unique.
 5)values can be Duplicate.
 */
public class Class61 {
	void meth1()
	{
		System.out.println("Implementing Map Interface");
		//HashMap<Object,Object> map=new HashMap<Object,Object>();
		LinkedHashMap<Object,Object> map=new LinkedHashMap<Object,Object>();
		
		//HashMap ==>Does not maintain insertion order & available from Java 1.2v
		//LinkedHashMap ==>mainatains insertion order & available from Java 1.4v
		
		
		map.put(101, "Java");//Insertion order is not maintained.
		map.put("Java",1000);//Heterogeneous keys & Heterogeneous values are allowed
		map.put(null, null);//null values are allowed.
		map.put(104, "Html");//Duplicate values are allowed
		map.put(102, "Css");//It is available from Java 1.2v
		map.put(105, "Html");//its default capacity is 16,Load Factor is 0.75
		map.put(103, "Oracle");//its size increases by double
		System.out.println(map);//it is not synchronized
		map.put(105, "Spring");
		System.out.println(map);
		
		System.out.println("--------------------------------------");
		System.out.println(map.get(101));
		System.out.println(map.get("Java"));
		System.out.println("--------------------------------------");
		
		//HashSet<Object> hs1=new HashSet<Object>(map.keyset());
		
		LinkedHashSet<Object> hs1=new LinkedHashSet<Object>(map.keySet());
		System.out.println("Keys present in Map : "+hs1);
		Iterator<Object> i1=hs1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("--------------------------------------");
		HashSet<Object> hs2=new HashSet<Object>(map.entrySet());
		Iterator<Object> i2=hs2.iterator();
		while(i2.hasNext())
		{
			//System.out.println(i2.next()); //used to retrieve data as KEY-VALUE
			Entry e=(Entry)i2.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		System.out.println("retriving using for loop");
		
		new LinkedHashSet<Object>(map.entrySet());
		//new TreeSet<Object>(map.entrySet());
		new ArrayList<Object>(map.entrySet());
		new LinkedList<Object>(map.entrySet());
		new Vector<Object>(map.entrySet());
		
	}
	public static void main(String[] args) {
		new Class61().meth1();
	}
}
/*
 In all Map Implementation classes we can pass duplicate key-values pairs 
 we will not be getting any error or an exception.But old values which is associated
 with that key will be replaced with the NEW Value.
 */
