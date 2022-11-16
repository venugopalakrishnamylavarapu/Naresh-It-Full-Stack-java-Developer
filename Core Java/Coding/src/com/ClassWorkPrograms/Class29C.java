package com.ClassWorkPrograms;

public class Class29C {
    void meth1()
    {
        System.out.println("meth1() called");
    }
    Class29C()
    {
        System.out.println("Default Constructor");
    }
    Class29C(int a)
    {
        this();
        System.out.println("Parameterized Constructor : "+a);
        this.meth1();
    }

    public static void main(String[] args) {
        new Class29C(500);
    }
}


//this is another example of this() so check it
/*
public class ClassB
{
        ClassB()
        {
        this("Hello");
        sout("hi");
        }
       ClassB(String s)
       {
       sout(s);
       }
       public static void main(String[] args)
       {
       new ClassB();
       }
}

*/

