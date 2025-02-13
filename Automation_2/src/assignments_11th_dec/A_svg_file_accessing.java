package assignments_11th_dec;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_svg_file_accessing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable?Scenario=1&scenario=1");
		System.out.println("Navigated to the page");
		Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("//th[contains(text(),'Samsung Galaxy')]/../td[4]"));  // the prices are changing dynamically
		if (driver.findElement(By.xpath("//th[contains(text(),'Samsung ')]/../td[5]/section/a/*[local-name()='svg']")).isDisplayed()) {
			System.out.println("delete icon is present");
		}else {
			System.out.println("no such");
		}
		System.out.println("this is the price of samsung galaxy s25 as of today " + h.getText() + "$ in USA");
		
		if (driver.findElement(By.xpath("//th[contains(text(),'Samsung ')]/../td[5]/div/*[local-name()='svg']")).isDisplayed()) {
			System.out.println("edit icon is present");
		}else {
			System.out.println("no such");
		}
		driver.quit();

	}

}
