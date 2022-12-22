package ClassWorkPrograms;

public class Class68C {
	static Class68B out=new Class68B()
			{
				@Override
				void print()
				{
					System.out.println("Start");
					super.print();
					System.out.println("I am in Anonymous class");
					System.out.println("End");
				}
			};
			public static void main(String[] args) {
				out.print();
			}
}
