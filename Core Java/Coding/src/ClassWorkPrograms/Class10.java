package ClassWorkPrograms;
/*
 Instance variables ( or Global variable)
 ====================
 1)the variables which are declare inside a class outside any method or a block or a constructor are known as instance variables.
 2)we can access the instance variable in "2" ways by using identifier name & by using 
 	Class Object/Class instance.
 3)For instance variables JVM will auto matically initialize them with their default values of the datatypes.
 4)if instance variable & local varaible are having same name then 1st priority will be given to the LOCAL variables.
 *important*5)For every instance a seperate copy of instance varible will be created.[Means how many objects we are creating inside a class those many
 	copies of instance variables will be created.]
 
 
 Static Variables(or Class Variable)
 ================
 1)these variable are declared inside a class, outside any method or a block or a constructor and wtrh the help of 'static' key word.
 2)static variables will be initialize at the time of class loading.
 3)we can access static variables in '3' ways, by using identifier name,by using Class Object &by using ClassName
 4)for static variable JVM will automatically initialize them with their default values of the datatypes.
 5)if static variable and local variable are having same names then the first priority will be given to LOCAL variables.
 6)a static variable can never be a LOCAL varaible.
 *important*7)there will be only one copy of static variable available in the entire program.
 
 
 Local Variables
 ================
 1)the variables which are declared inside the method or a block or a constructor are known as LOCAL variables.
 2)We van access a local variable only with the help of its identifier name.
 3)the scope of a local variable is only within the method .means we cant access a local variable outside the method.
 4)for local variables JVM will not assign any default values,it is the responsibility of the programmer to initialize them.
 5)if we are declaring a local variable & if we are not using that variable then our program will be executed
 
 */

public class Class10 {
	int x=10; //instance variable
	static int y=20; //static variable
	
	int a; //instance variable
	static int b; //static varaible
	
	boolean flag;
	
	void meth1()
	{
		System.out.println("meth1() called");
		int z=30; //local variable
		System.out.println("Instance Variable x : "+x);//by using identifier name
		System.out.println("Instance Variable x : "+new Class10().x);//by using Class object
		System.out.println("---------------------------------------------");
		System.out.println("Static Variable y : "+y);//by using idenfier name
		System.out.println("Static Variable y : "+new Class10().y);//by using Class object
		System.out.println("Static Variable y : "+Class10.y);//by using Class name
		System.out.println("---------------------------------------------");
		System.out.println("Local Variable x : "+z);//by using identifier name
	}
	void meth2()
	{
		System.out.println("meth2() called");
		System.out.println("x value : "+x);
		System.out.println("y value : "+Class10.y);
		//System.out.println("z value : "+z);//C.E because we cant access local varaible outside a meth		
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int x=100;
		int y=100;
		System.out.println("Instance varaible x: "+new Class10().x);
		System.out.println("static varaible x: "+Class10.y);
		System.out.println("local varaible x: "+x);
		System.out.println("local varaible y: "+y);
	}
	void meth4()
	{
		System.out.println("meth4() called");
		int c;
		System.out.println("Instance variable : "+a);
		System.out.println("static variable : "+b);
		
		System.out.println("Instamce varaible : "+flag);
		//System.out.println("Local varaible : "+c);//C.E
	}
	public static void main(String[] args) {
		Class10 obj=new Class10();
		obj.meth1();
		System.out.println("-----------------------------");
		obj.meth2();
		System.out.println("-----------------------------");
		obj.meth3();
		System.out.println("-----------------------------");
		obj.meth4();
	}

}
