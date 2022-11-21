package practice_program;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HRA.GenericUtilities.ExcelUtility;

public class samplePro2 {
	@Test(dataProvider = "getdata")
	public void method(String name, String rating, String compliments)
	{
		System.out.println(name+"----->"+rating+"--->"+compliments);
	}
	@DataProvider
	public Object[][] getdata() throws Throwable
	{
		ExcelUtility elib = new ExcelUtility();
		Object[][] data = elib.dataProvider("data");
		return data;
	}
}
