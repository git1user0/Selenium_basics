package pop_up_different_kinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication_popups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@demoapps.qspiders.com/ui/auth?sublist=0");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']")));
		login.click();
		Thread.sleep(2000);
		// Wait for popup (Give 2-3 seconds to appear)
        try { Thread.sleep(3000); } catch (InterruptedException e) {}

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
        
		driver.quit();
	}

}
