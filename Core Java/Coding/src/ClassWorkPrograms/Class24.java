package ClassWorkPrograms;

/* 
 my network got a problem so i mostly listened this class on mobile so i may missed some points thats why this thoery will be somewhat like errors
 but i do know the concepts before so i dont mind.
 
 ITERATION STATEMENTS:-
 ====================
 1)Java iteration statements enable repeated execution of part of a program until a certain termination condition becomes true.
 2)Java provides four iteration statements:
 		a)while
 		b)do-while
 		c)for
 		d)for each loop
 
 								IN THIS CLASS WE DISCUSS ABOUT WHILE AND DO WHILE
 								=================================================
	Syntax for while loop																Syntax for do-while loop
	=====================																========================
	while(Condition)//true or false														do
	{																					  {
		--------------;																			--------------;
		--------------;																			--------------;
	}																					  }while(Condition);//true or false
	
	
	Understanding while loop
	========================
	-->while loop first checks the condition the enters into the loop.
	-->Just like 'if' condition the argument should return a boolean value(either True or False).
	-->if we don't write braces after while we can write only one statement which is dependent on "while"
	-->we should not declare any statement in that sentence.
	
	Understanding do-while loop
	===========================
	-->do-while first enter the loop and then check the condition.
	-->in do-while after the while condition we should write semicolon Ex:while(i==0);
	
 		
 
  */
public class Class24 {
	void meth1(int a)
	{
		System.out.println("-----------------meth1()--------------------");
		while(a<=5)
		{
			System.out.println("a value : "+a);
			a++;
		}
		System.out.println("meth1() executed");
	}
	void meth2(int a)//Infinite loop
	{
		System.out.println("-----------------meth2()--------------------");
		while(a<=3)
			//int x=100; //C.E Because we cant write declarative statements;
		System.out.println("a value is : "+a);
		a++;
		System.out.println("meth2() executed");
	}
	void meth3(int a)
	{
		System.out.println("-----------------meth3()--------------------");
		while(true)
		{
			System.out.println("a value : "+a);
			a++;
			//break; //When ever compiler came across the break statement it will come out of the loop or block
		}
		//System.out.println("meth3() executed");//C.E because it is unreachable code.
	}
	void meth4(int a)
	{
		System.out.println("-----------------meth4()--------------------");
		do {
			System.out.println("a value : "+a);
			a++;
		}while(a<=5);
		System.out.println("meth4() executed");
	}
	public static void main(String[] args) {
		Class24 obj=new Class24();
		obj.meth1(1);
		//obj.meth2(1);//this is infinite loop
		//obj.meth3(1);//this is infinite loop
		obj.meth4(1);
	}
}
