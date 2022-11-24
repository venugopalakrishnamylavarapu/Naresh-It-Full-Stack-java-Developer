package ClassWorkPrograms;
/*today class will be a test so every question will be on oops concept check them
 
 answers will be at the end of the page so im giving answer by myself
 and i need to check with the correct key sheet.
 
 Questions
 =========
 1)Functional interfaces can be annotated as
      a)@FunctionalInterfaces--> (correct) -->cc
      b)@functionalinterfaces
      c)@interfaces
      d)@Function
      
==============================================================================================================
      
 2)Which of the following statements regarding abstract classes are true?
      a)an abstract class can be used a data type.
      b)All of the above-->cc
      c)a subclass of a non-abstract superclass can be abstract
      d)an subclass can override a normal method in a superclass to declare it abstract.-->(correct)
      e)an abstract class can be extended.
 
==============================================================================================================
s is S its not mistake its for speed type
      
 3)class A
   {
   	public void method1()
 		{
 		System.out.print("Class A method1");-->2
 		}
   }
   ---------------------------------------------
   class B extends A
   {
   		public void method2()
   		{
   			system.out.print("Class B method2")
   		}
   }
   ---------------------------------------------
   class C extends B
   {
   		public void method2()
   		{
   			system.out.print("Class C method2")-->1
   		}
   		public void method3()
   		{
   			system.out.print("Class C method3")
   		}
   }
   ---------------------------------------------
   public class ClassA
   {
   		public static void main(String[] args)
   		{
   		    A a=new A();
   		    C c=new C();
   		    c.method2();
   		    a=c;
   		    a.method3();
   		}
   } 
   
   a)Compilation Error-->c-->cc
   b)Class C method2 Class C method3
   c)Runtime exception
   d)None of the above
   e)Class B method2 Class C method3

==============================================================================================================

   4)public class ClassA
   {
   		static String value="abc";
   		public static void changeValue(String a)
   		{
   		String data=a.concat(value);
   		data=value;
   		}
   		public static void main(String[] args)
   		{
   		value ="Java";
   		changeValue(value);
   		System.out.println(value);
   		}
   }
   
   a)abcJava
   b)Java-->c-->cc
   c)Compile time error
   d)abc
   e)None of the above
 
==============================================================================================================

5)what is the output of the below code?
 	
 	package com;
 	class Animal
 	{
 		public void printName()
 		{
 			System.out.println("Animal");
 		}
 	}
 	------------------------------------------
 	package exam;
 	import com.Animal;
 	public class Dog extends Animal
 	{
 		public void printName()
 		{
 			System.out.println("Dog");
 		}
 	}
 	-------------------------------------------
 	package exam;
 	import com.Animal;
 	public class Test
 	{
 		public static void main(String[] args)
 		{
 			Animal a =new Dog();
 			a.printName();
 		}
 	}
 	
 	a)Compile time error-->cc
 	b)None of the above
 	c)Animal-->c
 	d)Animal Dog
 	e)Dog

==============================================================================================================

6)
public class ClassA
{
	int i;
	boolean see;
	static int u;
	public void printValue()
	{
		System.out.print(i);
		System.out.print(see);
		System.out.print(u);
	}
}
----------------------------------
public class ClassB
{
	public static void main(String[] args)
	{
		new ClassA().printValue();
	}
}

	a)0true0
	b)None of the above
	c)0false0-->cc
	d)Compile errot -static variable must be initialized before use.-->c
	e)000

==============================================================================================================

7)
	public class ClassA
	{
	public static void main(String[] args)
	{
		byte b=6;
		b+=8;
		System.out.println(b);//14
		b=b+7;//14+7=21
		System.out.println(b);//21
	}
	}
     
     a)None of the above
     b)21 14
     c)14 13
     d)14 21-->c
     e)Compile time Error-->cc
     
==============================================================================================================

8)Suppose A is an abstract class,B is a concrete(normal) subclass of A,and both A and B have a default constructor.
  Which of the folllowing is correct?
  1)A a =new A();
  2)A a=new B();
  3)B b=new A();
  4)B b=new B();
 
 a)None of the above
 b)2 and 3
 c)1 and 3
 d)1 and 2
 e)3 and 4-->c
 f)2 and 4-->cc
 
==============================================================================================================
9)what is the output of the below code?

	public class ClassA
	{
		static 
		{
			System.out.print("Java ");
		}
		
		{
		System.out.print("is ");  //instance block(executes whenever we are creating an object)
		}
		public ClassA()
		{
			System.out.print("Awesome");
		}
		public static void main(String[] args)
		{
			ClassA a=new ClassA();
		}
	}
	
	a)Java Awesome is
	b)Awesome Java is
	c)Awesome
	d)Compile time error
	e)Java is Awesome-->c-->cc
	
==============================================================================================================

10)Method overridding is a combination of inheritance and polymorphism
     a)True-->c-->cc
     b)False

==============================================================================================================
11)What is the output?
public interface InfA
{
protected String getName();
}
public class Test implements InfA
{	
	public String getName()
	{
		return "Java is awesome";
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(t.getName().length());
	}
}

	a)test-name
	b)None of the above
	c)Compile time error-->c-->cc
	d)14
	
==============================================================================================================

 12) Given the following piece of code:
 public class School
 {
 	public abstract double numberOfStrudent();
 }
 which of the following statements is true?
 
 a)You must add a return statement in method numberOfStudent();
 b)The keywords public and abstract cannot be used together
 c)All the above
 d)Class School must be defined abstract-->c-->cc
 e)The method numberOfStudent() in class School must have a body
 
==============================================================================================================

13) class Super
	{
		int value=0;
		Super()
		{
			addValue();
		}
		void addValue()
		{
			value+=10;
		}
		int getValue()
		{
		return value;
		}
	}
	class Sub extends Super
	{
		Sub()
		{
			addValue();
		}
		void addValue()
		{
		value +=20;
		}
	}
	public class ClassA
	{
		public static void main(String[] args)
		{
			Super b=new Sub();
			System.out.println(b.getValue());
		}
	}
	
	a)30
	b)10
	c)20
	d)50
	e)40-->cc
	
==============================================================================================================

14)what is the output for the below code?

 public class A
 {
 	int i=10;
 	public void printValue()
 	{
 		System.out.println("Value-A");
 	}
 }
 ---------------------------------------
 public class B extends A
 {
 	int i=12;
 	public void printValue()
 	{
 		System.out.print("Value-B");
 	}
 }
 ---------------------------------------
 public class Test 
 {
 public static void main(String args[])
 {
  	A a=new B();
  	a.printValue();
  	System.out.println(a.i);
 }
 }
 
 a)C.E
 b)Value-B 11
 c)Value-B 10-->cc
 d)Value-A 11
 e)Value-A 10-->c
 
==============================================================================================================

15)
class ClassA
{
	public void method()
	{
		System.out.println("Hi iam ClassA");
	}
}
---------------------------------------------
public class ClassB extends ClassA
{
	protected void method()
	{
		System.out.println("Hi iam ClassB");
	}
	public static void main(String args[])
	{
		ClassB child=new ClassB();
		child.method();
	}
}

a)None of the above
b)Hi iam ClassB
c)Compile time error-->cc
d)Hi iam ClassA

==============================================================================================================

16)An interface with no fields or methods is known as a ---------------;
		a)Abstract Interface
		b)Functional interface-->c
		c)None of the above -->cc
		d)Runnable Interface

==============================================================================================================
17)Analyze the following code:

public abstract class Test implements Runnable
{
	public void doSomething(){};
}

a)None of the above
b)The program will not compile because it does not implement the run() method.-->c
c)The program will not compile because it does not contain abstract methods.
d)The program compiles fine-->cc

==============================================================================================================

18)
public class ClassA
{
	public static void main(String[] args)
	{
		Mammal h=new Horse();
		Cattle c=new Horse();
		c.eat(h);
	}
}
class Mammal
{
	void eat(Mammal m)
	{
		System.out.println("Mammal eats food");
	}
}
class Cattle extends Mammal
{
	void eat(Cattle c)
	{
		System.out.println("Cattle eats hay");
	
	}
}
class Horse extends Cattle
{
	void eat(Horse h)
	{
		System.out.println("Horse eat hay");
	}
}

a)prints "Cattle eats hay"
b)None of the these
c)prints "Mammal eats food"-->cc
d)Exception
e)prints "Horse eats hay" -->c
 
==============================================================================================================

19)Which of the following class definitions defines a legal abstract class?
	
	a)public class abstract A
	  {
	  abstract void unfinished();
	  }
	b)class A
	  {
	  abstract void unfinished(){}
	  }
	c)abstract class A-->c-->cc
	  {
	  abstract void unfinished();
	  } 
	d)None of the above
	e)class A
	  {
	  abstract void unfinished();
	  }
	  
==============================================================================================================

20)
		abstract class Cl
		{
			public C1()
			{
				System.out.print(1);
			}
		}
		class C2 extends C1
		{
			public C2()
			{
				System.out.print(2);
			}
		}
		class C3 extends C2
		{
			public C3()
			{
				System.out.print(3);
			}
		}
		public class Test 
		{
			public static void main(String[] a)
			{
				new C3();
			}
		}
		
	a)23
	b)321
	c)C.E-->c
	d)123-->cc
	e)12
	
==============================================================================================================

					Those are all the quesitons
 
 check the key for the correct answers
 
 
 c means my answer
 cc means correct answer by key
 
 
 
 
 
 
 
 
 
 
 
 */
public class Class42 {

}
