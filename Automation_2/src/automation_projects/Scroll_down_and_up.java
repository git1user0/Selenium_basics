package automation_projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_down_and_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<97;i++) {
			js.executeScript("window.scrollBy(0,500)");
			
		}
		for(int i=0;i<98;i++) {
			js.executeScript("window.scrollBy(0,-500)");
			
		}
		Thread.sleep(2000);
		
		driver.quit();

	}

}
