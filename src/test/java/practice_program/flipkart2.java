package practice_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//enters woodland shoes into the search box
		driver.findElement(By.name("q")).sendKeys("woodland shoes");
		//clicks on search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//pauses the  execution for 4sec
		Thread.sleep(4000);
		//identify all the element title
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		
		//prints all the titles
		for(WebElement lv:titles)
		{
			System.out.println(lv.getText());
		}
		
		//identify prices of all the shoes
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
	
		for(WebElement lv:prices)
		{
			System.out.println(lv.getText());
		}
		
		for(int i=0;i<titles.size();i++)
		{
			String title = titles.get(i).getText();
			
			String sprice = prices.get(i).getText();
			int iprice = Integer.parseInt(sprice.substring(i).replace(",", ""));
			
			//prints the shoes are above 3000
			if(iprice>=3000)
			{
				System.out.println(title+"="+iprice);

			}
			driver.quit();
		}
		
		
	}

}
