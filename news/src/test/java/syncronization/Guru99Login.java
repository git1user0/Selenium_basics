package syncronization;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Guru99Login {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Excel file path
        String excelFilePath = ".\\src\\test\\resources\\login.xlsx";

        try {
            // Read Excel file
            FileInputStream fis = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row

                String username = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();

                driver.get("http://demo.guru99.com/V4/");

                // Enter username
                driver.findElement(By.name("uid")).sendKeys(username);

                // Enter password
                driver.findElement(By.name("password")).sendKeys(password);

                // Click Login button
                driver.findElement(By.name("btnLogin")).click();

                // Handle alert pop-up
                try {
                    Alert alert = driver.switchTo().alert();
                    System.out.println("Alert Message: " + alert.getText());
                    alert.accept(); // Click OK
                } catch (NoAlertPresentException e) {
                    System.out.println("No alert found for user: " + username);
                }

                // Wait before next login
                Thread.sleep(2000);
            }

            workbook.close();
            fis.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Close browser
        }
    }
}

