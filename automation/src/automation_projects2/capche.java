package automation_projects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText());
		String x = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText();
		/*int A = (int) (x.charAt(0));
		System.out.println(A);
		int B = (int) (x.charAt(4));
		System.out.println(B);
		char C = x.charAt(1);
		System.out.println(C);
		int res;
		 if(C == '+') {
			 res = A + B ;
		 }else if(C == '-') {
			 res = A - B ;
		 }else if(C == '/') {
			 res = A / B ;
		 }else {
			 res = A * B ;
		 }
		 String result = Integer.toString(res);
		
		driver.findElement(By.xpath("//*[@id=\"pdiv\"]/table/tbody/tr[2]/input"));*/
		System.out.println(driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).getText());
		//driver.quit();

	}

}
