package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert Physical File to Java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

		// Creating the workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch the Sheet
		Sheet sh = wb.getSheet("Data");

		Row r = sh.getRow(1);

		Cell c = r.getCell(0);

		String data = c.getStringCellValue();

		System.out.println(data);

		int lr = sh.getLastRowNum();

		int lc = r.getLastCellNum();

	}
}

//for (int i = 0; i <	; i++) {
//Row cr = sh.getRow(i);
//for (int j = 0; j <= tc; j++) {
//	Cell cell = cr.getCell(j);
//	System.out.print(cell.toString() + "\t");
//}
//System.out.println();
//}

//ProdName	ProdPrice
//Samsung	20000
//Vivo	    30000
//Iphone	90000
//Nothing	40000
//Redmi	    25000