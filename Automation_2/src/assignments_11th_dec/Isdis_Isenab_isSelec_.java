package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Isdis_Isenab_isSelec_ {
//isDisplayed(),isSelected(),isEnabled() methods
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
			Thread.sleep(2000);
			if(driver.findElement(By.cssSelector("button[id='btn10']")).isDisplayed()) {
				driver.findElement(By.cssSelector("button[id='btn10']")).click();
				driver.findElement(By.cssSelector("button[id='btn12']")).click();
				driver.findElement(By.cssSelector("button[id='btn17']")).click();
				driver.findElement(By.cssSelector("input[name='submit']")).click();
				driver.findElement(By.cssSelector("button[id='submitButton']")).click();
				Thread.sleep(5000);
				WebElement St = driver.findElement(By.xpath("//span[text()='Write a script to Click On Link Text?']"));
				if(St.isDisplayed()) {
					List<WebElement> links = driver.findElements(By.xpath("//span[text()='Write a script to Click On Link Text?']/../..//a/../../.."));
					for(WebElement ne :links) {
						System.out.println(ne.getText());
					}
				};
				Thread.sleep(10000);
				System.out.println("successfully done");
			}else {
				System.out.println("NO ELEMENT FOUND");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}

}
