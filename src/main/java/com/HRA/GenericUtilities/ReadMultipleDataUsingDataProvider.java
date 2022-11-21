package com.HRA.GenericUtilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadMultipleDataUsingDataProvider {
	@Test(dataProvider = "readData")
	public void excelData(String src, String dest) {
		System.out.println(src + "-----------" + dest);
	}

	@DataProvider
	public Object[][] readData() throws Throwable {
		ExcelUtility elib = new ExcelUtility();
		Object[][] data = elib.dataProvider("dataProvider");
		return data;
	}

}
