package automation_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements_CheckBoxes {
	
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		driver.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo");
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div[2]/span")).click();
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div/div[1]"));
		List<WebElement> checkboxes = driver.findElements(By.name("1x8H6m"));
		System.out.println("total check boxes : " + checkboxes.size());
		System.out.println(checkboxes);
		
		for (int i=2;i<checkboxes.size();i++) {
			driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div/div[1]/div[2]/div["+i+"]/div/div/label/div[1]")).click();
		}
	}

}
