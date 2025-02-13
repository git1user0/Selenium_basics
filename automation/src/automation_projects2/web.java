package automation_projects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        // Navigate to the target URL
        driver.get("https://timesofindia.indiatimes.com/poll.cms");

        try {
            // Get the CAPTCHA question
            WebElement captchaElement = driver.findElement(By.xpath("//*[@id=\"mathq2\"]"));
            String captchaQuestion = captchaElement.getText();
            System.out.println("CAPTCHA Question: " + captchaQuestion);

            // Parse and solve the CAPTCHA
            int result = solveCaptcha(captchaQuestion);

            // Enter the result into the input field
            WebElement captchaInputField = driver.findElement(By.id("mathuserans2"));
            captchaInputField.sendKeys(String.valueOf(result));

            // (Optional) Submit the form
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"pdiv\"]/table/tbody/tr[2]/input"));
            submitButton.click();

            System.out.println("CAPTCHA solved and submitted successfully!");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to solve the CAPTCHA
    private static int solveCaptcha(String captchaQuestion) {
        // Split the question into parts (e.g., "12 + 8")
        String[] parts = captchaQuestion.split(" ");

        // Parse numbers and operator
        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
