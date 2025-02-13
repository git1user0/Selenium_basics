package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dimension_of_buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement se = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		try {
			Dimension d = se.getSize();
			int height = d.getHeight();
			int width = d.getWidth();
			System.out.println("the height and width of the Login button is "+height+"||"+width);
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
