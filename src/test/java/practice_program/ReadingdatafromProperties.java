package practice_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingdatafromProperties {
	public static void main(String[] args) throws Throwable {
		//get java representation
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		//create an object of  properties
		Properties p = new Properties();
		//load the keys
		p.load(f1);
		
		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		 
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
