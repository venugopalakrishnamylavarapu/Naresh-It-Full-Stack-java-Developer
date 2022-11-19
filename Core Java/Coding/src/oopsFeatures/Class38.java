package oopsFeatures;
/*
 in this class we discuss about polymorphism
 
 Polymorphism
 ============
 -it is an ability to perform multiple tasks with the same identity
 -There are two types of polymorphisms are there they are
  1)Compile Time Polymorphism [also called method overloading]
  2)Run Time Polymorphism[also called method overriding]
  
  
  today we will discuss about method overloading
 
 Method Overloading
 ==================
 Writing two or more methods in the same class having same method name 
 but different parameters
 
 in java any method can be overloaded(litterally).
 
 Some Questions
 ==============
 1)Can we overload a main method?(Y/N)-->Y
 2)Can we declare overloaded method as final?(Y/N)-->Y
 3)Can we overload two methods if one method is static and other is non-static method?(Y/N)-->Y
 4)can we achieve method overloading by changing the return type?(Y/N)-->Y
 
 */
public class Class38 {
	public static void meth1()
	{
		System.out.println(10);
	}
	static int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	private void meth1(int a,String s)
	{
		System.out.println(30);
	}
	static String meth1(String s,int a)
	{
		System.out.println(40);
		return s;
	}
	protected void meth1(String s)
	{
		System.out.println(50);
	}
	static final void meth1(StringBuffer sb)
	{
		System.out.println(60);
	}
	byte meth1(byte b)
	{
		System.out.println(70);
		return b;
	}
	public static void main(String[] args) {
		Class38 obj=new Class38();
		System.out.println("-------------------------------------------");
		obj.meth1();
		obj.meth1(29);
		obj.meth1(500,"Java");
		obj.meth1("Java",500);
		obj.meth1("Java");
		obj.meth1(new StringBuffer("Java"));
		obj.meth1((byte)50);
		System.out.println("--------------------------------------------");
		main();
		main("venu");
	}
	
	public static void main() {
		System.out.println("1st main()");
	}
	public final static void main(String s) {
		System.out.println("2nd main()");
	}
	Class38()
	{
		this(500);
		System.out.println("Default Constructor");
	}
	Class38(int a)
	{
		System.out.println("Parameterized Constructor : "+a);
	}
	
	
	
	
	
	
	
	
	
	

}
