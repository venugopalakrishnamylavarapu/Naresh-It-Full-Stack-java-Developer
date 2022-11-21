package oopsFeatures;

public class Class40A extends Class40 {
void meth1()
{
	System.out.println("hi");
}
void meth1(String str)
{
	System.out.println(str);
}
public static void main(String[] args) {
	Class40 obj=new Class40A();
	obj.meth1();
	obj.meth1("Java is awesome");
	System.out.println("-------------------");
	obj.meth2();
}
}
