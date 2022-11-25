package ClassWorkPrograms;

public class Class44D extends Thread {
	public void run()
	{
		System.out.println("Iam ready for Interviews");
		for(int i=0;i<=10;i++)
		{
			System.out.println("This is my "+i+" interview");
		}
		System.out.println("I got placed,Now i can Relax");
		try {
			Thread.sleep(15000);//15 secs
		}
		catch(Exception e)
		{
			System.out.println("My sleep got disturbed");
		}
		System.out.println("Time to go to office");
	}
	public static void main(String[] args) {
		Class44D obj=new Class44D();
		Thread t=new Thread(obj);
		t.start();
		t.interrupt();
	}
}
