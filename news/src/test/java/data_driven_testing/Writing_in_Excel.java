package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writing_in_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\BHARATH\\eclipse-workspace\\news\\src\\test\\resources\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);
		Thread.sleep(2000);
		// fetch the sheet name
		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		
		cell.setCellValue("Bharath");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\BHARATH\\eclipse-workspace\\news\\src\\test\\resources\\Book1.xlsx");
		book.write(fos);
		book.close();
		// system.out.print("the data is successfully saved");
		Row row1 = sheet.getRow(1);

		Cell cell1 = row.getCell(0);

		String etch = cell1.getStringCellValue();

		System.out.println(etch);

	}

}
