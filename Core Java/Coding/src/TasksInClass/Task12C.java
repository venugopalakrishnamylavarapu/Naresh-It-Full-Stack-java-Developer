package TasksInClass;
/*Task3 in class12
 * 3Q)Suppose you have aa Bank Account with an initial amout of 500 and you have to add some more amount to it.
   Create a class 'AddAmount' with data member named 'amount' with an initial value of 500.Now make two constructors of this class as 
   follows:
   1-->without any parameter - no amount will be added then just display  your balance with out updating
   2-->having a parameter which is the amount that will be added to the account & display the final amount.*/

public class Task12C {
	int amount=500;
	Task12C()
	{
		System.out.println("the balance amount is :"+amount);
	}
	Task12C(int addedamount)
	{
		System.out.println("the balance amount is :"+(amount+addedamount));
	}
	public static void main(String[] args) {
		Task12C obj1=new Task12C();
		new Task12C(500); // well i don't know how is this possible
	}
}
