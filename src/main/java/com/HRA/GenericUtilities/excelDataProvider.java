package com.HRA.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelDataProvider {
	@DataProvider
	public Object[][] readMultipuleData() throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("dataProvider");
		int lastrow = sh.getLastRowNum() + 1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrow][lastcell];
		for (int i = 0; i < lastrow; i++) {
			for (int j = 0; j < lastcell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return obj;
	}

}
