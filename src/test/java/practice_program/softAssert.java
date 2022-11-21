package practice_program;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void create()
	{
		System.out.println("-----line1----");
		System.out.println("-----line2----");
		System.out.println("-----line3----");
		System.out.println("-----line4----");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("a", "b");
		System.out.println("-----line5----");
		System.out.println("-----line6----");
		sa.assertAll();
	}
	
	@Test
	public void update()
	{
		System.out.println("-----line7----");
		System.out.println("-----line8----");
		
	}
	

}
