package assignments_11th_dec;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='username']"))).sendKeys("YOUR_USERname");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("YOUR_PASSword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Wait for login success
        wait.until(ExpectedConditions.urlContains("instagram.com"));

        // Click on search box
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[aria-label='Search']"))).click();
        

        // Enter search query
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search']"))).sendKeys("hemsqalearnings");

        // Click on the first profile result
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class^='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv']"))).click();

        // Click on message button
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class$='x5n08af xsz8vos']"))).click();

        // Type and send message
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class^='xat24cr']"))).sendKeys("HELLO HEMANTH SIR,THIS IS AN AUTOMATED MESSAGE THROUGH SELENIUM JAVA");
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class$='a9_1']"))).click();
        
        // Click Send button
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class*=' xfs2ol5']"))).click();
        
        Thread.sleep(10000);
        // Close browser
        driver.quit();

	}

}
