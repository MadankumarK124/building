package practice_program;

import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bookMy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://in.bookmyshow.com/explore/home/bengaluru?utm_source=google&utm_medium=cpc&utm_campaign=BAU_Movies_Search_Brand_Focus_Exact_2021&utm_adgroup=Brand_Core&utm_term=bookmyshow&gclid=CjwKCAjw5P2aBhAlEiwAAdY7dIQtKte1xxefOA9Uj4pzz3IZhjDBK_vQmJ4AcfT2e4DLVFpnIA04bxoC3FEQAvD_BwE");
		driver.findElement(By.xpath("(//div[@class='sc-133848s-3 cWbeuJ'])[2]")).click();
		//WebElement element = driver.findElement(By.xpath("(//div[@class='sc-eykeme-0 kSkEtB'])[1]"));

		//int x = element.getLocation().getX();
		//int y = element.getLocation().getY();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy("+x+","+y+")", "");
		
		//Actions a=new Actions(driver);
		//a.moveToElement(element);
		
		 driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		
		

	}

}
