package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



import javax.swing.JTextArea;
import models.SalesPerson_POSBackend;
import javax.swing.DefaultComboBoxModel;

public class SalesPerson_POS extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField amountTextField;
	private JTextField changeTextField;
	private JTextField totalTextField;
	private JTextField QuantityTextField;
	private JButton salesButton ;
	private JButton logoutButton;
	private JButton AddButton;
	private JComboBox CategoryComboBox;
	private JComboBox ProductNameComboBox ;
	private JButton payButton;
	private JComboBox DiscountComboBox;
	private JLabel name;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesPerson_POS frame = new SalesPerson_POS(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */

	SalesPerson_POSBackend pos = new SalesPerson_POSBackend();
	// dont touch this!!!!!
	private String getUsername;
	private JTable table;
	private JTextField priceTextField;
	
	public String getGetUsername() 
	{
		return getUsername;
	}

	public void setGetUsername(String getUsername) 
	{
		this.getUsername = getUsername;
	}

	public SalesPerson_POS(String UserName) 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1291, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(62, 19, 28));
		panel_1.setBounds(0, 0, 1298, 713);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(109, 41, 50));
		panel.setBounds(0, 0, 254, 713);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(new Color(188, 120, 129));
		panel_8.setBounds(0, 0, 244, 713);
		panel.add(panel_8);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 233, 713);
		panel_8.add(panel_3);
		panel_3.setBackground(new Color(142, 60, 71));
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SalesPerson_POS.class.getResource("/Resources/user.png")));
		lblNewLabel_1.setBounds(87, 33, 84, 81);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME,");
		lblNewLabel_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(51, 106, 172, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(12, 182, 211, 32);
		panel_3.add(lblNewLabel_2_1_1);
		
		JButton Pos = new JButton("POS");
		Pos.setEnabled(false);
		Pos.setBackground(new Color(109, 41, 50));
		Pos.setForeground(new Color(232, 216, 196));
		Pos.setFont(new Font("Tahoma", Font.BOLD, 20));
		Pos.setBounds(0, 294, 243, 63);
		panel_3.add(Pos);
		
	    salesButton = new JButton("SALES");
		salesButton.setForeground(new Color(232, 216, 196));
		salesButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		salesButton.setBackground(new Color(109, 41, 50));
		salesButton.setBounds(0, 367, 243, 63);
		salesButton.addActionListener(this);
		panel_3.add(salesButton);
		
	    logoutButton = new JButton("LOG OUT");
		logoutButton.setForeground(new Color(232, 216, 196));
		logoutButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		logoutButton.setBackground(new Color(109, 41, 50));
		logoutButton.setBounds(0, 533, 243, 63);
		logoutButton.addActionListener(this);
		panel_3.add(logoutButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 497, 280, 216);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
	    name = new JLabel("SALES PERSON");
	    name.setBounds(22, 106, 211, 130);
	    panel_3.add(name);
	    name.setForeground(new Color(232, 216, 196));
	    name.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setToolTipText("");
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1_1.setBackground(new Color(142, 60, 71));
		panel_5_1_1.setBounds(264, 21, 431, 671);
		panel_1.add(panel_5_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(148, 219, 142, 55);
		panel_5_1_1.add(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(107, 46, 53));
		panel_2.setLayout(null);
		
	    AddButton = new JButton("ADD");
		AddButton.setForeground(new Color(232, 216, 196));
		AddButton.setBackground(new Color(82, 35, 41));
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		AddButton.setBounds(10, 10, 122, 35);
		AddButton.addActionListener(this);
		panel_2.add(AddButton);
		
	    CategoryComboBox = new JComboBox();
		CategoryComboBox.setBackground(new Color(232, 216, 196));
		CategoryComboBox.setBounds(162, 20, 201, 36);
		panel_5_1_1.add(CategoryComboBox);
		
	    ProductNameComboBox = new JComboBox();
		ProductNameComboBox.setBackground(new Color(232, 216, 196));
		ProductNameComboBox.setBounds(162, 66, 201, 36);
		panel_5_1_1.add(ProductNameComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("CATEGORY:");
		lblNewLabel_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(67, 25, 114, 24);
		panel_5_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("PRODUCT NAME:");
		lblNewLabel_3_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(27, 73, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("QUANTITY:");
		lblNewLabel_3_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBounds(67, 171, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1);
		
		JLabel label = new JLabel("AMOUNT:");
		label.setForeground(new Color(232, 216, 196));
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(52, 463, 154, 24);
		panel_5_1_1.add(label);
		
		amountTextField = new JTextField();
		amountTextField.setColumns(10);
		amountTextField.setBackground(new Color(232, 216, 196));
		amountTextField.setBounds(148, 460, 126, 36);
		panel_5_1_1.add(amountTextField);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("CHANGE:");
		lblNewLabel_3_2_1_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_2_1_1_1_1.setBounds(52, 521, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1_1_1);
		
		changeTextField = new JTextField();
		changeTextField.setEditable(false);
		changeTextField.setColumns(10);
		changeTextField.setBackground(new Color(232, 216, 196));
		changeTextField.setBounds(148, 514, 126, 36);
		panel_5_1_1.add(changeTextField);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(new Color(107, 46, 53));
		panel_2_1_1.setBounds(136, 578, 142, 55);
		panel_5_1_1.add(panel_2_1_1);
		
	    payButton = new JButton("PAY");
		payButton.setForeground(new Color(232, 216, 196));
		payButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		payButton.setBackground(new Color(82, 35, 41));
		payButton.setBounds(10, 10, 122, 35);
		payButton.addActionListener(this);
		panel_2_1_1.add(payButton);
		
		JLabel lblNewLabel_3_2_1_1_1_2 = new JLabel("DISCOUNT:");
		lblNewLabel_3_2_1_1_1_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_2_1_1_1_2.setBounds(48, 331, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1_1_2);
		
	    DiscountComboBox = new JComboBox();
	    DiscountComboBox.setModel(new DefaultComboBoxModel(new String[] {"--- Select a Discount--", "Senior Citizen Discount 20%", "Senior Citizen Discount 20%"}));
		DiscountComboBox.setBackground(new Color(227, 207, 183));
		DiscountComboBox.setBounds(150, 331, 126, 36);
		panel_5_1_1.add(DiscountComboBox);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("____________________________");
		lblNewLabel_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(10, 260, 411, 32);
		panel_5_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_3 = new JLabel("TOTAL:");
		lblNewLabel_3_2_1_1_1_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_2_1_1_1_3.setBounds(75, 389, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1_1_3);
		
		totalTextField = new JTextField();
		totalTextField.setEditable(false);
		totalTextField.setColumns(10);
		totalTextField.setBackground(new Color(232, 216, 196));
		totalTextField.setBounds(150, 386, 126, 36);
		panel_5_1_1.add(totalTextField);
		
		QuantityTextField = new JTextField();
		QuantityTextField.setBackground(new Color(232, 216, 196));
		QuantityTextField.setBounds(160, 168, 72, 36);
		panel_5_1_1.add(QuantityTextField);
		QuantityTextField.setColumns(10);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("PRICE:");
		lblNewLabel_3_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2_1_1.setBounds(99, 130, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1);
		
		priceTextField = new JTextField();
		priceTextField.setEditable(false);
		priceTextField.setBackground(new Color(232, 216, 196));
		priceTextField.setColumns(10);
		priceTextField.setBounds(160, 125, 72, 36);
		panel_5_1_1.add(priceTextField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(142, 60, 71));
		panel_4.setBounds(707, 21, 557, 671);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
	    textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.BOLD, 15));
		textArea.setBackground(new Color(208, 208, 208));
		textArea.setBounds(10, 287, 537, 374);
		textArea.append("\t \t============RECEIPT============"+"\n");
		panel_4.add(textArea);
		
		
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product", "Quantity", "Price", "Total", "Action"
			}
		));
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
		    @Override
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		        int row = table.rowAtPoint(evt.getPoint());  // Get clicked row
		        int col = table.columnAtPoint(evt.getPoint());  // Get clicked column

		        if (col == 4) {  // Check if the "Delete" column is clicked
		            String productName = (String) table.getValueAt(row, 0);  // Product Name
		            double price = (double) table.getValueAt(row, 2);  // Price
		            int quantity = (int) table.getValueAt(row, 1);  // Quantity
		            double total = (double) table.getValueAt(row, 3);  // Total (Total = Price * Quantity)

		            // Remove the row from JTable
		            DefaultTableModel model = (DefaultTableModel) table.getModel();
		            model.removeRow(row);  // Remove the selected row from the table

		            // Get the current text from the text area
		            String receiptText = textArea.getText();

		            // Create the string for this product to remove
		            String productText = String.format(
		        	        " \t \t Product: %s \t\t\n" +
		        	        " \t \t Price: ₱%.2f\t\t\t\n" +
		        	        " \t \t Quantity: %d\t\t\t\n" +
		        	        " \t \t Total: ₱%.2f\t\t\t\n" +
		        	        " \t \t-------------------------------\n",
		        	        productName, price, quantity, total);

		            // Remove the corresponding product text from the receipt
		            receiptText = receiptText.replace(productText, "");

		            // Set the updated receipt text back into the text area
		            textArea.setText(receiptText);
		            updateTotal();
		        }
		    }
		});


		
		DefaultTableModel model = new DefaultTableModel(
			    new Object[][] {},
			    new String[] { "Product", "Quantity", "Price", "Total", "Action" } // Add "Action" column
			);
		table.setModel(model);
		table.setBounds(10, 10, 537, 267);
		
		panel_4.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 537, 267);
		panel_4.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1276, 713);
		panel_1.add(lblNewLabel);
		setLocationRelativeTo(null);
		setGetUsername(UserName);
		UpdateLabelName(UserName);
		populateCategories();
		CategoryComboBox.addActionListener(this);
		ProductNameComboBox.addActionListener(this);
		
		

		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if(e.getSource() == salesButton)
		{
			dispose();
			new SalesPerson_Sales(getGetUsername());
		}
		else if(e.getSource() == logoutButton)
		{
			dispose();
			new UserLogin();
		}
		else if(e.getSource() == CategoryComboBox)
		{
			String selectedCategory = (String) CategoryComboBox.getSelectedItem();
		    if (selectedCategory != null) 
		    {
		        populateProducts(selectedCategory);
		    }
		}
		else if(e.getSource() == ProductNameComboBox)
		{
			String selectedProduct = (String) ProductNameComboBox.getSelectedItem();
		    if (selectedProduct != null) 
		    {
		        setProductPrice(selectedProduct);
		    }
		}
		else if (e.getSource() == AddButton) 
		{
		    String product = (String) ProductNameComboBox.getSelectedItem();
		    String category = (String) CategoryComboBox.getSelectedItem();
		    int quantity = Integer.parseInt(QuantityTextField.getText());
		    double price = Double.parseDouble(priceTextField.getText());
		    double total = price * quantity;

		    DefaultTableModel model = (DefaultTableModel) table.getModel();
		    
		    // ✅ Add row with "Delete" button
		    model.addRow(new Object[] { product, quantity, price, total, "Delete" });
		    addProductToTableAndReceipt(product, price, quantity, total);
		    
		    QuantityTextField.setText("");
		    priceTextField.setText("");
		}
		else if(e.getSource() == payButton)
		{
			String getTotal = totalTextField.getText();
			String getAmount =amountTextField.getText();
			
			double Total = Double.parseDouble(getTotal);
			double Amount = Double.parseDouble(getAmount);
			try
			{
				if(Amount >= Total)
				{
					double Change = Amount -= Total;
					String ConvertText = String.valueOf(Change);
					changeTextField.setText(ConvertText);
					pos.saveOrderToDatabase(getGetUsername(), Total, Amount, Change, table);
					generateReceiptPopup();
					totalTextField.setText("");
					amountTextField.setText("");
					QuantityTextField.setText("");
					priceTextField.setText("");
					textArea.setText("");
					changeTextField.setText("");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
							
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Insufficient Amount");
				}
			}
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(this, "Please enter valid numeric values for total and amount." );
				
			}
			
		}

	}
	// other methods 
	private void UpdateLabelName(String username)
	{
		String updatename = pos.getName(username);
		if(updatename != null)
		{
			
			name.setText("<html>" +updatename.replace("\n","<br>") + "</html>");
		}
		else
		{
			name.setText("User Not Found");
		}
				
	}
	
	private void populateCategories() 
	{
	    CategoryComboBox.removeAllItems();
	    List<String> categories = pos.getCategories();
	    CategoryComboBox.addItem("---Select a Category---");
	   
	    for (String category : categories) 
	    {
	        CategoryComboBox.addItem(category);
	    }
	}
	
	private void populateProducts(String category) 
	{
	    ProductNameComboBox.removeAllItems();
	    List<String> products = pos.getProductsByCategory(category);
	    
	    for (String product : products) 
	    {
	        
	        ProductNameComboBox.addItem(product);
	        
	    }
	}
	
	private void setProductPrice(String productName) 
	{
	    double price = pos.getProductPrice(productName);
	    priceTextField.setText(String.valueOf(price));
	    QuantityTextField.setText("1");
	}
	
	public void updateTotal() {
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    String discount = (String) DiscountComboBox.getSelectedItem();
	    double grandTotal = 0;
	    double discountRate = 0;

	    // Calculate grand total from table data
	    for (int i = 0; i < model.getRowCount(); i++) {
	        grandTotal += (double) model.getValueAt(i, 3); // Column index 3 is "Total"
	    }

	    // Determine discount rate
	    if ("Senior Citizen Discount 20%".equals(discount)) {
	        discountRate = 0.20;
	    } else if ("PWD Discount 15%".equals(discount)) {  // Example for PWD discount
	        discountRate = 0.15;
	    } 

	    // Apply discount
	    double discountAmount = grandTotal * discountRate;
	    double totalAmount = grandTotal - discountAmount;

	    // Format the total amount to two decimal places
	    totalTextField.setText(String.format("%.2f", totalAmount));
	}

	
	private void addProductToTableAndReceipt(String product, double price, int quantity, double total) {
	    

	    // Add to receipt in textArea
	    String productText = String.format(
	        " \t \t Product: %s \t\t\n" +
	        " \t \t Price: ₱%.2f\t\t\t\n" +
	        " \t \t Quantity: %d\t\t\t\n" +
	        " \t \t Total: ₱%.2f\t\t\t\n" +
	        " \t \t-------------------------------\n",
	        product, price, quantity, total);

	    textArea.append(productText);
	    updateTotal();
	}
	
	
	// ito ang pagandahin mo ARA
	public void generateReceiptPopup() {
	    StringBuilder receiptText = new StringBuilder();
	    
	    // Start with the title of the receipt
	    receiptText.append("\t \t============RECEIPT============\n");
	    
	    // Loop through the table and append product details
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    for (int i = 0; i < model.getRowCount(); i++) {
	        String productName = (String) model.getValueAt(i, 0);
	        int quantity = (int) model.getValueAt(i, 1);
	        double price = (double) model.getValueAt(i, 2);
	        double total = (double) model.getValueAt(i, 3);
	        
	        receiptText.append(String.format(
	            " \t \tProduct:                                      %s \t\t\n" +
	            " \t \tPrice:                                           ₱%s\t\t\t\n" +
	            " \t \tQuantity:                                        %d\t\t\t\n" +
	            " \t \tSubTotal:                                  ₱%s\t\t\t\n" +
	            " \t \t-------------------------------------------------------\n", 
	            productName, price, quantity, total
	        ));
	    }
	    
	    // Add the total at the bottom
	    String totalAmount = totalTextField.getText();
	    String Amountpaid = amountTextField.getText();
	    String Change = changeTextField.getText();
	    
	    receiptText.append(String.format(
	        " \t TOTAL:                                     ₱%s\n\n" +
	        " \t AMOUNT PAID:                            ₱%s\n\n" +
	        " \t CHANGE:                                      ₱%s\n",
	        totalAmount, Amountpaid, Change
	    ));
	    
	    receiptText.append(String.format(
	    		"\t \t===============================\n"+
	    		"\t \t                     THANK YOU!\n"+
	    		"\t \t===============================\n"));
	    
	    // Show the receipt in a pop-up dialog
	    JOptionPane.showMessageDialog(this, receiptText.toString(), "Receipt", JOptionPane.INFORMATION_MESSAGE);
	}

}

