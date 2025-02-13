package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fronts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);

		WebElement st = driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]"));
			System.out.print(st.getCssValue("front-size"));
			System.out.print("||");
			Thread.sleep(1000);
			System.out.print(st.getCssValue("front-family"));
			System.out.print("||");
			Thread.sleep(1000);
			System.out.print(st.getCssValue("color"));
			System.out.println("");
		Thread.sleep(5000);
		driver.quit();

	}

}
