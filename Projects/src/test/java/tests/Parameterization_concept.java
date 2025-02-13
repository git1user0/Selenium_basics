package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization_concept {
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void script_test(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			System.out.println("in fox");
			driver.get("https://www.amazon.in");
			driver.quit();
		}else if(browser.equalsIgnoreCase("google")) {
			driver=new ChromeDriver();
			System.out.println("in google");
			driver.get("https://www.amazon.in");
			driver.quit();
		}else if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("in google");
			driver.get("https://www.amazon.in");
			driver.quit();	
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("in edge");
			driver.get("https://www.amazon.in");
			driver.quit();
		}else {
			System.out.println("safari");
			
		}
		
	}

}
