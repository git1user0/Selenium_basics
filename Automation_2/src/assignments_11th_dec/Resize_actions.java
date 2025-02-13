package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.clickAndHold(resize).moveByOffset(100, 100).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
