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
	public String getMostBoughtItem(String selectedDate) {
	    String mostBoughtItem = "No data available";
	    dbConnection db = new dbConnection();

	    String query = "SELECT p.Product_Name " +
	                   "FROM sales s " +
	                   "JOIN products p ON s.Product_id = p.Product_id " +
	                   "WHERE s.Sales_Date = ? " +
	                   "GROUP BY p.Product_Name " +
	                   "ORDER BY SUM(s.Quantity_Sold) DESC LIMIT 1";
	    
	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query)) {

	        stmt.setString(1, selectedDate);
	        ResultSet rs = stmt.executeQuery();

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
	public String getLowStockProduct(String selectedDate) {
	    String lowStockProduct = "";
	    dbConnection db = new dbConnection();

	    String query = "SELECT p.Product_Name " +
	                   "FROM sales s " +
	                   "JOIN products p ON s.Product_id = p.Product_id " +
	                   "WHERE s.Sales_Date = ? " +
	                   "GROUP BY p.Product_Name " +
	                   "HAVING SUM(s.Quantity_Sold) >= 80 " +  // Only products sold 80+ times
	                   "ORDER BY SUM(s.Quantity_Sold) DESC " +  // Order by quantity sold, descending
	                   "LIMIT 1";  // Get the top product with the highest sales
	    
	    try (Connection conn = db.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query)) {

	        stmt.setString(1, selectedDate);
	        ResultSet rs = stmt.executeQuery();

	        if (rs.next()) {
	            lowStockProduct = rs.getString("Product_Name"); // Product with high sales
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error fetching low stock product: " + e.getMessage());
	    }

	    return lowStockProduct;
	}
}
