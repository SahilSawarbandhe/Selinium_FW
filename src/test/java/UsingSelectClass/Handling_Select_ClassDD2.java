package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Select_ClassDD2 {

	public static void main(String[] args) {

		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement dd = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(dd);

		s.selectByIndex(2);

		s.selectByValue("Mens Casual Slim Fit");

		s.selectByVisibleText("Mens Casual Premium ...");

		// Fetch all the Option
		List<WebElement> option = s.getOptions();
		for (WebElement e : option) {
			System.out.println(e.getText());
		}

		// Fetch the first selected option
		System.out.println(s.getFirstSelectedOption());

		// Fetch all selected option

		List<WebElement> select = s.getAllSelectedOptions();
		for (WebElement el : select) {
			System.out.println("selected options :" + el.getText());
		}

		// Check it is multiselet or not
		System.out.println(s.isMultiple());

		// Deselect the option by Index
		s.deselectByIndex(1);

		// Deselect the option by value
		s.deselectByValue("Mens Casual Slim Fit");

		driver.quit();

		
	}
}