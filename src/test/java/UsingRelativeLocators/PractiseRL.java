package UsingRelativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class PractiseRL {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.flipkart.com/");

		//
		WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));

		// driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(cart)).click();

		// driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart)).click();

//		driver.findElement(RelativeLocator.with(By.tagName("a")).near(cart)).click();

//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(cart)).click();

		driver.findElement(RelativeLocator.with(By.tagName("a")).below(cart)).click();

		Thread.sleep(5000);

		driver.quit();

	}
}