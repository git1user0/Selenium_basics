package automation_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class finding_xpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //WebDriver is the interface
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		/*Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("bharath31m45@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bharath31m45@gmail.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.className("_6ltg")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shakesphere@shakeabulla.com");
		driver.close();*/
		driver.findElement(By.cssSelector("a[id*= 'u_0_0_']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("shakesphere@shakeabulla.com");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("shakesphere@shakeabulla.com");
		driver.findElement(By.cssSelector("select[name='birthday_day']")).sendKeys("1");
		driver.findElement(By.cssSelector("select[name='birthday_month']")).sendKeys("1");
		driver.findElement(By.cssSelector("select[name='birthday_year']")).sendKeys("2001");
		driver.findElement(By.cssSelector("input[name='sex'][value='2']")).click();
		driver.findElement(By.cssSelector("input[name*='reg_email']")).sendKeys("shakesphere@shakeabulla.com");
		driver.findElement(By.cssSelector("input[name*='reg_pass']")).sendKeys("shakesphere@shakeabulla.com");
		driver.findElement(By.cssSelector("button[id*='u_0_n']")).click();
		System.out.println("successfully done");
		System.out.println("successfully  learnt about css selectors on facebook page");
	}

}
