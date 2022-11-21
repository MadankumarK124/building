package POM_user1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.GenericUtilities.JavaUtility;
import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.organizationUtilis.apartment;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class resgister_apartment_user extends BaseClass {
	
	@Test
	public void NewApartment() throws Throwable
	{
	//public static void main(String[] args) throws Throwable {
//		ExcelUtility elib = new ExcelUtility();
//		fileUtility flib = new fileUtility();
//		JavaUtility jlib = new JavaUtility();
//		WebDriverUtility weblib = new WebDriverUtility();

		// Random rm = new Random();
		// int random = rm.nextInt(50);
		//jlib.getRandomNumber();

//		String url = flib.readDataFromPropertyFile("url");
//		String browser = flib.readDataFromPropertyFile("browser");
//		String username = flib.readDataFromPropertyFile("username");
//		String password = flib.readDataFromPropertyFile("password");
//		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
//		Properties p = new Properties();
//		p.load(f1);
//		String url = p.getProperty("url");
//		String browser = p.getProperty("browser");
		// launching browser
		
//		WebDriver driver = null;
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else {
//			System.out.println("inavlid browser");
//		}
		// maximize
//		weblib.maxi(driver);
//		// driver.manage().window().maximize();
//		weblib.implicitlywait(driver);
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		// fetching webpage
//		driver.get(url);
//
//		// login as user
//		logo lo = new logo(driver);
//		lo.app();
//		loginUser log = new loginUser(driver);
//		log.loginUser(username, password);
		// driver.findElement(By.xpath("//a[text()='Login']")).click();
		// String username = p.getProperty("username");
		// String password = p.getProperty("password");
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// click on register button and select apartment

		// driver.findElement(By.xpath("//a[text()='Register']")).click();
		// driver.findElement(By.xpath("//a[text()='Apartment Registration']")).click();

		// submit button
		apartment part = new apartment(driver);
		// click on register and apartment
		part.apart();

		// fetching data from excel
		ExcelUtility exl = new ExcelUtility();
		exl.getList4(driver);
		
		// scroll to image and clicks
		part.scrollToImg(driver);

		// click on submit button
		part.submit();
		// logout
//		logout out = new logout(driver);
//		out.logout();
		// ExcelUtility exl = new ExcelUtility();
		// exl.GetLastCellnumber("apartment", 0);
		// entering data into all the fields
//		FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
//		Workbook wb = WorkbookFactory.create(f2);
//		Sheet sh = wb.getSheet("apartment");
//		Row rw = sh.getRow(0);
//		int count = rw.getLastCellNum();
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("apartment_name");
//		list.add("mobile");
//		list.add("email");
//		list.add("plot_number");
//		list.add("country");
//		list.add("state");
//		list.add("landmark");
//		list.add("address");
//		// click on addmore button
//		driver.findElement(By.xpath("//a[contains(text(),'Add More')]")).click();
//		list.add("fullname[]");
//		list.add("ap_number_of_plats[]");
//		list.add("rooms[]");
//		list.add("area[]");
//		list.add("rent[]");
//		list.add("accommodation[]");
//		list.add("description[]");
//
//		for (int i = 0; i <= count; i++) {
//			String value = rw.getCell(i).getStringCellValue();
//			driver.findElement(By.name(list.get(i))).sendKeys(value);
//
//		}
		// Purpose
//		WebElement listbox = driver.findElement(By.id("purpose"));
//		Select sl = new Select(listbox);
//		sl.selectByValue("Residential");
//		// Floor
//		WebElement floor = driver.findElement(By.id("floor"));
//		Select fl = new Select(floor);
//		fl.selectByValue("Ground Floor");
//		// owner
//		WebElement owner = driver.findElement(By.id("ownership"));
//		Select ow = new Select(owner);
//		ow.selectByValue("owner");
//		// vacant
//		WebElement vc = driver.findElement(By.id("vacant"));
//		Select vac = new Select(vc);
//		vac.selectByIndex(0);
//		
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();

//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
