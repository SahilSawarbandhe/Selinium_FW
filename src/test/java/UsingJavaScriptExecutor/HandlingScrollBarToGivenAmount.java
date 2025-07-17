package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBarToGivenAmount {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an APP
		driver.get("https://www.amazon.in/");
		
		//Handle scroll bar using hard coded coordinates
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		
		//Scroll to the given amount
		js.executeScript("window.scrollBy(100, 3000)");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}