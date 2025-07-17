package SearchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_find_Element {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to the url
		driver.get("https://www.facebook.com/");

		// Identify the tf Find the element
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Selenium");

		// Identify Password tf and pass the text
		WebElement p = driver.findElement(By.xpath("(//input)[4]"));
		p.sendKeys("Password");

		driver.findElement(By.xpath("//button")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}