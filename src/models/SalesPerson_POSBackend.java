package models;
import database.connection.dbConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
public class SalesPerson_POSBackend 
{
	private String username;
	dbConnection db = new dbConnection();
	Connection connection;
	public String getName(String username) 
	{
		
		
		try
		{
			connection = db.getConnection();
			setUsername(username);
			String query = ("SELECT CONCAT (first_name, ' ',last_name) AS FULLNAME FROM USERS WHERE USERNAME = ?");
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, getUsername());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getString("FULLNAME");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		return null;
	}
	
    public List<String> getCategories() 
    {
        List<String> categories = new ArrayList<>();
        String query = "SELECT DISTINCT Category FROM PRODUCTS";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                categories.add(rs.getString("Category"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categories;
    }
    
    public List<String> getProductsByCategory(String category) 
    {
        List<String> products = new ArrayList<>();
        String query = "SELECT Product_Name FROM PRODUCTS WHERE Category = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, category);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                products.add(rs.getString("Product_Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public double getProductPrice(String productName) 
    {
        double price = 0.0;
        String query = "SELECT Price FROM PRODUCTS WHERE Product_Name = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, productName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                price = rs.getDouble("Price");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return price;
    }
    
    public void saveOrderToDatabase(String username, double total, double amount, double change, JTable table) {
        PreparedStatement orderStmt = null;
        PreparedStatement itemStmt = null;
        PreparedStatement userStmt = null;
        PreparedStatement productStmt = null;
        PreparedStatement updateProductStockStmt = null;
        
        
        try {
            // Connect to MySQL database (Ensure you have a valid connection)
            connection = db.getConnection();

            // Retrieve user_id from users table
            String getUserQuery = "SELECT user_id FROM users WHERE username = ?";
            userStmt = connection.prepareStatement(getUserQuery);
            userStmt.setString(1, username);
            ResultSet userResult = userStmt.executeQuery();

            int userId = 0;
            if (userResult.next()) {
                userId = userResult.getInt("user_id");
            } else {
                JOptionPane.showMessageDialog(null, "User not found!");
                return;  // Exit function if user doesn't exist
            }

            // Insert into orders table
            String insertOrderQuery = "INSERT INTO orders (customer_payment, total_sale, customer_change) VALUES ( ?, ?, ?)";
            orderStmt = connection.prepareStatement(insertOrderQuery, Statement.RETURN_GENERATED_KEYS);
            orderStmt.setDouble(1, total);
            orderStmt.setDouble(2, amount);
            orderStmt.setDouble(3, change);
            orderStmt.executeUpdate();

            // Get the generated order ID
            ResultSet generatedKeys = orderStmt.getGeneratedKeys();
            int orderId = 0;
            if (generatedKeys.next()) {
                orderId = generatedKeys.getInt(1);
            }

            // Prepare statement for inserting into sales table
            String insertSalesQuery = "INSERT INTO sales (product_id, quantity_sold, sales_date, total_sales, user_id, order_id) VALUES (?, ?, ?, ?, ?, ?)";
            itemStmt = connection.prepareStatement(insertSalesQuery);
            
            String updateStockQuery = "UPDATE products SET Stock_Quantity = Stock_Quantity - ? WHERE product_id = ?";
            updateProductStockStmt = connection.prepareStatement(updateStockQuery);

            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
            // Get table model
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                String productName = (String) model.getValueAt(i, 0);
                int quantity = (int) model.getValueAt(i, 1);
                double itemTotal = (double) model.getValueAt(i, 3);

                // Retrieve product_id based on product name
                String getProductQuery = "SELECT product_id FROM products WHERE product_name = ?";
                productStmt = connection.prepareStatement(getProductQuery);
                productStmt.setString(1, productName);
                ResultSet productResult = productStmt.executeQuery();

                int productId = 0;
                if (productResult.next()) 
                {
                    productId = productResult.getInt("product_id");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Product not found: " + productName);
                    continue; // Skip this item if product is not found
                }
                
                // Insert into sales table
                itemStmt.setInt(1, productId);
                itemStmt.setInt(2, quantity);
                itemStmt.setDate(3, date);
                itemStmt.setDouble(4, itemTotal);
                itemStmt.setInt(5, userId);
                itemStmt.setInt(6, orderId);
                itemStmt.addBatch();
                
                updateProductStockStmt.setInt(1, quantity);
                updateProductStockStmt.setInt(2, productId);
                updateProductStockStmt.addBatch();
            }

            // Execute batch insert for sales
            itemStmt.executeBatch();
            updateProductStockStmt.executeBatch();
            JOptionPane.showMessageDialog(null, "Order saved successfully!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saving order: " + ex.getMessage());
        } finally {
            // Close resources
            try {
                if (userStmt != null) userStmt.close();
                if (productStmt != null) productStmt.close();
                if (orderStmt != null) orderStmt.close();
                if (itemStmt != null) itemStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }





	
	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	
	


	
	
}
