package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import inheritenceGlimpse.ClassB;

public class Class64F {
	void meth1()
	{
		ArrayList<Class64E> al=new ArrayList<Class64E>();
		Class64E aobj1=new Class64E("Kishan", 100, "Java");
		Class64E aobj2=new Class64E("Vijay", 109, "Arts");
		Class64E aobj3=new Class64E("Arun", 107, "Oracle");
		
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		
		System.out.println(al);
		System.out.println("---------------------------");
		
		Collections.sort(al,new Class64G());
		
		Iterator<Class64E> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());			
		}
	}
	public static void main(String[] args) 
	{
		new Class64F().meth1();		
	}
}
