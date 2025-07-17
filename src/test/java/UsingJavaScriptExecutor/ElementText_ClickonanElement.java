package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText_ClickonanElement {

	public static void main(String[] args) throws InterruptedException {

		/// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an APP
		driver.get("file:///C:/Users/sahil/Desktop/page.html");

		// Identify the web element
		WebElement un = driver.findElement(By.id("email"));

		WebElement ps = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.name("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Pass the Text
		js.executeScript("arguments[0].value='selenium'", un);

		// Pass the Password
		js.executeScript("arguments[0].value=arguments[1]", ps, "pass@123");

		// Click on login button
		js.executeScript("arguments[0].click()", login);

		Thread.sleep(3000);

		driver.quit();
	}
}