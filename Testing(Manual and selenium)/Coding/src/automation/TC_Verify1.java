package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//mouse over function

public class TC_Verify1 {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String un="nareshit";
	static String pw="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		//Verify Title
				//Acutal Result compare Expected Result
				if(driver.getTitle().equals("HRMS"))
					System.out.println("Title Matched");
				else
				{
					System.out.println("Title not matched");
					System.out.println(driver.getTitle());
				}
				//Test Data _hardcoded:provided in the same step
				driver.findElement(By.name("txtUserName")).sendKeys(un);
				driver.findElement(By.name("txtPassword")).sendKeys(pw);
				driver.findElement(By.name("Submit")).click();
				Thread.sleep(4000);
				//Verify Page Title
				if(driver.getTitle().equals(title2))
					System.out.println("TItle Matched");
				else
				{
					System.out.println("Title not Matched");
					System.out.println(driver.getTitle());
				}
				Actions ac = new Actions(driver);
				ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
				Thread.sleep(3000);
				System.out.println("mouseover completed");
				driver.findElement(By.linkText("Add Employee")).click();
				Thread.sleep(4000);
				System.out.println("Clicked on submenu");
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Logout completed");
				Thread.sleep(4000);
				driver.close();
			}
		}
