package be.sander.SongLists;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SqliteConnection {
	
	public static void dbConnector()
	{
		Connection conn=null;
		try {
			String url="jdbc:sqlite:‪‪SongLists.db";
			System.out.println(url);
			conn=DriverManager.getConnection(url);
			System.out.println(url);
			JOptionPane.showMessageDialog(null, "Connection Successful");
		}catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}

}