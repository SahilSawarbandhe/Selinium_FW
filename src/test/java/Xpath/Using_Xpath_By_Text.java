package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Xpath_By_Text {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// maximize the Window
		driver.manage().window().maximize();

		// navigate to the APP
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("mobile" + Keys.ENTER);

		driver.findElement(By.xpath("//div[text()='Popularity']")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}