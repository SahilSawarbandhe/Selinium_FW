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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Convert physical  file to java object
		FileInputStream fis =new FileInputStream("‪C:\\Users\\sahil\\Desktop\\Book1.xlsx");
		
		//create a workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh = wb.getSheet("Data");
		
		Row r1 = sh.getRow(7);
		
		Cell c1 = r1.getCell(0);
		
		String url = c1.getStringCellValue();
		
		Row r2 = sh.getRow(8);
		
		Cell c2 = r2.getCell(0);
		
		String name = c2.getStringCellValue();
		
		Row r3 = sh.getRow(9);
		
		Cell c3 = r3.getCell(0);
		
		String email = c3.getStringCellValue();
		
		Row r4 = sh.getRow(10);
		
		Cell c4 = r4.getCell(0);
		
		String pass = c4.getStringCellValue();
		
		//Launch the Browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to app
		driver.get(url);
		
		
		
		
		
		
		
		

	}
}