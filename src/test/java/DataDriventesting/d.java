package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		// convert the physical file to java object
		FileInputStream fis = new FileInputStream("C:\\Users\\sahil\\Desktop\\Book1.xlsx");

		// create a workbook
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Data");

		Row r = sh.getRow(7);

		Cell c = r.getCell(0);

		String url = c.getStringCellValue();

		Row r1 = sh.getRow(8);

		Cell c1 = r1.getCell(0);

		String name = c1.getStringCellValue();

		Row r2 = sh.getRow(9);

		Cell c2 = r2.getCell(0);

		String email = c2.getStringCellValue();

		Row r3 = sh.getRow(10);

		Cell c3 = r3.getCell(0);

		String pass = c3.getStringCellValue();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);

		driver.findElement(By.id("name")).sendKeys(name);

		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("password")).sendKeys(pass);

		Thread.sleep(3000);

		driver.quit();

	}
}