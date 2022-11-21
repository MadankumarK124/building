package practice_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingdatafromExcel {
	public static void main(String[] args) throws Throwable {
		//create the object of file
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		//create an object of workbook
		Workbook wb = WorkbookFactory.create(f1);
		//sheetname
		Sheet sh = wb.getSheet("sheet2");
		//row value
		Row rw = sh.getRow(1);
		//colum value
		String sh1 = rw.getCell(1).getStringCellValue();
		//printing statement
		System.out.println(sh1);
	}

}
