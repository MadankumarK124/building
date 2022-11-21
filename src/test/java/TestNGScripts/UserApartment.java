package TestNGScripts;

import org.testng.annotations.Test;
import com.HRA.organizationUtilis.apartment;
import com.HRA.GenericUtilities.BaseClass;

public class UserApartment extends BaseClass {
	@Test(groups = "smoke")
	public void apartment()
	
	{
	apartment part = new apartment(driver);
	//part.apart();
//		part.scrollToImg(driver);
//		part.submit();
		
	}
	

}
