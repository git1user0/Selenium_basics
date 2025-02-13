package automation_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block_code_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
		        driver.get("https://www.google.co.in/");
		        
		        WebElement block = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]"));
		        
		        List<WebElement> links = block.findElements(By.tagName("a"));
				
				System.out.println("total links are"+links.size());

		        driver.quit();
	}
		
}
