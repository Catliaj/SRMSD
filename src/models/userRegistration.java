package models;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection.dbConnection;

public class userRegistration 
{
	String FirstName, MiddleInitial,LastName, UserName,Password, Role;
	
	dbConnection db = new dbConnection();
	Connection connection;
	
	public void addUser(String FirstName, String MiddleInitial, String LastName, String UserName,
						String Password, String Role) 
	{
		setFirstName(FirstName);
		setMiddleInitial(MiddleInitial);
		setLastName(LastName);
		setUserName(UserName);
		setPassword(Password);
		setRole(Role);
		
		try
		{
		connection = db.getConnection();
		String query = "INSERT INTO users (First_Name, Middle_Initial, Last_Name, UserName, Password, Role) VALUES(?,?,?,?,?,?) ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, getFirstName());
		ps.setString(2, getMiddleInitial());
		ps.setString(3, getLastName());
		ps.setString(4, getUserName());
		ps.setString(5, getPassword());
		ps.setString(6, getRole());
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "User Added Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
			
	}
	
	public void updateUser(String FirstName, String MiddleInitial, String LastName, String UserName, String Password,
			String Role) 
	{
		setFirstName(FirstName);
		setMiddleInitial(MiddleInitial);
		setLastName(LastName);
		setUserName(UserName);
		setPassword(Password);
		setRole(Role);

		try 
		{
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("UPDATE users SET First_Name = ?, Middle_Initial = ?, Last_Name = ?, UserName = ?, Password = ?, Role = ? WHERE UserName = ?");
			ps.setString(1, getFirstName());
			ps.setString(2, getMiddleInitial());
			ps.setString(3, getLastName());
			ps.setString(4, getUserName());
			ps.setString(5, getPassword());
			ps.setString(6, getRole());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "User Updated Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}

	}
	
	public void deleteUser(String UserName) 
	{
		setUserName(UserName);

		try 
		{
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE UserName = ?");
			ps.setString(1, getUserName());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "User Deleted Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	public void loadUserTable(JTable table)
	{
		DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
		try {
			connection = db.getConnection();
			String query = "SELECT * FROM users";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String FirstName = rs.getString("First_Name");
				String MiddleInitial = rs.getString("Middle_Initial");
				String LastName = rs.getString("Last_Name");
				String UserName = rs.getString("UserName");
				String Password = rs.getString("Password");
				String Role = rs.getString("Role");
				
				Object[] row = { FirstName, MiddleInitial, LastName, UserName, Password, Role };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
    public List<String[]> getUsersData() {
        List<String[]> patientData = new ArrayList<>();
        try {
            // Establish the connection
            connection = db.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT First_Name, Middle_Initial, Last_Name, UserName, Password, Role FROM users";
            ResultSet resultSet = statement.executeQuery(query);

           
            while (resultSet.next()) {
                String firstName = resultSet.getString("First_Name");
                String middleInitial = resultSet.getString("Middle_Initial");
                String lastName = resultSet.getString("Last_Name");
                String UserName = resultSet.getString("UserName");
                String role = resultSet.getString("Role"); 
                patientData.add(new String[]{firstName, middleInitial, lastName,UserName,role});
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving users data: " + ex.getMessage());
        }
        return patientData;
    }
	

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleInitial() {
		return MiddleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		MiddleInitial = middleInitial;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
	
}
