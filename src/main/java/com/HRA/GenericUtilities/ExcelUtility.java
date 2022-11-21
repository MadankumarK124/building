package com.HRA.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import javax.sql.rowset.WebRowSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
	/**
	 * This method is used to read data from excel
	 * 
	 * @author MADAN KUMAR K
	 * @param sheetName
	 * @param rowno
	 * @param colno
	 * @return
	 * @throws Throwable
	 */
	public void arraylist(WebDriver driver, String sheetName) throws Throwable {
		// create the object of file
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		// create an object of workbook
		Workbook wb = WorkbookFactory.create(f1);
		// sheetname
		Sheet sh = wb.getSheet(sheetName);
		// row value
		Row rw1 = sh.getRow(1);
		Row rw2 = sh.getRow(2);
		int count = rw1.getLastCellNum();

		for (int i = 0; i < count; i++) {
			String key = rw2.getCell(i).getStringCellValue();
			String value = rw1.getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}

	}

	public String readDataFromExcel(String sheetname, int rowno, int colno) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		String value = sh.getRow(rowno).getCell(colno).getStringCellValue();
		return value;

	}

	/**
	 * this method is used to write the data into exce
	 * 
	 * @author MADAN KUMAR K
	 * @param sheetName
	 * @param rowno
	 * @param colno
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public void writeDataintoExcel(String sheetName, int rowno, int colno, String data) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("sheet2");
		Row rw = sh.createRow(rowno);
		Cell cl = rw.createCell(colno);
		cl.setCellValue(data);
		FileOutputStream fl = new FileOutputStream(iPathConstants.excel);
		wb.write(fl);

	}

	/**
	 * this method is used to fetch the data from last row
	 * 
	 * @author MADAN KUMAR K
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public int GetlastRownumber(String sheetname) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		int count = sh.getLastRowNum();
		return count;
	}

	/**
	 * this method is used to fetch the last cell/column
	 * 
	 * @author MADAN KUMAR K
	 * @param sheetname1
	 * @param rowno
	 * @return
	 * @throws Throwable
	 */
	public int GetLastCellnumber(String sheetname1, int rowno) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname1);
		Row rw = sh.getRow(rowno);
		int last = rw.getLastCellNum();
		return last;

	}

	public void cell(String sheetname, int rowno) throws Throwable {
		FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f2);
		Sheet sh = wb.getSheet("individual home");
		Row row1 = sh.getRow(1);
		int count = row1.getLastCellNum();
	}

	public void getlist(String sheetname, WebDriver driver) throws Throwable {
		FileInputStream f2 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f2);
		Sheet sh = wb.getSheet("individual home");
		Row row1 = sh.getRow(1);
		int count = row1.getLastCellNum();
		for (int i = 0; i < count; i++) {
			String key = row1.getCell(i).getStringCellValue();
			String value = row1.getCell(i).getStringCellValue();
			if (key.equals("fullname")) {
				value = value;
			}
			driver.findElement(By.name(key)).sendKeys(value);
		}
	}

	public void readData(String sheetname, WebDriver driver) throws Throwable {
		FileInputStream f2 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f2);
		Sheet sh = wb.getSheet(sheetname);
		Row row1 = sh.getRow(1);
		int count = row1.getLastCellNum();
		for (int i = 0; i < count; i++) {
			String key = row1.getCell(i).getStringCellValue();
			String value = row1.getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}

	}

	public String exc(String sheetname) throws Throwable, Throwable {
		FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f2);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		String cl = rw.getCell(0).getStringCellValue();
		return cl;
	}

	public void compl(String sheetname, WebDriver driver) throws Throwable {
		// create the object of file
				FileInputStream f1 = new FileInputStream(iPathConstants.excel);
				// create an object of workbook
				Workbook wb = WorkbookFactory.create(f1);
				// sheetname
				Sheet sh = wb.getSheet(sheetname);
				// row value
				Row rw1 = sh.getRow(1);
				Row rw2 = sh.getRow(2);
				int count = rw1.getLastCellNum();

				for (int i = 0; i < count; i++) {
					String key = rw2.getCell(i).getStringCellValue();
					String value = rw1.getCell(i).getStringCellValue();
					driver.findElement(By.name(key)).sendKeys(value);

				}
	}

	public HashMap<String, String> getlist2(String sheetname) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		Row rw1 = sh.getRow(0);
		Row rw2 = sh.getRow(1);
		int count = rw2.getLastCellNum();
		HashMap<String, String> set = new HashMap<String, String>();
		for (int i = 0; i <= count; i++) {
			String key = rw1.getCell(i).getStringCellValue();
			String value = rw2.getCell(i).getStringCellValue();
			set.put(key, value);
		}
		return set;
	}

	public void apart(WebDriver driver, String sheetname) throws Throwable {
		// create the object of file
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		// create an object of workbook
		Workbook wb = WorkbookFactory.create(f1);
		// sheetname
		Sheet sh = wb.getSheet(sheetname);
		// row value
		Row rw1 = sh.getRow(0);
		Row rw2 = sh.getRow(1);
		int count = rw1.getLastCellNum();

		for (int i = 0; i < count; i++) {
			String key = rw1.getCell(i).getStringCellValue();
			String value = rw2.getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);

		}
	}
	/**
	 * using 2 dimension array 
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public Object[][] dataProvider(String sheetname) throws Throwable
	{
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		int lastrow = sh.getLastRowNum()+1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrow][lastcell];
		for(int i=0; i<lastrow; i++)
		{
			for(int j=0; j<lastcell; j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return obj;
	}
	public void getlist3(WebDriver driver) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("apartment");
		Row rw1 = sh.getRow(0);
		Row rw2 = sh.getRow(1);
		int count = rw2.getLastCellNum();
		
		for (int i = 0; i <count; i++) {
			String key = rw1.getCell(i).getStringCellValue();
			String value = rw2.getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}
		
	}
	public void getList4(WebDriver driver) throws Throwable {
		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("indi");
		Row rw1 = sh.getRow(0);
		Row rw2 = sh.getRow(1);
		int count = rw2.getLastCellNum();
		
		for (int i = 0; i <count; i++) {
			String key = rw1.getCell(i).getStringCellValue();
			String value = rw2.getCell(i).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}
		
	}
	
//	public void provider(String sheetname) throws Throwable
//	{
//		FileInputStream f1 = new FileInputStream(iPathConstants.excel);
//		Workbook wb = WorkbookFactory.create(f1);
//		Sheet sh = wb.getSheet(sheetname);
//		sh.getLastRowNum();
//	}
}