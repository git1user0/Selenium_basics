package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Module_03_Assignment_1 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
                {"testuser@gmail.com", "password"},
                {"testuser1@gmail.com", "password123"},
                {"testuser2@gmail.com", "pass456"},
                {"testuser3@gmail.com", "secure789"},
                {"testuser4@gmail.com", "mypassword"},
                {"testuser5@gmail.com", "test@123"}
        };
    }

    @Test(dataProvider = "loginData", invocationCount = 1)
    public void loginTest(String username, String password) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        Thread.sleep(2000);
        emailField.clear();
        emailField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
        

        // Add assertion based on expected behavior
        WebElement successMessage = driver.findElement(By.xpath("//h3[contains(text(),'Successfully Logged in')]"));
        Assert.assertTrue(successMessage.isDisplayed(), "Login Failed");
        
        System.out.println("Login attempted with: " + username + " / " + password);

        // Navigate back to the login page
        driver.navigate().back();

        // Refresh page to clear old input fields
        driver.navigate().refresh();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
