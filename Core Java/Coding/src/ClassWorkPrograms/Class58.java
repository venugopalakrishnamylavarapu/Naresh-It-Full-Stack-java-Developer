package ClassWorkPrograms;
//Todays concept is Vector!!
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Class58 {
	void meth1()
	{
		System.out.println("Implementing Vector");
		Vector<Object> v=new Vector<Object>();
		v.add(10); //Insertion order maintained
		v.add("Java"); //Heterogenous data is allowed
		v.add(null); //null values are allowed
		v.add('A'); //Duplicated are allowed
		v.add(1); //It is available from Java 1.0 [Legacy Class]
		v.add(56);//its Default capacity is 10
		v.add(10);//its size increases by double
		v.add(500);//it is SYNCHRONIZED by default
		System.out.println(v);
		
		System.out.println("size() : "+v.size());//8
		System.out.println("capacity() : "+v.capacity());//10
		
		v.add(56);
		v.add(0,1000);
		v.add("CSS");
		
		System.out.println(v);
		System.out.println("capacity() : "+v.capacity());
		
		System.out.println("Retriving the data by using for loop");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		System.out.println("Retriving the data by using Enumeration Interface");
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		/*System.out.println("Retriving the data by using Itterator Interface");
		Iterator<Object> it=v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}*/
	}
	public static void main(String[] args) {
		new Class58().meth1();
	}
}
