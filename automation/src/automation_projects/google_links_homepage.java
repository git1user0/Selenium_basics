package automation_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class google_links_homepage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//select.selectByVisibleText("Books"); //successfully changed to books
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("total links are"+links.size());
		
		System.out.println("__________printing links_________");
		
		for(WebElement link: links) {
			System.out.println(link.getText()+"___url____"+link.getAttribute("href"));
		}
		
	}

}
