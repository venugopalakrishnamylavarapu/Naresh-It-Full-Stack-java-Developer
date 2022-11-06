package ClassWorkPrograms;
/*
Understanding 'this' keyword
=============================
-->we can use 'this' keyword in 4 ways.
1)it is used to resolve the ambiguity between instance variables and local variables.
2) it is used to access present class Methods.
3)it is used to return the instance of the present class.
4)
                        this                                        this()
                        ====                                        ======
           1)it is a Keyword                                  1)it is a Constructor call
           2)we can use 'this' keyword to                     2)it is used to call present class
            access present class variables                      constructor
            &methods
            3)we can use 'this' keyword                       3)we need to use this() ONLY inside
            anywhere except inside a static area                a constructor that too as a
                                                                1st statement inside a constructor
                                                              4)if we are using this() anywhere else except
                                                              inside a constructor we will be getting C.E
 */

public class Class29 {
	
	    int a=10;
	    static int b=20;
	    void meth1(){
	        int a=100;
	        int b=200;
	        System.out.println("Instance Variable  : "+this.a);
	        System.out.println("static variable : "+Class29.b);
	        System.out.println("Local variable a : "+a +" b :"+b);
	    }
	    public static void main(String[] args) {
	    Class29 obj=new Class29();
	    obj.meth1();
	    }
	}
	/*

	-->with the help of 'this' keyword we can access present class instance variables & static variables
	-->But accessing static variables with the help of 'this' keyword is not recommended.
	-->we can't use 'this' keyword for a local variable.

	*/

