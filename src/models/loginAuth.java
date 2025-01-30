package models;
import java.sql.*;

import javax.swing.JOptionPane;

import database.connection.dbConnection;
public class loginAuth 
{
	private String userName, password;
	private boolean loginSuccess = false;
	dbConnection adminCon = new dbConnection();
	Connection connection;
	
	// admin login authentication
	public void adminLogin(String userName, String password)
	{
		setUserName(userName);
		setPassword(password);
		try
		{
			connection = adminCon.getConnection();
			String Query = ("SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?");
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setString(1, getUserName());
			ps.setString(2, getPassword());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				String role = rs.getString("ROLE");
				
				if("admin".equalsIgnoreCase(role))
				{
					loginSuccess = true;
					JOptionPane.showMessageDialog(null, "Login Successfully");
				}
				else if("staff".equalsIgnoreCase(role))
				{
					JOptionPane.showMessageDialog(null, "Access Denied: staff cannot access this section");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Role: Please contact administrator");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			}
			connection.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace(); 
			JOptionPane.showMessageDialog( null,"Error: " + ex.getMessage());
		}
		
	}
	
	// staff or sales person login Authentication
	public void staffLogin(String userName, String password)
	{
		setUserName(userName);
		setPassword(password);
		try
		{
			connection = adminCon.getConnection();
			String Query = ("SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?");
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setString(1, getUserName());
			ps.setString(2, getPassword());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				String role = rs.getString("ROLE");
				
				if("staff".equalsIgnoreCase(role))
				{
					loginSuccess = true;
					JOptionPane.showMessageDialog(null, "Login Successfully");
				}
				else if("admin".equalsIgnoreCase(role))
				{
					JOptionPane.showMessageDialog(null, "Access Denied: please use staff account");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Role: Please contact administrator");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			}
			connection.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace(); 
			JOptionPane.showMessageDialog( null,"Error: " + ex.getMessage());
		}
		
	}
	
	public boolean  loginSuccess()
	{
		return loginSuccess;
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}
