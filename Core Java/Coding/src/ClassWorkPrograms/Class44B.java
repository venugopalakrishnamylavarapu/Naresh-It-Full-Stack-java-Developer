package ClassWorkPrograms;
//this is parent class
public class Class44B {
	public static void main(String[] args) throws InterruptedException {
		Class44A obj=new Class44A();//this is child class of thread class object observe
		obj.start();
		obj.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class 44B main() : "+i);
		}
	}
}
