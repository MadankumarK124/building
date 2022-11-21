package practice_program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderOfExecution {
	@BeforeClass
	public void launch()
	{
		System.out.println("launching browser");
		
	}
	@AfterClass
	public void closingbrowser()
	{
		System.out.println("closing browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("loggout from app");
	}
	@Test
	public void createUser()
	{
		System.out.println("create user");
	}
	@BeforeSuite
	public void dbconn()
	{
		System.out.println("connect to database");
	}
	@AfterSuite
	public void dbclose()
	{
		System.out.println("close for database");
	}
	@Test
	public void createAdmin()
	{
		System.out.println("create admin");
	}

}
