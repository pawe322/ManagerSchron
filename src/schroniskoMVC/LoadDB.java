package schroniskoMVC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoadDB 
{
	public static int i;
	static Object[][] Load(ResultSet myRs, Object[][] DATA) throws SQLException
	{
		i = 0;
		while (myRs.next())
		{
			DATA[i][0]=myRs.getInt("id");
			DATA[i][1]=myRs.getString("name");
			DATA[i][2]=myRs.getString("type_of_animal");
			DATA[i][3]=myRs.getInt("age");
			DATA[i][4]=myRs.getInt("height[cm]");
			i++;
		}
		
		return DATA;
	}
}
