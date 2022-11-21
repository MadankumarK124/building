package com.HRA.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	Connection con=null;
	/**
	 * this method is used to register and get connection to database
	 * @param key
	 * @param data
	 * @param no1
	 * @param no2
	 * @param no3
	 * @throws Throwable
	 */
	public void dataBAse() throws Throwable {
		Driver driver=new Driver();
		// register data into databse
		DriverManager.registerDriver(driver);
		// get connection to database
		Connection con = DriverManager.getConnection(iPathConstants.dataBase, iPathConstants.dbUserName, iPathConstants.dbpassword);
	}
	/**
	 * this method is used to execute query and get the data for user
	 * @param Query
	 * @param columnindex
	 * @param expdata
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public String executeQueryandgetData(String Query, int columnindex, String expdata,String data) throws Throwable
	{	
		
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(Query);
		while(result.next())
		{
			data = result.getString(columnindex);
			if(data.equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(data+"----->data verified");
			return expdata;
		}
		else
		{
			System.out.println(data+"-->not verfied");
		}
		return "";
	}
	/**
	 * close the database
	 * @throws Throwable
	 */
	public void closeDataBase() throws Throwable
	{
		con.close();
	}
}
