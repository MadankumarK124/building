package POM_user1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.organizationUtilis.editUser;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class user_edit  {
	
	
		
	public static void main(String[] args) throws Throwable {

		ExcelUtility elib = new ExcelUtility();
		fileUtility flib = new fileUtility();
		WebDriverUtility weblib = new WebDriverUtility();

		String url = flib.readDataFromPropertyFile("url");
		String browser = flib.readDataFromPropertyFile("browser");
		 String username = flib.readDataFromPropertyFile("username");
		 String password = flib.readDataFromPropertyFile("password");
		// physical file
		// FileInputStream f1 = new
		// FileInputStream(".\\src\\test\\resources\\commonData.properties");
		// Properties p = new Properties();
		// p.load(f1);
		// String url = p.getProperty("url");
		// String browser = p.getProperty("browser");
		// launching browser
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("inavlid browser");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
		// login to application
		logo lo = new logo(driver);
		lo.app();
		loginUser in = new loginUser(driver);
		in.loginUser(username, password);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
//		String username = flib.readDataFromPropertyFile("username");
//		String password = flib.readDataFromPropertyFile("password");
//		// String username = p.getProperty("username");
//		// String password = p.getProperty("password");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// click on detail/update module
		// fetching data from excel

		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9916115065");

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("alternat_mobile");
//		FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//		Workbook wb = WorkbookFactory.create(f2);
//		Sheet sh = wb.getSheet("apartment");
//
//	Row rw = sh.getRow(1);
//		String value = rw.getCell(1).getStringCellValue();
//		driver.findElement(By.xpath("//input[@name='alternat_mobile']")).sendKeys(value);
		// logout
		 logout out = new logout(driver);
		 out.logout(); 
		
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
