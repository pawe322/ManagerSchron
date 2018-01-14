package schroniskoMVC;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

public class Controller implements ActionListener 
{
	private JTextField textField = new JTextField(15);
	private DefaultTableModel model;
	
	public Controller(JTextField textField, DefaultTableModel model) 
	{
		super();
		this.textField = textField;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		
	}

}
