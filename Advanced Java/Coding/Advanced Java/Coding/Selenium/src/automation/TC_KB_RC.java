package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KB_RC {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty(Links.driverName, Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(Links.url);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//click : Keyboard:Tab,Enter
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("Tab is done here");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enter is done here");
		System.out.println("Login Completed");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
