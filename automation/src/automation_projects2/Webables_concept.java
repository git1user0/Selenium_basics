package automation_projects2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webables_concept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_state_and_union_territory_capitals_in_India");
		/*WebElement block = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody"));
		
		//List<WebElement> rowNum= driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[2]"));*/
		List<WebElement> rowNum= driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody"));
		System.out.println(rowNum.size());
		/*for (int i=0;i<rowNum.size();i++) { 
			driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr["+i+"]")); this was wrong thing that 
			should not be used
			WebElement row = rowNum.get(i);
            System.out.println("Row " + (i + 1) + ": " + row.getText());  // Print the row's text
			}
		List<WebElement> colNum= block.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[2]/td"));
		System.out.println(colNum.size());
		for (WebElement element1 : colNum) { 
			System.out.println(element1.getText()); 
			
			}*/
		 for (int i = 0; i < rowNum.size(); i++) {
	            WebElement row = rowNum.get(i);  // Get the row element
	            List<WebElement> columns = row.findElements(By.tagName("td"));  // Get all <td> elements (columns) in the row
	            
	            System.out.println("Row " + (i + 1) + ": ");
	            
	            // Iterate through each column in the current row and print its text
	            for (WebElement column : columns) {
	                System.out.print(column.getText() + " | ");  // Print the column text
	            }
	            System.out.println();  // Move to the next line after printing all columns in the current row
	        }
		 System.out.println();

		driver.quit();
	}
}
