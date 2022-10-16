package OwnMethods;

public class OwnMeth2 {
	public String meth1()//main 
	{
		System.out.println("Hy Bro");
		return "Good "+new OwnMeth2().meth5(
				new OwnMeth2().meth2(new OwnMeth2().meth4(15),new OwnMeth2().meth5("Love you man")))+" boi";
		
	}
	public String meth2(int a,String s)//meth 1 a=?(30),s=??(love u man)
	{
		System.out.println(a+a);
		new OwnMeth2().meth4(5);
		System.out.println(s+a);
		return s;
	}
	public char meth3(String s,double d)//unused method
	{
		System.out.println("If u dont Get it");
		return s.charAt(4);
	}
	public int meth4(int a)//meth2 a=5
	{
		System.out.println("Bring me Down!!");
		return a+a;
	}
	public String meth5(String s)
	{
		return s;
	}
	public static void main(String[] args) {
		System.out.println(new OwnMeth2().meth1());
	}
}

