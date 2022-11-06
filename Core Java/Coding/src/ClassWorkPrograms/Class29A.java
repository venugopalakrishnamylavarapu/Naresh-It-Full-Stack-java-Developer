package ClassWorkPrograms;

public class Class29A {
	  void meth1()
	    {
	        System.out.println(10);
	        meth2(20);//by default compiler will add 'this' key word
	    }
	    void meth2(int a)
	    {
	        System.out.println(a);
	        this.meth3(10,20);
	    }
	    void meth3(int a,int b)
	    {
	        System.out.println(a+b);
	    }

	    public static void main(String[] args) {
	        new Class29A().meth1();
	        //this.meth1(); //C.E
	        //we can't use this keyword inside a static area.
	    }
}
