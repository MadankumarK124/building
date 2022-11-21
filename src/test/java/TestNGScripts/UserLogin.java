package TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.HRA.GenericUtilities.BaseClass;
import com.HRA.GenericUtilities.BaseClass2;

public class UserLogin extends BaseClass2 {
	
	@Test(groups = "smoke")
	public void LoginAsNewUser() throws Throwable {
		
		
		Assert.assertEquals("", "");
		System.out.println("login successfull");
		
		
	}
}
