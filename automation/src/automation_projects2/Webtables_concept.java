package automation_projects2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_state_and_union_territory_capitals_in_India");
		WebElement block = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody"));
		List<WebElement> rowNum= block.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[2]"));
		for (WebElement element : rowNum) { 
			System.out.println(element.getText()); 
			}
		List<WebElement> colNum= block.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[2]/td"));
		System.out.println(colNum.size());
		/*for (WebElement element1 : colNum) { 
			System.out.println(element1.getText()); 
			}*/
		driver.quit();
	}

}
