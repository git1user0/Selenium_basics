package automation_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rows_columns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/BHARATH/OneDrive/Desktop/Untitled-2.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement block = driver.findElement(By.xpath("/html/body/table"));
		System.out.println("total rows"+block.getSize());
		
		List<WebElement> rowNum = block.findElements(By.xpath("/html/body/table/tbody"));
		
		System.out.println("total rows"+rowNum.size());
		
		List<WebElement> colNum = block.findElements(By.xpath("/html/body/table/thead"));
		
		System.out.println("total rows"+colNum.size());

	
	}

}
