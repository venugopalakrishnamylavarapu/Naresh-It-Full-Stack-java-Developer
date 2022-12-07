package ClassWorkPrograms;
/*
 today is mostly theory.. so no programs
 
 Collection FrameWorks:-
 ---------------------
 
 Why Collection Frameworks??
 1)Collection classes are growable in nature.
 2)Method support is there for Collection framework.
 3)Heterogenous data can be accepted by Collection Framework
 
*** Differences between Arrays and Collections
 
 				Arrays										Collections
 1)Arrays are fixed in size						1)Collections are growable in nature
 
 2)Arrays can hold only homogenous				2)Collections can hold both homogenous and
   data types elements.							  heterogenous elements.
   
 3)There is no underlying data structure.		3)Every Collection class is implemented based on
 												  some standard data structure.
 												  
 4)Arrays can hold both object and				4)Collection can hold only object types.
   primitive.		
   
 5)Memory wise -->Recommended.					5)Memory wise -->Not Recommended.
   Performance wise -->Not Recommended.			  Performance wise -->Recommended.
   
 
 Collection Framework has two root interfaces they are
 1)Collection(interface)
 2)Map(interface)
 
-->Collection interface have 3 child interfaces(and those interface have child classes)
 a)List(interface)
 	i)ArrayList(class)
 	ii)LinkedList(class)
 	iii)Vector(class)
 b)Set(interface)
 	i)HashSet(class)
 	ii)LinkedHashSet(class)
 	iii)TreeSet(class)
 c)Queue(interface)
 	i)LinkedList(class)
 	ii)PriorityQueue
 	
 -->Map interface have 4 sub classes
 	i)HashSet
 	ii)LinkedHashMap
 	iii)TreeMap
 	iv)Hashtable
 	
 	
 List:- In List interface elements will be stored just like an array,but allows DUPLICATE values.
 
 Set:- In Set interface elements will be stored just like an array,but Set will Not allows DUPLICATE values.
 
 Queue:-In Queue implementation classes data will be stored in the form of FIFO[First-In-First-Out] order.
 
 Map:-In map elements will be stored in the form of Key-Value pairs.
       E.x:-  "Venu" - 101
       		    key	   value
       		    
 Collection Object
 ------------------
 1)A Collection Object can store group of other objects.
 2)All Collection classes will allows only Objects.
 3)All the Collection classes are present inside java.util package.
 
 Retriving Elements from collections.
 ------------------------------------
 1)We can retrive the elements from collections 
 			i)by using Iterator interface
 			ii)List Iterator interface
 			iii)Enumeration interface.
 
 i)Iterator Interface
 ---------------------
 Iterator is an interface that contains methods to retrieve the elements one by one from a collection object.
 it retrieves elements only in forward direction.It has 3 methods:
 
		Method											Description
1)boolean hasNext()								returns true if the iterator has more elements.

2)element next()								returns the next element in the iterator.

3)void remove() 								removes the last element from the collection returned 
												by the iterator.

 
 	
 */
public class Class55 {

}
