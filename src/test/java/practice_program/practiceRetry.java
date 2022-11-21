package practice_program;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class practiceRetry {

	@Test (retryAnalyzer = com.HRA.GenericUtilities.RetryImplementationClass.class)
	public void retry()
	{
		System.out.println("sample1");
		System.out.println("sample2");
		fail();
		System.out.println("sample3");
		System.out.println("sample4");
	}
}
