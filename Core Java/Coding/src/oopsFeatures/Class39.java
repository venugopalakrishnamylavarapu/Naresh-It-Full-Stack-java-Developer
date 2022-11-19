package oopsFeatures;

/*
in this class we discuss about method overidding

Method Overriding
=================
Writing two or more methods in two difference classes having same method name,same return type.

Some Key Points
=================
->The method present in parent class is known as overridden method.
  and the method present in sub class is called overriding method.
->When an overridden(parent class) method is called through a super class reference.Java determines
  which version of that method is to be executed based upon the type of the object being
  referred to at the time the call occurs.thus,this determination is made at run time.
  that is the reason it is called as "Run-Time polymorphism"
->it is also known as late binding or run time polymorphism.


Differences between overloading and overridding(my own points)
--------------------------------------------------------------

            method overloading                                                method overridding
  ->overloading is said to be the process                           ->method overridding is a process of
    of declaring the same methods name                                 Writing two or more methods in two
     but with different parameters                                     difference classes having same method name,same return type.
  ->inheritance is not mandatory to achieve                         ->inheritance is mandatory to achieve overridding
    method overloading
  ->litterally any method can be overloaded                         ->overridding sometimes is restricted by access specifiers
    if it follows the 1st point rule

*/

public class Class39 {
    void meth1() //overridden method
    {
        System.out.println("Class A meth1() called");
    }
    void meth2()
    {
        System.out.println("Class A meth2() called");
    }
}

