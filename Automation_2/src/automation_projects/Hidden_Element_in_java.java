package automation_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hidden_Element_in_java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under");
		Thread.sleep(2000);
		WebElement under10k = driver.findElement(By.cssSelector("a[href*='10000']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",under10k);
		Thread.sleep(2000);
		WebElement mini = driver.findElement(By.xpath("//*[@class='iToJ4v Kaqq1s']"));
		Actions act = new Actions(driver);
		act.click(mini).build().perform();
		Thread.sleep(2000);
		act.moveByOffset(20, 0).build().perform();
		driver.quit();

	}

}
