package schroniskoMVC;

import java.sql.*;

public class JDBC 
{
	public static final Object[] TABLE_HEADER = {"id","name","type_of_animal","age","height[cm]"};
	public static Object[][] DATA;
	private static int i =0;
	
	public void LoadDB() throws SQLException
	{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/mgrschron?useSSL=false";
		String user = "student";
		String pass = "student";
		
		try
		{
			// Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// Create a statement
			myStmt = myConn.createStatement();
			
			// Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			// Process the result set
			while (myRs.next())
			{
				DATA[i][0] = myRs.getString("id");
				DATA[i][1] = myRs.getString("name");
				DATA[i][2] = myRs.getString("type_of_animal");
				DATA[i][3] = myRs.getString("age");
				DATA[i][4] = myRs.getString("height[cm]");
				i++;
			}
			
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		finally 
		{
			if (myRs != null) 
			{
				myRs.close();
			}
			
			if (myStmt != null) 
			{
				myStmt.close();
			}
			
			if (myConn != null) 
			{
				myConn.close();
			}
		}
	}
}
