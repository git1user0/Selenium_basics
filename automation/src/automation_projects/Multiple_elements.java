package automation_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Multiple_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///C:/Users/BHARATH/OneDrive/Desktop/Untitled-1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> labels = driver.findElements(RelativeLocator.with(By.tagName("label")).below(By.xpath("/html/body/h2")));
		for(WebElement label: labels) {
			System.out.println(label.getText());
		}
	}

}
