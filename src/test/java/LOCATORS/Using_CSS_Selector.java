package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_CSS_Selector {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();
		
		//Navigate to the APP
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify the Search TF and ADD text 
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Computer");
		
		//Identify the search button and click on it 
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}