package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PractiseTS {

	public static void main(String[] args) throws IOException, InterruptedException {

		//Launch the browser 
		WebDriver driver =new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement e = driver.findElement(By.id("nav-logo-sprites"));
		
		File src =e.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./Screenshot/zon.png");
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}