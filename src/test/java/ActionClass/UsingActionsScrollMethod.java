package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionsScrollMethod {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.amazon.in/");

		//Scroll the WebPage till element
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 170).perform();

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Help']"));
		
		act.scrollToElement(ele).perform();
		
		Thread.sleep(3000);

		driver.quit();

	}
}