package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KB_WD {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty(Links.driverName,Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("google search");
		driver.close();
	}
}
