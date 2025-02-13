package automation_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_pay_merchants_position {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement Merchants= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Amazon Pay on Merchants")));
		Point location = Merchants.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView",Merchants);
		Thread.sleep(2000);
		Merchants.click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
