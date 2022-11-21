package practice_program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.booking.com/country/in.en.html?aid=1610687;label=in-HvtKIh8HYqxrATaP24vtSgS379630681324:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-303403359744:lp9301773:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YfpWGnRw6lOGgfEoJVv7zYo;ws=&gclid=CjwKCAiA68ebBhB-EiwALVC-NmfJRoI-_SUPgmQbadDSPuJbvnyP3LDLR575r_kBvBQv35n-nl2j8BoCB5UQAvD_BwE");
		driver.findElement(By.xpath("//button[@class='bui-popover__close']")).click();
		//driver.findElement(By.xpath("//a[@class='bui-tab__link']/ancestor::nav[@class='bui-tab bui-header__tab bui-tab--borderless bui-tab--light  bui-tab--rounded ']")).click();
		//driver.findElement(By.xpath("//a[@class='bui-tab__link']/ancestor::ul[@class='bui-tab__nav']/descendant::span[contains(text(),'Flight + Hotel')]")).click();
		//driver.findElement(By.xpath("//p[text()='iOS app']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]/ancestor::li[@class='bui-tab__item']")).click();
	}
}
