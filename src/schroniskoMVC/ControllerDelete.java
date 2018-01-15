package schroniskoMVC;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControllerDelete implements ActionListener 
{
	private JTextField JT_id = new JTextField(20);
	private JTextField JT_name = new JTextField(20);
	private JTextField JT_toa = new JTextField(20);
	private JTextField JT_age = new JTextField(20);
	private JTextField JT_height = new JTextField(20);
	private DefaultTableModel model;
	private String query = "delete from pets where id = ?";
	
	public ControllerDelete (JTextField JT_id, JTextField JT_name, JTextField JT_toa, JTextField JT_age, JTextField JT_height, DefaultTableModel model)
	{
		super();
		this.JT_id = JT_id;
		this.JT_name = JT_name;
		this.JT_toa = JT_toa;
		this.JT_age = JT_age;
		this.JT_height = JT_height;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		
	}
	
}