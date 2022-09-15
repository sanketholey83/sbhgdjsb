package utilitty;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

	public static String readProperty(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Asus\\Desktop\\javafullcourse\\frame87\\TestData\\config.Property");
		prop.load(file);
		return prop.getProperty(value);
		
		
	}

	
	
}
