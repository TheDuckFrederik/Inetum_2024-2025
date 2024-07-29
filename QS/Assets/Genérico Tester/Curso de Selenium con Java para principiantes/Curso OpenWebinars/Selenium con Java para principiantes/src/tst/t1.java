//
package tst;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class t1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\unai.ovejero.ext\\Obsidian\\QS\\Assets\\Genérico Tester\\Curso de Selenium con Java para principiantes\\Selenium con Java para principiantes\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //
        try {
            driver.get("https://www.lttstore.com");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"cart-icon-bubble\"]")).click();
            String title = driver.getTitle();
            System.out.println(title);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

