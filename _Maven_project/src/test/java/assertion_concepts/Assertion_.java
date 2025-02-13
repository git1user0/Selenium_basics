package assertion_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_ {
	@Test
	public void hardAssert() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		SoftAssert sf = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("admin321");
		
		String expected = "admin123";
		String actual = "admin321";
		//Assert.assertEquals(actual,expected,"PASSWORD DOES NOT MATCH"); hard assert  but softAssert package is not imported
		sf.assertEquals(actual,expected,"PASSWORD DOES NOT MATCH");
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(3000);
		WebElement invalid = driver.findElement(By.xpath("//p[contains(@class,'-text oxd-text--p oxd')]"));
		String actual_message = invalid.getText();
		System.out.println(actual_message);
		driver.quit();
	}

}
