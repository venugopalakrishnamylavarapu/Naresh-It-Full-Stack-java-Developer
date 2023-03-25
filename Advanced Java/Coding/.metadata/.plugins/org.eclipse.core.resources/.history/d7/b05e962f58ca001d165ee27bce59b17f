import java.lang.reflect.*;
import java.util.Scanner;
public class Reflection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class c=Class.forName(sc.nextLine());
			Method[] m=c.getMethods();
			for(Method m2:m)
			{
				System.out.println(m2);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
