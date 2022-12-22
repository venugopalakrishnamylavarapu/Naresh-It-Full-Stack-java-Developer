package ClassWorkPrograms;
//continuation of inner class
public class Class68 
{
	int a=10;
	static int b=20;
	Class68()
	{
		System.out.println("Outer Class Constructor");
	}
	static 
	{
		System.out.println("Outer Class static block");
	}
	static class InnerClass
	{
		void show()
		{
			System.out.println("Iam from InnerClass");
			System.out.println("Outer Class Instance Variable : "+new Class68().a);
			System.out.println("Outer Class Static Variable : "+b);
		}
		InnerClass()
		{
			System.out.println("Inner Class constructor");
		}
		static
		{
			System.out.println("Inner Class static block");
		}
		public static void main(String[] args) {
			new InnerClass().show();
		}
	}
	public static void main(String[] args) {
		Class68.InnerClass obj=new Class68.InnerClass();
		obj.show();
	}
}
