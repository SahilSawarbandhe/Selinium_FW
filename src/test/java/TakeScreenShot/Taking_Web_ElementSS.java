package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Taking_Web_ElementSS {

	public static void main(String[] args) throws IOException {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an APP
		driver.get("https://www.flipkart.com/");

		// Identify the Element
		WebElement ele = driver.findElement(By.xpath("//img[@alt=\"Payment methods\"]"));

		//take ss and Store it in a temp folder
		File src = ele.getScreenshotAs(OutputType.FILE);

		// Create a new Empty file
		File dest = new File("./Screenshot/Ele.png");

		FileUtils.copyFile(src, dest);

		driver.quit();
	}
}