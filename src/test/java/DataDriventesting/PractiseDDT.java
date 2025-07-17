package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PractiseDDT {

	public static void main(String[] args) throws IOException, InterruptedException {

		// convert the physical file into java object
		FileInputStream fis = new FileInputStream("C:\\Users\\sahil\\Desktop\\Book1.xlsx");

		// create a workbook
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Data");

		Row r = sh.getRow(0);

		Cell c = r.getCell(0);

		System.out.println(c.getStringCellValue());

		System.out.println(sh.getLastRowNum());

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				String d = sh.getRow(i).getCell(j).toString();
				System.out.print(d + "  ");
			}
			System.out.println();
		}
	}
}