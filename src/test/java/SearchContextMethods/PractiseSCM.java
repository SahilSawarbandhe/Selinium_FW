package SearchContextMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PractiseSCM {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// navigate to app
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto");

		List<WebElement> tf = driver.findElements(By.xpath("//span[contains(text(),'mo')]"));

		for (WebElement e : tf) {
			System.out.println(e.getText());
		}

		Thread.sleep(3000);

		driver.quit();

	}
}