package excel_working;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handling_java {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\BHARATH\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook Wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = Wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		int rows = sheet.getLastRowNum();
		for(int r=0;r<=rows;r++) {
			XSSFRow row1 = sheet.getRow(r);
			XSSFCell username = row1.getCell(0);
			XSSFCell password = row1.getCell(1);
			System.out.println(username+"---"+password+" "+r+" ");
			
		}

	}

}
