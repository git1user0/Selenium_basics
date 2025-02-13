package automation_projects2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables2_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_state_and_union_territory_capitals_in_India");
		WebElement block = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody")); 
		List<WebElement> rowNum= block.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr"));
		System.out.println("total rows are "+rowNum.size());
		List<WebElement> colNum= block.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr/td"));
		System.out.println("total columns are "+colNum.size());
		
		/*for(int rows = 1; rows<=rowNum.size(); rows++) {
			for(int cols = 1; cols<=colNum.size(); cols++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"|");
			}
			System.out.println();
		}*/
		int i = 1,j = 1;
		while(i<= rowNum.size()) {
			while(j<=colNum.size()) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr["+i+"]/td["+j+"]")).getText()+"|");	
				j++;
			}
			System.out.println();
			i++;
		}
		driver.quit();
	}

}
