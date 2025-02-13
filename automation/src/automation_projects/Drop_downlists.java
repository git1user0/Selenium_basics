package automation_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_downlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdown=driver.findElement(By.xpath("xpath of all dropdown"));
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Books"); //SUCCESSFULLY EXECUTED
		select.selectByValue("mobile-apps");

	}

}


