package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty(Links.driverName, Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Google opened");
		driver.findElement(By.name("q")).sendKeys("Bootstrap");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		Thread.sleep(5000);
		driver.findElement(By.linkText("Get started with Bootstrap")).click();
		Thread.sleep(10000);

		System.out.println("done the process");
		driver.close();
	}
}
