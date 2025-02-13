package pop_up_different_kinds;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FileUploadDragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the file upload page
        driver.get("https://demoapps.qspiders.com/ui/fileUpload/drag?sublist=2");
        driver.manage().window().maximize();

        // Locate the hidden file input field
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

        // Provide the absolute file path
        String filePath = "C:\\Users\\BHARATH\\OneDrive\\Desktop\\screenshot\\login.png";

        // Use JavaScript to remove hidden attribute (if necessary)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", uploadElement);

        // Upload file using sendKeys
        uploadElement.sendKeys(filePath);

        // Wait for upload to complete
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}

