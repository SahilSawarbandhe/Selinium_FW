package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_WebPageSS2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to APP
		driver.get("https://www.meesho.com/");
		
		//Downcast the WebDriver with TakesScreenshot interface
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		//Store it in a Temporary File
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//Create an Empty File
		File dest =new File("./Screenshot/ms.png");
		
		//Copy ss to permanent folder
		FileUtils.copyFile(src,dest);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}