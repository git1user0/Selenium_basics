package SeleniumMaven.Projects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class POI_apache {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");
		Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");
		
		File f = new File("C:\\Users\\BHARATH\\OneDrive\\Desktop\\New folder (2)\\java projects");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		fo.close();
		
		System.out.println("file created !!!");
		
	}
}
