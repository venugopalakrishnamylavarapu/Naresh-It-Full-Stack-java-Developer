package inheritenceGlimpse;

public class ClassB extends ClassA{
	void meth2()
	{
		System.out.println("Class B is accessed");
	}
	public static void main(String[] args) {
		ClassB bobj=new ClassB();
		bobj.meth1();
		bobj.meth2();
	}

}
