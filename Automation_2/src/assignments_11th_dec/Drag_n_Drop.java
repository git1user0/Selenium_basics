package assignments_11th_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		List<WebElement> e1 = driver.findElements(By.xpath("//*[@id='dropContent']"));
		List<WebElement> e2 = driver.findElements(By.xpath("//*[@id='countries']"));
		WebElement m_1 = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement m_2 = driver.findElement(By.xpath("//*[@id='box101']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(m_1, m_2).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
