package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathByAxes {

	public static void main(String[] args) {
		
		//Using Parent and child Axes
		
		//Launch the Browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+Keys.ENTER);
		
		WebElement price =driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord')]/ancestor::div[contains(@class,'a-section a-spacing-s')]/descendant::span[@class='a-price-whole']"));
		
		System.out.println(price.getText());
		
		
		driver.quit();
		
		
		
		
		
		
		
	}
}