package automation_projects2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fullpage_ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='login']")));
		Thread.sleep(5000);
		

        File temp_ = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		File pmt = new File("C:\\Users\\BHARATH\\OneDrive\\Desktop\\screenshot\\login.png");
		Thread.sleep(1000);
		FileHandler.copy(temp_, pmt);
		System.out.println("logged");
		driver.quit();
	}
}
