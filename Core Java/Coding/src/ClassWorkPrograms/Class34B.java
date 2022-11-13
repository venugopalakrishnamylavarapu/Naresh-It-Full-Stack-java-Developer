/*comparing of strings in String Class,StringBuilder Class,StringBuffer Class

 */
package ClassWorkPrograms;

public class Class34B {
	void meth1() {
        String s1 = new String("Java");
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuilder builder1 = new StringBuilder("Java");

        String s2 = new String("Java");
        StringBuffer buffer2 = new StringBuffer("Java");
        StringBuilder builder2 = new StringBuilder("Java");

        System.out.println("-------------String Class----------------");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false

        System.out.println("-------------StringBuffer Class----------------");
        System.out.println(buffer1.equals(buffer2));//false
        System.out.println(buffer1 == buffer2);//false
        System.out.println(buffer1.toString().equals(buffer2.toString()));//true

        System.out.println("-------------StringBuilder Class----------------");
        System.out.println(builder1.equals(builder2));//false
        System.out.println(builder1 == builder2);//false
        System.out.println(builder1.toString().equals(builder2.toString()));//true
    }

    public static void main(String[] args) {
        Class34B obj=new Class34B();
        obj.meth1();
    }
}
