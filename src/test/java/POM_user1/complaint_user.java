package POM_user1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
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
import com.HRA.organizationUtilis.adminComplaint;
import com.HRA.organizationUtilis.detailsHome;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class complaint_user  {
	
		
	public static void main(String[] args) throws Throwable, Throwable {
		ExcelUtility elib = new ExcelUtility();
		fileUtility flib = new fileUtility();
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility weblib = new WebDriverUtility();
//		// fetching data from propertyfile
		String url = flib.readDataFromPropertyFile("url");
		String browser = flib.readDataFromPropertyFile("browser");
		String username = flib.readDataFromPropertyFile("username");
		String password = flib.readDataFromPropertyFile("password");
		String un = flib.readDataFromPropertyFile("un");
		String pass = flib.readDataFromPropertyFile("pass");
		// fetching the data from property file
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
		driver.get(url);
//		// maximizing
		weblib.maxi(driver);
//		// implicit wait
		weblib.implicitlywait(driver);
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		// login as and user
		logo lo = new logo(driver);
		lo.app();
//		// login to app using username and password
		loginUser user = new loginUser(driver);
		user.loginUser(username, password);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
//		//String username = p.getProperty("username");
//		//String password = p.getProperty("password");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		// complaint as an user
		String full = elib.readDataFromExcel("Sheet3", 0, 0);
		String comp = elib.readDataFromExcel("Sheet3", 1, 1);
		detailsHome detail = new detailsHome(driver);
		detail.detailsHome(full, comp);
		// driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		// driver.findElement(By.xpath("//a[text()='Complaint']")).click();
		// ArrayList<String> list = new ArrayList<String>();
		// list.add("name");
		// list.add("cmp");
//		FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//		Workbook wb = WorkbookFactory.create(f2);
//		Sheet sh = wb.getSheet("Sheet2");
//		Row rw = sh.getRow(0);
//		short count = rw.getLastCellNum();
//		for (int i = 0; i < count; i++) {
//			String value = rw.getCell(i).getStringCellValue();
//			driver.findElement(By.name(list.get(i))).sendKeys(value);
//		}
		detail.submit();
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// logout as user
		logout logout = new logout(driver);
		logout.logout();
		// driver.findElement(By.xpath("//a[text()='Logout']")).click();
		// String un = flib.readDataFromPropertyFile("un");
		// String pass = flib.readDataFromPropertyFile("pass");

		// login as an admin
		logo lo1 = new logo(driver);
		lo1.app();
		loginUser in1 = new loginUser(driver);
		in1.loginUser(un, pass);
		//user.loginUser(un, pass);
		// FileInputStream f3 = new
		// FileInputStream(".\\src\\test\\resources\\commonData.properties");
		// Properties p1 = new Properties();
		// p1.load(f3);
		// String un = p.getProperty("un");
		// String pass = p.getProperty("pass");

		// driver.findElement(By.xpath("//a[text()='Login']")).click();
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// click on complaint list as admin
		adminComplaint com = new adminComplaint(driver);
		com.admincomp();
		// logout as admin
		logout logout1 = new logout(driver);
		logout1.logout();
		// driver.findElement(By.xpath("//a[text()='Complaint List']")).click();

	}
}
