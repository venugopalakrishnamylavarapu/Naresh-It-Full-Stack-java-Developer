package com.TasksInClass;

/*sir gave a requirement as a question so we need to provide him a program meeting his requirements

just so u know i failed the task i copied from the sir's code explanation
*/
public class Task15B {
    void meth1(int a,int b,int c)
    {
        System.out.println("Addition : "+(a+b+c));
        new Task15B().meth2(100,1);
    }
    void meth2(int a,int b) {
        int c = a - b;
        System.out.println("Substraction : " + c);
    }
    Task15B()
    {
        System.out.println("Division:"+10/5);
    }
    Task15B(int a) {
        System.out.println("Multiplication : " + (a*a));
    }

    public static void main(String[] args) {
        new Task15B(10).meth1(5,5,5);
    }
}

