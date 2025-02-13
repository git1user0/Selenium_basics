package assignments_11th_dec;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_down_up_MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        
         driver.get("https://www.amazon.in/");
         WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")));
         searchBox.sendKeys("Mobiles");
         WebElement searchButton = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
         searchButton.click();
         
         Actions act = new Actions(driver);
         
         for(int i=1;i<=5;i++){
        	 act.sendKeys(Keys.PAGE_DOWN).perform();
        	 Thread.sleep(1000);
         }
         for(int i=1;i<=6;i++){
        	 act.sendKeys(Keys.PAGE_UP).perform();
        	 Thread.sleep(1000);
         }

         driver.quit();

	}

}
