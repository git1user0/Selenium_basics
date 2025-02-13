package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Location_of_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver se = new EdgeDriver();
		se.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement nw = se.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		Point l1 = nw.getLocation();
		System.out.println(l1);
		int x = l1.getX();
		int y = l1.getY();
		System.out.println("LOCATION OF (X & Y) "+x+" "+y);
		Thread.sleep(4000);
		se.quit();
	}

}
