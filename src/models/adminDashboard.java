package models;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.*;
import java.time.LocalDate; // Import for handling dates
import java.util.Random;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;


import database.connection.dbConnection;

public class adminDashboard {
	
	public void populateSalesDates(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        
        String todayDate = LocalDate.now().toString(); // Get today's date in YYYY-MM-DD format
        boolean todayExists = false; // Flag to check if today's date is in the database

        dbConnection db = new dbConnection(); // Create an instance
        try (Connection conn = db.getConnection(); // Call instance method
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT DISTINCT Sales_Date FROM sales ORDER BY Sales_Date DESC")) {

            while (rs.next()) {
                String salesDate = rs.getString("Sales_Date");
                comboBox.addItem(salesDate);

                // Check if today's date exists in the database
                if (salesDate.equals(todayDate)) {
                    todayExists = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading sales dates: " + e.getMessage());
        }

        // Set today's date as the default selection if it exists
        if (todayExists) {
            comboBox.setSelectedItem(todayDate);
        } else {
            comboBox.setSelectedItem(null); // Leave it blank if today’s date is not in the database
        }
    }
	
	
	//BAR GRAPH-----------------------------------------------------------------------------------------------------------
	class BarGraphPanel extends JPanel {
	    private int[] values;
	    private String[] salespersons;
	    private String selectedDate; // The date filter for sales data

	    public BarGraphPanel(String selectedDate) {
	        this.selectedDate = selectedDate;
	        setBackground(Color.WHITE);
	        loadSalesData(selectedDate); // Fetch data from DB based on date
	    }

	    public void updateGraph(String newDate) {
	        this.selectedDate = newDate;
	        loadSalesData(newDate);
	        repaint(); // Refresh graph
	    }

	    private void loadSalesData(String selectedDate) {
	        ArrayList<String> staffList = new ArrayList<>();
	        ArrayList<Integer> salesList = new ArrayList<>();

	        dbConnection db = new dbConnection();

	        try (Connection conn = db.getConnection()) {
	            // Get all users with role 'staff'
	            String userQuery = "SELECT user_id, username FROM users WHERE role = 'staff'";
	            try (PreparedStatement userStmt = conn.prepareStatement(userQuery);
	                 ResultSet userRs = userStmt.executeQuery()) {

	                while (userRs.next()) {
	                    int userId = userRs.getInt("user_id");
	                    String username = userRs.getString("username");

	                    // Get total sales for each staff member filtered by date
	                    String salesQuery = "SELECT SUM(Total_Sales) AS total FROM sales WHERE user_id = ? AND Sales_Date = ?";
	                    try (PreparedStatement salesStmt = conn.prepareStatement(salesQuery)) {
	                        salesStmt.setInt(1, userId);
	                        salesStmt.setString(2, selectedDate);
	                        try (ResultSet salesRs = salesStmt.executeQuery()) {
	                            if (salesRs.next()) {
	                                int totalSales = salesRs.getInt("total");
	                                staffList.add(username);
	                                salesList.add(totalSales);
	                            }
	                        }
	                    }
	                }
	            }

	            // Convert lists to arrays
	            salespersons = staffList.toArray(new String[0]);
	            values = salesList.stream().mapToInt(i -> i).toArray();

	        } catch (SQLException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Error loading sales data: " + e.getMessage());
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        if (values == null || salespersons == null || values.length == 0) {
	            g.setColor(Color.BLACK);
	            g.drawString("No sales data available", getWidth() / 2 - 50, getHeight() / 2);
	            return;
	        }

	        int panelWidth = getWidth();
	        int panelHeight = getHeight();
	        int bottomPadding = 30;
	        int maxBarHeight = panelHeight - 50;
	        int barWidth = panelWidth / values.length - 20;

	        // Get the maximum value for scaling
	        int maxValue = values.length > 0 ? 
	            java.util.Arrays.stream(values).max().orElse(1000) : 1000;

	        g.setColor(Color.BLACK);
	        for (int i = 0; i <= maxValue; i += 500) {
	            int y = panelHeight - bottomPadding - (i * maxBarHeight / maxValue);
	            g.drawString(String.valueOf(i), 5, y);
	            g.drawLine(30, y, panelWidth - 10, y);
	        }

	        int x = 50;
	        for (int i = 0; i < values.length; i++) {
	            int value = values[i];
	            int barHeight = value * maxBarHeight / maxValue;

	            int red = Math.min(109 + (i * 15), 255);
	            int green = Math.max(41 - (i * 5), 0);
	            int blue = Math.max(50 - (i * 5), 0);

	            g.setColor(new Color(red, green, blue));
	            g.fillRect(x, panelHeight - bottomPadding - barHeight, barWidth, barHeight);
	            g.setColor(Color.BLACK);
	            g.drawRect(x, panelHeight - bottomPadding - barHeight, barWidth, barHeight);

	            g.drawString(salespersons[i], x + (barWidth / 4), panelHeight - 10);
	            
	         // Draw the actual value of the bar on top of it
	            g.setColor(Color.BLACK);
	            g.drawString(String.valueOf(value), x + (barWidth / 3), panelHeight - bottomPadding - barHeight - 5);

	            
	            x += barWidth + 9;
	        }
	    }
	}
	
	public void addBarGraphPanel(JPanel panel_5_1, String selectedDate) {
        BarGraphPanel graphPanel = new BarGraphPanel(selectedDate);  // Instantiate BarGraphPanel
        graphPanel.setBounds(10, 10, 426, 373); // Set the position and size
        panel_5_1.add(graphPanel);  // Add the graph to the panel
    }
	
	
	//BAR GRAPH 2-----------------------------------------------------------------------------------------------------------
	class BarGraphPanel_2 extends JPanel {
	    private int[] values;
	    private String[] productNames;
	    private String selectedDate; // The date filter for sales data

	    public BarGraphPanel_2(String selectedDate) {
	        this.selectedDate = selectedDate;
	        setBackground(Color.WHITE);
	        loadSalesData(selectedDate); // Fetch data from DB based on date
	    }

	    public void updateGraph(String newDate) {
	        this.selectedDate = newDate;
	        loadSalesData(newDate);
	        repaint(); // Refresh graph
	    }

	    private void loadSalesData(String selectedDate) {
	        ArrayList<String> productList = new ArrayList<>();
	        ArrayList<Integer> salesList = new ArrayList<>();

	        dbConnection db = new dbConnection();

	        try (Connection conn = db.getConnection()) {
	            // Query to get product names and total quantity sold on the selected date
	            String query = "SELECT p.Product_Name, SUM(s.Quantity_Sold) AS total_sold " +
	                           "FROM sales s " +
	                           "JOIN products p ON s.Product_id = p.Product_id " +
	                           "WHERE s.Sales_Date = ? " +
	                           "GROUP BY p.Product_id";
	            try (PreparedStatement stmt = conn.prepareStatement(query)) {
	                stmt.setString(1, selectedDate);
	                try (ResultSet rs = stmt.executeQuery()) {
	                    while (rs.next()) {
	                        productList.add(rs.getString("Product_Name"));
	                        salesList.add(rs.getInt("total_sold"));
	                    }
	                }
	            }

	            // Convert lists to arrays
	            productNames = productList.toArray(new String[0]);
	            values = salesList.stream().mapToInt(i -> i).toArray();

	        } catch (SQLException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Error loading sales data: " + e.getMessage());
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        if (values == null || productNames == null || values.length == 0) {
	            g.setColor(Color.BLACK);
	            g.drawString("No sales data available", getWidth() / 2 - 50, getHeight() / 2);
	            return;
	        }

	        int panelWidth = getWidth();
	        int panelHeight = getHeight();
	        int bottomPadding = 30;
	        int maxBarHeight = panelHeight - 50;
	        int barWidth = panelWidth / values.length - 20;

	     // Ensure maxValue is at least 100
	        int maxValue = values.length > 0 ? Math.max(100, java.util.Arrays.stream(values).max().orElse(100)) : 100;

	        g.setColor(Color.LIGHT_GRAY);
	        for (int i = 0; i <= maxValue; i += 25) { // Draw horizontal grid lines at 25, 50, 75, 100, etc.
	            int y = panelHeight - bottomPadding - (i * maxBarHeight / maxValue);
	            g.drawLine(30, y, panelWidth - 10, y);
	            g.setColor(Color.BLACK);
	            g.drawString(String.valueOf(i), 5, y);
	            g.setColor(Color.LIGHT_GRAY);
	        }

	        int x = 50;
	        for (int i = 0; i < values.length; i++) {
	            int value = values[i];
	            int barHeight = value * maxBarHeight / maxValue;

	            int red = Math.min(109 + (i * 15), 255);
	            int green = Math.max(41 - (i * 5), 0);
	            int blue = Math.max(50 - (i * 5), 0);

	            g.setColor(new Color(red, green, blue));
	            g.fillRect(x, panelHeight - bottomPadding - barHeight, barWidth, barHeight);
	            g.setColor(Color.BLACK);
	            g.drawRect(x, panelHeight - bottomPadding - barHeight, barWidth, barHeight);

	            g.drawString(productNames[i], x + (barWidth / 4), panelHeight - 10);
	            
	         // Draw the actual value of the bar on top of it
	            g.setColor(Color.BLACK);
	            g.drawString(String.valueOf(value), x + (barWidth / 3), panelHeight - bottomPadding - barHeight - 5);

	            
	            x += barWidth + 9;
	        }
	    }
	}

	public void addBarGraphPanel_2(JPanel panel_5, String selectedDate) {
	    BarGraphPanel_2 graphPanel = new BarGraphPanel_2(selectedDate);  // Instantiate BarGraphPanel
	    graphPanel.setBounds(10, 10, 426, 373); // Set the position and size
	    panel_5.add(graphPanel);  // Add the graph to the panel
	}
	
	
	
	//Total revenue lbl-----------------------------------------------------------------------------
	public int getTotalRevenue(String selectedDate) {
	    int totalRevenue = 0;
	    dbConnection db = new dbConnection();

	    String query = "SELECT SUM(Total_Sales) FROM sales WHERE Sales_Date = ?";
	    
	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query)) {

	        stmt.setString(1, selectedDate);
	        ResultSet rs = stmt.executeQuery();

	        if (rs.next()) {
	            totalRevenue = rs.getInt(1); // Get the sum of Total_Sales
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error fetching total revenue: " + e.getMessage());
	    }

	    return totalRevenue;
	}
	
	
	//Most popular Item-------------------------------------------------------------------------------

	// Most popular Item (All-time)
	public String getMostBoughtItem() {

	    String mostBoughtItem = "No data available";
	    dbConnection db = new dbConnection();

	    String query = "SELECT p.Product_Name " +
	                   "FROM sales s " +
	                   "JOIN products p ON s.Product_id = p.Product_id " +
	                   "GROUP BY p.Product_Name " +
	                   "ORDER BY SUM(s.Quantity_Sold) DESC LIMIT 1";

	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query);
	         ResultSet rs = stmt.executeQuery()) {

	        if (rs.next()) {
	            mostBoughtItem = rs.getString("Product_Name"); // Get the most sold product
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error fetching most bought item: " + e.getMessage());
	    }

	    return mostBoughtItem;
	}
	
	
	//low stocks-------------------------------------------------------------------------------
	// Get the product with the lowest stock (if below 21)
	public String getLowStockProduct() {
	    String lowStockProduct = "Plenty Stocked";
	    dbConnection db = new dbConnection();

	    String query = "SELECT Product_Name " +
	                   "FROM products " +
	                   "WHERE Stock_Quantity < 21 " +
	                   "ORDER BY Stock_Quantity ASC " + // Get the lowest stock first
	                   "LIMIT 1";

	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query);
	         ResultSet rs = stmt.executeQuery()) {

	        if (rs.next()) {
	            lowStockProduct = rs.getString("Product_Name"); // Get the product with the lowest stock

	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error fetching low stock product: " + e.getMessage());
	    }

	    return lowStockProduct;
	}
	
	
	public DefaultTableModel getTopSellingProducts() {
	    DefaultTableModel model = new DefaultTableModel(new String[]{"Rank", "Product Name", "Qty."}, 0);
	    dbConnection db = new dbConnection();

	    String query = "SELECT p.Product_Name, SUM(s.Quantity_Sold) AS TotalSold " +
	                   "FROM sales s " +
	                   "JOIN products p ON s.Product_id = p.Product_id " +
	                   "GROUP BY p.Product_Name " +
	                   "ORDER BY TotalSold DESC " +
	                   "LIMIT 10"; // Limit to top 10 products

	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query);
	         ResultSet rs = stmt.executeQuery()) {

	        int rank = 1;
	        while (rs.next()) {
	            model.addRow(new Object[]{rank++, rs.getString("Product_Name"), rs.getInt("TotalSold")});
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error fetching top-selling products: " + e.getMessage());
	    }

	    return model;
	}
	
	
	
	public DefaultTableModel updateLowStockTable() {
	    dbConnection db = new dbConnection();
	    String query = "SELECT Product_Name, Stock_Quantity FROM products WHERE Stock_Quantity < 21 ORDER BY Stock_Quantity ASC";

	    DefaultTableModel tableModel = new DefaultTableModel(
	        new Object[]{"Rank", "Product Name", "Qty."}, 0
	    );

	    try (Connection conn = db.getConnection();
	         PreparedStatement pst = conn.prepareStatement(query);
	         ResultSet rs = pst.executeQuery()) {

	        int rank = 1;
	        while (rs.next()) {
	            String productName = rs.getString("Product_Name");
	            int stock = rs.getInt("Stock_Quantity");
	            tableModel.addRow(new Object[]{rank++, productName, stock});
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return tableModel;
	}
}
