package TasksInClass;

public class Task18 {
	void implicit()
	{
		byte b=10;//b=10
		System.out.println("byte value is"+b);//b=10
		short s=b;//s=10-->s=11-->s=12
		System.out.println("short value is"+s);//s=10
		s++;//s=10 s=11
		int i=s++;//i=(s=11 s=12)==>i=11
		System.out.println("int value is "+i);//i=11
		System.out.println("short value is "+s);//s=12
		long l=i;//l=(i=11)==>l=11-->l=10
		System.out.println("long value is"+(--l));//l=10 l=10==>10
		float f=l;//f=(l=10)==>f=10.0-->f=10.0
		System.out.println("the value of float is "+(f+b));//f=10.0+b=10==>10.0+10=20.0==>20.0
		double d=(--f);//f=9.0 f=9.0==>9.0
		System.out.println("the value of double is "+d);//9.0
		show();
		if(!(d==f))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
	public static void main(String[] args) {
		Task18 a=new Task18();
		a.implicit();
	}
	static void show()
	{
		char c='A';//65
		int a=++c;//a=66 a=66
		System.out.println(a);
		Task18 obj=new Task18();
		String s=obj.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String S="Implicit Casting is done by the compiler automatically";
		return S;
	}
	

}
