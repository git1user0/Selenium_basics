package pop_up_different_kinds;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='buttonAlert1']"))).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("no");
		String txt = alert.getText();
		alert.accept();
		System.out.println(txt);
		System.out.println(driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
