package POM_user1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.poi.ss.usermodel.Cell;
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
import com.HRA.GenericUtilities.BaseClass2;
import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.GenericUtilities.JavaUtility;
import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;
import com.HRA.organizationUtilis.newRegistration;
import com.mysql.cj.jdbc.Driver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class register_user_login_as_user {
	
		 public static void main(String[] args) throws Throwable {

		WebDriverUtility weblib = new WebDriverUtility();
		ExcelUtility eLib = new ExcelUtility();
		fileUtility flib = new fileUtility();
		JavaUtility jlib = new JavaUtility();
		
		String url = flib.readDataFromPropertyFile("url");
		String browser = flib.readDataFromPropertyFile("browser");
		String username = flib.readDataFromPropertyFile("username");
		String password = flib.readDataFromPropertyFile("password");
		 String un = flib.readDataFromPropertyFile("un");
		 String pass = flib.readDataFromPropertyFile("pass");
		// create a object for physical file
		// FileInputStream f1 = new
		// FileInputStream(".\\src\\test\\resources\\commonData.properties");
		// create properties object
		// Properties p1 = new Properties();
		// loads
		// p1.load(f1);
		// fetching the data from properties file
		// String url = p1.getProperty("url");
		// String browser = p1.getProperty("browser");
		// launching browser
		// WebDriverManager.chromedriver().setup();
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
		// implicitly wait
		weblib.implicitlywait(driver);
		//clicks on login buttion
		logo lo=new logo(driver);
		lo.app();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// fetching data from excel
        
//		newRegistration reg = new newRegistration(driver);
//		reg.getLnkreg();
//		ExcelUtility elip = new ExcelUtility();
//		elip.apart(driver, "userreg");
//		reg.getLnksubmit();
//
//		logo lo = new logo(driver);
//		lo.app();
//		fileUtility flip = new fileUtility();
//		String username = flip.readDataFromPropertyFile("username");
//		String password = flip.readDataFromPropertyFile("password");
//		loginUser in = new loginUser(driver);
//		in.loginUser(username, password);
		
//	String first_name = elip.readDataFromExcel("registration1", 0, 0);
//
//	String user_name = elip.readDataFromExcel("registration1", 0, 1);
//
//		String mob = elip.readDataFromExcel("registration1", 0, 2);
//
//		String em = elip.readDataFromExcel("registration1", 0, 3);
//
//		String pass1 = elip.readDataFromExcel("registration1", 0, 4);
//
//		String c_pass = elip.readDataFromExcel("registration1", 0, 5);

		// create an object for physical file
		// FileInputStream f2 = new
		// FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		// workbook
		// Workbook wb = WorkbookFactory.create(f2);
		// sheetname
		// Sheet s1 = wb.getSheet("registration");
		// row value
		// Row r1 = s1.getRow(3);
		// colum value
		// String fn = r1.getCell(0).getStringCellValue();
		// String un1 = r1.getCell(1).getStringCellValue();
		// String mb = r1.getCell(2).getStringCellValue();
		// String em = r1.getCell(3).getStringCellValue();
		// String ps = r1.getCell(4).getStringCellValue();
		// String cps = r1.getCell(5).getStringCellValue();
		// login as an user
		loginUser log=new loginUser(driver);
		log.loginUser(username, password);
		
		//logout as an user
		logout out = new logout(driver);
		out.logout();
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys(first_name);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user_name);
//		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mob);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(em);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass1);
//		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys(c_pass);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
}
