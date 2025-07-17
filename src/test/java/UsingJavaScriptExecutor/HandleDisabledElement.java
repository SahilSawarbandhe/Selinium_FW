package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an App
		driver.get("file:///C:/Users/sahil/Desktop/page.html");

		WebElement TF = driver.findElement(By.id("user"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// handle disable text field
		js.executeScript("arguments[0].value=arguments[1]", TF, "selenium");

		// handle disable button
		WebElement login = driver.findElement(By.id("login"));

		js.executeScript("arguments[0].disabled=false", login);

		login.click();

		Thread.sleep(5000);

		driver.quit();

	}
}