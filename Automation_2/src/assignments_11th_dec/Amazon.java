package assignments_11th_dec;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
            driver.get("https://www.amazon.in/");
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")));
            searchBox.sendKeys("iPhone 16 Pro Max");
            WebElement searchButton = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
            searchButton.click();

            String h = driver.findElement(By.xpath("(//div[@data-asin='B0DGHYDZR9'])[2]//span//div[@class='a-row a-size-base a-color-base']//a//span/span[2]/span[2]")).getText();
            System.out.println("This is the price of iPhone 16 Pro Max as of today: " + h + " rupees in India");
       
            driver.quit();
        
    }
}
