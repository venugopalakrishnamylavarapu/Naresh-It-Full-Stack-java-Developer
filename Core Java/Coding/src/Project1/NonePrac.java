package project1;

import java.util.Scanner;
import java.util.Hashtable;
import java.util.ArrayList;


public class NonePrac {
        static Scanner sc=new Scanner(System.in);
        static ArrayList<Integer> totalPrice=new ArrayList<Integer>();
        static Hashtable<Integer,String> hash=new Hashtable<Integer,String>();

        /*---------------------------------------------------------------------Home Appliances section starts here---------------------------------------------------------------------------------------*/
        static void HomeAppliances()// calling method store
        {
            System.out.println();

            System.out.println(".==================================================================.\r\n"
                    + "| ID NO	|             NAME		|   COMPANIES AVAILABLE	   |\r\n"
                    + "|==================================================================|\r\n"
                    + "| 201	|	Refrigerators		| samsung,whirlpool,lg,god-|\r\n"
                    + "|	|				| -rej,panasonic.	   |\r\n"
                    + "|	|				|			   |\r\n"
                    + "| 202	|	Television		| sansui,samsung,Lg,Mitv   |\r\n"
                    + "|	|				|			   |\r\n"
                    + "|	|				|			   |\r\n"
                    + "| 203	| Ricecookers,Mixers,Grinders	|prestige,pegion,butterfly |\r\n"
                    + "|	|				|			   |\r\n"
                    + "|	|				|			   |\r\n"
                    + "| 204	|   AC's,Coolers,TableFans	|loyd,samsung,mi,kinestar  |\r\n"
                    + "|	|				|			   |\r\n"
                    + ".==================================================================.");

            System.out.println("Select the desired id from the above categories of Home Appliances or press 1 to go back to home page");

            int a=sc.nextInt();
            switch(a)
            {
            case 1:
            	store();
            	break;
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
        	System.out.println();
            System.out.println("----------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Rice Cookers,Mixers,Grinders <<<<<<<<<<<<<<<<---------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|  NO OF ITEMS AVAILAB	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 20301	|	 RICECOOKERS		|    		4	   |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 20302	|	   MIXIES		| 		3          |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 20303	|	 GRINDERS		| 	 	3	   |\r\n"
            		+ ".==================================================================.\r\n"
            		+ "");
            System.out.println("Enter the product id u want to see its menu");
            int a=sc.nextInt();
            switch (a)
            {
            	case 20301:
            		riceCookers();
            		break;
            	case 20302:
            		mixies();
            		break;
            	case 20303:
            		grinders();
            		break;
            	default:
            		System.out.println("Please Enter a valid id number");
            		RMG();
            		break;
            }

        }


        private static void grinders() {
        	System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Grinders <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|  	     PRICE	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 203021|	 PRESTIGE		|    	   8999/-	   |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 203022|	   GANGA		| 	   6999/      	   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 203023|	 BUTTERFLY		| 	   11599/-	   |\r\n"
            		+ "| 	|	 			| 	 		   |\r\n"
            		+ ".==================================================================.");
			
		}


