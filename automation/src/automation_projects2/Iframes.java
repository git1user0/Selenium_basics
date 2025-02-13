package automation_projects2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

        // Switch to frame 1 and interact with it
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1_sendKeys_trying");
        Thread.sleep(2000);

        // Switch back to the main content before switching to the next frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2_sendKeys_trying");
        Thread.sleep(2000);

        // Switch back to the main content before switching to the next frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3_sendKeys_trying");
        Thread.sleep(2000);

        // Switch back to the main content before switching to the next frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("frame4_sendKeys_trying");
        Thread.sleep(2000);

        // Switch back to the main content before switching to the next frame
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(4);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("frame5_sendKeys_trying");
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
