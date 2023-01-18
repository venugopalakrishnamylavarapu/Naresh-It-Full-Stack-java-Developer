package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Links.driverName, Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(Links.url);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert d=driver.switchTo().alert();
	}
}
