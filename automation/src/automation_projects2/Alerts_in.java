package automation_projects2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_in {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Notification']")).click();
        Thread.sleep(1000); // Let the page settle
        Actions act = new Actions(driver);
       
        // Handle the alert
        Alert al = driver.switchTo().alert();
        Thread.sleep(1000);
        al.sendKeys("hello");
        act.sendKeys(Keys.TAB);// Enter text into the prompt alert
        Thread.sleep(1000);
        al.sendKeys("hello");
        act.sendKeys(Keys.TAB);
        al.accept();

        // Close the browser
        Thread.sleep(2000);
        driver.quit();
    }
}
