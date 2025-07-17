package UsingRelativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_ToLeft_and_ToRight_Method {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the APP
		driver.get("https://www.flipkart.com/");

		// Identify the cart button
		WebElement cart = driver.findElement(By.linkText("Cart"));

		// Identify the Login button and click on it
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart)).click();

		driver.navigate().back();

		WebElement cart1 = driver.findElement(By.linkText("cart"));

		driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(cart)).click();

		// click on cross button
		driver.findElement(By.xpath("//span[@role='button']")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}