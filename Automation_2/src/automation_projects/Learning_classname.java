package automation_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_classname {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //WebDriver is the interface
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		System.out.println("printing mobile brands on flipkart mobiles page");
	    List<WebElement> brands = driver.findElements(By.cssSelector("container[div='nth-child(1)'][table='nth-child(5)'][tbody='tr']"));
		for (WebElement w :brands) {
			System.out.println(w);
		}
		/*System.out.println("printing mobile size ranges on flipkart mobiles page");
		List<WebElement> size_range = driver.findElements(By.cssSelector(""));
		for (int i = 0; i<size_range.size();i++) {
			System.out.println(driver.findElement(By.cssSelector("")).getText());
		}
		System.out.println("printing mobile RAM_size ranges preaent on flipkart mobiles page");
		List<WebElement> RAM_size = driver.findElements(By.cssSelector(""));
		for (int i = 0; i<RAM_size.size();i++) {
			System.out.println(driver.findElement(By.cssSelector("")).getText());
		}
		System.out.println("printing apple_mobile models on flipkart mobiles page");
		List<WebElement> apple_mobile = driver.findElements(By.cssSelector(""));
		for (int i = 0; i<apple_mobile.size();i++) {
			System.out.println(driver.findElement(By.cssSelector("")).getText());
		}*/
		
	}

}
