package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Iterator;

//Today concept is ArrayList
public class Class56 {
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);//Insertion order is maintained.
		//al.add("Java"); //Heterogenous elements are allowed.
		//al.add(null); //null value is allowed
		al.add(1); //Duplicates are allowed
		al.add(86);//It is available from Java 1.2v
		al.add(45);//Its default capacity is 10
		al.add(10);//Its size increases by half
		al.add(25);//It is NOT synchronized
		System.out.println(al);
		
		System.out.println("------------------------------");
		System.out.println("size() : "+al.size());//8
		System.out.println("get() : "+al.get(1));//Java
		System.out.println("get() : "+al.get(al.size()-1));//25
		
		System.out.println("-------------------------------");
		System.out.println("Retreiving the data by using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("Retriving the data in reverse order by using for loop");
		for(int i=al.size()-1;i>0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Retricving the data by using for each loop");
		for(int o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Retriving the data by using Iterator Interface");
		Iterator<Integer> i=al.iterator();//[10 1 86 45 10 25]
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");//10 1 86 45 10 25
		}
		System.out.println();
		System.out.println("--------------Methods-----------------");
		al.add(1,50);
		System.out.println(al);
		al.remove((Object)50);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.isEmpty());
		//al.clear();
		System.out.println(al.isEmpty());
		al.add(4,1);
		System.out.println(al);
		al.remove((Object)1);
		System.out.println(al);
	}
	public static void main(String[] args) {
		new Class56().meth1();
	}
}
