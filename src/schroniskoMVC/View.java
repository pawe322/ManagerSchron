package schroniskoMVC;

import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.*;

public class View 
{
	public static JTable table;
	
	public View() throws SQLException
	{
		// Create swing UI components
		JLabel JL_id = new JLabel("Id");
		JLabel JL_name = new JLabel("Name");
		JLabel JL_toa = new JLabel("Type of animal");
		JLabel JL_age = new JLabel("Age");
		JLabel JL_height = new JLabel("Height[cm]");
		
		JTextField JT_id = new JTextField(20);
		JTextField JT_name = new JTextField(20);
		JTextField JT_toa = new JTextField(20);
		JTextField JT_age = new JTextField(20);
		JTextField JT_height = new JTextField(20);
		
		JButton btn_insert = new JButton("Dodaj");
		JButton btn_update = new JButton("Zmieñ");
		JButton btn_delete = new JButton("Usuñ");
		
		table = new JTable();
		
		// Create table model
		CreateTable(table);
		
		// Create controller
		ControllerInsert controllerInsert = new ControllerInsert(JT_id, JT_name, JT_toa, JT_age, JT_height);
		btn_insert.addActionListener(controllerInsert);
		
		ControllerUpdate controllerUpdate = new ControllerUpdate(JT_id, JT_name, JT_toa, JT_age, JT_height);
		btn_update.addActionListener(controllerUpdate);
		
		ControllerDelete controllerDelete = new ControllerDelete(JT_id);
		btn_delete.addActionListener(controllerDelete);
		
		
		// Set the view layout
		JPanel controlPane = new JPanel();
		controlPane.setLayout(new GridLayout(3,5,3,3));
		controlPane.add(JL_id);
		controlPane.add(JL_name);
		controlPane.add(JL_toa);
		controlPane.add(JL_age);
		controlPane.add(JL_height);
		controlPane.add(JT_id);
		controlPane.add(JT_name);
		controlPane.add(JT_toa);
		controlPane.add(JT_age);
		controlPane.add(JT_height);
		controlPane.add(btn_insert);
		controlPane.add(btn_update);
		controlPane.add(btn_delete);
		
		
		JScrollPane tableScrollPane = new JScrollPane(table);
		tableScrollPane.setPreferredSize(new Dimension(640, 180));
		tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
				"Baza Schroniska", TitledBorder.CENTER, TitledBorder.TOP));
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, controlPane, tableScrollPane);
		splitPane.setDividerLocation(80);
		splitPane.setEnabled(false);
		
		// Display all in a scrolling window
		JFrame frame = new JFrame("Manager schroniska");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void CreateTable(JTable table) throws SQLException
	{
		Model model = new Model();
		table.setModel(model);
	}
}
