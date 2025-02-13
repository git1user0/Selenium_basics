package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class Dimensions_2_facebook_login {
//just moving the window web page to another position 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement se = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		try {
			Dimension d = new Dimension(800,500);
			driver.manage().window().setSize(d);
			Point p = new Point(600,200);
			driver.manage().window().setPosition(p);
			Thread.sleep(10000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
