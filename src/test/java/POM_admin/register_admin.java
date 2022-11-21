package POM_admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.organizationUtilis.admin_dashboard;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;

import practice_program.baseTest1;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class register_admin {

	public static void main(String[] args) throws Throwable {
		fileUtility flib = new fileUtility();
		ExcelUtility elib = new ExcelUtility();
		WebDriverUtility weblib = new WebDriverUtility();
		// fetching from property file
		String url = flib.readDataFromPropertyFile("url");
		String browser = flib.readDataFromPropertyFile("browser");
		String un = flib.readDataFromPropertyFile("un");
		String pass = flib.readDataFromPropertyFile("pass");
		// FileInputStream f1 = new
		// FileInputStream(".\\src\\test\\resources\\commonData.properties");
		// Properties p = new Properties();
		// p.load(f1);
		// String url = p.getProperty("url");
		// String browser = p.getProperty("browser");
		// launching browser
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("inavlid browser");
		}
		driver.get(url);
		// maximize
		weblib.maxi(driver);

		// driver.manage().window().maximize();
		weblib.implicitlywait(driver);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// login to application
		logo lo = new logo(driver);
		lo.app();

		loginUser in = new loginUser(driver);
		in.loginUser(un, pass);

		// driver.findElement(By.xpath("//a[text()='Login']")).click();
		// String username = p.getProperty("username");
		// String password = p.getProperty("password");
		admin_dashboard ds = new admin_dashboard(driver);
		ds.user();
		ds.home();
		ds.room();

		// logout
		logout out = new logout(driver);
		out.logout();

//		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
//		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
//		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		// dashboard register user and rooms for rent
//		driver.findElement(By.xpath("//b[text()='Registered Users: ']")).click();
//		driver.findElement(By.xpath("//a[text()='Home']")).click();
//		driver.findElement(By.xpath("(//div[@class='col-md-3']//div[@class='alert alert-warning'])[1]")).click();

		// driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
