package PopUps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Handling_Child_Window_Popup2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to APP
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);

		String pwid = driver.getWindowHandle();

		// Create Action class object
		Actions act = new Actions(driver);	

		// identify the kid option
		WebElement m = driver.findElement(By.id("kids"));

		// move cursor to kids option
		act.moveToElement(m).click().build().perform();

		Thread.sleep(3000);

		// click on boys clothing t shirt option
		driver.findElement(By.xpath("//a[@href=\"/sub-category/boys-tshirt\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='us polo kids ']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[name()='svg'][contains(@class,'MuiSvgIcon-root MuiSvgIcon-c')]")).click();

		Thread.sleep(3000);

		Set<String> wids = driver.getWindowHandles();

		for (String s : wids) {
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();

			if (url.contains("https://www.amazon.in/")) {
				break;
			}
		}

		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshot/cv.png");

		FileUtils.copyFile(src, dest);

		Thread.sleep(3000);

		driver.switchTo().window(pwid);

		Thread.sleep(3000);

		driver.quit();

	}

}