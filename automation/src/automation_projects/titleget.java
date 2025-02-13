package automation_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleget {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://elearning.excelr.com/dashboard");
        String title = driver.getTitle();
        System.out.println(title.length());
        driver.close();
	}

}
