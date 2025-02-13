package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Source_demo_login;

public class Keyword_driveb_approach_method {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Source_demo_login sc = new Source_demo_login(driver);

		String path = "C:\\Users\\BHARATH\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook Wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = Wb.getSheet("Sheet2");
		XSSFRow row = sheet.getRow(0);
		int rows = sheet.getLastRowNum();
		for (int r = 0; r <= rows; r++) {
			XSSFRow row1 = sheet.getRow(r);
			XSSFCell methods = row1.getCell(0);
			XSSFCell keys = row1.getCell(1);
			System.out.println(methods + "---" + keys);

			switch (keys.toString()) {
			case "url":
				sc.enterURL();
				break;
			case "username":
				sc.enter_Username("standard_user");
				break;
			case "password":
				sc.enter_password("secret_sauce");
				break;
			case "login":
				sc.enter_by();
				break;
			case "logout":
				sc.enter_logout();
				break;
			}
		}

	}

}
