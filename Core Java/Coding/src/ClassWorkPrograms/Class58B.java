package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class Class58B {
	private static Object arr[];
	static
	{
		arr=new Object[100000];
		for(int i=0;i<arr.length;i++)
			arr[i]=new Object();
	}
	void ArrayListTime()
	{
		long start;
		long end;
		ArrayList<Object> al=new ArrayList<Object>();
		start=System.currentTimeMillis();//its a static method gives the current system time in long millisec
		for(Object obj1:arr)
		{
			al.add(obj1);
		}
		end=System.currentTimeMillis();
		System.out.println("ArrayList Construction Time : "+(end-start));
	}
	void LinkedListTime()
	{
		long start;
		long end;
		LinkedList<Object> ll=new LinkedList<Object>();
		start=System.currentTimeMillis();
		for(Object obj2:arr)
		{
			ll.add(obj2);
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList Construction Time : "+(end-start));
	}
	void meth1()
	{
		for(Object o:arr)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		Class58B object=new Class58B();
		object.ArrayListTime();
		object.LinkedListTime();
		//object.meth1();
	}
}
