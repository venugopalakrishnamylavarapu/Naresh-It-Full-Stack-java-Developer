package com.ClassWorkPrograms;

public class Class20A {
	void meth1()
	{
		System.out.println("Performing Auto-unBoxing");
		Integer ival=new Integer(100);
		int i1=ival;
		int i2=ival.intValue();
		
		System.out.println("Integer WCO : "+ival);
		System.out.println("int PDT : "+i1);
		System.out.println("int PDT : "+i2);
		
		Byte bval=new Byte((byte)50);
		byte b1=bval;
		byte b2=bval.byteValue();
		System.out.println("----------------------------");
		
		System.out.println("Byte WCO : "+bval);
		System.out.println("byte PDT : "+b1);
		System.out.println("byte PDT : "+b2);
		
		Boolean booleanval=new Boolean("tRuE");
		boolean flag1=booleanval;
		boolean flag2=booleanval.booleanValue();
		
		System.out.println("Boolean WCO : "+booleanval);
		System.out.println("boolean PDT : "+flag1);
		System.out.println("boolean PDT : "+flag2);
		
	}
	public static void main(String[] args) {
		Class20A obj=new Class20A();
		obj.meth1();
	}

}
