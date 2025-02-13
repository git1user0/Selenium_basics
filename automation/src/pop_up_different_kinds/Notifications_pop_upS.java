package pop_up_different_kinds;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notifications_pop_upS {
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");

        System.out.println("_______________1. JavaScript Pop-ups_____________________________________________________________");

        try {
            // Handling JavaScript Alert
            handleAlert(wait, By.id("buttonAlert2"), true);

            // Handling JavaScript Confirm
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Confirm"))).click();
            handleAlert(wait, By.id("buttonAlert5"), false);

            // Handling JavaScript Prompt
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Prompt"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='buttonAlert1']"))).click();
    		Thread.sleep(2000);
    		Alert alert= driver.switchTo().alert();
    		alert.sendKeys("no");
    		String txt = alert.getText();
    		alert.accept();
    		System.out.println(txt);
    		System.out.println(driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText());
    		Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error handling alerts: " + e.getMessage());
        }

        System.out.println("_______________2. Browser Window Pop-ups_____________________________________________________________");

        // Clicking on Browser Windows section
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[contains(@class,'relative flex')])[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Browser Windows"))).click();

        // Handling New Window
        wait.until(ExpectedConditions.elementToBeClickable(By.id("browserLink1"))).click();
        switchToNewWindowAndPerformActions(driver, wait);

        // Handling New Tab
        driver.findElement(By.xpath("//a[text()='New Tab']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open window in new Tab']"))).click();
        switchToNewWindowAndPerformActions(driver, wait);

        // Handling Multiple Windows
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href=\"/ui/browser/multipleWindow?sublist=2\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click to open multiple popup windows']"))).click();
        handleMultipleWindows(driver, wait);

        // Handling Multiple Tabs
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Multiple Tabs"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click to open multiple tabs']"))).click();
        handleMultipleWindows(driver, wait);

        System.out.println("Test Completed Successfully");
        
        System.out.println("_______________3.Authentication Pop-ups_____________________________________________________________");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/ui/auth']")).click();
        Thread.sleep(3000);
        
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']")));
		login.click();
		Thread.sleep(2000);
		
        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        
        Robot robot = new Robot();

        
        String username = "admin";
        for (char c : username.toCharArray()) {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            Thread.sleep(100);
        }
        
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);

       
        String password = "admin";
        for (char c : password.toCharArray()) {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            Thread.sleep(100);
        }
        
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        System.out.println("Logged in successfully!");
        System.out.println((driver.findElement(By.xpath("//p"))).getText());
        driver.quit();
        
        driver = new FirefoxDriver();
        Thread.sleep(5000);
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        System.out.println("_______________4. File Upload Pop-ups_____________________________________________________________");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='File Uploads']")).click();

        String filePath = "C:\\Users\\BHARATH\\OneDrive\\Desktop\\screenshot\\login.png";
        Thread.sleep(3000);
        driver.findElement(By.id("fileInput")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Upload File']")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        Thread.sleep(3000);
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadElement);
        uploadElement.sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Multiple select']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("fileInput")).sendKeys(filePath);
        Thread.sleep(1000);

        driver.quit();
    }

    private static void handleAlert(WebDriverWait wait, By locator, boolean accept) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            if (accept) {
                alert.accept();
            } else {
                alert.dismiss();
            }
        } catch (Exception e) {
            System.out.println("No alert found: " + e.getMessage());
        }
    }

    private static void switchToNewWindowAndPerformActions(WebDriver driver, WebDriverWait wait) throws InterruptedException, AWTException {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window: " + driver.getTitle());

                wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("hello_world");
                wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("hello_world");
                wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-password"))).sendKeys("hello_world");

                Thread.sleep(1000);
                driver.close(); // Close new window
            }
        }
        driver.switchTo().window(parentWindow); // Switch back to main window

    }

    private static void handleMultipleWindows(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                try {
                    if (driver.findElements(By.xpath("//h2[text()='Login']")).size() > 0) {
                        processLoginWindow(driver, wait);
                    } else if (driver.findElements(By.xpath("//h2[text()='Sign Up']")).size() > 0) {
                        processSignUpWindow(driver, wait);
                    } else if (driver.findElements(By.xpath("//h2[text()='Change Password']")).size() > 0) {
                        processChangePasswordWindow(driver, wait);
                    }
                } catch (Exception e) {
                    System.out.println("Error handling window: " + e.getMessage());
                }
                driver.close(); // Close the processed window
            }
        }
        driver.switchTo().window(parentWindow); // Switch back to main window  
    }

    private static void processLoginWindow(WebDriver driver, WebDriverWait wait) {
        System.out.println("Switched to Login window: " + driver.getTitle());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("hello_world");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("hello_world");
    }

    private static void processSignUpWindow(WebDriver driver, WebDriverWait wait) {
        System.out.println("Switched to Sign Up window: " + driver.getTitle());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("hello_world");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("hello_world");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("hello_world");
    }

    private static void processChangePasswordWindow(WebDriver driver, WebDriverWait wait) {
        System.out.println("Switched to Change Password window: " + driver.getTitle());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("hello_world");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("hello_world");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-password"))).sendKeys("hello_world");
    }
}
