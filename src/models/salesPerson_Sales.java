package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection.dbConnection;
public class salesPerson_Sales 
{
	 private String username;

	public salesPerson_Sales(String username) 
	{
	        this.username = username;
	}

    public List<String[]> getTableData() 
    {
	        dbConnection db = new dbConnection();
	        Connection connection;
	        List<String[]> salesData = new ArrayList<>();

	        try {
	            connection = db.getConnection();
	            
	            String query = "SELECT p.product_name, s.quantity_sold, s.sales_date, s.total_sales " +
	                           "FROM SALES s " +
	                           "JOIN USERS u ON s.user_id = u.user_id " +
	                           "JOIN PRODUCTS p ON s.product_id = p.product_id " +
	                           "WHERE u.username = ?";

	            PreparedStatement ps = connection.prepareStatement(query);
	            ps.setString(1, username);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                String productName = rs.getString("product_name");
	                String quantitySold = rs.getString("quantity_sold");
	                String saleDate = rs.getString("sales_date");
	                String totalSales = rs.getString("total_sales");

	                salesData.add(new String[]{productName, quantitySold, saleDate, totalSales});
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
	        }

	        return salesData;
	    }
    
		public Double getTotalSales() {
			dbConnection db = new dbConnection();
			Connection connection;
			Double totalSales = 0.0;

			try {
				connection = db.getConnection();
				String query = "SELECT SUM(total_sales) AS total_sales " + "FROM SALES s "
							   + "JOIN USERS u ON s.user_id = u.user_id " + "WHERE u.username = ?";

				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, username);
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					totalSales = rs.getDouble("total_sales");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			}
			return totalSales;
		}
	
}
