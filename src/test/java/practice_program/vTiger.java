package practice_program;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vTiger {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']/ancestor::td[@class='small']/descendant::td[@class='tabUnSelected'][3]")).click();
		driver.findElement(By.xpath("(//td[@style=\"padding-right:0px;padding-left:10px;\"])[1]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(dropdown);
		TreeSet<String> set = new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> options = s.getOptions();
		
		for(WebElement lv:options)
		{
			String element = lv.getText();
			set.add(element);
			
		}
		for(String texts:set)
		{
			System.out.println(texts);
		}
		
		
			
		
		
	}

}
