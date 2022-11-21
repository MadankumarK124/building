package TestNGScripts;

import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.organizationUtilis.adminComplaint;
import com.HRA.organizationUtilis.detailsHome;
import com.HRA.organizationUtilis.loginUser;
import com.HRA.organizationUtilis.logo;
import com.HRA.organizationUtilis.logout;

public class userComplaint extends BaseClass {

	@Test(groups = {"smoke","regression"})
	public void complaintUser() throws Throwable {
		String full = elib.readDataFromExcel("Sheet3", 0, 0);
		String comp = elib.readDataFromExcel("Sheet3", 1, 1);
		detailsHome detail = new detailsHome(driver);
		detail.detailsHome(full, comp);
		detail.submit();
		logout logout = new logout(driver);
		logout.logout();
		logo lo1 = new logo(driver);
		lo1.app();
		//fetching data from fileutility
		String un = flib.readDataFromPropertyFile("un");
		String pass = flib.readDataFromPropertyFile("pass");
		loginUser in1 = new loginUser(driver);
		in1.loginUser(un, pass);

		// click on complaint list as admin
		adminComplaint com = new adminComplaint(driver);
		com.admincomp();
		
		// logout as admin
		logout logout1 = new logout(driver);
		logout1.logout();
	}

	
}
