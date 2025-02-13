package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_and_drag_window_position {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		Point p = new Point(500,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(5600);
		System.out.println("successful");
		driver.quit();
	}
}
