package ClassWorkPrograms;
//check the class66A for the topic today 
//btw today topic is Method Referencing
import java.util.Scanner;

public class Class66 {
	void checkAge()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		sc.close();
	}
	static void msg()
	{
		System.out.println("We are refferening a static method");
	}
	Class66()
	{
		System.out.println("we are reffering a constructor");
	}
}
