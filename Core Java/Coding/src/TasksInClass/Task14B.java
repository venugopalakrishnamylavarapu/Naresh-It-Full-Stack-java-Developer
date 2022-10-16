package TasksInClass;
/*complicated task in increment and decrement concept */

public class Task14B {
	public static void main(String[] args) {
		int a=34;//a=34-->35-->a=34
		int b=21;//b=21-->b=22-->b=21-->b=20
		int c=a++ + ++b;//c= (a=34 a=35 + b=22 b=22)==>(34+22=56)==>c=56-->c=55
		int d= --a + --b +c--;//d= (a=34 a=34 + b=21 b=21 +c=56 c=55)==>(34+21+56=111)==>d=111-->d=110-->d=109
		int e =a+ +b + +c +d--;//a=34+b=21+c=55+(d=111 d=110)==>(34+21+55+111=221)==>e=221
		int f= -a +b-- + -c - d--;//a=(-34)+(b=21 b=20)+c=(-55)-(d=110 d=109)==>(-34+21-55-110=-178)==>f=-178
		int sum=a+b+c+d+e+f;//(a=34+b=20+c=55+d=110+e=221+f=(-178))==>(34+20+55+109+221-178)=261==>sum=261
		System.out.println("sum = "+sum);//261
	}
}
