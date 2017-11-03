package schroniskoUI;

import java.awt.*;
import javax.swing.*;

public class ManagerSchronUI {

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				OknoUI o = new OknoUI();
				o.setTitle("Manager Schroniska");
				o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				o.setVisible(true);
				o.setResizable(false);
			}
		});
	}

}
