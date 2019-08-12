package discovery.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ProjectConfig {
	public static Properties prop = new Properties();
	public static String filepath;
	static {
		try {
			filepath = System.getProperty("user.dir");
				System.out.println(filepath);
				filepath = filepath + "\\src\\main\\java\\discovery\\framework\\projectconfig.properties";
				prop.load(new FileInputStream(filepath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getPropertyValue(String key) {
		return prop.getProperty(key);
	}
}
