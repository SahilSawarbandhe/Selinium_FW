package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_MouseHovering {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.amazon.in/");

		// Create Object for Action Class
		Actions act = new Actions(driver);

		WebElement p = driver.findElement(By.xpath("//span[(text()='Prime')]"));

		act.moveToElement(p).perform();

		Thread.sleep(3000);

		driver.quit();

	}
}