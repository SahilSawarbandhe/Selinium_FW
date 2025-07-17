package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hidden_Division {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.makemytrip.com/");

		// Close the PopUp
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		// Click on From
		driver.findElement(By.xpath("//span[text()='From']")).click();

		// Click on from location
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyd");

		// Select an Option
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();

		// Click on To
		driver.findElement(By.xpath("//span[text()='To']")).click();

		// Click on To location
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("ben");

		// Select an Option
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();

		driver.findElement(By.xpath(
				"//div[contains(text(),'June')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='27']"))
				.click();

		Thread.sleep(3000);

		driver.quit();

	}
}