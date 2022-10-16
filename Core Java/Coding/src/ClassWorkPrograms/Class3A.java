package ClassWorkPrograms;
/*finalize() method
 * ================
 * 1)finalize method will be called by garbage collector
 * 2)garbage collector will act on the class when 
 * an object or reference is eligible for destruction
 * 3)in simple terms it deletes the unused object,references from heap area
 * 
 *  OBJECT
 *  ======
 *  1)objects are created from a class.
 *  2)to create an object we shud use new key word and initialize 
 *  that object with the help of a constructor(constructor name is same as class name).
 *  3)we can create multiple objects of one class.
 *  
 *  VARIABLE
 *  ========
 *  1)a variable provides identity to a memory location
 *  2)using variables we can process the information easily. */

public class Class3A {
	public static void main(String[] args) {
		Class3A obj1=new Class3A();
		Class3A obj2=new Class3A();
		
		obj1.meth1();
		obj2=obj1;//here obj1 has been unreffered so its a garbage
		System.gc();
	}

	void meth1() {
		System.out.println("meth1() called");
	}
	 
	protected void finalize() {
		System.out.println("Garbage has been collected");
	}
}
