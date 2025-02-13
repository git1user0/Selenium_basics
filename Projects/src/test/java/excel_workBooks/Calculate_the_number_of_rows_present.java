package excel_workBooks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Calculate_the_number_of_rows_present {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Thread.sleep(2200);
		Sheet sheet = book.getSheet("Sheet1");
		
		//int no_of_rows = sheet.getPhysicalNumberOfRows();
		int no_of_rows = sheet.getLastRowNum();
		
		for (int i = 0; i <= no_of_rows; i++) {
			int no_of_cols = sheet.getRow(i).getLastCellNum();
		    for (int j = 0; j < no_of_cols; j++) {
		        String values = sheet.getRow(i).getCell(j).toString();
		        System.out.println("Value at row " + i + " column " + j + ": " + values);
		    }
		}

		System.out.println("data is fetched");
		

	}

}
