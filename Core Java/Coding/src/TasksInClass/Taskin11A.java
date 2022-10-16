package TasksInClass;
//find output without using run button 

public class Taskin11A {
	int meth1(int a,int b)
	{
		System.out.println("meth1() called");
		return a+b;
	}
	Taskin11A(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println(new Taskin11A("hi").meth1(99,1)+99);
	}

}
