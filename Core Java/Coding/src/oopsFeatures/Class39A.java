package oopsFeatures;

public class Class39A extends Class39 {
void meth1()//overridding method
{
    System.out.println("Class B meth1() called");
}
void meth2()
{
    System.out.println("Class B meth2() called");
}

    public static void main(String[] args) {
        Class39 obj=new Class39A();
        obj.meth1();
        obj.meth2();
        System.out.println("------------------------------------");
        Class39 obj1=new Class39();
        obj.meth1();
        obj.meth2();
    }

}

