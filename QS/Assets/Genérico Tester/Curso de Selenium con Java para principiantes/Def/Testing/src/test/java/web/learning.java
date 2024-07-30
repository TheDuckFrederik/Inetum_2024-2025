import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open the DemoQA website
            driver.get("https://demoqa.com/");

            // Find the "Elements" section and click on it
            WebElement elementsSection = driver.findElement(By.xpath("//h5[text()='Elements']"));
            elementsSection.click();

            // Add more actions here as needed

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
