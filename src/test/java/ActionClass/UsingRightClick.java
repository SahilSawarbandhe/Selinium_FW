package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingRightClick {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions act = new Actions(driver);

		WebElement r = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.contextClick(r).perform();
		Thread.sleep(3000);

		driver.navigate().refresh();

		WebElement d = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		act.doubleClick(d).perform();

		Thread.sleep(3000);

		driver.quit();

	}
}