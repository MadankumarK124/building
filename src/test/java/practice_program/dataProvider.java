package practice_program;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@Test(dataProvider = "getData")
	public void Travell(String src, String dest, int price)
	{
		System.out.print(src+"---------->"+dest+"-------->"+price +",");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0]= "banglore";
		obj[0][1]= "goa";
		obj[0][2]= 100;
		
		obj[1][0]= "goa";
		obj[1][1]= "banglore";
		obj[1][2]= 150;
		return obj;
	}
}
