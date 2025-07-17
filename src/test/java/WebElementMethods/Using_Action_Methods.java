package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Action_Methods {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to APP
		driver.get("https://demowebshop.tricentis.com/");

		// Identify the Search text field and send text
		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("computers");

		Thread.sleep(3000);

		// Clear the text
		search.clear();

		Thread.sleep(3000);

		// Send the Text
		search.sendKeys("mobiles");

		// Identify submit button and click on it using submit method
		driver.findElement(By.xpath("//input[@type='submit']")).submit();

		Thread.sleep(3000);

		// Identify the button
		WebElement button = driver.findElement(By.partialLinkText("Digital"));

		// click on it
		button.click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Log in")).click();

		Thread.sleep(3000);

		driver.quit();

	}
} 