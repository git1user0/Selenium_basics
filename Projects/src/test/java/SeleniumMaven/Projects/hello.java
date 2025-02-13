package SeleniumMaven.Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("wopviskln");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("wopviskln");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.print("i'm good");
	}

}
