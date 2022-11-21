package TestNGScripts;



import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.organizationUtilis.sms_Admin;

public class adminSms extends BaseClass {
	@Test
	public void sendsms() throws Throwable

	{
		// excel data
		String data = elib.readDataFromExcel("Sheet1", 0, 0);
		// send sms
		sms_Admin sm = new sms_Admin(driver);
		sm.sms(data);
		
		sm.scrollTocheck(driver);

	}
}
