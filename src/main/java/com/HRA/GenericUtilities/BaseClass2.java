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

import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;
import com.HRA.organizationUtilis.newRegistration;
public class BaseClass2 {
	public fileUtility flib = new fileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverUtility weblib = new WebDriverUtility();
	public JavaUtility jlib = new JavaUtility();
	public DataBaseUtility dlib = new DataBaseUtility();
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void connectDB() throws Throwable
	{
		dlib.dataBAse();
		System.out.println("connect to db");
	}
	//@Parameters("browser")
	@BeforeClass
	public void launch( ) throws Throwable
	{
		String browser = flib.readDataFromPropertyFile("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		sdriver=driver;
		weblib.maxi(driver);
		weblib.implicitlywait(driver);
		String url = flib.readDataFromPropertyFile("url");
		driver.get(url);
		System.out.println("launch");
		newRegistration reg = new newRegistration(driver);
		reg.register();
		elib.apart(driver, "userreg");
		reg.submit();
	}
	@BeforeMethod
	public void login() throws Throwable
	{
		String username = flib.readDataFromPropertyFile("username");
		String password = flib.readDataFromPropertyFile("password");
		logo lo = new logo(driver);
		lo.app();
		loginUser in = new loginUser(driver);
		in.loginUser(username, password);
		System.out.println("login");
	}
	@AfterMethod
	public void logout()
	{
		logout out = new logout(driver);
		out.logout();
		System.out.println("logout");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		System.out.println("closebrowser");
		
	}
	@AfterSuite
	public void closeDB() throws Throwable
	{
		dlib.closeDataBase();
		System.out.println("closeDB");
	}
	


}
