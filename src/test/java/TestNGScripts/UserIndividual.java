package TestNGScripts;

import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.organizationUtilis.registerHome;

public class UserIndividual extends BaseClass{
	@Test(groups = {"smoke","regression"})
	public void createIndividualHome() throws Throwable
	{
		registerHome home = new registerHome(driver);
		home.registerHome();

		home.drop(driver, "0");
		ExcelUtility ex = new ExcelUtility();
		ex.compl("individual home", driver);
		weblib.file(driver);
		home.submit();
	}
	
	@Test
	public void sample1()
	{
		System.out.println("sample1");
	}
	@Test
	public void sample()
	{
		System.out.println("sample2");
	}
}
