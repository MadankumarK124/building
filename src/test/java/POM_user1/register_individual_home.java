package POM_user1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
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
import com.HRA.GenericUtilities.iPathConstants;
import com.HRA.organizationUtilis.apartment;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;
import com.HRA.organizationUtilis.registerHome;
import com.graphbuilder.struc.LinkedList;
import com.mysql.jdbc.Driver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class register_individual_home {

	public static void main(String[] args) throws Throwable {

		ExcelUtility eLib = new ExcelUtility();
		fileUtility flib = new fileUtility();
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility weblib = new WebDriverUtility();
//
		String url = flib.readDataFromPropertyFile("url");
		String browser = flib.readDataFromPropertyFile("browser");
		String username = flib.readDataFromPropertyFile("username");
		String password = flib.readDataFromPropertyFile("password");

		// FileInputStream f1 = new
		// FileInputStream(".\\src\\test\\resources\\commonData.properties");
		// Properties p = new Properties();
		// p.load(f1);
		// String url = p.getProperty("url");
		// String browser = p.getProperty("browser");
		// launching browser
		// WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("inavlid browser");
		}
		// maximize the webpage
		weblib.maxi(driver);
		// implicitly wait
		weblib.implicitlywait(driver);
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
////		// login as an user
		logo lo = new logo(driver);
		lo.app();
		loginUser in = new loginUser(driver);
		in.loginUser(username, password);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		// String username = p.getProperty("username");
		// String password = p.getProperty("password");
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// register an indiviual home
		// driver.findElement(By.xpath("//a[text()='Register']")).click();
		// WebElement vac = driver.findElement(By.xpath("//select[@name='vacant']"));
		// weblib.scrollAction(driver, vac);
		// fetching data from excel
		//eLib.getlist("individual home", driver);
		/*
		 */
		/*
		 * FileInputStream f2 = new
		 * FileInputStream(".\\src\\test\\resources\\Excel.xlsx"); Workbook wb =
		 * WorkbookFactory.create(f2); Sheet sh = wb.getSheet("individual home"); Row
		 * row1 = sh.getRow(1); int count = row1.getLastCellNum(); /*
		 * //ArrayList<String> list = new ArrayList<String>(); //list.add("fullname");
		 * //list.add("mobile"); //list.add("alternat_mobile"); /*list.add("email");
		 * list.add("plot_number"); list.add("rooms"); list.add("country");
		 * list.add("state"); list.add("city"); list.add("rent"); list.add("deposit");
		 * list.add("accommodation"); //list.add("description"); list.add("landmark");
		 * list.add("address");
		 */

		// for (int i = 0; i < count; i++) {
		// String sh1 = row1.getCell(i).getStringCellValue();
		// driver.findElement(By.name(list.get(i))).sendKeys(sh1);

		// eLib.arraylist(driver, "individual home");

		// Select s = new Select(drop);
		// s.selectByIndex(0);

		registerHome home = new registerHome(driver);
		home.registerHome();

		home.drop(driver, "0");
		ExcelUtility ex = new ExcelUtility();
		ex.compl("individual home", driver);
		weblib.file(driver);
		home.submit();

//		File fil = new File(".\\src\\test\\resources\\Screenshot (2).png");
//		String path = fil.getAbsolutePath();
//		driver.findElement(By.id("image")).sendKeys(path);
		// click on details/update
//		logout out = new logout(driver);
//		out.logout();
		// driver.findElement(By.xpath("//a[text()='Details/Update']")).click();

	}

}
