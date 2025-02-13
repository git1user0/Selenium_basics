package automation_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_learners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdown=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Books"); //successfully changed to books
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("total links are"+links.size());
		
		System.out.println("__________printing links_________");
		
		for(WebElement link: links) {
			System.out.println(link.getText()+"___url____"+link.getAttribute("href"));
		}


	}

}
