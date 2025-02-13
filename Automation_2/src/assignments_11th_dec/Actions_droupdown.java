package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_droupdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        WebElement Electronics_tab = driver.findElement(By.xpath("//span[text()='Electronics']"));
        Actions act = new Actions(driver);
        act.moveToElement(Electronics_tab).click().perform();
        Thread.sleep(5000);
        WebElement Gaming = driver.findElement(By.xpath("(//a[contains(text(),'Gaming')])[2]"));
        act.moveToElement(Gaming).click().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
        Thread.sleep(2000);
        WebElement Electronics_tab1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
        act.moveToElement(Electronics_tab1).click().perform();
        Thread.sleep(2000);
        WebElement lapt = driver.findElement(By.xpath("//a[contains(text(),'Laptop and Desktop')]"));
        act.moveToElement(lapt).click().perform();
        Thread.sleep(5000);
        System.out.println("successfully done");
        driver.quit();
	}

}
