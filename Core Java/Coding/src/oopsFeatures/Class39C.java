package oopsFeatures;

public class Class39C extends Class39B {
    void meth1()
    {
        System.out.println(200);
    }
    void meth1(int x)
    {
        System.out.println("hello ==> "+(x+2));
    }
    public void show()
    {
        System.out.println("Hello world");
    }
    static void display()
    {
        System.out.println("Substraction : "+(99+1));
    }
    Class39C meth2()
    {
        System.out.println("Class 39C meth2() called");
        return  new Class39C();
    }

    public static void main(String[] args) {
        Class39B obj=new Class39C();
        obj.meth1(100);
        //obj.meth1();//C.E
        obj.show();
        obj.meth2();
        System.out.println("-----------------------");
        obj.display();
        new Class39C().meth1();
    }

}

