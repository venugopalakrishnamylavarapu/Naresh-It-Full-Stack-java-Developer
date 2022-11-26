package ClassWorkPrograms;

public class Class46A 
{
	public static void main(String[] args) 
	{
		Class46 obj1=new Class46();
		new Thread()
		{
			//Anonymous Inner Class Starts here
			public void run()
			{
				try {
					obj1.with_draw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}//Anonymous Inner Class Ends here
		.start();
		new Thread()
		{//Anonymous Inner Class starts here
			public void run()
			{
				obj1.deposit(10000);
			}
		}//Anonymous Inner Class ends here
		.start();
	}
}
