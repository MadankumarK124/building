package practice_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingmultipledatafromexcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("sheet2");
		int count = sh.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			Row rw = sh.getRow(i);
			String inf = rw.getCell(1).getStringCellValue();
			System.out.println(inf);
		}
	}

}
