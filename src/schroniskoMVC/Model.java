package schroniskoMVC;

import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Model extends DefaultTableModel
{

	public Model() throws SQLException 
	{
		super(JDBC.getPetsList(), JDBC.TABLE_HEADER);
	}

}
