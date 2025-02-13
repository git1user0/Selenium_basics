package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tets {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://admin:admin@demoapps.qspiders.com/ui/auth?sublist=0");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@DataProvider(name = "login_data")
	public Object[][] getData() {
		return new Object[][] { { "admin", "password" }, { "", "  " }, { "", "admin" },
				{ "admin", " " }, { "admin", "admin" } };
	}

	@Test(dataProvider = "login_data", invocationCount = 1)
	public void login(String username, String password) throws InterruptedException, AWTException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();

		for (char c : username.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(100);
		}

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		for (char c : password.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(100);
		}

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		if ((driver.findElement(By.linkText("Basic Auth"))).isDisplayed()) {
			System.out.print(driver.findElement(By.xpath("//p")).getText());
		}
	}

	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
