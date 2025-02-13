package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Getting_All_Links {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println("TOTALLY THERE ARE "+elements.size()+" NUMBER OF LINKS PRESENT IN THIS PAGE");
		Thread.sleep(3000);
		for(WebElement ne : elements) {
			System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println("");
			System.out.println("[ "+ne.getAttribute("href")+" ]");
			Thread.sleep(0500);
		}
		Thread.sleep(1000);
		System.out.println("SUCCESSFULLY PRINTED");
		driver.quit();
	}

}
