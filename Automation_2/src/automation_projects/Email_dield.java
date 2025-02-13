package automation_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_dield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&p%5B%5D=facets.brand%255B%255D%3D0-DEGREE");
		dr.findElement(By.xpath("//section[5]/div[2]/div[2]/span")).click();
		Thread.sleep(2000);
		List<WebElement> block = dr.findElements(By.className("lx8H6m"));
		System.out.println(block.size());
		Thread.sleep(3000);
		/*for(int i = 0; i < block.size(); i++) {
			 block.get(i).click();
			    //System.out.println(block.get(i).getText());
			//System.out.println(we.getText());
		}
		*/
		dr.quit();
		

	}

}
