package TasksInClass;
/*
 need to identify which example is invalid and which example is valid.totally based on precious class
 exception 17 keypoints
 
 
 Example -1;   Valid
 ----------
 class Test1
 {
 main<--main method
 {
 try
 {
 
 }
 catch(ArithmeticException e)
 {
 
 }
 }
 }
 
 Example -2 Valid
 ----------
 class Test1{
 main
 {
 try
 {}
 catch(ArithmeticException e)
 {}
 catch(NullPointerException e)
 {}
 }
 }
 
 Example -3  Invalid (cant have duplicate exceptions for a single try block)
 ----------
 class Test1{
 main
 {
 try
 {}
 catch(ArithmeticException e)
 {}
 catch(ArithmeticException e)
 {}
 }
 }
 
 Example -4  Invalid (cant write a single try block)
 ----------
 class Test1
 {
 main
 {
 try
 {}
 }
 }
 
 Example -6  Invalid (cant have any statements between try-catch-finally)
 ----------
 class Test1{
 main
 {
 try
 {}
 sysout("hello");
 catch(Exception e)
 {}
 }
 }
 
 Example -5   Invalid (cant have single catch block)
 ----------
 class Test1{
 main
 {
 catch(Exception e)
 {}
 }
 }
 
 
 Example -7  Valid
 ----------
 class Test1
 {
 main
 {
 try
 {}
 catch(Exception e)
 {}
 finally
 {}
 }
 }
 
 Example -8  Valid but cant hande the exception because  of no catch block
 ----------
 class Test1{
 main
 {
 try
 {}
 finally
 {}
 }
 }
 
 Example -9  Invalid
 ----------
 class Test1{
 main
 {
 try
 {}
 finally
 {}
 finally
 {}
 }
 }
 
 Example -10  Invalid
 -----------
 class Test1{
 main
 {
 try
 {}
 catch(Exception e)
 {}
 sysout("hello");
 finally
 {}
 }
 }
 

Example -11  Invalid
-----------
class Test1
{
main
{
try
{}
finally
{}
catch(Exception e)
{}
}
}
 
 Example -12  Invalid
 -----------
 class Test1{
 main
 {
 finally
 {}
 }
 }
 
 Example -13  Invalid  <--Valid
 -----------
 class Test1
 {
 main
 {
 try
 {
	 try
	 {}
	 catch(Exception e)
	 {}
 }
 catch(Exception e)
 {}
 }
 }
 
 Example -14  Invalid  <--valid
 -----------
 class Test1
 {
 main
 {
 try
 {}
 catch(Exception e)
 {
 try{}
 finally{}
 }
 }
 
 }
 
 Example -15  Invalid because only a single finally block in the finally block
 -----------
 class Test1{
 main
 {
 try
 {}
 catch(Exception e)
 {
 try{}
 catch(Exception e){}
 }
 finally
	 {
	 	finally{}
	 }
 }
 }
 
 
 Example -16  Invalid
 -----------
 class Test1{
 main
 {
 finally
 {}
 try
 {}
 catch(Exception e)
 {}
 }
 }


 Example -17  Valid
 -----------
 class Test1
 {
 main
 {
 try
 {}
 catch(Exception e)
 {}
 finally
 {
	 try{}
	 catch(Exception e)
	 {}
	 finally
	 {}
 }
 }
 }
 
 */
public class Task49 {

}
