package automation_projects2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_concepts_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));
		name.sendKeys("wrong_wrong_person_marco");
		Thread.sleep(2000);
		WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pass.sendKeys("harold_das");
		Thread.sleep(2000);
		WebElement log = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submitButton']")));
		Thread.sleep(2000);
		log.click();
		
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
