package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Stream API some more methods and todays task will be in the TaskSection
public class Class67A {
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(55);
		
		/*
		Stream<Integer> s1=al.stream();
		Stream<Integer> s2=s1.map(data->data*2);
		List<Integer> li=s2.collect(Collectors.toList());
		*/
		
		List<Integer> li=al.stream().map(data->data*2).collect(Collectors.toList());
		System.out.println(li);
	}
	void meth2()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(8);
		al.add(25);
		al.add(86);
		al.add(12);
		al.add(55);
		System.out.println("Before : "+al);
		Collections.sort(al);
		
		List<Integer> li=al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("After : "+li);
	}
	public static void main(String[] args) {
		new Class67A().meth1();
		new Class67A().meth2();
	}
}
