package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iphone_price_4th_inlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("iphone 16 pro max");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		Thread.sleep(10000);
		String h = driver.findElement(By.xpath("(//div[@data-asin='B0DGHYDZR9'])[2]//span//div[@class='a-row a-size-base a-color-base']//a//span/span[2]/span[2]")).getText();
		System.out.println("this is the price of iphone as of today " + h + " rupees in india");
		driver.quit();

	}

}
