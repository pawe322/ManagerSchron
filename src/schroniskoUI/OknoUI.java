package schroniskoUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class OknoUI extends JFrame
{
	private static final int Width = 600;
	private static final int Height = 300;
	private JButton dodaj, usun, status, exit;

	public OknoUI() 
	{
		JPanel a = new JPanel();
		a.setLayout(new GridLayout(1,4,0,0));
		setSize(Width, Height);
		setLocationByPlatform(true);
		
		setLayout(new GridLayout(0,1));

		JTextArea tf = new JTextArea(1,1);
		JTextField tf2 = new JTextField();
		tf2.setEnabled(false);
		JLabel napis = new JLabel("Witaj w Schronisku!");
		
		add(napis);
		add(tf);
		add(a);		
		
		add(tf2);
		
		dodaj = new JButton("Dodaj");
		a.add(dodaj);
		
		usun = new JButton("Usuñ");
		a.add(usun);
		
		status = new JButton("Status");
		a.add(status);
		
		exit = new JButton("Wyjœcie");
		exit.addMouseListener(new MouseAdapter()					//Wyjscie
				{
					public void mouseClicked(MouseEvent e)
					{
						System.exit(0);
					}
				});
		a.add(exit);
		
	}

}
