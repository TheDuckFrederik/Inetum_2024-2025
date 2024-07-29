//
//package tst;
import org.openqa.selenium.By;
//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class selenium_test {
        public static void main(String[] args) {
            //
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //
            try {
                driver.get("https://www.lttstore.com");
                //
                Thread.sleep(5000);
                //
                driver.findElement(By.xpath("//*[@id=\"cart-icon-bubble\"]")).click();
                //
                String title = driver.getTitle();
                //
                System.out.println(title);
            }catch(Exception e) {
                e.printStackTrace();
            }finally {
                driver.quit();
            }
        }
}
//
