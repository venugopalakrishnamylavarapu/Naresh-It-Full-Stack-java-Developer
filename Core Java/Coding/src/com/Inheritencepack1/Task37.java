package com.Inheritencepack1;
/*Task37 and Task37A are interlinked */
public class Task37 {
	void meth1()//done
	{
		System.out.println(10);
		System.out.println(this.meth2()+56);//??+56-->-18+56=38
	}
	int meth2()//meth1called
	{
		System.out.println(75);
		System.out.println(96);
		return this.meth3();//done
	}
	int meth3()//meth2 called
	{
		System.out.println(74);
		System.out.println(92);
		return 74-92;
	}
	void meth4()
	{
		System.out.println(56);
	}
	Task37()
	{
		this(52);//done
		this.meth1();//done
		System.out.println(85);
	}
	Task37(int a)//a=52-->completed
	{
		System.out.println(a+7);//52+7=59
	}
}

