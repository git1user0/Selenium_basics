package automation_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_boxes {
	public static WebDriver driver = new ChromeDriver();
	public static boolean isElementPresent(By by) {
		int size = driver.findElements(by).size();
		if(size == 0) {
			return false;
		}else {
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo");
		
		for(int i=3;i<6;i++) {
			driver.findElement(By.xpath("//*[@id=\""+i+"star\"]")).click();	
		}
		
		int i = 1,count=0;
		while(isElementPresent(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div/div[1]/div[2]/div[2]/div/div/label/div["+i+"]"))) {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div/div[1]/div[2]/div[2]/div/div/label/div["+i+"]")).click();
			i++;
			count++;
		}
		System.out.println("total check boxes are:  "+ count);
		
		
		System.out.println(isElementPresent(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/div/section[5]/div[2]/div/div[1]/div[2]/div[2]/div/div/label/div[1]")));
	}

}
