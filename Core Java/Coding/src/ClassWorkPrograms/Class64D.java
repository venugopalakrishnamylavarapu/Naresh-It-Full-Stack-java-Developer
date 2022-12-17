package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Class64D {
	void meth1()
	{
		ArrayList<Class64C> al=new ArrayList<Class64C>();
		Class64C aobj1=new Class64C("Kishan", 100, "Java");
		Class64C aobj2=new Class64C("Vijay", 109, "Arts");
		Class64C aobj3=new Class64C("Arun", 107, "Oracle");
		
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		
		System.out.println(al);
		System.out.println("---------------------------");
		
		Collections.sort(al);
		
		Iterator<Class64C> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());			
		}
	}
	public static void main(String[] args) 
	{
		new Class64D().meth1();		
	}
}
