package excel_working;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeC_screenShot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source_file = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File target_file = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		source_file.renameTo(target_file);
		
		driver.quit();
	    			
	}

}
