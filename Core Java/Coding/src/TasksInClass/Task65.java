package TasksInClass;

public class Task65 {
	void hello()
	{
		TaskInterface65A s=()->System.out.println("Hello World");
		s.meth1();
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65B u=(String p)->{
			StringBuilder sb=new StringBuilder();
			for(int i=p.length()-1;i>=0;i--)
				sb.append(p.charAt(i));
			return sb.toString();
		};
		System.out.println("The reverse of the given string is : "+u.meth2("Thisislambdaexpression"));
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65C z=(int c)-> {
			System.out.println("After adding 1 to the given integer the value is : "+(c+1));	
		};
		z.meth3(142);
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65D y=(int a,float b)->
		{
			System.out.println("The root of the Given value is : "+Math.sqrt(a));
			if(b==3.142)	System.out.println("The value is pie value");
			else	System.out.println("The value is not a pie value");
		};
		y.meth4(625, 3.143f);
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65E x=(int h)->{
			if(h%2==0)	System.out.println("The given value is an even number");
			else	System.out.println("The given is an odd number");
		};
		x.digits(83247932);
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65F m=(double d)->{
			if(d==3453.23432532d)	System.out.println("it is a valid double value");
			else System.out.println("its not a valid double value");
		};
		m.meth5(3746583274832d);
		
		System.out.println("----------------------------------------------------------------------");
		TaskInterface65G n=(int st,int q,char ch)->{
			System.out.println(st+" "+q+" "+ch);
		};
		n.meth6(1, 4, 'U');
		
	}
	public static void main(String[] args) {
		new Task65().hello();
	}
}

