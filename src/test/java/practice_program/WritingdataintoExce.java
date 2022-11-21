package practice_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingdataintoExce {
	public static void main(String[] args) throws Throwable {
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet("sheet2");
		Row rw = sh.createRow(4);
		Cell cl = rw.createCell(3);
		cl.setCellValue("tyss");
		FileOutputStream fl = new FileOutputStream(".\\src\\test\\resources\\Excel.xlsx");
		wb.write(fl);
	}

}
