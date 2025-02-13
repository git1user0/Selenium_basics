package pop_up_different_kinds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class new_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[text()='Popups']"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/ui/hidden']"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[1]"))).sendKeys("HELLO");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='email'])[1]"))).sendKeys("HYDRID@gmailYahoo.com");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[contains(@class,'w-[97%] m-2 px-4 h-10')]"))).sendKeys("Mobile");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[contains(@class,'w-[97%] m-2')]"))).sendKeys("1.) Using TestNG, We can execute mulitple script at one shot.\r\n"
				+ "2.) Using TestNg, We can achieve cross Browser Testing\" Or Parallel Execution\".\r\n"
				+ "3.) Using TestNg, We can Perform Verification.\r\n"
				+ "4.) We can generate \"Test Execution Report\" using TestNG\r\n"
				+ "5.) Drawback of J-unit : we cannot generate Test Execution report.\r\n"
				+ "6.) We cannot Perform Cross browser Testing/ parallel Execution.\r\n"
				+ "");
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		driver.quit();
	}

}
