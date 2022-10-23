package ClassWorkPrograms;
/*In this class we discuss about the code part of wrapper classes from last class
 
 check the second program for the auto-unboxing 
 
 */
public class Class20 {
	void meth1()
	{
		System.out.println("Performing Auto-Boxing");
		int i=10;
		Integer ival1=i;
		Integer ival2=new Integer(i);
		Integer ival3=Integer.valueOf(i);
		System.out.println("int PDT value : "+i);
		System.out.println("Integer WCO value : "+ival1);
		System.out.println("Integer WCO value : "+ival2);
		System.out.println("Integer WCO value : "+ival3);
		
		System.out.println("-----------------------------------------");
		
		byte b=5;
		Byte bval=Byte.valueOf(b);
		System.out.println("byte PDT value : "+b);
		System.out.println("Byte WCO value : "+bval);
		
		System.out.println("-----------------------------------------");

		float f=10.9f;
		Float fval=Float.valueOf(f);
		System.out.println("float PDT value : "+f);
		System.out.println("Float WCO value : "+fval);
		
		System.out.println("-----------------------------------------");

	}
	void meth2()
	{
		System.out.println("Wrapper Classes Defaultly accepts String data type except Characte W.C");
		
		Integer ival1=new Integer(100);
		Integer ival2=new Integer("100");//and the string inside must be integer like "538492" etc,we cannot pass "Venu"
		
		Byte bval1=new Byte((byte)50);
		Byte bval2=new Byte("100");
		
		Character cval=new Character('A');
		//Character cval2=new Character("J");
		//see here in the above line we get C.E because Character Wrapper Class will nit accepts string data
		
		System.out.println("ival1 : "+ival1);
		System.out.println("ival2 : "+ival2);
		System.out.println("bval1 : "+bval1);
		System.out.println("bval2 : "+bval2);
		System.out.println("cval : "+cval);

		
	}
	public static void main(String[] args) {
	Class20	obj=new Class20();
	obj.meth1();
	obj.meth2();
	}

}
