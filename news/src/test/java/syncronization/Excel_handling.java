package syncronization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_handling {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Thread.sleep(2200);
		Sheet sheet = book.getSheet("Sheet1");
		Row row1 = sheet.getRow(10);
		Cell cell1 = row1.getCell(1);
		String vl = cell1.getStringCellValue();
		System.out.println(vl);

	}

}
