package ClassWorkPrograms;

import java.io.FileReader;

// this section started with tasks so check in the task section

/*
 todays concept is about throw and throws keyword
 
 throw
 =====
 1)throw keyword is used to throw user defined -exception messages.
 2)We need to use throw keyword only inside a method body.
 3)We can use throw keyword both for Checked exceptions & Un-Checked Exceptions.
 
 throws
 ======
 1)throws keyword is used for escaping from exception handling.
 2)We need to use throws keyword along with the method signature.
 3)We need to use throws keyword with Checked Exception.
 */
public class Class49 {
	int avi_amt=10000;
	void with_draw(int wd_amt)
	{
		if(avi_amt<wd_amt)
		{
			throw new ArithmeticException("Insufficient Funds");
		}
		else
		{
			System.out.println("Transaction success");
		}
	}
	void fileOperations() throws Exception
	{
		System.out.println("Hello");
		FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop");
	}
	public static void main(String[] args) throws Exception
	{
		Class49 obj=new Class49();
		//obj.with_draw(15000);
		obj.fileOperations();
	}
}
