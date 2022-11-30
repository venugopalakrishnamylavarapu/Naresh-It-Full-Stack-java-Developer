package ClassWorkPrograms;

import java.util.Scanner;

public class Class49B {
	static double current_balance=100;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdrawal");
		int n=sc.nextInt();
		try
		{
			if(current_balance < n)
			{
				throw new Class49A("Insufficient funds ! your Current balance is "+current_balance);
			}
			else
			{
				System.out.println("Please Take The Money : "+n);
			}
		}
		catch(Class49A e)
		{
			e.printStackTrace();
		}
	}
}
