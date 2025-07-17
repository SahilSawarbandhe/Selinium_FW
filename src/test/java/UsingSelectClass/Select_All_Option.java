package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_Option {

	public static void main(String[] args) {

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
		// Fetch all the option from dd
		List<WebElement> ele = s.getOptions();
		System.out.println(ele.size());

		// Iterate using for each loop and print the text from the option
		for (WebElement ss : ele) {
			System.out.println(ss.getText());
		}

		System.out.println(s.isMultiple());

		driver.quit();
	}
}