package practice_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.reporters.jq.Main;

public class FlipKart {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		// Robot rb = new Robot();
		// rb.keyPress(KeyEvent.KEY_PRESSED);
		// rb.keyRelease(KeyEvent.KEY_RELEASED);
		WebElement element = driver.findElement(By.xpath("//button[text()='✕']"));
		Actions a = new Actions(driver);
		a.moveToElement(element);
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone14 pro");
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Silver, 1 TB)']")).click();
	}

}
