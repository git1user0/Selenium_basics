package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Source_demo_login;

public class SourcedemoLoginTestCase {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Source_demo_login sc = new Source_demo_login(driver);
		sc.enterURL();
		sc.enter_Username("standard_user");
		sc.enter_password("secret_sauce");
		sc.enter_by();
		Thread.sleep(2000);
		//sc.Visible_on_link();
		Thread.sleep(2000);
		sc.enter_logout();
		driver.quit();
		
	}

}
