package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Links.driverName, Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(Links.url);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		//Enter into the frame
		driver.switchTo().frame("rightMenu");
		Thread.sleep(5000);
		//click on Add btn
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
		driver.findElement(By.name("txtLastName")).sendKeys("");
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("New Emp Added");
		Thread.sleep(2000);
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
