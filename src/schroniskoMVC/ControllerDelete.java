package schroniskoMVC;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ControllerDelete implements ActionListener 
{
	private JTextField JT_id = new JTextField(20);
	private String query;
	
	public ControllerDelete (JTextField JT_id)
	{
		super();
		this.JT_id = JT_id;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		Connection myConn = null;
		Statement myStmt = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/mgrschron?useSSL=false";
		String user = "student";
		String pass = "student";
		
		query = "delete from `pets`" +
				"where " +
				"`id` = " +
				JT_id.getText();
		try
		{
			// Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// Create a statement
			myStmt = myConn.createStatement();
						
			// Execute SQL query		
			if((myStmt.executeUpdate(query))==1)
			{
				View.CreateTable(View.table);
			}
			
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		finally 
		{
			if (myStmt != null)
				try 
				{
					myStmt.close();
				} catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
			if (myConn != null)
				try 
				{
					myConn.close();
				} catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
		}
		
	}
	
}