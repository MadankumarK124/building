package practice_program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icc {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/homepage");
		driver.findElement(By.xpath("(//button[text()='Womens'])[1]")).click();
		//WebElement ic = driver.findElement(By.xpath("//a[contains(text(),'WTC Standings')]"));
		//int x = ic.getLocation().getX();
		//int y = ic.getLocation().getY();
		
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("window.scrollby("+x+","+y+")");
		
	}

}
