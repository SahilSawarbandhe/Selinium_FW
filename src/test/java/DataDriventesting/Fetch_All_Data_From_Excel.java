package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_All_Data_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert Physical Property to Java Object
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

		// Creating a Workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Fetching sheet
		Sheet sh = wb.getSheet("Data");

		int tr = sh.getLastRowNum();

		int tc = sh.getRow(1).getLastCellNum();

		System.out.println("Total no. of rows " + tr);

		System.out.println("Total no. of cells " + tc);

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				String d = sh.getRow(i).getCell(j).toString();
				System.out.print(d + "  ");
			}
			System.out.println();
		}
		wb.close();
	}
}