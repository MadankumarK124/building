package POM_admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

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
import com.HRA.GenericUtilities.JavaUtility;
import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;
import com.HRA.organizationUtilis.sms_Admin;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class send_sms  {
	
		
	
	public static void main(String[] args) throws Throwable {
		fileUtility flib = new fileUtility();
		ExcelUtility elib = new ExcelUtility();
		WebDriverUtility weblib = new WebDriverUtility();
		JavaUtility jlib = new JavaUtility();
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
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("inavlid browser");
		}
		// launching browser
		driver.get(url);
//		// maximizing
		weblib.maxi(driver);
//		// driver.manage().window().maximize();
//		// implicitly wait
		weblib.implicitlywait(driver);
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		// login as admin
		logo lo = new logo(driver);
		lo.app();
		loginUser in = new loginUser(driver);
		in.loginUser(un, pass);
		
		String title = driver.getTitle();
		System.out.println(title);

		// driver.findElement(By.xpath("//a[text()='Login']")).click();
		// String username = p.getProperty("username");
		// String password = p.getProperty("password");

		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// complaint list in admin
		// driver.findElement(By.xpath("//a[text()='Complaint List']")).click();
		// excel data
		String data = elib.readDataFromExcel("Sheet1", 0, 0);
		// send sms
		sms_Admin sm = new sms_Admin(driver);

		sm.sms(data);
		sm.scrollTocheck(driver);

		logout out = new logout(driver);
		out.logout();
		// driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
		// driver.findElement(By.xpath("(//input[@name='check[]'])[4]")).click();
		// fetching data from excel
		// String data = elib.exc("Sheet1");
		// FileInputStream f2 = new
		// FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		// Workbook wb = WorkbookFactory.create(f2);
		// Sheet sh = wb.getSheet("Sheet1");
		// Row rw = sh.getRow(0);
		// String cl = rw.getCell(0).getStringCellValue();

		// driver.findElement(By.xpath("//input[@name='message']")).sendKeys(data);
		// driver.findElement(By.xpath("//button[text()='Send SMS']")).click();

	}

}
