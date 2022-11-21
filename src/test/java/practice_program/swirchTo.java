package practice_program;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swirchTo {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		driver.findElement(By.id("loginButtonContainer")).click();
		
		String parentWindowID = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		Set<String> allWindowsIDs = driver.getWindowHandles();
		for(String id:allWindowsIDs)
		{
			driver.switchTo().window(id);
			if(!id.contains(parentWindowID))
			{
				driver.findElement(By.xpath("//a[.='Try Free']")).click();
				Thread.sleep(5000);
			}
		}
		driver.quit();
		
	}

}
