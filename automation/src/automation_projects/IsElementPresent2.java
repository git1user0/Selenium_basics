package automation_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent2 {
	public static WebDriver driver = new ChromeDriver();;
	public static boolean isElementPresent(String locator) {
		/*try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch(Throwable t) {
			return false;
		}*/
		int size = driver.findElements(By.xpath(locator)).size();
		if(size == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://www.google.co.in/");
		
		System.out.println(isElementPresent("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));

}
}

	

