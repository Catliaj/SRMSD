# Sales Management System

## Overview

The **Sales Management System** is designed to streamline sales tracking and analytics for businesses. It provides functionality for managing products, recording sales, and analyzing sales performance. The system includes role-based access control for **Admins/Managers** and **Salespersons** to ensure secure and efficient operations.

## Features

### **User Roles**

1. **Admin/Manager:**
   - Manage product details (add, update, delete)
   - View and manage all sales records
   - Perform sales analytics
   - Delete outdated sales records
2. **Salesperson/User:**
   - Add daily sales transactions
   - View their own sales records
   - Monitor personal sales performance

### **Functional Requirements**

- **User Management:**
  - Secure login authentication
  - Role-based access control
- **Product Management (Admin Only):**
  - CRUD operations for products (ID, Name, Category, Price, Stock Quantity)
- **Sales Record Management:**
  - Add, update, view, and delete sales records
  - Filter sales by date, product, salesperson, or customer
- **Data Analytics:**
  - Total sales revenue calculation
  - Identify top-selling products
  - Track salesperson performance
  - Display sales trends (daily, weekly, monthly)
  - Monitor low-stock products

## System Requirements

### **Technology Stack**

- **Programming Language:** Java (JDK 8+)
- **Database:** MySQL, SQLite, or H2
- **GUI Framework:** JavaFX or Swing (optional)
- **Database Connection:** JDBC
- **Development Tools:** NetBeans, Maven/Gradle (optional)
- **Libraries:** JFreeChart (for analytics), Apache Commons Math (optional)

### **Database Schema**

#### **Tables**

1. `users (id, name, role, email, password)`
2. `products (id, name, category, price, stock)`
3. `sales (id, product_id, salesperson_id, quantity, sale_date, total_price)`

## Installation Guide

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/your-repo/sales-management-system.git
   ```
2. **Set Up the Database:**
   - Create the required tables in MySQL/SQLite using the provided schema.
3. **Configure Database Connection:**
   - Update `db_config.properties` with correct database credentials.
4. **Build and Run the Application:**
   ```sh
   mvn clean install
   java -jar target/sales-management-system.jar
   ```

## Usage Guide

1. **Admin Login:** Access all features including product and sales management.
2. **Salesperson Login:** Add and view personal sales records.
3. **Sales Analysis:** View sales trends and product performance.

## Error Handling

- Ensures valid input for sales transactions (e.g., no negative sales quantities).
- Prevents sales if product stock is insufficient.
- Displays error messages for incorrect login credentials.

## Future Enhancements

- Implement graphical reports for sales analytics.
- Add support for exporting sales data (CSV/PDF).
- Include customer management functionality.

## Contributors

- **AJ E CATLI           1** (Role - Backend Development & Database)
- **ARED ABELLERA        2** (Role - UI & Database)
- **ARAVHEIYL FELICISIMO 3** (Role - UI & Testing)

## License

This project is licensed under the MIT License.



