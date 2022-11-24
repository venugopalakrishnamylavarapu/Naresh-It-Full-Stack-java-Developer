package ClassWorkPrograms;
//2nd way of creating of thread by using implements(own class btw)

/*
 
 t1.start()
 ----------
 New Thread will be generated which is respionsible for the execution of ClassA run() method.
 
 t1.run()
 --------
 No new Thread will be generated but ClassA run() method will be called just like a normal method call.
 
 t2.start()
 ----------
 A new Thread will be generated which is respinsible for the implementation of Thread Class run() method.
 
 t2.run()
 --------
 No new Thread will be generated but Thread class run() method will be called just like a normal call.
 

 
 
 */
public class Class43A implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("hello here run method executed");
	}
	public static void main(String[] args) {
		Class43A obj=new Class43A();
		Thread t1=new Thread(obj);
		//t1.start();
		//t1.run();
		
		Thread t2=new Thread();
		//t2.start();
		//t2.run();
	}
}
