package models;
import java.sql.*;

import javax.swing.JOptionPane;
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
			ps.setString(1, productCategory);
			ps.setString(2, productName);
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
