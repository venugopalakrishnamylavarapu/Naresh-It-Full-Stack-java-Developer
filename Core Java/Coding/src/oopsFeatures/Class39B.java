package oopsFeatures;

/*

Key Points in Method Overriding
=================================
1)if we can't inherit we can't override.[Ex: private methods]
2)Inheritance is mandatory for method overriding.
3)private>default>protected>public.
4)Child class methods should not be more restrictive than the parent class methods.
5)static methods can't be overridden.[Method hiding]
6)After jdk 1.5 return types may not be same in co-variant return types.
  (Co-Variant return types concept is applicable only for objects types but not for primitives)
7)Constructors can't be Overridden.

*/
public class Class39B {
    private void meth1()
    {
        System.out.println(100);
    }
    void meth1(int a)
    {
        System.out.println("hi ==> "+(a+1));
    }
    public void show()
    {
        System.out.println("Java is awesome");
    }
    static void display()
    {
        System.out.println("Addition : "+(99+1));
    }
    Class39B meth2()
    {
        System.out.println("Class39B meth2() called");
        return new Class39B();
    }
}


