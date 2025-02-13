package automation_projects2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		for(int i=1;i<=5;i++)
		{
			a.sendKeys(Keys.DOWN).perform();
		}
		
		/*accept()
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();//ok
		
		//dismiss()
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();//cancel
		*/
		
		//sendKeys()
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(4000);
		alert3.sendKeys("Hello everyone");
		Thread.sleep(4000);
		
		//getText()
		String text = alert3.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.quit();
	}

}
