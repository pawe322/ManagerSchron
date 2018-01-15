package schroniskoMVC;

import java.sql.*;

public class JDBC 
{
	public static final String[] TABLE_HEADER = {"id","name","type_of_animal","age","height[cm]"};
	public static Object[][] DATA;
	
	public static Object[][] getPetsList() throws SQLException
	{
		int i=0;
		
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
			myRs = myStmt.executeQuery("select * from pets");
			
			// Counting Rows
			myRs.last();
			DATA = new Object[myRs.getRow()][5];
			
			myRs.beforeFirst();
			
			// Process the result set
			while (myRs.next())
			{
				DATA[i][0]=myRs.getInt("id");
				DATA[i][1]=myRs.getString("name");
				DATA[i][2]=myRs.getString("type_of_animal");
				DATA[i][3]=myRs.getInt("age");
				DATA[i][4]=myRs.getInt("height[cm]");
				i++;
			}
			
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		finally 
		{
			if (myRs != null) myRs.close();
			if (myStmt != null) myStmt.close();
			if (myConn != null) myConn.close();
		}
		
		return DATA;
	}
	
}
