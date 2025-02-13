package pop_up_different_kinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app");

		// Wait for popup (Give 2-3 seconds to appear)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// Use Robot class to enter credentials
		Robot robot = new Robot();

		// Enter username "admin"
		String username = "admin";
		for (char c : username.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(100);
		}

		// Press TAB to switch to Password field
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		// Enter password "admin"
		String password = "admin";
		for (char c : password.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(100);
		}

		// Press ENTER to submit
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Logged in successfully!");

		System.out.println((driver.findElement(By.xpath("//p"))).getText());

	}
}
