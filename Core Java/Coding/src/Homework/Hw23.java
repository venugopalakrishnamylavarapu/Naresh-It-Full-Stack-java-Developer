package Homework;

/*
3)WAP using switch statement that takes three inputs from the method as parameters:operator(+,-,/,*)
and 2 numbers.it performs calculation based on number and operator entered.Then the result is displayed on the screen.
 */
public class Hw23 {
	void meth1(int a,int b,String operator)
	{
		switch(operator)
		{
		case"+":
			System.out.println("The Addition of the two numbers is : "+(a+b));
			break;
		case"-":
			System.out.println("The Subtraction of the two numbers is : "+(a-b));
			break;
		case"%":
			System.out.println("The Modulus of the two numbers is : "+(a%b));
			break;
		case"*":
			System.out.println("The Mulitplication of the two numbers is : "+(a*b));
			break;
		case"/":
			System.out.println("The Division of the two numbers is : "+(a/b));
			break;
			
		}
	}
public static void main(String[] args) {
	new Hw23().meth1(10,20,"*");
}
}
