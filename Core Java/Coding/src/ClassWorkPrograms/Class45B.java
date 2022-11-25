package ClassWorkPrograms;
//synchronized method
public class Class45B extends Thread {
public void run()
{
	criticalResource();
}
synchronized void criticalResource()
{
	String name=Thread.currentThread().getName();
	System.out.println(name+" has entered criticalResource()");
	for(int i=1;i<=5;i++)
	{
		System.out.println(name+" i value : "+i);
	}
	System.out.println(name+" has completed criticalResource() Execution");
}
public static void main(String[] args) {
	Class45B obj=new Class45B();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	t1.setName("First-Thread");
	t2.setName("Second-Thread");
	
	t1.start();
	t2.start();

}
}
