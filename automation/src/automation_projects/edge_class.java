package automation_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new EdgeDriver();
        driver.get("https://elearning.excelr.com/dashboard");
        driver.manage().window().maximize();
        driver.quit();

	}

}

		



