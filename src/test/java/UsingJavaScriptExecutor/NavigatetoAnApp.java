package UsingJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoAnApp {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// maximize the wiNDOW
		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location=arguments[0]", url);

		Thread.sleep(2000);

		// Fetch the Url and Title
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));

		Thread.sleep(2000);

		// Refresh the Webpage
		js.executeScript("history.go(0)");

		Thread.sleep(2000);

		driver.quit();

	}
}