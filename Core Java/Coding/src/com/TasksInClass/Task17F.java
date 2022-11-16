package com.TasksInClass;

public class Task17F {
int c;
static int e;
Task17F(){
	System.out.println(++c);//c=1 c=1
	System.out.println(++e);//e=1 e=1
}
public static void main(String[] args) {
	int a=34;
	int b=21;
	new Task17F().c-=a++ + ++b;
	int d=--a + --b +new Task17F().c--;
	e=a+ +b +new Task17F().c + d--;
	int f=-a+b-- + -new Task17F().c - d++;
	int sum=a+b+new Task17F().c+d+e+f;
	System.out.println("sum="+sum);
}
}
