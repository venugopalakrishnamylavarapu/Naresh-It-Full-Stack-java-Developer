package com.ClassWorkPrograms;

/*Relational operators
====================
>,<,<=,>=,!=.==
Logical operators
===================
&&,||,!

Understanding static keyword
============================
1)static key word in java is mainly used for memory management.
2)we can use static in 3 ways
  a)a variable can be declared as a static
  b)a method can be declared as a static
  c)a block can be declared as a static
  we'll discuss this in the next class

*/
public class Class15 {
  void person(int age)//its my own method btw.sir gave a mini task
  {
      if(age<18)
      {
          System.out.println("Not Elgible");
      }
      else
      {
          System.out.println("Elgible");
      }
  }
  void goveExamEligibility(String Name,int age)
  {
      if(age<22)
      {
          System.out.println(Name+" is not Eligible");
      }
      else if(age>=22 &&age<=35)
      {
          System.out.println(Name+" is Eligible");
      }
      else
      {
          System.out.println(Name+"is not Eligible");
      }
  }

  public static void main(String[] args) {
      new Class15().person(18);
      new Class15().person(7);
      System.out.println("---------------------------------------");
      new Class15().goveExamEligibility("venu",22);
  }

}

