package schroniskoMVC;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ControllerInsert implements ActionListener 
{
	private JTextField JT_id = new JTextField(20);
	private JTextField JT_name = new JTextField(20);
	private JTextField JT_toa = new JTextField(20);
	private JTextField JT_age = new JTextField(20);
	private JTextField JT_height = new JTextField(20);
	private String query;
	
	public ControllerInsert (JTextField JT_id, JTextField JT_name, JTextField JT_toa, JTextField JT_age, JTextField JT_height)
	{
		super();
		this.JT_id = JT_id;
		this.JT_name = JT_name;
		this.JT_toa = JT_toa;
		this.JT_age = JT_age;
		this.JT_height = JT_height;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		Connection myConn = null;
		Statement myStmt = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/mgrschron?useSSL=false";
		String user = "student";
		String pass = "student";
		
		query = "insert into `pets`" +
				"(`id`,`name`,`type_of_animal`,`age`,`height[cm]`)" +
				"Values" +
				"("+JT_id.getText()+",'"+JT_name.getText()+"','"+JT_toa.getText()+"',"+JT_age.getText()+","+JT_height.getText()+")";
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