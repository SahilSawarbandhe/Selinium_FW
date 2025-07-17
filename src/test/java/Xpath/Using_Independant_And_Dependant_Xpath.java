package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Independant_And_Dependant_Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// maximize the Window
		driver.manage().window().maximize();

		// Navigate to the APP
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);

		// Identify the search text field and add the text
		driver.findElement(By.name("q")).sendKeys("toys" + Keys.ENTER);

		// click on toys
		WebElement price = driver.findElement(By.xpath(
				"//a[contains(text(),'SABIRAT Animal Set No Music Toy For Kids')]/../a[@class='DMMoT0']/div/div[@class='Nx9bqj']"));

		System.out.println(price.getText());

//		driver.quit();
		
	}
}