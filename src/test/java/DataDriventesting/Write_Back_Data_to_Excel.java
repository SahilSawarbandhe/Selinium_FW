package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Back_Data_to_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert Physical property to java object
		FileInputStream fis = new FileInputStream("C:\\Users\\sahil\\Desktop\\Book1.xlsx");

		// Create a workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch the sheet
		Sheet sh = wb.getSheet("Data");

		// Create the row
//		Row r = sh.getRow(3);
		Row r = sh.createRow(10);

		Cell c = r.createCell(0);

		c.setCellValue("pass@123");

		// Converting Java object to physical property
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sahil\\Desktop\\Book1.xlsx");

		wb.write(fos);

		wb.close();

	}
}