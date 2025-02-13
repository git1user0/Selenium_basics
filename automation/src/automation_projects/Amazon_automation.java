package automation_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdown=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Books"); //successfully changed to books
		List<WebElement>values = driver.findElements(By.tagName("option"));
		
		System.out.println(values.size());
		
		System.out.println(values.get(12).getText());
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getAttribute("value"));
		}

	}

}
/* 44
Clothing & Accessories
search-alias=a p s
search-alias=alexa-skills
search-alias=amazon-devices
search-alias=fashion
search-alias=amazon-pharmacy
search-alias=appliances
search-alias=mobile-apps
search-alias=audible
search-alias=baby
search-alias=beauty
search-alias=strip books
search-alias=automotive
search-alias=apparel
search-alias=collect i b l e s
search-alias=computers
search-alias=todays-deals
search-alias=electronics
search-alias=furniture
search-alias=lawn garden
search-alias=gift-cards
search-alias=grocery
search-alias=h p c
search-alias=kitchen
search-alias=industrial
search-alias=jewelry
search-alias=digital-text
search-alias=luggage
search-alias=luxury-beauty
search-alias=d v d
search-alias=digital-music
search-alias=popular
search-alias=m i
search-alias=office-products
search-alias=pets
search-alias=instant-video
search-alias=shoes
search-alias=software
search-alias=sporting
search-alias=specialty-aps-sns
search-alias=home-improvement
search-alias=toys
search-alias=under-ten-dollars
search-alias=video games
search-alias=watches
*/