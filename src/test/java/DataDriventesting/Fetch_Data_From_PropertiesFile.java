package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Data_From_PropertiesFile {

	public static void main(String[] args) throws IOException {

		// Step 1 Converting Physical property file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		// Step 2 Create object of properties
		Properties p = new Properties();

		// Step 3 Load the java object to property object
		p.load(fis);

		// Step 4 Fetch the data
		String br = p.getProperty("browser");

		String lk = p.getProperty("url");

		String nm = p.getProperty("un");

		String ps = p.getProperty("psw");
		
		String t = p.getProperty("timeouts");
		
		int i=Integer.parseInt(t);

		System.out.println(br + "-->" + lk + "-->" + nm + "-->" + ps);

	}
}