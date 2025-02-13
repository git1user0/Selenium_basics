package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Explicit_waits2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("*********");
        WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='_97vu img']")));
		wait.until(ExpectedConditions.visibilityOf(logo));  //waits until element is visible

		driver.quit();

	}

}
