package com.TasksInClass;
//here m means MainTask of the day
//try to write the output without using run button and after use run button 
//and compare the outputs with ur note output !!

public class MTask11 {
	public MTask11() {		//main
		System.out.println("Sunday");
		MTask11 obj=new MTask11(10);
		System.out.println("Tuesday");
		String s=obj.display("Challenge Accepted!!");
		System.out.println(s);
	}
	public MTask11(int temp)	//MTask11() temp=10
	{
		System.out.println("Saturday");
		MTask11 obj=new MTask11(10,20);
		int a=obj.meth1()+temp;//100+10;
		System.out.println("===>"+(a+obj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)//MTask()
	{
		System.out.println("in the next statement iam returning String value");
		return s;
	}
	int meth1()//MTask11(int temp)
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public MTask11(int data,int temp)//MTask(int temp) data=10 temp=20
	{
		System.out.println("Thursday");
		System.out.println("====>"+(data+new MTask11("HI").meth2()-temp));
	}
	MTask11(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		MTask11 obj=new MTask11();
		System.out.println("output verified");
	}
	
}
