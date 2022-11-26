package ClassWorkPrograms;
//this is an example of next topic so dont mind the program for now in the next class we will see the program expalination and the concept behind it.
public class Class45D {
	public static void main(String[] args)
	{
		final String A="Java";
		final String B="Python";
		
		Thread t1=new Thread()
		{
			@Override
			public void run()
			{
				synchronized (A)//Thread 1 is holding Java
				{
					System.out.println("Thread 1 locked on A");
				try 
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				synchronized (B)//Thread 1 will be waiting for B(Python)
				{
					System.out.println("Thread 1 locked on B");
				}
				System.out.println("no dead lock");
			}
			}
		};
	Thread t2=new Thread()
	{
		@Override
		public void run()
		{
			synchronized (B)//Thread 2 is holding Python
			{
				System.out.println("Thread 2 locked on B");
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				synchronized (A)//Thread 2 will be waiting for A(Java)
				{
					System.out.println("Thread 2 locked on A");
				}
			}
			System.out.println("no dead lock");
		}
	};
			t1.start();
			t2.start();
		
	}
}
