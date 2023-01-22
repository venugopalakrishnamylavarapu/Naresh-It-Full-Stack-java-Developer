package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Links.driverName, Links.path);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(Links.url);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		Select st=new Select((WebElement) driver.findElements(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys("10004");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
