package com.ClassWorkPrograms;
/*
 
 UNDERSTANDING PACKAGES
 =======================
 1)A package consists of similar types of classes,interfaces and sub packages.
 2)java package is used for easily accessing the classes.
 3)in general there are '2' types of packages are there.
 	a)Pre-Defined Packages
 	b)User-Defined Packages
 4)in java nearly there are 5000 predefined packages are present.
 5)if both the classes are present in the same package then NO need to use IMPORT statement.
 6)import statement is used to connect classes in java application of different packages.
 7)in every java program by default java.lang package will be automatically imported.
 
 Q)How to import a class into a program?
 A)we can import a class into a program in '3' ways
	1)by using--> import packageName.ClassName;  [only the specified Class will be imported into our program]
	2)by using--> import packageName.ClassName.*;  [All the Classes which were available in that package will be imported.]
	3)by using--> Fully Qualified ClassName.  [without using import statement we can import a  class into our program.]
 
 
     Access Modifier
     ===============
 -->in java we are having 4  types of Access modifiers
 -->all these 4 access modifiers are classified into 2 types
      1)Class level access modifiers.(public,default)
      2)Member level access modifiers.(all the four)
      
      
      Tabular form of access modifier
      ==============================
      
      modifier    class    package      sub-class     world
     =======================================================
      public       YES       YES           YES          YES 
      protected    YES       YES           YES          YES
      default      YES       YES
      private      YES
      
 */
public class Class28 {
public static void main(String[] args) {
	
}
}
/*
 						            	PACKAGES
 						            	
 these programs are present at different packages so it more confusion in this single Class package so i wrote them as comment 
 =======================================================
 				PRESENT IN THE SAME PAACKAGE
 				
 package com.pack1;
 
 public class ClassA
 {
 	public void meth1()
 	{
 	sysout("Class A method");
 	}
 }
 -------------------------------------------------------
 package com.pack1;
 public class ClassB
 {
 public void meth2()
 {
 sysout("Class B method");
 }
 public static void main(String[] args)
 {
 new ClassA().meth1();
 }
 }
 =========================================================================
 				PRESENT IN THE DIFFERENT PACKAGE
 				
 	package com.pack2;
 	import com.pack1.ClassA; //1st way [Highlly recommmended]
 	
 	//import com.pack1.*;//2nd way
 	 
 	 public class ClassX
 	 {
 	 public static void main(String[] args)
 	 {
 	 new ClassA().meth1();
 	 com.pack1.ClassB obj=new com.pack1.ClassB(); //3rd way
 	 obj.meth2();
 	 }
 	 }
 ================================================================================================================
 					                     ACCESS MODIFIERS
 
 package com.pack1;
 public class ClassA
 {
 protected void meth1()
 {
 sysout("Class A method")
 }
 public static void main(String[] args)
 {
 new ClassA().meth1();
 }
 }
 -------------------------------------------------------
 package com.pack1
 public class ClassB
 {
 public static void main(String[] args)
 {
 new ClassA().meth1();
 }
 }
 ============================================================================
 							DIFFERENT PACKAGE
 package com.pack2;
 import com.pack1.ClassA;
 public class ClassX extends ClassA
 {
 public static void main(String[] args)
 {
 //new ClassA().meth1();
  new ClassX().meth1();
 }
 }
 
 
 */
