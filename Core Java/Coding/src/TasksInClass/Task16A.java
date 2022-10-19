package TasksInClass;
/*analyse and give the output*/
public class Task16A {
	static int a=0;//a=1-->a=2-->a=3-->a=4
	int b=0;//b=1-->b=1-->b=1-->b=1
	Task16A()
	{
		a++;//a=0 a=1
		b++;//b=1
		System.out.println("Static variable==>"+a);//a=1-->a=2-->a=3==>a=4-->a=5
		System.out.println("Instance variable==>"+b);//b=1-->b=1-->b=1-->b=1-->b=1
		System.out.println("---------------------");
	}
	void display()
	{
		System.out.println("*************Accessing static variable***************");
		System.out.println(Task16A.a);//a=4
		System.out.println(a);//a=4
		System.out.println(new Task16A().a);//a=5
	}
	public static void main(String[] args) {
		new Task16A();
		new Task16A();
		new Task16A();
		System.out.println("##########################");
		new Task16A().display();
	}

}
