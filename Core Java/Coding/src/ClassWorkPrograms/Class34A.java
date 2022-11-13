/*
   in this class we discuss about StringBuilder,StringBuffer differences



   */
package ClassWorkPrograms;

public class Class34A {
	  void meth1()
	    {
	        String s=new String("Java");
	       StringBuffer buffer =new StringBuffer("Java");
	       StringBuilder builder=new StringBuilder("Java");

	        System.out.println("String value Before concatination : "+s);
	        System.out.println("StringBuffer value Before concatination : "+buffer);
	        System.out.println("StringBuilder value Before concatination : "+builder);

	        s.concat(" is awesome");
	        buffer.append(" is awesome");
	        builder.append(" is awesome");

	        System.out.println("---------------------------------------------------------");

	        System.out.println("String value After concatination : "+s);//Java
	        System.out.println("StringBuffer value After concatination : "+buffer);
	        System.out.println("StringBuilder value After concatination : "+builder);
	    }
	    public static void main(String[] args) {
	        Class34A obj=new Class34A();
	        obj.meth1();
	    }
}