		private static void mixies() {

			System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Mixies <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
			System.out.println(".==================================================================.\r\n"
					+ "| ID NO	|             NAME		|  	     PRICE	   |\r\n"
					+ "|==================================================================|\r\n"
					+ "| 203021|	 PRESTIGE		|    	   1599/-	   |\r\n"
					+ "|	|				| 			   |\r\n"
					+ "|	|				|			   |\r\n"
					+ "| 203022|	   GANGA		| 	   3999/      	   |\r\n"
					+ "|	|				|			   |\r\n"
					+ "|	|				|			   |\r\n"
					+ "| 203023|	 BUTTERFLY		| 	   5599/-	   |\r\n"
					+ "| 	|	 			| 	 		   |\r\n"
					+ ".==================================================================.");
			  System.out.println("select ur desired product id from the above list or select 1 to go back");

	            int a=sc.nextInt();
	            switch(a) {
		            case 1:
		            	HomeAppliances();
		            	break;
	                case 203021:
	                	System.out.println("how many quantity u want?");
	                    int b=sc.nextInt();
	                    int price = b*1599;
	                    totalPrice.add(price);
	                    hash.put(203021,"|203021|    PRESTIGE(mixie)			| 	1599/-RS        "+"|	   "+b+"	 	"+"|	"+price+"    		         | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k=sc.nextInt();
	                    switch(k)
	                    {
	                        case 1:
	                        	mixies();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            mixies();
	                            break;
	                    }
	                    break;
	                  
	                case 203022:
	                    System.out.println("how many quantity u want?");
	                    int b1=sc.nextInt();
	                    int price1 = b1*3999;
	                    totalPrice.add(price1);
	                    hash.put(203022,"|203022|    GANGA(mixie)			| 	3999/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k1=sc.nextInt();
	                    switch(k1)
	                    {
	                        case 1:
	                        	mixies();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price1);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            mixies();
	                            break;
	                    }
	                    break;
	                case 203023:
	                    System.out.println("how many quantity u want?");
	                    int b2=sc.nextInt();
	                    int price2 = b2*5599;
	                    totalPrice.add(price2);
	                    hash.put(203023,"|203023|    BUTTERFLY(mixie)			| 	5599/-RS        "+"| 	  "+b2+"	 	"+"|	"+price2+"    		         | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k2=sc.nextInt();
	                    switch(k2)
	                    {
	                        case 1:
	                        	mixies();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price2);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            mixies();
	                            break;
	                    }
	                    break;
	                default:
	                 	System.out.println("Enter a valid id no ");
	                 	mixies();
	            }
		}


		private static void riceCookers()
		{
			System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Rice Cookers  <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|  	     PRICE	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 203011|	 PRESTIGE		|    	   4999/-	   |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 203012|	   PIGEON		| 	   3500/      	   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 203013|	 BUTTERFLY		| 	   7599/-	   |\r\n"
            		+ "| 	|	 			| 	 		   |\r\n"
            		+ "| 	|	 			| 	 		   |\r\n"
            		+ "| 203014|	 PRESTIGE BLACKPRINCE	| 	   8999/-	   |\r\n"
            		+ "| 	|	 			| 	 		   |\r\n"
            		+ ".==================================================================.");
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	HomeAppliances();
	            	break;
                case 203011:
                	System.out.println("how many quantity u want?");
                    int b=sc.nextInt();
                    int price = b*4999;
                    totalPrice.add(price);
                    hash.put(203011,"|203011|    PRESTIGE(cooker)			| 	4999/-RS        "+"|	   "+b+"	 	"+"|	"+price+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	riceCookers();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            riceCookers();
                            break;
                    }
                    break;
                  
                case 203012:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*3500;
                    totalPrice.add(price1);
                    hash.put(203012,"|203012|    PIGEON(cooker)			| 	3500/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	riceCookers();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            riceCookers();
                            break;
                    }
                    break;
                case 203013:
                    System.out.println("how many quantity u want?");
                    int b2=sc.nextInt();
                    int price2 = b2*7599;
                    totalPrice.add(price2);
                    hash.put(203013,"|203013|    BUTTERFLY(cooker)			| 	7599/-RS        "+"| 	  "+b2+"	 	"+"|	"+price2+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k2=sc.nextInt();
                    switch(k2)
                    {
                        case 1:
                        	riceCookers();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price2);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            riceCookers();
                            break;
                    }
                    break;
                case 203014:
                    System.out.println("how many quantity u want?");
                    int b3=sc.nextInt();
                    int price3 = b3*8999;
                    totalPrice.add(price3);
                    hash.put(203014,"|203014|    PRESTIGE BLACKPRINCE(cooker)	| 	8999/-RS       "+" |	   "+b3+"	 	"+"|	"+price3+"    		         |	");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k3=sc.nextInt();
                    switch(k3)
                    {
                        case 1:
                        	riceCookers();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price3);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            riceCookers();
                            break;
                    }
                    break;
                default:
                 	System.out.println("Enter a valid id no ");
                 	riceCookers();
            }
		}


		static void Televison() {
        	System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Televisions  <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|         PRICE	   	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 20201	|	  SAMSUNG		|    	 25000/-RS         |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 20202	|	   SANSUI		| 	 6999/-RS          |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 20203	|	    LG			| 	12999/-RS	   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 20204	|           MI			|	14999/-RS	   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ ".==================================================================.");
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	HomeAppliances();
	            	break;
                case 20201:
                	System.out.println("how many quantity u want?");
                    int b=sc.nextInt();
                    int price = b*25000;
                    totalPrice.add(price);
                    hash.put(20201,"|20201|    SAMSUNG(tv)				| 	25000/-RS       "+"|	   "+b+"	 	"+"|	"+price+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	Televison();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Televison();
                            break;
                    }
                    break;
                  
                case 20202:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*6999;
                    totalPrice.add(price1);
                    hash.put(20202,"|20202|    SANSUI(tv)				| 	6999/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	Televison();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Televison();
                            break;
                    }
                    break;
                case 20203:
                    System.out.println("how many quantity u want?");
                    int b2=sc.nextInt();
                    int price2 = b2*12999;
                    totalPrice.add(price2);
                    hash.put(20203,"|20203|    LG (tv)				| 	12999/-RS       "+"|	   "+b2+"	 	"+"|	"+price2+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k2=sc.nextInt();
                    switch(k2)
                    {
                        case 1:
                        	Televison();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price2);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Televison();
                            break;
                    }
                    break;
                case 20204:
                    System.out.println("how many quantity u want?");
                    int b3=sc.nextInt();
                    int price3 = b3*14999;
                    totalPrice.add(price3);
                    hash.put(20204,"|20204|    MI (tv)				| 	14999/-RS       "+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k3=sc.nextInt();
                    switch(k3)
                    {
                        case 1:
                        	Televison();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price3);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Televison();
                            break;
                    }
                    break;
                default:
                 	System.out.println("Enter a valid id no ");
                 	Televison();
            }
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
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	HomeAppliances();
	            	break;
                case 20101:
                	System.out.println("\t\tSamsung refrigerators are currently out of stock we will restock them \n\t\t\tso plz bear with us.until then \ncheck our other products by pressing 1 || press 2 to go back to store page|| press 3 to go back to homeappliances menu");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	Refrigerators();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                        	HomeAppliances();
                        	break;
                    }
                    break;
                  
                case 20102:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*12000;
                    totalPrice.add(price1);
                    hash.put(20102,"|20102|    LYOD(rf)				| 	12000/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	Refrigerators();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Refrigerators();
                            break;
                    }
                    break;
                case 20103:
                    System.out.println("how many quantity u want?");
                    int b2=sc.nextInt();
                    int price2 = b2*17000;
                    totalPrice.add(price2);
                    hash.put(20103,"|20103|    WHIRLPOOL (rf)			| 	17000/-RS        "+"|	   "+b2+"	 	"+"|	"+price2+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k2=sc.nextInt();
                    switch(k2)
                    {
                        case 1:
                        	Refrigerators();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price2);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Refrigerators();
                            break;
                    }
                    break;
                case 20104:
                    System.out.println("how many quantity u want?");
                    int b3=sc.nextInt();
                    int price3 = b3*15000;
                    totalPrice.add(price3);
                    hash.put(20104,"|20104|    PANASONIC (rf)			| 	15000/-RS       "+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k3=sc.nextInt();
                    switch(k3)
                    {
                        case 1:
                        	Refrigerators();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price3);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Refrigerators();
                            break;
                    }
                    break;
                case 20105:
                	System.out.println("how many quantity u want?");
                    int b4=sc.nextInt();
                    int price4 = b4*22000;
                    totalPrice.add(price4);
                    hash.put(20105,"|20105|    GODREJ				| 	22000/-RS        "+"|	   "+b4+"	 	"+"|	"+price4+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k4=sc.nextInt();
                    switch(k4)
                    {
                        case 1:
                        	Refrigerators();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price4);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Refrigerators();
                            break;
                    }
                    break;
              default:
                 	System.out.println("Enter a valid id no ");
                 	Refrigerators();
            }
        }
