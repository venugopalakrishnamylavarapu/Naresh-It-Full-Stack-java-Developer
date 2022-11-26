package ClassWorkPrograms;
//daemon thread concept
public class Class46B extends Thread
{
	public void run()
	{
		int i=0;
		while(true)
		{
			i+=1;
			System.out.println("Daemon : "+i);
		}
	}
	public static void main(String args[])
	{
		Class46B obj=new Class46B();
		/*
		 d.setDaemon(true);
		 d.start();
		 */
		Thread t1=new Thread(obj);
		t1.setDaemon(true);
		t1.start();
		
		for(int i=0;i<=20;i++)
		{
			System.out.println("main : "+i);
		}
		System.out.println("end of main");
		
	}
}
