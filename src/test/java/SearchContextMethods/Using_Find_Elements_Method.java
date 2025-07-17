package SearchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Find_Elements_Method {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to the app   
		driver.get("https://www.facebook.com/");

		// Identify all the Links
		List<WebElement> link = driver.findElements(By.xpath("//a"));

		for (WebElement ele : link) {
			System.out.println(ele.getText());
		}

		driver.quit();

	}
}