/*---------------------------------------------------------------------Home Appliances section ends here---------------------------------------------------------------------------------------*/
        
/*---------------------------------------------------------------------Laptops section starts here---------------------------------------------------------------------------------------*/

        static void Laptops()//calling method store
        {
            System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Laptops!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|   	    PRICE	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 101	|  Dell inspiron 1tbhdd/256ssd  |	  65000/-Rs	   |\r\n"
            		+ "|	| backlit,8gbram/2gb nvedia card| 			   |\r\n"
            		+ "|	| i5 10th gen,15 inch display	|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 102	| hp 15s 1tbhdd/256ssd backlit,	|         67000/-Rs  	   |\r\n"
            		+ "|	| 8gbram iris,i5 intel 11gen	|			   |\r\n"
            		+ "|	| 				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 103	| Lenovo IdeaPad Slim 1		|	  39000/-Rs	   |\r\n"
            		+ "|	|  AMD Ryzen 3 Thin & Light 	|			   |\r\n"
            		+ "|	|Laptop (8GB/512GB SSD/Windows11|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 104	|ASUS ROG Strix G17 (2022)	|	109599/-Rs  	   |\r\n"
            		+ "|	|Gaming Laptop (16GB/512GB SSD,	|			   |\r\n"
            		+ "|	|/Windows 11/Green/2.5 Kg)	|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ ".==================================================================.\r\n"
            		+ "");
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	store();
	            	break;
                case 101:
                	System.out.println("how many quantity u want?");
                    int b=sc.nextInt();
                    int price = b*65000;
                   totalPrice.add(price);
                    hash.put(101,"|101  |Dell inspiron 1tbhdd/256ssd		|  	65000/-RS       "+"|	  "+b+"	 	"+"|       "+price+"           		 | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	Laptops();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Laptops();
                            break;
                    }
                    break;
                case 102:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*67000;
                    totalPrice.add(price1);
                    hash.put(102,"|102  |    hp 15s 1tbhdd/256ssd		| 	67000/-RS       "+"|	  "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	Laptops();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Laptops();
                            break;
                    }
                    break;
                case 103:
                	  System.out.println("how many quantity u want?");
                      int b2=sc.nextInt();
                      int price2 = b2*39000;
                      totalPrice.add(price2);
                      hash.put(103,"|103  |LenovoIdeaPad Slim 1 8GB/512GB SSD	| 	39000/-RS       "+"|	   "+b2+"	 	"+"|	"+price2+"    		         | ");
                      System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                      int k2=sc.nextInt();
                      switch(k2)
                      {
                          case 1:
                        	  Laptops();
                              break;
                          case 2:
                              store();
                              break;
                          case 3:
                              billing(price2);
                              break;
                          default:
                              System.out.println("please enter a valid response");
                              Laptops();
                              break;
                      }
                case 104:
              	  System.out.println("how many quantity u want?");
                    int b3=sc.nextInt();
                    int price3 = b3*109599;
                    totalPrice.add(price3);
                    hash.put(104,"|104  |   ASUS ROG Strix G17 16GB/1Tb ssd	| 	109599/-RS      "+"|	   "+b3+"	 	"+"|	"+price3+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k3=sc.nextInt();
                    switch(k3)
                    {
                        case 1:
                        	Laptops();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price3);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            Laptops();
                            break;
                    }
       
                default:
                    	System.out.println("Enter a valid id no ");
                    	Laptops();
            }
          
        }
