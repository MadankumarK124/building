package com.HRA.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.HRA.organizationUtilis.logout;
import com.HRA.organizationUtilis.apartment;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;

public class BaseClass {
	public fileUtility flib = new fileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverUtility weblib = new WebDriverUtility();
	public JavaUtility jlib = new JavaUtility();
	public DataBaseUtility dlib = new DataBaseUtility();
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite
	public void connectDB() throws Throwable {
		dlib.dataBAse();
		System.out.println("connect to dataBase");
	}
	//@Parameters("browser")
	@BeforeClass
	public void launching() throws Throwable {
		String browser = flib.readDataFromPropertyFile("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser");
		}
		sdriver=driver;// dummy reference to reinitilze the browser for taking screenshot
		weblib.maxi(driver);
		weblib.implicitlywait(driver);

		String url = flib.readDataFromPropertyFile("url");

		driver.get(url);
		System.out.println("launched");
	}

	

	@BeforeMethod
	public void Userlogin() throws Throwable {
		
		String username = flib.readDataFromPropertyFile("un");
		String password = flib.readDataFromPropertyFile("pass");
		// String username = flib.readDataFromPropertyFile("username");
		// String password = flib.readDataFromPropertyFile("password");
		logo lo = new logo(driver);
		lo.app();
		loginUser in = new loginUser(driver);
		in.loginUser(username, password);
		
//		elib.getlist3(driver);
//		apartment part = new apartment(driver);
//		part.apart();
//		
//		part.scrollToImg(driver);
//		part.submit();
		System.out.println("login to app");
	}

//	
//
	@AfterMethod
	public void logout() {
		logout lo = new logout(driver);
		lo.logout();
		System.out.println("logout from applicataion");
	}
//	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("close the browser");
	}
//	

	@AfterSuite
	public void closeDB() throws Throwable {
		dlib.closeDataBase();
		System.out.println("close db");
	}
}
