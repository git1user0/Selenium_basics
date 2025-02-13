package assignments_11th_dec;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(6000);
	
		driver.findElement(By.cssSelector("svg[aria-label='Search']")).click();

		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("hemsqalearnings");
		
		driver.findElement(By.cssSelector("div[class*='x1cy8zhl x1oa3qoh ']")).click();
	
		driver.findElement(By.cssSelector("div[class$='x5n08af xsz8vos']")).click();
	
		driver.findElement(By.cssSelector("p[class^='xat24cr']")).sendKeys("HELLO  HEMANTH SIR I'M YOUR SELENIUM CLASS STUDENT FROM TODAY || YOUR TEACHINGS ARE GREAT REALLY {THIS IS A AUTOMATED MESSAGE THROUGH SELENIUM JAVA }");
		
		driver.findElement(By.cssSelector("div[class*=' xfs2ol5']")).click();
		
		driver.quit();
		
	}

}   //.xpath("(//*[contains(text(),'Search')])[1]"
