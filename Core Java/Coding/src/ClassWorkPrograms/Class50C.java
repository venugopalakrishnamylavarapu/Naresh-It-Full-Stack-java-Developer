package ClassWorkPrograms;

public final class Class50C// final classes cant be inherited
{
 final int a=10;//final variables are constants
 final void meth1()//final methods cant be Overridden
 {
	 System.out.println("hi");
	 //System.out.println(a++);//C.E
	// System.out.println(++a);//C.E
 }
 public static void main(String[] args) {
	new Class50C().meth1();
}
}

//final Methods : We can inherit but we cant override.
//private Methods : We can't inherit SO,we can't override.
