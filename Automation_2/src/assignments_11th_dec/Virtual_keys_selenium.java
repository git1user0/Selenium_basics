package assignments_11th_dec;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Virtual_keys_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement Email_add = driver.findElement(By.cssSelector("input[class*='inputtext _1kbt']"));
		Thread.sleep(2000);
		Email_add.sendKeys("userNAME",Keys.TAB,"PasswoRD",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(5600);
		System.out.println("successful");
		driver.quit();
	}

}
