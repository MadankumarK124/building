package practice_program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		//driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("kanthara");
		//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		WebElement drag = driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]"));
		
		int x = drag.getLocation().getX();
		int y = drag.getLocation().getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")", "");
		
	}

}
