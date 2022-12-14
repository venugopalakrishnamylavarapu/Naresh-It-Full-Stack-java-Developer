package ClassWorkPrograms;
import java.util.HashSet;
import java.util.Iterator;
public class Class59A {
	void meth1()
	{
		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add(10);//Insertion Order is not maintained
		hs.add("Java");//Heterogenous data is allowed
		hs.add(null);//null values are allowed
		hs.add('K');//Available from java 1.5v
		hs.add(25);//Default Capacity is 16 LOADFACTOR:0.75
		hs.add(56);//it is not synchronized
		hs.add(10);//it accepts dupicate values
		hs.add(17.542);//size is increased by double
		System.out.println();
		System.out.println("Retriving the data by using Iterator interface");
		Iterator<Object> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
//		here we cannot retrive the data in backward direction because Insertion order is not followed
//		System.out.println("Retriving the data in backward direction using List Iterator");
//		ArrayList<Object> al=new ArrayList<Object>(hs);
//		ListIterator<Object> lt=al.listIterator();
//		while(lt.hasPrevious())
//		{
//			System.out.print(lt.previous()+" ");
//		}
//		while(lt.hasNext())
//		{
//			System.out.println(lt.next());
//		}
	}
	public static void main(String[] args) {
		new Class59A().meth1();
	}
}
