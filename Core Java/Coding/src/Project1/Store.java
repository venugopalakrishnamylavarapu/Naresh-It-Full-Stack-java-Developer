package Project1;

import java.util.Scanner;
import java.util.ArrayList;
 
/*I RECOMMEND RUN THIS PROGRAM IN ECLIPSE FOR BEST EXPERIENCE AS FOR OTHER IDES U NEED TO MAKE SOME CHANGES*/
public class Store {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> list=new ArrayList<String>();
		
	static void HomeAppliances()// calling method store
	{
		System.out.println();
		
		System.out.println(".==================================================================.\r\n"
				+ "| ID NO	|             NAME		|   COMPANIES AVAILABLE	   |\r\n"
				+ "|==================================================================|\r\n"
				+ "| 201	|	REFRIGERATORS		| samsung,whirlpool,lg,god-|\r\n"
				+ "|	|				| -rej,panasonic.	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 202	|	TELEVISION		| sansui,samsung,Lg,Mitv   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 203	| RICECOOKERS,MIXERS,GRINDERS	|prestige,pegion,butterfly |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 204	|   AC,COOLERS,TABLEFANS	|loyd,samsung,mi,kinestar  |\r\n"
				+ "|	|				|			   |\r\n"
				+ ".==================================================================.");
		
		System.out.println("Select the desired id from the above categories of Home Appliances");
		
		int a=sc.nextInt();
		switch(a)
		{
		case 201:
			Refrigerators();
			break;
		case 202:
			Televison();
			break;
		case 203:
			RMG();
			break;
		case 204:
			ACT();
			break;
		default:
			System.out.println();
			System.out.println("PLEASE SELECT A VALID CATEGORY");
			System.out.println();
			HomeAppliances();
		}
		
	}
	
	
	static void ACT() {
		System.out.println();
		System.out.println("");
	}


	static void RMG() {
		
	}


	static void Televison() {
		
	}


