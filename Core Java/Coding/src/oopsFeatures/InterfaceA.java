package oopsFeatures;

public interface InterfaceA {
	void meth1();
	
	default void meth2()//Java 8 version
	{
		this.meth4();
		System.out.println("Interface A default method");
	}
	static void meth3()//Java 8 version
	{
		//meth4();//C.E we cant use this inside a static area
		System.out.println("Interface A static method");
	}
	private void meth4()//Java 9 version
	{
		System.out.println("Interface A private method");
	}
	public static void main(String[] args)//Java 8 version
	{
		System.out.println("InterfaceA main()");
		//new InterfaceA();//we cannot instantiate in interface(cannot create objects in interface)
		InterfaceA.meth3();
	}
}
