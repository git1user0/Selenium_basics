package assignments_11th_dec;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxes_click {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/BHARATH/OneDrive/Desktop/states.html");

        // Find all checkboxes using a more specific XPath
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        // Click all checkboxes to select them
        for (WebElement checkbox : checkBoxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
        System.out.println("All checkboxes selected");
        Thread.sleep(1000);

        // Click all checkboxes to deselect them
        for (WebElement checkbox : checkBoxes) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }
        System.out.println("All checkboxes deselected");
        Thread.sleep(2000);

        // Select and deselect the last checkbox
        WebElement lastCheckbox = checkBoxes.get(checkBoxes.size() - 1);
        lastCheckbox.click();
        
        Thread.sleep(1000);
        lastCheckbox.click();
       
        Thread.sleep(2000);

        // Select and deselect even checkboxes
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (i % 2 == 0) {
            	checkBoxes.get(i).click();             
            }
        }
        Thread.sleep(2000);
        
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (i % 2 == 0) {
            	checkBoxes.get(i).click();             
            }
        }
        Thread.sleep(2000);

        // Select and deselect odd checkboxes
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (i % 2 != 0) {
                checkBoxes.get(i).click();
            }
        }
        Thread.sleep(2000);
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (i % 2 != 0) {
                checkBoxes.get(i).click();
            }
        }
        Thread.sleep(2000);

        driver.quit();
    }
}
