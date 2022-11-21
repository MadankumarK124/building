package practice_program;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class userName extends baseTest1 {
	@Test
	public void createUser() throws Throwable
	
	{
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("madan");
		driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("madan@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		
	}
}
