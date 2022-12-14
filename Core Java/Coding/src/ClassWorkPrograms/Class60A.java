package ClassWorkPrograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Class60A {
    void meth1()
    {
        PriorityQueue<Object> priorityQueue = new PriorityQueue<Object>();
        priorityQueue.add(100);//Insertion order is not maintained but always  the first element will be the smallest element
      //  priorityQueue.add("Java");//Heterogenous date is not allowed
      //  priorityQueue.add(null);//null is not allowed
        priorityQueue.add(45);//Duplicates are allowed
        priorityQueue.add(52);//it is available from Java 1.5v
        priorityQueue.add(10);//its default capacity is 11
        priorityQueue.add(85);//its size increases by double
        priorityQueue.add(25);//it is NOT synchronized
        System.out.println(priorityQueue);

        Iterator<Object> i = priorityQueue.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("--------------------------------------------");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());//10
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());//25
        System.out.println(priorityQueue);
        System.out.println("---------------------------------------------");
        //pq.clear();
       // System.out.println(priorityQueue.poll());//null
        // System.out.println(priorityQueue.remove());//Generates NoSuchElementException
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }

    public static void main(String[] args) {
        new Class60A().meth1();
    }
}
