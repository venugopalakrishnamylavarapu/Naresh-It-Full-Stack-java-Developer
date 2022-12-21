package ClassWorkPrograms;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Class67 {
	void meth1()
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Naresh");
		al.add("Ram");
		al.add("John");
		al.add("Sujatha");
		al.add("Kishan");
		
		Stream<String> s1=al.stream();
//		Stream<String> s2=s1.filter(data->data.length()<=4);
//		long val=s2.count();
		s1.filter(data->data.length()<=4).forEach(d->System.out.println(d));
		
		//long val=al.stream().filter(data->data.length()<=4).count();	//every code we written above is done here in a single line
		
		//System.out.println("There are "+val+" objects which are having length less than or equal to 4");
		
	}
	public static void main(String[] args) {
		new Class67().meth1();
	}
}
