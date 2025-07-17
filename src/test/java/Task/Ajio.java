package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) {
		//launch the Browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to APP
		driver.navigate().to("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//span[text()='MEN']"));

	}

}
