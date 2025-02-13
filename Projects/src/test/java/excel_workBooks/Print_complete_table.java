package excel_workBooks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_complete_table {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Thread.sleep(2200);
		Sheet sheet = book.getSheet("Sheet1");
		
		// int no_of_rows = sheet.getPhysicalNumberOfRows();
		int no_of_rows = sheet.getLastRowNum();

		for (int i = 0; i <= no_of_rows; i++) {
			String key = sheet.getRow(i).getCell(0).toString();
			String value = sheet.getRow(i).getCell(1).toString();
			String pair = sheet.getRow(i).getCell(2).toString();
			System.out.println(key + "\t" + value + "\t" + pair);
		}

		System.out.println("data is fetched");
	}
}
