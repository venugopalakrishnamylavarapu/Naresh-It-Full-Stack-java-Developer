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

public class Class29B {

	    Class29B meth1()
	    {
	        System.out.println("meth1() called");
	        return this;
	    }
	    Class29B meth2()
	    {
	        System.out.println("meth2() called");
	        return this;
	    }
	    void meth3()
	    {
	        System.out.println("meth3() called");
	    }

	    public static void main(String[] args) {
	        new Class29B().meth1().meth2().meth3();
	    }

}