/*---------------------------------------------------------------------Laptop section ends here---------------------------------------------------------------------------------------*/
      
  
/*---------------------------------------------------------------------Gaming consoles section starts here---------------------------------------------------------------------------------------*/
        static void GamingConsoles()//calling method store
        {
            System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> GAMING CONSOLES!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println("\r\n"
            		+ ".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|   	    STOCK	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 301	|	Sony playstation	|	     3		   |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 302	|	   Nintendo		|            2  	   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 303	| 	Microsoft Xbox		|	     3		   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ ".==================================================================.");
            System.out.println("select ur desired product id from the above list or press 1 to go back to the homepage");

            int a=sc.nextInt();
            switch(a) {
            	case 1:
            		store();
            		break;
                case 301:
                    sonyPlaystations();
                    break;
                case 302:
                	nintendo();
                    break;
                case 303:
                   microSoftXbox();
                    break;
               default:
                   System.out.println("Select valid id from the menu");
                   GamingConsoles();
            }
            
        }

        static void microSoftXbox() {
        	System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Microsoft Xbox <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|   	    PRICE	   |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 30301	|    Xbox 360 Gaming Console	|	   15,999/-	   |\r\n"
            		+ "|	|    				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 30302	|   Xbox One 1TB Gaming Console |          29,800/-  	   |\r\n"
            		+ "|	|  				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 30303	| 	Microsoft Xbox One S    |	   21,490/-	   |\r\n"
            		+ "|	|        1TB Gaming Console	|			   |\r\n"
            		+ ".==================================================================.");
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	GamingConsoles();
	            	break;
                case 30301:
                	System.out.println("how many quantity u want?");
                    int b=sc.nextInt();
                    int price = b*15999;
                   totalPrice.add(price);
                    hash.put(30301,"|30301|	  Xbox 360 Gaming Console	|  	15,999/-RS      "+"|	   "+b+"	 	"+"|     "+price+"             		 | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	microSoftXbox();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            microSoftXbox();
                            break;
                    }
                    break;
                case 30302:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*29800;
                    totalPrice.add(price1);
                    hash.put(30302,"|30302| Xbox One 1TB Gaming Console	 	| 	29,800/-RS       "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	microSoftXbox();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            microSoftXbox();
                            break;
                    }
                    break;
                case 30303:
                	   System.out.println("how many quantity u want?");
                       int b2=sc.nextInt();
                       int price2 = b2*21490;
                       totalPrice.add(price2);
                       hash.put(30303,"|30303|    Microsoft Xbox One S 1TB 		| 	21,490/-RS       "+"|	   "+b2+"	 	"+"|	"+price2+"    		         | ");
                       System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                       int k2=sc.nextInt();
                       switch(k2)
                       {
                           case 1:
                        	   microSoftXbox();
                               break;
                           case 2:
                               store();
                               break;
                           case 3:
                               billing(price2);
                               break;
                           default:
                               System.out.println("please enter a valid response");
                               microSoftXbox();
                               break;
                       }
                       break;
                default:
                    	System.out.println("Enter a valid id no ");
                    	microSoftXbox();
            }
		}


		static void nintendo() {
			System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> nintendo <<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
          System.out.println(".==================================================================.\r\n"
          		+ "| ID NO	|             NAME		|   	    PRICE	   |\r\n"
          		+ "|==================================================================|\r\n"
          		+ "| 30201	|	Nintendo Switch OLED 	|	   25,999/-	   |\r\n"
          		+ "|	|    				| 			   |\r\n"
          		+ "|	|				|			   |\r\n"
          		+ "| 30202	|       Nintendo NES 		|          14,800/-  	   |\r\n"
          		+ "|	|  Classic Mini Gaming Console	|			   |\r\n"
          		+ "|	|				|			   |\r\n"
          		+ "| 30203	| 	Nintendo Switch Lite	|	*Out of stock*	   |\r\n"
          		+ "|	|          Basic Edition	|			   |\r\n"
          		+ ".==================================================================.\r\n"
          		+ "");
            System.out.println("select ur desired product id from the above list or select 1 to go back");

            int a=sc.nextInt();
            switch(a) {
	            case 1:
	            	GamingConsoles();
	            	break;
                case 30201:
                	System.out.println("how many quantity u want?");
                    int b=sc.nextInt();
                    int price = b*25999;
                   totalPrice.add(price);
                    hash.put(30201,"|30201|	  Nintendo Switch OLED		|  	25,999/-RS      "+"|	   "+b+"	 	"+"|     "+price+"             		 | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k=sc.nextInt();
                    switch(k)
                    {
                        case 1:
                        	nintendo();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            nintendo();
                            break;
                    }
                    break;
                case 30202:
                    System.out.println("how many quantity u want?");
                    int b1=sc.nextInt();
                    int price1 = b1*14800;
                    totalPrice.add(price1);
                    hash.put(30202,"|30202|    Nintendo NES Classic		| 	14,800/-RS       "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                    int k1=sc.nextInt();
                    switch(k1)
                    {
                        case 1:
                        	nintendo();
                            break;
                        case 2:
                            store();
                            break;
                        case 3:
                            billing(price1);
                            break;
                        default:
                            System.out.println("please enter a valid response");
                            nintendo();
                            break;
                    }
                    break;
                case 30203:
                	System.out.println("Nintendo Switch Lite Basic Edition is currently out of stock.we will restock it soon until then check our other products");
                	nintendo();
                    break;
       
                default:
                    	System.out.println("Enter a valid id no ");
                    	nintendo();
            }
			
		}


		static void sonyPlaystations() {
			 	System.out.println();
	            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Sony Playstations <<<<<<<<<<<<<<<<-----------------------------------------------------------");
	            System.out.println();
	            System.out.println("\r\n"
	            		+ ".==================================================================.\r\n"
	            		+ "| ID NO	|             NAME		|   	    PRICE	   |\r\n"
	            		+ "|==================================================================|\r\n"
	            		+ "| 30101	|	Sony PlayStation 5 	|	   49,000/-	   |\r\n"
	            		+ "|	|    (PS5) 1TB Gaming Console	| 			   |\r\n"
	            		+ "|	|				|			   |\r\n"
	            		+ "| 30102	|       Sony Playstation 2 	|          7,999/-  	   |\r\n"
	            		+ "|	|	Slim Gaming Console	|			   |\r\n"
	            		+ "|	|				|			   |\r\n"
	            		+ "| 30103	| 	Sony PlayStation 5	|	*Out of stock*	   |\r\n"
	            		+ "|	|          Basic Edition	|			   |\r\n"
	            		+ "|	|				|			   |\r\n"
	            		+ "| 30104	|   	Sony PlayStation 4	|	   27,490/-  	   |\r\n"
	            		+ "|	|	1TB Gaming Console	|			   |\r\n"
	            		+ "|	|	(With VR Bundle)	|			   |\r\n"
	            		+ "|	|				|			   |\r\n"
	            		+ "| 30105	|	Sony Playstation 3 	|	*Out of stock*	   |\r\n"
	            		+ "|	|      500 GB Gaming Console	|			   |\r\n"
	            		+ "|	|				|			   |\r\n"
	            		+ "| 30106	|     Sony PlayStation 4 (PS4) 	|	*Out of stock*	   |\r\n"
	            		+ "|	|      500GB Gaming Console	|			   |\r\n"
	            		+ ".==================================================================.");
	            System.out.println("select ur desired product id from the above list or select 1 to go back");

	            int a=sc.nextInt();
	            switch(a) {
		            case 1:
		            	GamingConsoles();
		            	break;
	                case 30101:
	                	System.out.println("how many quantity u want?");
	                    int b=sc.nextInt();
	                    int price = b*49000;
	                   totalPrice.add(price);
	                    hash.put(30101,"|30101|    Sony PS5 1TB			| 	49,000/-RS      "+"|	   "+b+"	 	"+"|	"+price+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k=sc.nextInt();
	                    switch(k)
	                    {
	                        case 1:
	                        	sonyPlaystations();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            sonyPlaystations();
	                            break;
	                    }
	                    break;
	                  
	                case 30102:
	                    System.out.println("how many quantity u want?");
	                    int b1=sc.nextInt();
	                    int price1 = b1*7999;
	                    totalPrice.add(price1);
	                    hash.put(30102,"|30102|    Sony PS2 Slim			| 	7999/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k1=sc.nextInt();
	                    switch(k1)
	                    {
	                        case 1:
	                        	sonyPlaystations();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price1);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            sonyPlaystations();
	                            break;
	                    }
	                    break;
	                case 30103:
	                	System.out.println("Sony PS5 basic edition is currently out of stock.we will restock it soon until then check our other products");
	                    sonyPlaystations();
	                    break;
	                case 30104:
	                    System.out.println("how many quantity u want?");
	                    int b3=sc.nextInt();
	                    int price3 = b3*27490;
	                    totalPrice.add(price3);
	                    hash.put(30104,"|30104|    Sony PS4 1TB VR			| 	27,490/-RS      "+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k3=sc.nextInt();
	                    switch(k3)
	                    {
	                        case 1:
	                        	 sonyPlaystations();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price3);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            sonyPlaystations();
	                            break;
	                    }
	                    break;
	                case 30105:
	                	System.out.println("Sony PS3 500GB edition is currently out of stock.we will restock it soon until then check our other products");
	                    sonyPlaystations();
	                    break;
	                case 30106:
	                	System.out.println("Sony PS4 500GB edition is currently out of stock.we will restock it soon until then check our other products");
	                    sonyPlaystations();
	                    break;
	                    default:
	                    	System.out.println("Enter a valid id no ");
	                    	sonyPlaystations();
	            }
			
		}
/*---------------------------------------------------------------------Gaming consoles section ends here---------------------------------------------------------------------------------------*/

/*---------------------------------------------------------------------Mobile Accesories section starts here---------------------------------------------------------------------------------------*/
		static void MobileAccesories()// calling method store
        {
            System.out.println();
            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> MOBILE ACCESORIES!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");
            System.out.println();
            System.out.println(".==================================================================.\r\n"
            		+ "| ID NO	|             NAME		|   NO OF ITEMS AVAILABLE  |\r\n"
            		+ "|==================================================================|\r\n"
            		+ "| 401	|	 Chargers		|	4		   |\r\n"
            		+ "|	|				| 			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 402	|	Earpods,Headphones	| 	7		   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 403	|  	Display,Batteries	|	6		   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ "| 404	|   	    Pouches		|	3		   |\r\n"
            		+ "|	|				|			   |\r\n"
            		+ ".==================================================================.");
            System.out.println("select ur desired product id from the above list or press 1 to go back to the homepage");

            int a=sc.nextInt();
            switch(a) {
            	case 1:
            		store();
            		break;
                case 401:
                    chargers();
                    break;
                case 402:
                	EandH();
                    break;
                case 403:
                	DandB();
                    break;
                case 404:
                    pouches();
                     break;
               default:
                   System.out.println("Select valid id from the menu");
                   GamingConsoles();
            }
            

        }

       static void pouches() {
    	   System.out.println();
           System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Pouches<<<<<<<<<<<<<<<<-----------------------------------------------------------");
           System.out.println();
           System.out.println(".==================================================================.\r\n"
           		+ "| ID NO	|             NAME		|   	   Price  	   |\r\n"
           		+ "|==================================================================|\r\n"
           		+ "| 40401	|	Iphone 14 pro pouch     |	   499/-Rs	   |\r\n"
           		+ "|	|				| 			   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ "| 40402	|	Xiaomi all models	| 	  199/-Rs	   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ "| 40403	|  	Custom Pouch any	|	  399/-Rs	   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ "| 40404	|   	Grafitee Sticker  	|	  99/-Rs	   |\r\n"
           		+ "|	|				|			   |\r\n"
           		+ ".==================================================================.");
           System.out.println("select ur desired product id from the above list or select 1 to go back");

           int a=sc.nextInt();
           switch(a) {
	            case 1:
	            	MobileAccesories();
	            	break;
               case 40401:
               	System.out.println("how many quantity u want?");
                   int b=sc.nextInt();
                   int price = b*499;
                  totalPrice.add(price);
                   hash.put(40401,"|40401|    Iphone 14 pro pouch 		| 	499/-RS        "+" |	   "+b+"	 	"+"|	"+price+"    		         	 |	");
                   System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                   int k=sc.nextInt();
                   switch(k)
                   {
                       case 1:
                    	   pouches();
                           break;
                       case 2:
                           store();
                           break;
                       case 3:
                           billing(price);
                           break;
                       default:
                           System.out.println("please enter a valid response");
                           pouches();
                           break;
                   }
                   break;
                 
               case 40402:
                   System.out.println("how many quantity u want?");
                   int b1=sc.nextInt();
                   int price1 = b1*199;
                   totalPrice.add(price1);
                   hash.put(40402,"|40402|   Xiaomi all models	 	  	| 	199/-RS        "+" |	   "+b1+"	 	"+"|	"+price1+"    		         	 | ");
                   System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                   int k1=sc.nextInt();
                   switch(k1)
                   {
                       case 1:
                    	   pouches();
                           break;
                       case 2:
                           store();
                           break;
                       case 3:
                           billing(price1);
                           break;
                       default:
                           System.out.println("please enter a valid response");
                           pouches();
                           break;
                   }
                   break;
               case 40403:
               	System.out.println("how many quantity u want?");
                   int b2=sc.nextInt();
                   int price2 = b2*399;
                   totalPrice.add(price2);
                   hash.put(40403,"|40403|    Custom Pouch any brand	  	| 	399/-RS        "+" |	   "+b2+"	 	"+"|	"+price2+"    		         	 |	");
                   System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                   int k2=sc.nextInt();
                   switch(k2)
                   {
                       case 1:
                    	   pouches();
                           break;
                       case 2:
                           store();
                           break;
                       case 3:
                           billing(price2);
                           break;
                       default:
                           System.out.println("please enter a valid response");
                           pouches();
                           break;
                   }
                   break;
             
               case 40404:
                   System.out.println("how many quantity u want?");
                   int b3=sc.nextInt();
                   int price3 = b3*2499;
                   totalPrice.add(price3);
                   hash.put(40404,"|40404|    Grafitee Sticker		 	| 	99/-RS"+"          |	   "+b3+"	 	"+"|	"+price3+"    		 	 |	");
                   System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                   int k3=sc.nextInt();
                   switch(k3)
                   {
                       case 1:
                    	   pouches();
                           break;
                       case 2:
                           store();
                           break;
                       case 3:
                           billing(price3);
                           break;
                       default:
                           System.out.println("please enter a valid response");
                           pouches();
                           break;
                   }
                   break;
             
               default:
                  System.out.println("Enter a valid id no ");
                  pouches();
           }
		
			
		}


       static void DandB() {
    	   System.out.println();
           System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Display and Batteries<<<<<<<<<<<<<<<<-----------------------------------------------------------");
           System.out.println();
		System.out.println("\r\n"
				+ ".==================================================================.\r\n"
				+ "| ID NO	|             NAME		|   	   Price  	   |\r\n"
				+ "|==================================================================|\r\n"
				+ "| 40301	|     Gorilla Glass 3		|	   249/-Rs	   |\r\n"
				+ "|	|				| 			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 40302	|     Saphire Plate 		| 	   499/-Rs	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 40303	|     Tampered Glass 		|	   149Rs/-	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 40304	|   5000Mah Generic Battery  	|	  1999Rs/-	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 40305	| 	jio phone battery	|	  249Rs/-	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "|	|				|			   |\r\n"
				+ "| 40306	|  3000Mah Generic Battery	|	  1199Rs/-	   |\r\n"
				+ "|	|				|			   |\r\n"
				+ ".==================================================================.");
		 System.out.println("select ur desired product id from the above list or select 1 to go back");

         int a=sc.nextInt();
         switch(a) {
	            case 1:
	            	MobileAccesories();
	            	break;
             case 40301:
             	System.out.println("how many quantity u want?");
                 int b=sc.nextInt();
                 int price = b*249;
                totalPrice.add(price);
                 hash.put(40301,"|40301|    Gorilla Glass 3			    	| 	249/-RS      	"+"|	   "+b+"	 	"+"|	"+price+"    		         |	");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k=sc.nextInt();
                 switch(k)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
               
             case 40302:
                 System.out.println("how many quantity u want?");
                 int b1=sc.nextInt();
                 int price1 = b1*499;
                 totalPrice.add(price1);
                 hash.put(40302,"|40302|   Saphire Plate				  	| 	499/-RS         "+"|	   "+b1+"	 	"+"|	"+price1+"    		                 | ");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k1=sc.nextInt();
                 switch(k1)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price1);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
             case 40303:
             	System.out.println("how many quantity u want?");
                 int b2=sc.nextInt();
                 int price2 = b2*149;
                 totalPrice.add(price2);
                 hash.put(40303,"|40303|    Tampered Glass			| 	149/-RS        "+"|	   "+b2+"	 	"+"|	"+price2+"    		         |	");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k2=sc.nextInt();
                 switch(k2)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price2);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
           
             case 40304:
                 System.out.println("how many quantity u want?");
                 int b3=sc.nextInt();
                 int price3 = b3*1999;
                 totalPrice.add(price3);
                 hash.put(40304,"|40304|    5000Mah Generic Battery	 	| 	1999/-RS	"+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k3=sc.nextInt();
                 switch(k3)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price3);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
             case 40305:
             	System.out.println("how many quantity u want?");
                 int b4=sc.nextInt();
                 int price4 = b4*249;
                totalPrice.add(price4);
                 hash.put(40305,"|40305|    jio phone battery				| 	249/-RS      	"+"|	   "+b4+"	 	"+"|	"+price4+"    		                 |	");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k4=sc.nextInt();
                 switch(k4)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price4);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
             case 40306:
             	System.out.println("how many quantity u want?");
                 int b5=sc.nextInt();
                 int price5 = b5*1199;
                totalPrice.add(price5);
                 hash.put(43206,"|40306|    3000Mah Generic Battery		   	| 	1199/-RS      	"+"|	   "+b5+"	 	"+"|	"+price5+"    		                 |	");
                 System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
                 int k5=sc.nextInt();
                 switch(k5)
                 {
                     case 1:
                    	 DandB();
                         break;
                     case 2:
                         store();
                         break;
                     case 3:
                         billing(price5);
                         break;
                     default:
                         System.out.println("please enter a valid response");
                         DandB();
                         break;
                 }
                 break;
             default:
                 System.out.println("Enter a valid id no ");
                 DandB();
         }
			
		}


	 	static void EandH() {
	 		    System.out.println();
	            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Earphones And HeadJacks<<<<<<<<<<<<<<<<-----------------------------------------------------------");
	            System.out.println();
	 		System.out.println("Earpods And Head Phones\r\n"
	 				+ "=======================\r\n"
	 				+ "\r\n"
	 				+ ".==================================================================.\r\n"
	 				+ "| ID NO	|             NAME		|   	   Price  	   |\r\n"
	 				+ "|==================================================================|\r\n"
	 				+ "| 40201	|     JBL Tune 760NC(OverHead)  |	   5600/-Rs	   |\r\n"
	 				+ "|	|				| 			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40202	|   boAt Rockerz 370(OverHead) 	| 	   899/-Rs	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40203	|  	Sony Wh-Ch510 		|	  2779/-Rs	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40204	|   Boult Ear Cracker		|	  2499Rs/-	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40205	|Boult Audio FXCharge Neckband	|	  999Rs/-	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40206	|  Boat Rockerz 205 NeckBand	|	  999Rs/-	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40207	|  Noise Bass Head wired plugs	|	  699Rs/-	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ ".==================================================================.");
	 		 System.out.println("select ur desired product id from the above list or select 1 to go back");

	            int a=sc.nextInt();
	            switch(a) {
		            case 1:
		            	MobileAccesories();
		            	break;
	                case 40201:
	                	System.out.println("how many quantity u want?");
	                    int b=sc.nextInt();
	                    int price = b*5600;
	                   totalPrice.add(price);
	                    hash.put(40201,"|40201|    JBL Tune 760NC(OverHead)    	| 	5600/-RS      	"+"|	   "+b+"	 	"+"|	"+price+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k=sc.nextInt();
	                    switch(k)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	                  
	                case 40202:
	                    System.out.println("how many quantity u want?");
	                    int b1=sc.nextInt();
	                    int price1 = b1*899;
	                    totalPrice.add(price1);
	                    hash.put(40202,"|40202|   boAt Rockerz 370(OverHead)	  	| 	899/-RS         "+"|	   "+b1+"	 	"+"|	"+price1+"    		                 | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k1=sc.nextInt();
	                    switch(k1)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price1);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	                case 40203:
	                	System.out.println("how many quantity u want?");
	                    int b2=sc.nextInt();
	                    int price2 = b2*2779;
	                    totalPrice.add(price2);
	                    hash.put(40203,"|40203|    Sony Wh-Ch510			| 	2779/-RS        "+"|	   "+b2+"	 	"+"|	"+price2+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k2=sc.nextInt();
	                    switch(k2)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price2);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	              
	                case 40204:
	                    System.out.println("how many quantity u want?");
	                    int b3=sc.nextInt();
	                    int price3 = b3*2499;
	                    totalPrice.add(price3);
	                    hash.put(40204,"|40204|    Boult Ear Cracker		 	| 	2499/-RS	"+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k3=sc.nextInt();
	                    switch(k3)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price3);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	                case 40205:
	                	System.out.println("how many quantity u want?");
	                    int b4=sc.nextInt();
	                    int price4 = b4*999;
	                   totalPrice.add(price4);
	                    hash.put(40205,"|40205|    Boult Audio FXCharge Neckband	| 	999/-RS      	"+"|	   "+b4+"	 	"+"|	"+price4+"    		                 |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k4=sc.nextInt();
	                    switch(k4)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price4);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	                case 40206:
	                	System.out.println("how many quantity u want?");
	                    int b5=sc.nextInt();
	                    int price5 = b5*999;
	                   totalPrice.add(price5);
	                    hash.put(40206,"|40206|    Boat Rockerz 205 NeckBand   	| 	999/-RS      	"+"|	   "+b5+"	 	"+"|	"+price5+"    		                 |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k5=sc.nextInt();
	                    switch(k5)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price5);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	                case 40207:
	                	System.out.println("how many quantity u want?");
	                    int b6=sc.nextInt();
	                    int price6 = b6*699;
	                   totalPrice.add(price6);
	                    hash.put(40207,"|40207|    Noise Bass Head wired plugs 	| 	699/-RS      	"+"|	   "+b6+"	 	"+"|	"+price6+"    		                 |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k6=sc.nextInt();
	                    switch(k6)
	                    {
	                        case 1:
	                        	EandH();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price6);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            EandH();
	                            break;
	                    }
	                    break;
	              
	                default:
	                   System.out.println("Enter a valid id no ");
	                   MobileAccesories();
	            }
			
		}


	 	static void chargers() {
	 		  System.out.println();
	            System.out.println("------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>> Chargers!!<<<<<<<<<<<<<<<<-----------------------------------------------------------");
	            System.out.println();
	 		System.out.println(".==================================================================.\r\n"
	 				+ "| ID NO	|             NAME		|   	   Price  	   |\r\n"
	 				+ "|==================================================================|\r\n"
	 				+ "| 40101	|	ERD Generic Charger	|	   500/-Rs	   |\r\n"
	 				+ "|	|				| 			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40102	|	Xiaomi Charger 64W	| 	  1250/-Rs	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40103	|  	Iphone Charger Brick	|	  1599/-Rs	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ "| 40104	|   Samsung 120W Power Brick  	|	  2499/-Rs	   |\r\n"
	 				+ "|	|				|			   |\r\n"
	 				+ ".==================================================================.\r\n"
	 				+ "");
	 		  System.out.println("select ur desired product id from the above list or select 1 to go back");

	            int a=sc.nextInt();
	            switch(a) {
		            case 1:
		            	MobileAccesories();
		            	break;
	                case 40101:
	                	System.out.println("how many quantity u want?");
	                    int b=sc.nextInt();
	                    int price = b*500;
	                   totalPrice.add(price);
	                    hash.put(40101,"|40101|    ERD Generic Charger	     		| 	500/-RS      	"+"|	   "+b+"	 	"+"|	"+price+"    		                 |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k=sc.nextInt();
	                    switch(k)
	                    {
	                        case 1:
	                        	chargers();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            chargers();
	                            break;
	                    }
	                    break;
	                  
	                case 40102:
	                    System.out.println("how many quantity u want?");
	                    int b1=sc.nextInt();
	                    int price1 = b1*1250;
	                    totalPrice.add(price1);
	                    hash.put(40102,"|40102|   Xiaomi Charger 64W 			| 	1250/-RS        "+"|	   "+b1+"	 	"+"|	"+price1+"    		         | ");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k1=sc.nextInt();
	                    switch(k1)
	                    {
	                        case 1:
	                        	chargers();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price1);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            chargers();
	                            break;
	                    }
	                    break;
	                case 40103:
	                	System.out.println("how many quantity u want?");
	                    int b2=sc.nextInt();
	                    int price2 = b2*1599;
	                    totalPrice.add(price2);
	                    hash.put(40103,"|40103|    Iphone Charger Brick		| 	1599/-RS        "+"|	   "+b2+"	 	"+"|	"+price2+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k2=sc.nextInt();
	                    switch(k2)
	                    {
	                        case 1:
	                        	chargers();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price2);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            chargers();
	                            break;
	                    }
	                    break;
	              
	                case 40104:
	                    System.out.println("how many quantity u want?");
	                    int b3=sc.nextInt();
	                    int price3 = b3*2499;
	                    totalPrice.add(price3);
	                    hash.put(40104,"|40104|    Samsung 120W Power Brick 		| 	2499/-RS	"+"|	   "+b3+"	 	"+"|	"+price3+"    		         |	");
	                    System.out.println("to go back press 1, to go back to the home page press 2, to go to the billing press 3");
	                    int k3=sc.nextInt();
	                    switch(k3)
	                    {
	                        case 1:
	                        	chargers();
	                            break;
	                        case 2:
	                            store();
	                            break;
	                        case 3:
	                            billing(price3);
	                            break;
	                        default:
	                            System.out.println("please enter a valid response");
	                            chargers();
	                            break;
	                    }
	                    break;
	              
	                default:
	                   System.out.println("Enter a valid id no ");
	                   chargers();
	            }
	 	
	 	}
	 	
/*---------------------------------------------------------------------Mobile Accesories section ends here---------------------------------------------------------------------------------------*/

/*---------------------------------------------------------------------Store section starts here---------------------------------------------------------------------------------------*/


		static void store()
        {	System.out.println("Check the below List");
            System.out.println(".=======================================.\r\n"
            		+ "| ID NO	|          Sections		|\r\n"
            		+ "|=======================================|\r\n"
            		+ "|   1	|	   Laptops		|\r\n"
            		+ "|	|				|\r\n"
            		+ "|	|				|\r\n"
            		+ "|   2   |	Home Appliances		|\r\n"
            		+ "|	|				|\r\n"
            		+ "|	|				|\r\n"
            		+ "|   3	|	Gaming Consoles		|\r\n"
            		+ "| 	|	 			|\r\n"
            		+ "| 	|	 			|\r\n"
            		+ "|   4	|	Mobile Accesories	|\r\n"
            		+ "| 	|	 			|\r\n"
            		+ "| 	|	 			|\r\n"
            		+ ".=======================================.");
            System.out.println();

            System.out.println("Select ur desired category");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                    Laptops();
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
/*---------------------------------------------------------------------Store section ends here---------------------------------------------------------------------------------------*/


/*---------------------------------------------------------------------Billing list section starts here---------------------------------------------------------------------------------------*/

        static void billing(int price)
        {
            displayFormat();
            hash.forEach((key,value)->System.out.println(" "+value));
            System.out.println(" .=======================================================================================================================================.");
            int a=sc.nextInt();
            
           
         
        }
        static void displayFormat()
        {
            System.out.println(" "
            		+ ".=======================================================================================================================================.\r\n"
                    + " |IDNO |		PRODUCT NAME		|	PRICE		|	QUANTITY	|	TOTALPRICE		         |\n"
                    + " .=======================================================================================================================================.");
        }
        
        
        static void totalBilling() //total bill called in main method
        {
        	System.out.println("Enter 1 to return to shopping again or press 2 to Exit the Store");
        	int a=sc.nextInt();
        	switch (a)
        	{
        	case 1:
        		store();
        		break;
        	case 2:
        		endCard();
        		break;
        	default:
        		System.out.println("Enter a valid option");
        		totalBilling();
        		break;
        		
        	}
        	
        			
        	}
        static void endCard() {
			
			
		}
    
/*---------------------------------------------------------------------Billing list section ends here---------------------------------------------------------------------------------------*/



      


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
