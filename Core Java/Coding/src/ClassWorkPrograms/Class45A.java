package ClassWorkPrograms;

public class Class45A {
public static void main(String[] args) throws InterruptedException 
{
	Class45 obj=new Class45();
	obj.start();
	//obj.join();
	Thread.yield();
	for(int i=0;i<=5;i++)
	{
		System.out.println("Class45A method : "+i);
	}
}
}
