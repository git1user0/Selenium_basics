package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Circle_MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(1000);
		System.out.println("focus on the circle");
		Thread.sleep(10000);
		WebElement circle = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		act.clickAndHold(circle).perform();
		Thread.sleep(5000);
		// act.contextClick(circle).perform();
		// Thread.sleep(5000);

		driver.findElement(By.xpath("(//li/section)[15]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']//div[8]/ul/li[2]/a[contains(@href,'/ui/mouseHover')]")).click();
		Thread.sleep(10000);
		System.out.println("navigated to the text page ??  this is for you !!! ");
		Thread.sleep(10000);
        driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("t2PassWordisPASS");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@class,'ml-72')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@class,'ml-3')]")).click();
        Thread.sleep(2000);
		System.out.println("done");
		Thread.sleep(1000);
		driver.quit();
	}

}
