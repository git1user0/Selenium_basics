package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEditorCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Handling disabled element in java
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\BHARATH\\Downloads\\disabled_javascript.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement disable = driver.findElement(By.id("text1"));
		js.executeScript("arguments[0].value='GOOD_Morning'", disable);
		Thread.sleep(2000);
        driver.quit();
	}

}
