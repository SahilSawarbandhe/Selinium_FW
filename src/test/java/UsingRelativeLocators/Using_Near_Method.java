package UsingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Near_Method {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to APP
		driver.get("https://www.flipkart.com/");

		// Identify SVG tag
		WebElement link = driver.findElement(By.xpath("//*[name()='svg'][@fill='none']"));
		link.click();

		Thread.sleep(3000);

		driver.quit();

	}
}