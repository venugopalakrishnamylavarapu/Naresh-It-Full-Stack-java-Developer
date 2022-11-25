package ClassWorkPrograms;
//this is child class of thread class
//here we use join() method
public class Class44A extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class 44A method : "+i);
		}
	}
}
