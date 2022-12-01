package ClassWorkPrograms;

public class Class50B {
public static void main(String[] args)  throws Exception{
		System.out.println("Creating a clone for class object");
		Class50 obj1=new Class50();
		System.out.println(obj1.a+" "+obj1.b);//10 20
		Class50 obj2=obj1;//This is NOT CLONING
		obj2.b=500;
		System.out.println(obj1.a+" "+obj1.b+" "+obj2.b);//10 500 500
		
		System.out.println("----------------------------------------");
		
		Class50A bobj1=new Class50A(100,200);
		System.out.println(bobj1.x+" "+bobj1.y);//100 200
		Class50A bobj2=bobj1.show();//HERE WE ARE CREATING CLONE
		bobj2.y=500;
		System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.y);//100 200 500
		System.out.println(bobj2.x);//100
		
		Class50A bobj3=new Class50A(1000,2000);
		System.out.println(bobj3.x+" "+bobj3.y);//1000 2000
}
}
