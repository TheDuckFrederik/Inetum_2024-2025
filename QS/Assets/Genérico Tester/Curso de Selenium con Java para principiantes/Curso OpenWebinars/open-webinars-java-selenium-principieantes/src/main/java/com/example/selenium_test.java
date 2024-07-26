import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_test {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the LTT Store website
        driver.get("https://www.lttstore.com");
        
        // Optionally, you can add a wait or other actions here
        
        // Close the browser after some time (optional)
        //Thread.sleep(5000); // Wait for 5 seconds
        // driver.quit();
    }
}
