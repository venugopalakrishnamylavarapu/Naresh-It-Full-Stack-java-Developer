package ClassWorkPrograms;
/*
 Inner Classes
 --------------
 ->Inner Classes are defined inside the body of another class
 ->Inner Classes have Special Relation hip with outter classe instances which allows them to 
   access outer class members including private methods also.
 ->In java there are 4 types of inner classes 
 		a)Nested Inner Class.
 		b)Static Inner Class.
 		c)Method Local Inner Class.
 		d)Anonymous Inner Class.
 		
	a)Nested Inner Class
	  ------------------
	  
 */
public class Class67B {
	private void meth1()
	{
		System.out.println("I am from outer class");
	}
	Class67B()
	{
		System.out.println("Outer Class Constructor");
	}
	static 
	{
		System.out.println("Outer class static block");
	}
	public class InnerClass
	{
		void show()
		{
			System.out.println("Iam from Inner Class");
			meth1();
		}
		InnerClass()
		{
			System.out.println("Inner Class Constructor");
		}
	}
	public static void main(String[] args) {
		Class67B.InnerClass obj=new Class67B().new InnerClass();
		obj.show();
	}
}
