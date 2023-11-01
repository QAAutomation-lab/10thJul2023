package propertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertyFile {

	public static void main(String[] args) throws IOException {
		/*
		 * file location-
		 * absolute location: start from the root till the target element
		 * 		i.g: F:\JavaWorkspace\CoreJavaSessions\PropFiles\AppTestData.properties
		 * relative location: doesn't start from root('.' indicates current working dir)
		 * 		i.g: .\PropFiles\AppTestData.properties
		 * 	
		 * 		System.getProperty("user.dir");//---> gives current working dir location 
		 */
		String fileLocation="./PropFiles/AppTestData.properties";
		FileInputStream fis=new FileInputStream(fileLocation);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("lastName"));
		System.out.println(prop.getProperty("emailid"));
		System.out.println(prop.getProperty("mobileNumber"));
		System.out.println(prop.getProperty("p"));
		
		//add 1000 in p value
		int finalValue=Integer.parseInt(prop.getProperty("p"))+1000;
		System.out.println("final value "+finalValue);
		
		prop.setProperty("finalAmount", String.valueOf(finalValue));
		
		prop.setProperty("firstName", "Selenium");
		FileOutputStream fos=new FileOutputStream(fileLocation);
		
		prop.store(fos, "Added new subject");
		
		fos.flush();
		fos.close();		
	}

}
