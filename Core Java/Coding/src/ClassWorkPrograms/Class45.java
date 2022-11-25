package ClassWorkPrograms;
/*continuation of multithreading 
 
 
 yeild()
 =======
 1)yield() provides a mechanism to inform the "thread scheduler" that the current thread is willing to hand over
  its current use of the processor.but it'd like to scheduled vack soon as possible.
 2)if we are using the yield method then the selected thread will give a chance for other threads with same priority
   to execute.
 3)if there are several waiting Threads with same priority,then we can't expect exactly which Thread will get chance 
   for its execution.
 4)we can't guess again when the yielded method
 
 
 Thread Synchronization
 ======================
 1)synchronization in java controls multiple threads fromaccesing the same shared resourse in order to prevent an inconsistent state.
 2)Java Synchronization is done when we want to allow only one thread to access the shared resource.
 3)in simple synchronization is a process of making only one Thread access a resource where multiple Threads are trying to access the same resource 
   and moving all the remaining threads into waiting state.
 4)the main problem with synchronization is it increases the Thread waiting time.
 5)we can achieve synchronization in 2 ways
   a)by using synchronized()
   b)synchronized block
 
 
 Deadlock
 ========
 1)Dead lock is situation where two or more threads are blocked forever and waiting for each other.
 2)in simple it is a condition which occurs when two or more threads get blocked,waiting for eachother for an infinite 
   period of time to release the resources they hold.
 
 */
public class Class45 extends Thread {
public void run()
{
	for(int i=0;i<=5;i++)
	{
		System.out.println("Class45 method : "+i);
	}
}
}
