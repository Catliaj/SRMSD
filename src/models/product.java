package models;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.connection.dbConnection;

public class product 
{
	private String productCategory, productName, productPrice, productQuantity, brand;
	dbConnection db = new dbConnection();
	Connection connection;
	
	public void Addproduct(String productCategory, String productName, String productPrice, String productQuantity,
							String brand)
	{
		setProductCategory(productCategory);
		setProductName(productName);
		setProductPrice(productPrice);
		setProductQuantity(productQuantity);
		setBrand(brand);
		
		try
		{
			getProductCategory();
			getProductName();
			getProductPrice();
			getProductQuantity();
			getBrand();
			
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("INSERT INTO products (product_name, category, price, stock_quantity, brand) VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, productName);
			ps.setString(2, productCategory);
			ps.setString(3, productPrice);
			ps.setString(4, productQuantity);
			ps.setString(5, brand);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Product Added Successfully ");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		
	}
	
	public void Updateproduct(String productCategory, String productName, String productPrice, String productQuantity,
			String brand) {
		setProductCategory(productCategory);
		setProductName(productName);
		setProductPrice(productPrice);
		setProductQuantity(productQuantity);
		setBrand(brand);

		try {
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement(
					"UPDATE products SET product_name = ?, category = ?, price = ?, stock_quantity = ?, brand = ? WHERE product_name = ?");
			ps.setString(1, getProductCategory());
			ps.setString(2, getProductName());
			ps.setString(3, getProductPrice());
			ps.setString(4, getProductQuantity());
			ps.setString(5, getBrand());
			ps.setString(6, getProductName());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Product Updated Successfully ");

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	public void Deleteproduct(String productName) {
		setProductName(productName);

		try {
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM products WHERE product_name = ?");
			ps.setString(1, getProductName());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Product Deleted Successfully ");

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	
	public void loadProductintoTable(JTable table)
	{
		DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
		try {
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM products");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String productCategory = rs.getString("category");
				String productName = rs.getString("product_name");
				String productPrice = rs.getString("price");
				String productQuantity = rs.getString("stock_quantity");
				String brand = rs.getString("brand");

				Object[] row = { productCategory, productName, brand,productPrice, productQuantity };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	
	

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
