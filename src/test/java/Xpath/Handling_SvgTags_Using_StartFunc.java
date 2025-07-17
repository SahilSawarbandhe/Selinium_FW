package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_SvgTags_Using_StartFunc {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address or phone number')]"))
				.sendKeys("selenium");

		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal-p')]")).sendKeys("passs@223");

		driver.findElement(By.xpath("type='submit'"));

		driver.quit();

	}
}