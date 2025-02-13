package syncronization;

import org.apache.poi.ss.usermodel.*; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Module_4_Assignment_01 {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
	}

	@DataProvider(name = "loginData")
	public Object[][] getData() throws IOException {
		String filePath = ".\\src\\test\\resources\\login.xlsx";
		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();

		Object[][] data = new Object[rowCount - 1][2];
		for (int i = 1; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			data[i - 1][0] = row.getCell(0).getStringCellValue();
			data[i - 1][1] = row.getCell(1).getStringCellValue();
		}

		workbook.close();
		return data;
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException {
		// Enter Username & Password
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement name_field = wait.until(ExpectedConditions.elementToBeClickable(By.name("uid")));
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin")));
        Thread.sleep(1000);
		
        name_field.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        
        Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		alert.accept();
		
		Thread.sleep(1000);
		
		// Navigate back for the next login attempt
		driver.navigate().refresh();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
