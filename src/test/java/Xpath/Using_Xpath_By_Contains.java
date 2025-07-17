package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Xpath_By_Contains {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[contains(@aria-label,'Search Amazon.in')]")).sendKeys("toys" + Keys.ENTER);

		driver.findElement(By.xpath("//span[contains(text(),'Gooyo DB2060')]")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}