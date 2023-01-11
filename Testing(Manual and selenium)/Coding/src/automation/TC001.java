package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 extends Links {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfully done");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully done");
		driver.close();
		System.out.println("Application closed");
	}
}
