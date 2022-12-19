package ClassWorkPrograms;
/*
 Lambda expression is a anonymous function which does not have any name
 Difference between a lambda expression and a method
 ->a method in java has following components
 	access modifiers,methodname,parameters,return type,method body
 ->A Lamda expression is an anonynmous function,it has the following components.
 		1)Without name
 		2)Without return type.,java compilier is able infer return type based on the code,you have written
 		3)Parameter list
 		4)Body
 
 A Lamda Function
 ->A Lamda function can be defined in different ways.
 		a)A Lamda Function with parameters.
 		b)A Lamda Function with single parameters.
 		c)A Lamda Function with multiple parameters.
 		d)A Lamda Function with return statement.
 		e)A lambda Function without return statement.
 
 */


//this class is about lambda expression
public class Class65 {
	void display()
	{
		System.out.println("Implementing Lambda Expressions");
		Interface65A x=()->System.out.println("Hi");
		x.meth1();
		
		Interface65B y=(int p,int q)->System.out.println("Addition : "+(p+q));
		y.meth2(1,99);
		
		Interface65C z=(int k,int L)->{
			if(k>L)
			{
				System.out.println("If block executed");
				return k+100;
			}
			else
			{
				System.out.println("else block executed");
				return L+10;
			}
		};
		
		int result=z.meth3(5,10);
		System.out.println("Result : "+result);
	}
	public static void main(String[] args)
	{
		new Class65().display();
	}
	
}
