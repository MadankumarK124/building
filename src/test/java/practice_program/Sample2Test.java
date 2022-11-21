package practice_program;

import org.testng.annotations.Test;

public class Sample2Test {
	@Test(groups = {"smoke","regression"})
	public void test3()
	{
		System.out.println("Script3");
	}
	
	@Test(groups = "smoke")
	public void test4()
	{
		System.out.println("Script4");
	}


}
