package ClassWorkPrograms;

/*Java operators
 ================
 1)increment or decrement operator
 2)arthimetic operators
 3)realtional operators
 4)logical operators
 
 todays class we discuss about increment or decrement operator only
 most confusing topics of programming so practice more.
 
 ===> increment operators(++) are of two types
 a)pre-increment 
 b)post- increment

 ===>Decrement operators(--) are of two types
 a)pre-decrement
 b)post-decrement
 
 */

public class Class14 {
	void meth1()
	{
		int a=10;
		System.out.println(a);//10
		a++;//Increment operator
		System.out.println(a);//11
		a--;//Decrement operator
		System.out.println(a);//10
		System.out.println("===============================");
		
		
		
		//Increment Operator
		int x=10;
		System.out.println(x);//10
		System.out.println(x++);//10 a=11 [Post-Increment]
		System.out.println(x);//11   a=11
		System.err.println(++a);//12 a=12 [Pre-Increment]
		
		int d=100; //d=100
		int e=d++; //e=100 d=101
		int f=++d; //f=102 d=102
		System.out.println("x : value "+d);  //102
		System.out.println("y : value "+e);  //100
		System.out.println("z : value "+f);  //102
		
		
		//Decrement
		
		int m=100; 
		int n=--m; //n=24 m=24
		int o=m--; //o=24 m=23
		System.out.println("m : value "+d);  //23
		System.out.println("n : value "+e);  //24
		System.out.println("o : value "+f);  //24
		
		System.out.println("============================");
		//some more tricks in this
		/*so here if we have increment or derement 
		 * next to another + or - operator then it will be ignored*/
		int k=10;
		int g=k++ +20; //g=10+20=30  k=11
		System.out.println("a value : "+k);
		System.out.println("b value : "+g);
		
		int v=100;
		v=v++ +100;
		System.out.println("x value : "+v);//200
		
		int q=100;
		q=++q +100;
		System.out.println("q value : "+q);//201
	}

	public static void main(String[] args) {
		new Class14().meth1();
	}
}
