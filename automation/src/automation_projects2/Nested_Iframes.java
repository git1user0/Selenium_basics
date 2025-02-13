package automation_projects2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nested_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Multiple iframe']"))).click();
		Thread.sleep(3000);
		WebElement frame1 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//iframe[@class='w-full h-96'])[1]"))));
		driver.switchTo().frame(frame1);
		
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		name.click();
		name.sendKeys("wrong_wrong_person_marco");
		Thread.sleep(2000);
		WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pass.click();
		pass.sendKeys("harold_das");
		Thread.sleep(2000);
		WebElement _pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='confirm-password']")));
		_pass.click();
		_pass.sendKeys("harold_das");
		Thread.sleep(2000);
		WebElement log = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submitButton']")));
		Thread.sleep(2000);
		log.click();
		
		driver.switchTo().defaultContent();
        WebElement frame2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//iframe[@class='w-full h-96'])[2]")));
		driver.switchTo().frame(frame2);

		WebElement name_ = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));
		name_.sendKeys("wrong_wrong_person_marco");
		Thread.sleep(2000);
		WebElement pass1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pass1.sendKeys("harold_das");
		Thread.sleep(2000);
		WebElement log1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submitButton']")));
		Thread.sleep(2000);
		log1.click();
		System.out.println("Nested__loops__concept understood ?????");
		System.out.println(" ");
		
		driver.switchTo().defaultContent();
		if(
		driver.findElement(By.xpath("//span[text()='Write a script to handle frames in web page?']")).isDisplayed()) {
			System.out.println("YOU_MOVED_TO_MAIN_FRAME");
			System.out.println(" ");
		};
		System.out.println("FURTHER_DO_YOU_HAVE_ANY_QUESTIONS_LIKE_");
		System.out.println(" ");
		List<WebElement> questions = driver.findElements(By.xpath("//main[contains(@class,'relative top-1')]"));
		for(int i=0; i<questions.size();i++) {
			System.out.println(questions.get(i).getText());
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("ARE_YOU_READY_TO_LEARN_NEW_CONCEPT ");
		System.out.println(" ");
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='pt-2 pe-1']"));
		for (WebElement list : lists) {
		    List<WebElement> concepts = list.findElements(By.xpath(".//li")); 
		    for (WebElement concept : concepts) {
		        System.out.println(concept.getText());
		        System.out.println(" ");
		    }
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
