package ClassWorkPrograms;

import java.util.LinkedList;
import java.util.List;

/*
Queue
-----
1)The implementation classes for Queue interface are LinkedList and Priority Queue.
2)In Queue data will bw stored in FIFO order.
3)If we are creating an object for LinkedList with LinkedList reference variable,then we can
  access complete functionality of Queue and List Interfaces.
4)From 1.5v onwards LinkedList also implements Queue interface.
*/

public class Class60 {
	    void meth1() {
	        List<Object> ll1 = new LinkedList<Object>();
	        LinkedList<Object> ll2 = new LinkedList<Object>();

	        //List Interface  ===>add()
	        //Queue Interface ===>offer()

	        ll1.add(10);
	        //  ll1.offer(20);//C.E because ll1 can't access Queue Interface methods

	        ll2.add(100);
	        ll2.add(200);
	    }
	}

