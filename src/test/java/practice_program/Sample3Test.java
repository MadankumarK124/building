package practice_program;

import org.testng.annotations.Test;

public class Sample3Test {
	@Test
	public void test5()
	{
		System.out.println("Script5");
	}
	
	@Test(groups = {"smoke","regression"})
	public void test6()
	{
		System.out.println("Script6");
	}


}
