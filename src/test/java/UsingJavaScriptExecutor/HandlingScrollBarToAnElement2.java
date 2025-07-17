package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBarToAnElement2 {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an APP
		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to given Amount
//		js.executeScript("window.scrollby(100,1000)");

		// Identify the search text field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles" + Keys.ENTER);

		// Identify the Scrolling Element
		WebElement cm = driver.findElement(By.xpath("//span[text()='Camera Modes']"));

//		int x_axia = cm.getLocation().getX();
//		int y_axis = cm.getLocation().getY();	

		// Scroll the WebPage using element coordinates
//		js.executeScript("window.scrollBy("+x_axia+","+y_axis+")");

		// Scroll the WebPage using element reference
		js.executeScript("arguments[0].scrollIntoView(true)", cm);

		Thread.sleep(2000);

		// Scroll till bottom of the WebPage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(2000);

		// Scroll till top of the WebPage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		Thread.sleep(2000);

		driver.quit();

	}
}