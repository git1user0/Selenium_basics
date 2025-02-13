package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class TestLogin {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
        driver.manage().window().maximize();
    }

    @DataProvider(name = "login_data")
    public Object[][] getData() {
        return new Object[][] {
            {"admin", "password", true},
            {"testuser1@gmail.com", "admin", false},
            {"admin", "admin", false},
            {"", "", false},
            {"", "admin", false},
            {"admin", "", false},
            {"123", "admin", false}
        };
    }

    @Test(dataProvider = "login_data")
    public void testLogin(String username, String password, boolean expectedSuccess) {
        login(username, password);

        if (expectedSuccess) {
            assertLoginSuccess();
            logout();
        } else {
            assertLoginFailure();
        }
    }

    private void login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    private void logout() {
        driver.findElement(By.xpath("//button[text()='Logout']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
    }

    private void assertLoginSuccess() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Welcome')]")));
        //Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).isDisplayed(), "Login Success verification failed");
        System.out.println("Login successful.");
    }

    private void assertLoginFailure() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Invalid')]")));
        //Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Invalid')]")).isDisplayed(), "Login Failure verification failed");
        System.out.println("Login failed as expected.");
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

