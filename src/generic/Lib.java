package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Lib {

	public static String getProperty(String path, String key){
		String propertyValue = "";
		Properties p =  new Properties();
		try {
			p.load(new FileInputStream(path));
			propertyValue = p.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertyValue;
	}

}
