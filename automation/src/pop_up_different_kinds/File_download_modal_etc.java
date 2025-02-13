package pop_up_different_kinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class File_download_modal_etc {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Open Modal'])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='closeModal']"))).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Multiple Modal']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='multiModalButton']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Open Modal'])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='close'])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='close'])[2]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[text()='Popups']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/ui/download']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='writeArea']")))
				.sendKeys("Hello_world");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='fileArea']")))
				.sendKeys("New_folder_.txt");
		WebElement button = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Download']")));
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		Thread.sleep(2000);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		rbt.keyRelease(KeyEvent.VK_RIGHT);
		for (int i = 1; i <= 3; i++) {
			rbt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rbt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		for (int i = 1; i <= 2; i++) {
			rbt.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			rbt.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			rbt.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(2000);
			rbt.keyRelease(KeyEvent.VK_LEFT);
			Thread.sleep(2000);

			rbt.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			rbt.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}

		String name = "admin";
		for (char c : name.toCharArray()) {
			rbt.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			rbt.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(100);
		}

		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.quit();

		

	}

}
