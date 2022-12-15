package ClassWorkPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
//TreeMap
public class Class62 {
	void meth1()
	{
		System.out.println("Implementing TreeMap");
		TreeMap<Object,Object> tm=new TreeMap<Object,Object>();
		tm.put(101,"India");//Insertion order is not maintained but sorting order is maintained with the keys
		tm.put(105, 1000);//Heterogeneous keys are not allowed & Heterogeneous values are allowed
		tm.put(108, null);//null keys are not allowed & null values are allowed.
		tm.put(109, "America");//Duplicate values are allowed
		tm.put(104, "Japan");//It is available from Java 1.2v
		tm.put(106, "Australia");//Its default capacity is 16,Load factor is 0.75
		tm.put(103, "Japan");//Its size increases by double
		tm.put(102,"Paris");//It is Not synchronized
		System.out.println(tm);
		
		HashSet<Object> hs=new HashSet<Object>(tm.entrySet());
		Iterator<Object> it=hs.iterator();
		while(it.hasNext())
		{
			Entry e=(Entry)it.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
	public static void main(String[] args)
	{
		new Class62().meth1();
	}
}
