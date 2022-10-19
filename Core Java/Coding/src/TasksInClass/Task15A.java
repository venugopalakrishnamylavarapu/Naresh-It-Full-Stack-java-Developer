package TasksInClass;

public class Task15A {
    int meth1()
    {
        int a=10;/*a=11-->a=12-->a=13-->a=14-->a=15-->a=16-->
       a=15-->a=14-->a=17-->a=18-->a=17-->a=16-->a=17-->a=16-->a=20-->a=21-->a=22-->a=42
       -->
        */
        a++;//a=10 a=11
        System.out.println(a++);//a=11 a=12
        a++;//a=12 a=13
        System.out.println(++a);//a=14 a=14
        System.out.println(a++);//a=14 a=15
        System.out.println(a++);//a=15 a=16
        a--;//a=16 a=15
        System.out.println(--a);//a=14 a=14
        a=a++ +3;//a=14 a=15 +3==>14+3=17==>a=17
        System.out.println("a value===>"+a);//a=17
        System.out.println(a++);//a=17 a=18;
        --a;//a=17 a=17
        System.out.println(--a);//a=16 a=16
        System.out.println(a--);//a=16 a=17
        a=a-- +3;//a=17 a=16 +3==>17+3=20==>a=20
        return a++ + ++a;//a=20 a=21 + a=22 a=22==>20+22=42==>a=42
    }
    void meth2()//a=42 in meth1
    {
        int a=10;//a=11-->a=12-->
        int x=new Task15A().meth1()+ a++;//42+a=10 a=11==>42+10=52==>x=52-->x=53
        System.out.println(x++ + a++);//x=52 x=53 + a=11 a=12=(52+11)=63
        System.out.println(a++);//a=12 a=13==>a=12
        System.out.println(a);//a=12
        System.out.println(x);//x=53
    }
    public static void main(String[] args) {
        System.out.println("Start");
        new Task15A().meth2();
        System.out.println("Java is awesome");
    }
}
