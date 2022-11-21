package TestNGScripts;

import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.organizationUtilis.admin_dashboard;
//@Listeners(com.HRA.GenericUtilities.ListenersImplemnatationClass.class)
public class adminDashboardTest extends BaseClass{
	@Test
	public void login() throws Throwable
	{
		admin_dashboard ds = new admin_dashboard(driver);
		ds.user();
		ds.home();
		ds.room();
	}
}
