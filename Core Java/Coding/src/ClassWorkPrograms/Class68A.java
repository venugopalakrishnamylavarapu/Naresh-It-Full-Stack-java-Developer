package ClassWorkPrograms;
//Method Local InnerClass
public class Class68A {
	void meth1()
	{
		String s="Java";
		class InnerClass
		{
			void show()
			{
				System.out.println(s+" is awesome");
			}
			InnerClass()
			{
				System.out.println("Inner Class Constructor");
			}
		}
		new InnerClass().show();
	}
	public static void main(String[] args) {
		new Class68A().meth1();
	}
}
