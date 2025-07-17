package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_ClickAndDrop {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0&scenario=1");

		WebElement c = driver.findElement(By.id("circle"));

		Actions act = new Actions(driver);

		act.clickAndHold(c).perform();

		Thread.sleep(3000);

		act.release(c).perform();

		Thread.sleep(3000);

		driver.quit();

	}
}