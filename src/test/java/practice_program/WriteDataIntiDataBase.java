package practice_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class WriteDataIntiDataBase {
	public static void main(String[] args) throws Throwable {
		int result=0;
		Driver driver=new Driver();
		//register the database
		DriverManager.registerDriver(driver);
		//get connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		//issue create statement
		Statement stat = con.createStatement();
		String query = "insert into sdet439 values('uday','python',2)";
		//execute/update
		if(result==1)
		{
			System.out.println("data updated");
		}
		else
		{
			System.out.println("data not updated");
		}
		//close database
		con.close();
		
	}

}
