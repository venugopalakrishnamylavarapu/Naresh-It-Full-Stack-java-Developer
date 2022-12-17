package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Class64B {
	void meth1()
	{
		int arr[]= {4,9,7,3,6,2,1,5};
		System.out.println("Before sorting : "+Arrays.toString(arr));
		Arrays.sort(arr); // sorting the data in Array
		System.out.println("After sorting : "+Arrays.toString(arr));
		
		System.out.println("-----------------------------");
		System.out.println("       ArrayList        ");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(99);
		al.add(25);
		al.add(15);
		al.add(85);
		al.add(45);
		System.out.println("Before sorting : "+al);
		Collections.sort(al);
		System.out.println("After sorting : "+al);
		System.out.println("-----------------------------");
		System.out.println("       LinkedHashset        ");
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(1);
		hs.add(9);
		hs.add(5);
		hs.add(7);
		hs.add(2);
		hs.add(6);
		hs.add(8);
		hs.add(4);
		System.out.println("Before sorting : "+hs);
		
		ArrayList<Integer> al2=new ArrayList<Integer>(hs);
		Collections.sort(al2);
		System.out.println("After sorting : "+al2);
		
	}
	public static void main(String[] args) {
		new Class64B().meth1();
	}

}
