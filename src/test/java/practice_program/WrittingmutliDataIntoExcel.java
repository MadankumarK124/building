package practice_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingmutliDataIntoExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("Sheet1");
	Row rw = sh.createRow(1);
	short cl = rw.getLastCellNum();
	for(int i=0;i<=cl;i++)
		
		{
			rw.createCell(i).setCellValue("madan");
			FileOutputStream f2 = new FileOutputStream(".\\src\\test\\resources\\Excel.xlsx");
			wb.write(f2);
			System.out.println(f2);
		}
		
	}

}
