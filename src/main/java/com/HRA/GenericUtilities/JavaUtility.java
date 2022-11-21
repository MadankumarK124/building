package com.HRA.GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method is used to get random number
	 * 
	 * @author MADAN KUMAR K
	 * @return
	 */
	public int getRandomNumber() {
		Random rn = new Random();
		int rand = rn.nextInt(10000);
		return rand;
	}

	/**
	 * this method is used to get system date
	 * 
	 * @return
	 */
	public String getSystemDate() {
		Date date = new Date();
		String systemdate = date.toString();
		return systemdate;
	}

	/**
	 * this method is used to get system date and date in formate
	 * 
	 * @return
	 */
	public String getsystemdateAndTimeInFormat() {
		SimpleDateFormat dateformate = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss");
		Date systemdate = new Date();
		String getdataAndTime = dateformate.format(systemdate);
		System.out.println(getdataAndTime);
		return getdataAndTime.replaceAll(":", "-");
	}

}
