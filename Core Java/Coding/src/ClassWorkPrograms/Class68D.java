package ClassWorkPrograms;

import java.util.Optional;

/*
 OptionalClass
 =============
	->Java Announced a new class Optional in jdk8 which is used to deal with 
	  NullPointerException in Java application
	->it is a public final class,soit cant be inherited.
	->it is present in java.util package.
	->Optional class offers methods which are used to check the presence of value
	  for particular variable.
 */
public class Class68D {
	void meth1()
	{
		String arr[]=new String[5];
		arr[1]="Kishan";
		arr[2]="Java";
		
		//System.out.println(arr[0].length());
		
		Optional<String> o=Optional.ofNullable(arr[1]);
		System.out.println(o);//Kishan
		
		if(o.isPresent()) //true
		{
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else
		{
			System.out.println("its Empty");
		}
	}
	public static void main(String[] args) {
		new Class68D().meth1();
	}
}
