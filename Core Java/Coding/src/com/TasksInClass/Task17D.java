package com.TasksInClass;

public class Task17D {
static int x=10;//x=20
public static void main(String[] args) {
	Task17D t1=new Task17D();//first object
	Task17D t2=new Task17D();//second object
	t1.x=20;//x=10-->x=20==>assigned x to 20 by ClassObject
	System.out.print(x+" ");//x=20
	System.out.println(t2.x);//since the value of static got updated  we get the value of x as 20==>x=20
}
}
