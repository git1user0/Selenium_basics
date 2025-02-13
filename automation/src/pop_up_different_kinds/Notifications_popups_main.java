package pop_up_different_kinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notifications_popups_main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications","--start-maximized");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		/*
		 * FirefoxOptions options = new FirefoxOptions();
		 * options.setProfile(newFirefoxProfile());
		 * options.addPreference("dom.webnotifications.enabled",false); WebDriver driver
		 * = new FirefoxDriver(options);
		 */

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[text()='Popups']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[text()='Notifications']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Notification']"))).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
