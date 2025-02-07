package database.connection;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class dbConnection 
{
	private static Connection connection;
	private static dbConnection db;
	
	public dbConnection()
	{
		connection = null;
		
		try
		{
			connection = DriverManager.getConnection
		    (
		       "jdbc:mysql://localhost:3306/srm_db", 
		       "root", 
		       "" 	
			);	
			System.out.println("Connected Successfully");
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Connection Error"+ e.getMessage());
		}
	}
	
	public static dbConnection getDBConnection()
	{
		if(db == null)
		{
			db = new dbConnection();
		}
		return db;
	}
	
	public Connection getConnection() throws SQLException
	{
		if(connection == null || connection.isClosed())
		{
			connection = DriverManager.getConnection
				    (
				       "jdbc:mysql://localhost:3306/srm_db", 
				       "root", 
				       "" 	
					);	
		}
		return connection;
	}	
}
