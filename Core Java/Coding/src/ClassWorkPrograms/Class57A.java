package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Class57A {
	void meth1()
	{
		System.out.println("Passing user defined Objects in to ArrayList");
		ArrayList<Class57> al=new ArrayList<Class57>();
		
		Class57 obj1=new Class57("Venu",101,"Java");
		Class57 obj2=new Class57("Narendra",102,"Python");
		Class57 obj3=new Class57("Madhu",103,"UI");
		
		//passing Objects into arraylist
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(new Class57("Sathwika",104,"Testing"));
		
		System.out.println(al);
		System.out.println("----------------------------------------------");
		
		System.out.println("Retriving the data by using Iterator Interface");
		
		Iterator<Class57> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new Class57A().meth1();
	}
}
