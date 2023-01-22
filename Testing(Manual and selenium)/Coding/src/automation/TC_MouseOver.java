package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_MouseOver {
	static String url = "http://127.0.0.1/orangehrm-2.6/login.php";
    static String un  = "nareshit";
    static String pw  = "nareshit";
    static String title1 = "OrangeHRM - New Level of HR Management";
    static String title2 = "OrangeHRM";
	public static void main(String[] args) throws Exception {
			    //Test Steps
			System.setProperty("webdriver.chrome.driver", Links.path);
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(url);
			//Verify Title
			//  Actual Result   compare Expected Result
			if(driver.getTitle().equals(title1)) {
			    System.out.println("Title matched");
			}
			else {
			    System.out.println("Titile not matched");
			    System.out.println(driver.getTitle());
			}
			/* //Test Data - hardcoded: provided in the same step
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); */

			//Test Data - variable: provided from variable
			driver.findElement(By.name("txtUserName")).sendKeys(un);
			driver.findElement(By.name("txtPassword")).sendKeys(pw);

			driver.findElement(By.name("Submit")).click();
			Thread.sleep(4000);
			//Verify Page Title
			if(driver.getTitle().equals(title2)) {
			    System.out.println("Title matched");
			}
			else {
			    System.out.println("Title not matched ");
			    System.out.println(driver.getTitle());
			}
			//mouseover
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
