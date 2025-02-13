package projects_cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginfeaturefile {
	// Pre-condition - Given
		// Actions - When
		// Validations - Then
		public WebDriver driver;
	@Given("the user is on OrangeHrm Login Page") //pre-condition
	public void the_user_is_on_orange_hrm_login_page() throws InterruptedException {
	    
		// implement the method with selenium java test script

				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user enters valid credentials \\(username:{string} , password:{string});")
	public void the_user_enters_valid_credentials_username_password(String usn, String pass) throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(usn);
		Thread.sleep(2000); // Enter password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	}

	@When("the user clicks on login Button")
	public void the_user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("the User should redirected to the HomePage")
	public void the_user_should_redirected_to_the_home_page() throws InterruptedException 
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(4000);
		String excepted_URl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(excepted_URl, currentUrl);
		
		driver.quit();
	}
}
