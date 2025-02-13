package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Module_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\BHARATH\\eclipse-workspace\\news\\src\\test\\resources\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);
		Thread.sleep(2000);
		// fetch the sheet name
		Sheet sheet = book.getSheet("Sheet1");
		
		int PhysicalNumberOfRows = sheet.getPhysicalNumberOfRows(); //gets all the rows that are present
		
		System.out.println(PhysicalNumberOfRows);
		System.out.println("*************");

		for (int i = 0; i < PhysicalNumberOfRows; i++) {
			/*Row row = sheet.getRow(i);

			Cell cell = row.getCell(1);

			Double etch = cell.getNumericCellValue();

			String etch = cell.getStringCellValue();

			System.out.println(etch);
			
			
			*************if using *********
			int PhysicalNUMberofrows = sheet.getLastRowNum();
			
			then we should add
			for (int i = 0; **i <=PhysicalNumberOfRows** like this to condition ; i++)
			*/
			
			String key = sheet.getRow(i).getCell(0).toString();
			String values = sheet.getRow(i).getCell(1).toString();
			String all_values = sheet.getRow(i).getCell(2).toString();
			String all_values2 = sheet.getRow(i).getCell(3).toString();
			System.out.println(key+"\t"+values+"\t"+all_values+"\t"+all_values2);

		}

		/*
		 * Row createdRow = sheet.createRow(0); Cell createdcell =
		 * createdRow.createCell(0); //createdcell.setCellValue("HI EVERYONE");
		 * 
		 * String stringCellValue = createdcell.getStringCellValue();
		 * System.out.println(stringCellValue);
		 */
	}

}
