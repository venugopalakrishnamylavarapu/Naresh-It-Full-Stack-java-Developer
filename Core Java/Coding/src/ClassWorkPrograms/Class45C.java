package ClassWorkPrograms;
//synchronized block
public class Class45C extends Thread {
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" has entered run()");
		synchronized (this)
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(name+" i value : "+i);
			}
		}
		System.out.println(name+" has completed Execution");
	}
	public static void main(String[] args)
	{
		Class45C obj=new Class45C();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.start();
		t2.start();
	}
}
