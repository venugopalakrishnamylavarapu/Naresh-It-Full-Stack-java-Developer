package ClassWorkPrograms;

public class Class50A  implements Cloneable
{
	int x;
	int y;
	
	Class50A(int num1,int num2)
	{
		x=num1;
		y=num2;
	}
	Class50A show() throws CloneNotSupportedException
	{
		Class50A obj=(Class50A)super.clone();
		return obj;
	}
}
