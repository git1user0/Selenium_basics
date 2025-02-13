package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung_galaxy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		System.out.println("Navigated to the page");
		Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("//th[contains(text(),'SAMSUNG ')]/../td[4]"));
		System.out.println("this is the price of samsung galaxy s25 as of today "+ h.getText()+"$ in USA");
		driver.quit();

	}

}
