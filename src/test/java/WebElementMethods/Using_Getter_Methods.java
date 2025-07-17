package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Getter_Methods {

	public static void main(String[] args) {

		// Launch the Browser
		WebDriver driver = new EdgeDriver();

		// Maximize the Window
		driver.manage().window().maximize();

		// Navigate to APP
		driver.get("https://demowebshop.tricentis.com/");

		// Identify the login link
		WebElement login_link = driver.findElement(By.linkText("Log in"));

		// Fetch the text present of an element
		String text = login_link.getText();

		System.out.println("Text: " + text);

		// Fetch the tag name of an element
		String tag = login_link.getTagName();

		System.out.println("Tag : " + tag);

		// Fetch the Attribute of an element
		String av = login_link.getAttribute("class");

		System.out.println("Attribute :" + av);

		// Fetch the Size of an element
		Dimension size = login_link.getSize();

		System.out.println("Size :" + size);

		// Fetch the Width
		System.out.println("Width : " + size.getWidth());

		// Fetch the Height
		System.out.println("Height :" + size.getHeight());

		Point location = login_link.getLocation();

		// Fetch the Position
		System.out.println("Location :" + location);

		// Fetch the x -axis
		System.out.println("X :" + location.getX());

		/// Fetch the y-axis
		System.out.println("Y :" + location.getY());

		Rectangle rect = login_link.getRect();

		System.out.println("Width : " + rect.getWidth());

		System.out.println("Height :" + rect.getHeight());

		System.out.println("X :" + rect.getX());

		System.out.println("Y :" + rect.getY());

		System.out.println(login_link.getCssValue("color"));

		System.out.println(login_link.getCssValue("cursor"));

		System.out.println(login_link.getCssValue("font-family"));

		driver.quit();

	}
}