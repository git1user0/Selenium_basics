package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Att_facebook_language {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		List<WebElement> list_ = driver.findElements(By.xpath("//*[@id=\"pageFooter\"]/ul"));
		for(int i=0; i<list_.size();i++) {
			System.out.println(list_.get(i).getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
