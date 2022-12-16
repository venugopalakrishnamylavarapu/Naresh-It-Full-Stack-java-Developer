package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Class64 {
	void meth1()
	{
		ArrayList<Class64A> al1=new ArrayList<Class64A>();
		Class64A obj1=new Class64A("Venu",101,"Java");
		Class64A obj2=new Class64A("Gopala",102,"Python");
		Class64A obj3=new Class64A("Krishna",104,"Oracle");
		al1.add(obj1);
		al1.add(obj2);
		al1.add(obj3);
		
		System.out.println(al1);
		Iterator it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		new Class64().meth1();
	}
}
