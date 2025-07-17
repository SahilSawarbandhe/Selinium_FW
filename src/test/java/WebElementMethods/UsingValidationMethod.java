package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingValidationMethod {

	public static void main(String[] args) throws InterruptedException {

		// launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to APP
		driver.get("https://demowebshop.tricentis.com/");

		WebElement sub_TF = driver.findElement(By.id("newsletter-email"));

		if (sub_TF.isDisplayed()) {// ex. webelement
			sub_TF.sendKeys("selenium");
		} else {
			System.out.println("not displaysed");
		}

		WebElement sub = driver.findElement(By.id("newsletter-email"));
		if (sub.isEnabled()) {// ex.Button
			sub.click();
		} else {
			System.out.println("sub_tx is not displayed");
		}

		WebElement exe = driver.findElement(By.id("pollanswers-1"));
		exe.click();

		if (exe.isSelected()) { // ex.Radio button, Check boxes
			System.out.println("selectted");
		} else {
			System.out.println("not selected");
		}

		Thread.sleep(3000);

		driver.quit();

	}
}