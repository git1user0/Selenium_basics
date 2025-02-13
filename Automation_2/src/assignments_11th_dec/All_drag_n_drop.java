package assignments_11th_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class All_drag_n_drop {
	public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Open the URL
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Initialize Actions class
        Actions act = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Mapping capital cities to their respective countries
        Map<String, String> capitalToCountry = new HashMap<>();
        capitalToCountry.put("box1", "box101"); // Oslo -> Norway
        capitalToCountry.put("box2", "box102"); // Stockholm -> Sweden
        capitalToCountry.put("box3", "box103"); // Washington -> USA
        capitalToCountry.put("box4", "box104"); // Copenhagen -> Denmark
        capitalToCountry.put("box5", "box105"); // Seoul -> South Korea
        capitalToCountry.put("box6", "box106"); // Rome -> Italy
        capitalToCountry.put("box7", "box107"); // Madrid -> Spain

        // Perform drag and drop for each capital into its correct country
        for (Map.Entry<String, String> entry : capitalToCountry.entrySet()) {
            WebElement capital = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(entry.getKey())));
            WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(entry.getValue())));
            act.dragAndDrop(capital, country).perform();
            Thread.sleep(1000);
        }

        // Close browser
        driver.quit();
    }

}
