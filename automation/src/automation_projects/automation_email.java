package automation_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_email {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeZLP98rm_soe7_d1F9Bb6ybFZshj8fHkVNLBhow7IgnVeCpt2hIx3GGo-pQx7CTOZ2dbZNX84DiYw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1194274745%3A1736231327812341&ddm=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")); 
		username.sendKeys("bharathmahalingam14@gmail.com"+ Keys.RETURN);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		username.sendKeys("eng18me0010@gmail.com"+ Keys.RETURN);
	
		driver.quit();

	}

}



