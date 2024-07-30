import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent
import java.util.concurrent.TimeUnit;,TimeUnit;

public class CSE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "src/test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.lttstore.com")

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement username = driver.findElement(By,id("username"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.id("loginButton"));
			
			username.sedKeys("username");
			password.sedKeys("password");
			loginButton.click();

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeMessage")));

			WebElement menu = driver.findElement(By.className("data"));
			List<WebElement> menuItems = menu.findElements(By.tagName("li"));

			for (WebElement item : menuItems) {
				item.click();

				Webelement dataElement = driver.findElement(By.className("data"));
				System.out.println("Data: " +dataElement.getText());

				driver.navigate().back();
			}
		}
	}
}
