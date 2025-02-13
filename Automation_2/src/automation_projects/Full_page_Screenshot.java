package automation_projects;

import java.io.File;  
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// import org.apache.commons.io.FileUtils;

public class Full_page_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement block = driver.findElement(By.cssSelector("div.RNNXgb"));
		File screenshot = block.getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshot, new File("C:\\Users\\BHARATH\\OneDrive\\Desktop\\screenshot\\page1.jpg"));
		System.out.println("Screenshot saved successfully!");

	}

}
