package oopsFeatures;

public class Class41B implements InterfaceC,InterfaceD
{
 @Override
public void meth1()
{
	InterfaceC.super.meth1();
	InterfaceD.super.meth1();
}
public static void main(String[] args) {
	Class41 obj=new Class41();
	obj.meth1();
}
}
