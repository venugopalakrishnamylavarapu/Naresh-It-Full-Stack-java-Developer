package project1;

import java.util.Scanner;
import java.util.Hashtable;
import java.util.ArrayList;


public class NonePrac {
        static Scanner sc=new Scanner(System.in);
        static ArrayList<Integer> totalPrice=new ArrayList<Integer>();
        static Hashtable<Integer,String> hash=new Hashtable<Integer,String>();


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
                    + "| 204	|   AC's,TableFans	 	|loyd,samsung,mi,kinestar  |\r\n"
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
                   
                    hash.put(20102,"|20102|	   LYOD			| 	12000/-RS          |"+"|	"+b1+"	|"+"|	"+price1);
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
                            break;
                    }
                    break;
                case 20103:
                    System.out.println("how many quantity u want?");
                    int b2=sc.nextInt();
                    int price2 =b2*17000;
                    hash.put(20103,"|20103|	 WHIRLPOOL		| 	17000/-RS	   |");
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
                            break;
                    }
                    break;
                case 20104:
                    System.out.println("how many quantity u want?");
                    int b3=sc.nextInt();
                    int price3 = b3*15000;
                    billing(price3);
                    hash.put(20104,"|20104|        PANASONIC		|	15000/-RS	   |");
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
                            break;
                    }
                    break;
                case 20105:
                    System.out.println("how many quantity u want?");
                    int b4=sc.nextInt();
                    int price4 = b4*22000;
                    billing(price4);
                    hash.put(20102,"|20105|	  GODREJ		|	22000/-RS	   |");
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
                            break;
                    }
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
	                    billing(price3);
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


        static void billing(int price)
        {
            int sum=0;
            displayFormat();
            hash.forEach((key,value)->System.out.println(" "+value));
            System.out.println(" .========================================================================================================================================.");
            for(Integer a:totalPrice)
            {
            	sum+=a;
            }
           
         
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
