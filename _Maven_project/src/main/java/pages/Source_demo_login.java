package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Source_demo_login {
	//Source_demo_login
	
	public WebDriver driver;
	public Source_demo_login(WebDriver driver) {   //NOTE THIS IS A CONSTRUCTOR OF THE CLASS
		this.driver = driver;
	}
	
	//repository foe elements for login (by class is used to store all the elements)
	By Username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.xpath("//input[@id='login-button']");
	By text_field = By.xpath("//img[@class='footer_robot']");
	By logout_Button = By.xpath("//button[text()='Open Menu']");
	By logout_Button1 = By.xpath("//a[text()='Logout']");
	public void enterURL() throws InterruptedException {
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(2000);
	}
	public void enter_Username(String UN) throws InterruptedException {
		driver.findElement(Username).sendKeys(UN);;
		Thread.sleep(2000);
	}
	public void enter_password(String PA) throws InterruptedException {
		driver.findElement(password).sendKeys(PA);;
		Thread.sleep(2000);
	}
	public void enter_by() throws InterruptedException {
		driver.findElement(loginButton).click();
		Thread.sleep(3000);
	}
	/*public void Visible_on_link() throws InterruptedException {
		File temp = driver.findElement(text_field).getScreenshotAs(OutputType.FILE);
	
		File dest = new File(System.getProperty("user.dir")+"\\_Maven_project\\screenshot\\robot.png");
		
		temp.renameTo(dest);
		
		System.out.println("successfully saved");
		
		Thread.sleep(2000);
	}*/
	
	public void enter_logout() throws InterruptedException {
		driver.findElement(logout_Button).click();
		Thread.sleep(2000);
		driver.findElement(logout_Button1).click();
		Thread.sleep(3000);
	}
	

}
