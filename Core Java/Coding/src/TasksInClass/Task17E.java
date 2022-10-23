package TasksInClass;

public class Task17E {
	static int x=m1();//first priority x=50-->x=100-->x=120
public static void main(String[] args) {
	System.out.println(Task17E.x);//x=120
}
static {
	System.out.println(x);//x=100 by static variable got updated
	Task17E.x=x+20;//x=100-->x=100+20==>x=120
}
static int m1()//static variable
{
	Task17E.x=50;//x=50
	return m2();//100 by m2
}
static int m2()
{
	System.out.println(Task17E.x);//50
	return 100;
}
}
