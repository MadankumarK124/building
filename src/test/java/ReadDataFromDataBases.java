

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDataBases {
	public static void main(String[] args) throws Throwable {
		Driver driver=new Driver();
		//register data into databse
		DriverManager.registerDriver(driver);
		//get connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		//issue create statement
		Statement stat = con.createStatement();
		String query = "select *from sdet439";
		//update/execute
		ResultSet result = stat.executeQuery(query);
				while(result.next())
				{
					System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
				}
		//close database
				con.close();
	}

}
