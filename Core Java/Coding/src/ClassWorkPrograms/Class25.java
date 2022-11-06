package ClassWorkPrograms;
/* 
 
ITTERATION STATEMENTS PART-2
============================
 						*Today we discuss about for loop*
 
  */

public class Class25 {
	void meth1()
	{
		System.out.println("--------meth1()----------");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value : "+i);
		}
		System.out.println("meth1() execution completed");
	}
	void meth2()
	{
		System.out.println("--------meth2()----------");
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value : "+i);
			i++;
		}
		System.out.println("meth2() execution Completed");	
	}
	void meth3()
	{
		System.out.println("--------meth3()----------");
		int i=1;
		for(;i<=3;)
		{
			System.out.println("i value : "+i);
			i++;
		}
		System.out.println("meth3() execution Completed");	
	}
	void meth4() {
		System.out.println("--------meth4()----------");
		int i=1;
		for(;i<=3;)
		{
			//int x=50;//C.E becuase we cant write any declarative statements
			System.out.println("i value :"+i);
			i++;
			System.out.println("meth4() execution completed");
		}
	}
		void meth5()
		{
			int i=1;
			for(System.out.println("--------meth5()----------");i<=3;System.out.println("Hello"))
			{
				System.out.println("i value : "+i);
				i++;
			}
			System.out.println("meth5() execution completed");
		}
		void meth6()
		{
			int i=1;
			for(System.out.println("--------meth6()----------"),System.out.println("hi");i<=3;System.out.println("Hello"))
			{
				System.out.println("i value : "+i);
				i++;
			}
			System.out.println("meth6() execution completed");
		}
		void meth7()
		{
			int i=1;
			for(new Class25().meth8();i<='A'-62;new Class25().meth9())
			{
				System.out.println("i value : "+i);
				i++;
			}
			System.out.println("meth7() execution completed");
		}
		int meth8() {
			System.out.println("Java is awesome");
			return ('A'-64)*1;
		}
		void meth9()
		{
			System.out.println("----------------------");
		}
		void meth10()//Infinite for-Loop
		{
			System.out.println("--------meth10()----------");
			int i=1;
			for(;;)
			{
				System.out.println("i value : "+i);
				i++;
			}
			//System.out.println("meth3() execution Completed");//Unreachable code error
		}
		void meth11(int a,int b,int c)
		{
			for(;a<=5;)//a=1=true-->
			{
				if(b==10)//b=10=true
				{
					System.out.println("if block executed");
					switch(c)
					{
					case 100:
						System.out.println("Case 100 executed");
						break;
					default:
						System.out.println("No case lables matched");
					}
					System.out.println("Compiler came out from switch");
					while(c<=105)
					{
						System.out.println("c value :"+c);
						c++;
					}
					do {
						System.out.println("c value : "+ ++c);
					}while(false);
				}
				else
				{
					System.out.println("else block executed");
				}
				return;
			}
		}
	public static void main(String[] args) 
	{
		Class25 obj=new Class25();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj.meth5();
		obj.meth6();
		obj.meth7();
		//obj.meth10();//infinite loop
		obj.meth11(1,10,100);

	}

}
