package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PractiseJS {

	public static void main(String[] args) throws InterruptedException {

		// Handling Scroll bar

		// 1. Using hard coded co-ordinates

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to app
		driver.get("https://www.amazon.in/");

		WebElement ele = driver.findElement(By.xpath("//h2[text()='Amazon LIVE - Watch, Chat & Shop LIVE ']"));

		int x_axis = ele.getLocation().getX();

		int y_axis = ele.getLocation().getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;

//		js.executeScript("window.scrollBy(" + x_axis + ";" + y_axis + ")");

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		System.out.println(js.executeScript("return document.title"));

		System.out.println(js.executeScript("return document.url"));

		Thread.sleep(3000);

		driver.quit();

	}
}