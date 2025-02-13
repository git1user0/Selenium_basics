package pop_up_different_kinds;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popups {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='File Uploads']")).click();

        String filePath = "C:\\Users\\BHARATH\\OneDrive\\Desktop\\screenshot\\login.png";

        driver.findElement(By.id("fileInput")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadElement);
        uploadElement.sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Multiple select']")).click();
        driver.findElement(By.id("fileInput")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.quit();
    }
}

