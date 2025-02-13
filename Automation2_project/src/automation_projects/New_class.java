package automation_projects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_class {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    try {
      // Open the Yahoo Finance page
      driver.get("https://finance.yahoo.com/quote/%5ENSEI/history/");

      // Wait for the table to be present
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(
          By.xpath("//*[@id=\"nimbus-app\"]/section/section/section/article/div[1]/div[3]/table")));

      // Get all rows (excluding header)
      List<WebElement> rows = table.findElements(By.tagName("tr"));

      System.out.println("Total rows (including header): " + rows.size());

      for (WebElement row : rows) {
        // Extract data cells within each row
        List<WebElement> dataCells = row.findElements(By.tagName("td"));

        // Print data cell values
        for (WebElement cell : dataCells) {
          System.out.print(cell.getText() + " | ");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      driver.quit();
    }
  }
}
