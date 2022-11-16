package com.Homework;

//this was the main task in this class
public class Hw29 {
  public int meth1(int a,int b)//a=18 b=-27
  {
      System.out.println("meth1 called");
      System.out.println(b);
      System.out.println(100);
      return (a+b)+10+(a-b);//46
  }
  public int meth2()//hw29(string)
  {
      System.out.println("meth2 called");
      return this.meth3()+8;//10+8=18;
  }
  public Hw29()//main
  {
      this("Java is awesome");//calling constructor
      System.out.println(50);
  }
  int meth3()//meth2
  {
      System.out.println("meth3 called");
      return 10;
  }
  public String meth4(int a,String s)//hw29(string)-->a=46 ,s=Java
  {
      System.out.println("meth4 called");
      a=a+4;
      System.out.println("a value ==>"+a);
      System.out.println("s value ==>"+s);
      return s+" is object oriented programming language";
  }
  public int meth5(int a)//a=5
  {
      System.out.println("meth5() called");
      return 10-a;//10-5=5
  }
  public Hw29(String s)
  {
      String result=this.meth4(this.meth1(this.meth2(),this.meth5(5)+'A'-('a')),"Java");
      System.out.println(result);
      System.out.println(s);
  }

  public static void main(String[] args) {
      new Hw29();
  }
}

