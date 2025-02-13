package excel_workBooks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Adding_values_in_excel_book {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
       
        Sheet sheet = book.getSheet("Sheet1");
        Row row1 = sheet.createRow(11);
        
        Cell cell1 = row1.createCell(0);
        cell1.setCellValue("Hi_Bro_");
        
        Cell cell3 = row1.createCell(1);
        cell3.setCellValue("Hi_Bro_");
        
        Cell cell2 = row1.createCell(2);
        cell2.setCellValue("Hi_Bro_");
		FileOutputStream output = new FileOutputStream(".\\src\\test\\resources\\Book1.xlsx");
		book.write(output);
		System.out.println("data is added");
		

	}

}
