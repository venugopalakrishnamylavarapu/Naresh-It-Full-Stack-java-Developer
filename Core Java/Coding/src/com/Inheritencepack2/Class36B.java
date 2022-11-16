package com.Inheritencepack2;
import com.Inheritencepack1.Class36A;
public class Class36B  extends Class36A{
void meth3()
{
	System.out.println("Class36B in different package");
}
public static void main(String[] args) {
	Class36B obj=new Class36B();
	obj.meth3();
	obj.meth1();
	obj.meth2();
}
}
/*Hierarchial inhertences
  ======================
  pack1
  ClassA
  meth1()
  {
  sysout("classA")
  }
  
  pack1
  ClassB extends CLassA
  main()
  {
  sysout("classB")
  }
  
  pack2
  ClassC extends CLassB
  main()
  {
  sysout("classB")
  }
 */
