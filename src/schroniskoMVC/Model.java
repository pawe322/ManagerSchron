package schroniskoMVC;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Model extends DefaultTableModel
{

	public Model() 
	{
		super(JDBC.DATA, JDBC.TABLE_HEADER);
	}

}
