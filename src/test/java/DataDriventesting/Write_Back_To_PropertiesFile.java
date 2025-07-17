package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Back_To_PropertiesFile {

	public static void main(String[] args) throws IOException {

		//Convert physical file to java object
		FileInputStream fis =new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Create object of property file
		Properties pr =new Properties();
		
		//Load property object
		pr.load(fis);
		
		pr.put("milk", "dinshaw");
		
		//Remove data from prop file
		pr.remove("choco");
		
		//Convert property object to physical file
		FileOutputStream fos =new FileOutputStream("./src/test/resources/CommonData.properties");
		
		pr.store(fos, "Updated");
		
	}
}