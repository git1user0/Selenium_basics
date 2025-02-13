package automation_projects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///C:/Users/BHARATH/OneDrive/Desktop/Untitled-1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		//above.sendKeys("100000");
		
		//WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		//below.sendKeys("hello");
	
		/*WebElement genderElement = driver.findElement(By.id("#password"));
		WebElement targetElement = driver.findElement(RelativeLocator.with(By.partialLinkText("Address")).near(genderElement));
		targetElement.sendKeys("hello");*/
		
		//WebElement rightOf = driver.findElement(RelativeLocator.with(By.xpath("/html/body/form/div[5]/input")).toRightOf(By.tagName("Address")));
		//rightOf.sendKeys("hello");

		

	}

}
