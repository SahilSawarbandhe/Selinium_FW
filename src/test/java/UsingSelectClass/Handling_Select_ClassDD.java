package UsingSelectClass;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Select_ClassDD {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://www.amazon.in/");

		WebElement DD = driver.findElement(By.id("searchDropdownBox"));

		Select s = new Select(DD);

		// Select an option by Index
		s.selectByIndex(5);

		Thread.sleep(2000);

		// Select an option by attribute value
		s.selectByValue("search-alias=electronics");

		Thread.sleep(2000);

		// Fetch the first selected option
		WebElement option = s.getFirstSelectedOption();
		System.out.println("first selected :" + option.getText());

		// Fetch all selected option
		List<WebElement> selected = s.getAllSelectedOptions();
		for (WebElement e : selected) {
			System.out.println("All selected option :" + e.getText());
		}

		driver.quit();

	}
}