package ClassWorkPrograms;

/*
 
 InterThread Communications
 ==========================
 1)Two thread can communiacate with each other by using wait(),notify and notifyAll() methods.
   
 
 Difference between wait() and sleep()
 
 				wait() 										sleep()
-----------------------------------------------------------------------------------------------
  1)wait() methods releases the lock			1)sleep() method doesn't release the lock
  
  2)it is the method of 						2)it is the method of 
    java.lang.Object Class						  java.lang.Thread Class
    
  3)it is a non-static method					3)it is a static method.
  
  4)wait() should be notified by 				4)After the specified amount of time,
    notify() or notifyAll() methods				  sleep() method is completed
    
  5)wait() method must be called from			5)sleep() can be called from anywhere.there is no
   synchronized context(i.e synchronized	  speicific requirement.
   method or block).otherwise it will
   throw IllegalMonitorStateException
 --------------------------------------------------------------------------------------------
 
 What is a daemon thread?
 ->Deamon thread is a low priority thread that runs in the background to perform tasks such
   as Garbage Collection etc.
 ->Deamon Thread is a infinite executing thread
 ->Execution of the deamon thread will be completed if its supporting thread execution is 
   finished
 
 
 */
public class Class46 {
	int amount=10000;//Instance
	
	synchronized void with_draw(int amount) throws InterruptedException//15000
	{
		if(this.amount<amount)//10000<15000
		{
			System.out.println("Insufficient Balance");
			wait();
			System.out.println("Amount Credited");
			this.amount-=amount;//20000-15000=5000
			System.out.println("with draw succesfullt \nBalance is "+this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("with draw succesful \nBalance is "+this.amount);
		}
	}
	synchronized void deposit(int amount)//10000
	{
		this.amount+=amount;//10000+10000=20000
		System.out.println("Deposited succesfully \nBalance is "+this.amount);
		//notify();
		//notifyAll();
	}
	
}
