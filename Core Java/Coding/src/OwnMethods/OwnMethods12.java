package OwnMethods;
/*homework question
 * =================
   4)write a constructor in the car class given below that initializes the brand field with the string "Ford"
   Call the getBrand() method in the main method of the sample class and store the value of the brand in a variable,and print the value
   
   Code snippet
   ------------
   class Car
   {
   String brand;
   public String getBrand()
   {
   return brand;
   }
   void run()
{
sysout("Car is running...")'
}
}
*/

public class OwnMethods12 {
	 String brand;
	 OwnMethods12(String s)
	 {
		 brand=s;
	 }
	   public String getBrand()
	   {
	   return brand;
	   }
	   void run()
	{
	System.out.println("Car is running...");
	}
	   public static void main(String[] args) {
		  OwnMethods12 obj= new OwnMethods12("Ford");
		   String name=obj.getBrand();
		   System.out.println(name);
		   obj.run();
		   
	
	}
}
