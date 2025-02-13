package automation_projects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Elemente_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement block = driver.findElement(By.cssSelector("div.RNNXgb"));
		File screenshot = block.getScreenshotAs(OutputType.FILE);
		File destination = new File("searchbar_screenshot.png");
		Files.copy(screenshot, destination);
		System.out.println("Screenshot saved successfully!");
        
	}

}