	static void Refrigerators() {
		System.out.println();
		System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> REFRIGERATORS!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");
		System.out.println();
		System.out.println(".==================================================================.\r\n"
				+ "| ID NO	|             NAME		|          PRICE	   |\r\n"
				+ "|==================================================================|\r\n"
				+ "| 20101	|	  SAMSUNG		|    *OUT-OF-STOCK!!*      |\r\n"
				+ "|	|				| 			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 20102	|	   LYOD			| 	12000/-RS          |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 20103	|	 WHIRLPOOL		| 	17000/-RS	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 20104	|        PANASONIC		|	15000/-RS	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 20105	|	  GODREJ		|	22000/-RS	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ ".==================================================================.");
		System.out.println("select ur desired product id from the above list");

		int a=sc.nextInt();
		switch(a) {
				case 20101:
					System.out.println("Samsung refrigerators are currently out of stock.new stock will come in the comming days so plz bear with us.");
					Refrigerators();
					break;
				case 20102:
					System.out.println("how many quantity u want?");
					int b1=sc.nextInt();
					int price1 = b1*12000;
					list.add(20101);
					System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
					int k1=sc.nextInt();
					switch(k1)
					{
					case 1:
						Refrigerators();
						break;
					casstore();
						break;
					case 3:
						billing(20102,"LYOD",b1,price1);
						break;
					default:
						System.out.println("please enter a valid response");
						break;	
					}
					break;
				case 20103:
					System.out.println("how many quantity u want?");
					int b2=sc.nextInt();
					int price2 =b2*17000;
					System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
					int k2=sc.nextInt();
					switch(k2)
					{
					case 1:
						Refrigerators();
						break;
					casstore();
						break;
					case 3:
						billing(20103,"WHIRLPOOL",b2,price2);
						break;
					default:
						System.out.println("please enter a valid response");
						break;	
					}
					break;
				case 20104:
					System.out.println("how many quantity u want?");
					int b3=sc.nextInt();
					int price3 = b3*15000;
					billing(20102,"PANASONIC",b3,price3);	
					break;
				case 20105:
					System.out.println("how many quantity u want?");
					int b4=sc.nextInt();
					int price4 = b4*22000;
					billing(20102,"GODREJ",b4,price4);
					break;
		}
	}

	static void Gadgets()//calling method store
	{
		System.out.println();
		System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> GADGETS!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");

		
	}
	
	static void GamingConsoles()//calling method store
	{
	System.out.println();
	System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> GAMING CONSOLES!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");

		
	}
	
	static void MobileAccesories()// calling method store
	{
		System.out.println();
		System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> MOBILE ACCESORIES!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");

		
	}
	
	static void store()
	{	System.out.println("Check the below List");
		System.out.println("1.Gadgets");
		System.out.println("2.Home Appliances");
		System.out.println("3.Gaming Consoles");
		System.out.println("4.Mobile Accesories");
		System.out.println("Coming soon.....");
		System.out.println();
		
		System.out.println("Select ur desired category");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			Gadgets();
			break;
		case 2:
			HomeAppliances();
			break;
		case 3:
			GamingConsoles();
			break;
		case 4:
			MobileAccesories();
			break;
		default:
			System.out.println();
			System.out.println("PLEASE SELECT A VALID CATEGORY");
			System.out.println();
			store();

		}
		
	}
	
	
	static void billing(int id,String name,int Quantity,int price)
	{
		int sum=0;
		int total=sum+price;
		System.out.println(id+" "+name+" "+Quantity+" "+price);
	}
	static void displayFormat()
	{
		System.out.println(".=======================================================================================.\r\n"
				+ "|IDNO  |		PRODUCT NAME		|	QUANTITY	|	PRICE		|\r\n"
				+ ".=======================================================================================.");
	}
	static void display(int id,String name,int Quantity,int price)
	{
		System.out.printf("%d  ,%s  ,%d, %d",id,name,Quantity,price);
	}
	
	
	
public static void main(String[] args) {
	System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"
			+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"
			+ "<>//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<>\n"
			+ "<>############################################ 			             __	    __	__  .  .  __				############################################################<>\n"
			+ "<>############################################				|  ||_	|  |   |  | |\\/| |_				############################################################<>\n"
			+ "<>############################################				|/\\||__ |__|__ |__| |  | |__				############################################################<>\n"
			+ "<>############################################				============================				############################################################<>\n"
			+ "<>############################################					 ___  __					############################################################<>\n"
			+ "<>############################################					  |  |	|					############################################################<>\n"
			+ "<>############################################					  |  |__|					############################################################<>\n"
			+ "<>############################################					==========					############################################################<>\n"
			+ "<>############################################	                                    __						############################################################<>\n"
			+ "<>############################################				      |  | |__  |  |					############################################################<>\n"
			+ "<>############################################   			       \\/   __|  \\/					############################################################<>\n"
			+ "<>############################################ 				     =================					############################################################<>\n"
			+ "<>############################################		         __ .   __  __	___  __	  __	   ___	 __   __		############################################################<>\n"
			+ "<>############################################		        |_  |  |_  | 	 |  |__| |  | |\\ |  |	|    |__		############################################################<>\n"
			+ "<>############################################		        |__ |__|__ |__	 |  |\\	 |__| |	\\| _|_	|__   __|		############################################################<>\n"
			+ "<>############################################			==================================================		############################################################<>\n"
			+ "<>############################################		PLACE WHERE U CAN BUY ANY ELECTRONICS FROM UR POCKET MONEY!!            ############################################################<>\n"
			+ "<>##########################################################################################################################################################################################<>\n"
			+ "<>//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<>\n"
			+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"
			+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"
			+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	System.out.println("\n");
	System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> PLEASE PRESS 1 TO ENTER THE STORE<<<<<<<<<<<<<<<<-----------------------------------------------------------");
	store();
}
}
