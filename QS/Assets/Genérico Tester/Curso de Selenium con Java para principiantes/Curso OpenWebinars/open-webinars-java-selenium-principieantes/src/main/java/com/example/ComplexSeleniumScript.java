import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ComplexSeleniumScript {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the browser and navigate to the website
            driver.get("https://example.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Perform login
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            username.sendKeys("yourUsername");
            password.sendKeys("yourPassword");
            loginButton.click();

            // Explicit wait for the next page to load
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeMessage")));

            // Navigate through multiple pages
            WebElement menu = driver.findElement(By.id("menu"));
            List<WebElement> menuItems = menu.findElements(By.tagName("li"));

            for (WebElement item : menuItems) {
                item.click();
                // Extract some data
                WebElement dataElement = driver.findElement(By.className("data"));
                System.out.println("Data: " + dataElement.getText());
                // Navigate back to the menu
                driver.navigate().back();
            }

            // Log out
            WebElement logoutButton = driver.findElement(By.id("logoutButton"));
            logoutButton.click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
