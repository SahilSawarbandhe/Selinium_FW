package UsingSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseDD {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to app
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

		WebElement dd1 = driver.findElement(By.id("select3"));

		WebElement dd2 = driver.findElement(By.id("select5"));

//		WebElement dd3 = driver.findElement(By.xpath("//select[@fdprocessedid='tnqma']"));

		Select s = new Select(dd1);

//		s.selectByIndex(0);

//		s.selectByValue("countryOpt1");

		s.selectByVisibleText("United Arab Emirates");

		Select s2 = new Select(dd2);

//		Select s3 = new Select(dd3);

//		s3.selectByVisibleText("Select State");

		Thread.sleep(5000);

		driver.quit();

	}
}