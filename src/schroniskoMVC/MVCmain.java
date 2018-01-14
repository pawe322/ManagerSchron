package schroniskoMVC;

import javax.swing.SwingUtilities;

public class MVCmain 
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					try
					{
						CreateGUI();
					} catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			});
	}
	
	public static void CreateGUI() throws Exception
	{
		new View();
	}
}
