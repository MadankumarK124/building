package com.HRA.GenericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUtility {
	
	/**
	 * This method is used to read data from propoerty file
	 * @author MADAN KUMAR K
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromPropertyFile(String key) throws Throwable {
		// get java representation
		FileInputStream f1 = new FileInputStream(iPathConstants.filepath);
		// create an object of properties
		Properties p = new Properties();
		// load the keys
		p.load(f1);

		String value = p.getProperty(key);
		return value;

	}
	
	
}
