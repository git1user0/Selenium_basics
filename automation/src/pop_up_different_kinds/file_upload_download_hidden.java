package pop_up_different_kinds;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class file_upload_download_hidden {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Month currentMonth = now.getMonth();
        int currentMonthValue = now.getMonthValue();
        int currentYear = now.getYear();
        String monthYear = currentMonth.toString() + currentYear;

        Scanner scanner = new Scanner(System.in);
        System.out.println("The current month is " + currentMonth);
        System.out.println("Enter the month you want to travel for (1 to 12):");
        int travelMonth = scanner.nextInt();
        scanner.close();

        if (travelMonth < 1 || travelMonth > 12) {
            System.out.println("Please enter a valid number within 1 to 12.");
            return;
        }

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='Layer_1']")));
        WebElement displayedMonth = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("div[style$='0.875rem;']")));

        if (travelMonth == currentMonthValue && displayedMonth.getText().contains(monthYear)) {
            WebElement holidays = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("div[class='holiday_count']")));
            System.out.println("The number of holidays in " + displayedMonth.getText() + " is " + holidays.getText());
        } else {
            int diff = travelMonth - currentMonthValue;
            for (int i = 0; i <= diff; i++) {
                arrow.click();
            }
            System.out.println("Please select the day.");
            WebElement holidays = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("div[class='holiday_count']")));
            System.out.println("The number of holidays in " + displayedMonth.getText() + " is " + holidays.getText());
        }
        driver.quit();
    }
}
