package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBarToAnElement {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		// Navigate to anAPP
		driver.get("https://www.amazon.in/");

		// Identify search text field and pass the text
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles" + Keys.ENTER);

		// Identify the Scrolling element
		WebElement cm = driver.findElement(By.xpath("//span[text()='Camera Modes']"));

		// DownCasting JavaScript executer to driver reference variable
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Identify the x and y position
		int x_axis = cm.getLocation().getX();
		int y_axis = cm.getLocation().getY();

		js.executeScript("window.scrollBy(" + x_axis + "," + y_axis + ")");

		Thread.sleep(3000);

		driver.quit();
	}
}