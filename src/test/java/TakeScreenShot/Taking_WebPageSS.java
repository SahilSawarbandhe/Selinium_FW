package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Taking_WebPageSS {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to an APP
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);

		// DownCast TakesScreenshot with driver
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Taking the Screenshot And Storing it in temp File
		File src = ts.getScreenshotAs(OutputType.FILE);

		// Create a new empty file
		File dest = new File("./Screenshot/ss.png");

		// Copy SS to temp file
//		FileHandler.copy(src, dest);

		FileUtils.copyFile(src, dest);

		driver.quit();

	}
}