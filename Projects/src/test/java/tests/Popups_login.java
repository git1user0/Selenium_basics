package tests;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Popups_login {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
    }

    @DataProvider(name = "login_data")
    public Object[][] getData() {
        return new Object[][] {
            {"admin", "password"},
            {"testuser1@gmail.com", "admin"},
            {"admin", "admin"},
            {" ", " "},
            {" ", "admin"},
            {"admin", " "},
            {" 123 ", "admin"}
        };
    }

    @Test(dataProvider = "login_data")
    public void login(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='AuthLink']"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.sendKeys(username + "\t" + password);
        alert.accept();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Login Successful')]")));
            System.out.println("Login Successful for user: " + username + " " + password);
        } catch (Exception e) {
            System.out.println("Login Failed for user: " + username + " " + password);
        }

        driver.navigate().refresh();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
