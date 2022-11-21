package com.HRA.GenericUtilities;

import org.testng.annotations.Test;

public class readingDataFromDataProvider {
	@Test(dataProviderClass = excelDataProvider.class, dataProvider = "readMultipuleData")
	public void name(String name, String rating)
	{
		System.out.println(name+"="+rating);
	}

}
