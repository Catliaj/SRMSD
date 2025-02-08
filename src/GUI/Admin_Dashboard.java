package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.text.DecimalFormat;

import models.adminDashboard;





public class Admin_Dashboard extends JFrame implements ActionListener 
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton dashboardBtn;
	private JButton btnProducts;
	private JButton RegisterBtn;
	private JButton logoutBtn;
	private JButton transactionsBtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Dashboard frame = new Admin_Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin_Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1291, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		adminDashboard method = new adminDashboard();
		
		//Side Panel-------------------------------------------------------------------
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
		
		//Admin Logo Design--------------------------------------------------------------------------------
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/admin.png")));
		lblNewLabel_1.setBounds(87, 33, 83, 81);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME, \r\n");
		lblNewLabel_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(60, 118, 172, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ADMIN!");
		lblNewLabel_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(71, 151, 172, 32);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(10, 160, 211, 32);
		panel_3.add(lblNewLabel_2_1_1);
		
		//Buttons-------------------------------------------------------
	    dashboardBtn = new JButton("DASHBOARD");
	    dashboardBtn.setEnabled(false);
		dashboardBtn.setBackground(new Color(109, 41, 50));
		dashboardBtn.setForeground(new Color(232, 216, 196));
		dashboardBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		dashboardBtn.setBounds(0, 254, 243, 63);
		dashboardBtn.addActionListener(this);
		panel_3.add(dashboardBtn);
		
	    btnProducts = new JButton("PRODUCTS");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 327, 243, 63);
		btnProducts.addActionListener(this);
		panel_3.add(btnProducts);
		
	    RegisterBtn = new JButton("REGISTER");
		RegisterBtn.setForeground(new Color(232, 216, 196));
		RegisterBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		RegisterBtn.setBackground(new Color(109, 41, 50));
		RegisterBtn.setBounds(0, 400, 243, 63);
		RegisterBtn.addActionListener(this);
		panel_3.add(RegisterBtn);
		
	    logoutBtn = new JButton("LOG OUT");
		logoutBtn.setForeground(new Color(232, 216, 196));
		logoutBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		logoutBtn.setBackground(new Color(109, 41, 50));
		logoutBtn.setBounds(0, 587, 243, 63);
		logoutBtn.addActionListener(this);
		panel_3.add(logoutBtn);
		
	    transactionsBtn = new JButton("TRANSACTIONS");
		transactionsBtn.addActionListener(this);
		transactionsBtn.setForeground(new Color(232, 216, 196));
		transactionsBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		transactionsBtn.setBackground(new Color(109, 41, 50));
		transactionsBtn.setBounds(0, 473, 243, 63);
		panel_3.add(transactionsBtn);
		
		
		//TOP SELLING PRODUCTS-------------------------------------------------------------------
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(188, 120, 129));
		panel_2.setBounds(278, 21, 303, 154);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(142, 60, 71));
		panel_4.setBounds(11, 11, 284, 133);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("TOP-SELLING PRODUCT");
		lblNewLabel_3_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3.setBounds(102, 99, 182, 13);
		panel_4.add(lblNewLabel_3_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(232, 216, 196));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setForeground(new Color(142, 60, 71));
		textField.setBounds(112, 25, 150, 64);
		panel_4.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/topicon.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(10, 10, 92, 95);
		panel_4.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				TopSelling_Popup topPopUpFrame = new TopSelling_Popup(); // Open the Customers frame
				topPopUpFrame.setVisible(true); // Set the Customers frame visible
			}
		});
		
		
		
		//TODAYS TOTAL REVENUE-----------------------------------------------------------------------
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(188, 120, 129));
		panel_2_1.setBounds(613, 21, 303, 154);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(142, 60, 71));
		panel_4_1.setBounds(10, 10, 283, 134);
		panel_2_1.add(panel_4_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("TOTAL REVENUE");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3_1.setBounds(101, 100, 172, 13);
		panel_4_1.add(lblNewLabel_3_3_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(new Color(142, 60, 71));
		textField_1.setBackground(new Color(232, 216, 196));
		textField_1.setColumns(10);
		textField_1.setBounds(111, 26, 150, 64);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4_1.add(textField_1);
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/revenueicon.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBounds(10, 10, 92, 95);
		panel_4_1.add(btnNewButton_1);
		
		
		//LOW ON STOCKS-----------------------------------------------------------------------------------------------
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2.setBackground(new Color(188, 120, 129));
		panel_2_2.setBounds(947, 21, 303, 154);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(new Color(142, 60, 71));
		panel_4_1_1.setBounds(10, 12, 283, 132);
		panel_2_2.add(panel_4_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("LOW STOCK ALERT");
		lblNewLabel_3_3_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3_1_1.setBounds(119, 97, 182, 13);
		panel_4_1_1.add(lblNewLabel_3_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(232, 216, 196));
		textField_2.setColumns(10);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setForeground(new Color(142, 60, 71));
		textField_2.setBounds(112, 26, 150, 64);
		panel_4_1_1.add(textField_2);
		
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/alerticon.png")));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBounds(10, 15, 92, 95);
		panel_4_1_1.add(btnNewButton_1_1);
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LowStock_Popup topPopUpFrame = new LowStock_Popup(); // Open the Customers frame
				topPopUpFrame.setVisible(true); // Set the Customers frame visible
			}
		});
		
		
		//line design
		JLabel lblNewLabel_2_1_1_1 = new JLabel("________________________________________________________________");
		lblNewLabel_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(288, 165, 950, 32);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		
		//lbl background
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(10, 0, 1311, 713);
		panel_1.add(lblNewLabel);
		String[] options = {"This Week", "This Month", "This Year"};
		
		
		
		//COMBOBOX FOR GRAPH--------------------------------------------
		
		
		JComboBox comboBox_1 = new JComboBox();
		lblNewLabel.add(comboBox_1);
		comboBox_1.setBackground(new Color(232, 216, 196));
		comboBox_1.setBounds(709, 211, 250, 27);
		method.populateSalesDates(comboBox_1);
		
		String selectedDate = (String) comboBox_1.getSelectedItem(); 
		
		
		
		//LINE GRAPH---------------------------------------------------------------------------------------------
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(232, 216, 196));
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(298, 252, 446, 393);
		lblNewLabel.add(panel_5);
		panel_5.setLayout(null);
		
		method.addBarGraphPanel_2(panel_5, selectedDate);
		
		
		//LABEL BENEATH LINE GRAPH-------------------------------------------------------------
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(190, 167, 139));
		panel_6.setBounds(410, 654, 233, 49);
		lblNewLabel.add(panel_6);
		panel_6.setLayout(null);
				
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBackground(new Color(232, 216, 196));
		panel_7.setBounds(10, 10, 211, 29);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
				
		JLabel lblNewLabel_3 = new JLabel("SALES TRENDS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(85, 32, 38));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(48, 8, 120, 13);
		panel_7.add(lblNewLabel_3);
		
		
		//BAR GRAPH---------------------------------------------------------------------------------------------
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1.setBackground(new Color(232, 216, 196));
		panel_5_1.setBounds(775, 251, 446, 393);
		lblNewLabel.add(panel_5_1);
		
		
		method.addBarGraphPanel(panel_5_1, selectedDate);

		
		//LABEL BENEATH BAR GRAPH-------------------------------------------------------------
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(190, 167, 139));
		panel_6_1.setBounds(860, 654, 285, 49);
		lblNewLabel.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(new Color(232, 216, 196));
		panel_7_1.setBounds(10, 10, 265, 29);
		panel_6_1.add(panel_7_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("SALESPERSON PERFORMANCE");
		lblNewLabel_3_2.setForeground(new Color(85, 32, 38));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(24, 8, 227, 13);
		panel_7_1.add(lblNewLabel_3_2);
		
				
		//COMBOBOX LABEL AND ACTION LISTENER--------------------------------------------
		JLabel lblNewLabel_3_3_2_1 = new JLabel("FILTER FOR A DATE:");
		lblNewLabel.add(lblNewLabel_3_3_2_1);
		lblNewLabel_3_3_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3_2_1.setBounds(557, 217, 182, 13);
				
		comboBox_1.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		      String selectedDate = (String) comboBox_1.getSelectedItem();
		      if (selectedDate != null) {
		          panel_5_1.removeAll(); // Clear previous chart
		          method.addBarGraphPanel(panel_5_1, selectedDate); // Update with new date
		          panel_5_1.revalidate();
		          panel_5_1.repaint();
		          
		          panel_5.removeAll(); // Clear previous chart
		          method.addBarGraphPanel_2(panel_5, selectedDate); // Update with new date
		          panel_5.revalidate();
		          panel_5.repaint();
		          
		          int totalRevenue = method.getTotalRevenue(selectedDate);
		        // Format with commas and two decimal places
		          DecimalFormat formatter = new DecimalFormat("#,##0.00");
		          String formattedRevenue = "₱ " + formatter.format(totalRevenue);
		          textField_1.setText(formattedRevenue);
		            
		          String mostBoughtItem = method.getMostBoughtItem(selectedDate); // Get the most bought item
		          textField.setText(mostBoughtItem);
		          
		       // Update Low Stock Product (sold 80 times or more)
		            String lowStockProduct = method.getLowStockProduct(selectedDate); // Get the low stock product
		            if (!lowStockProduct.isEmpty()) {
		                textField_2.setText(lowStockProduct); // Set in the textField_2 if a product has low stock
		            } else {
		                textField_2.setText(""); // Leave empty if no product is sold more than 79 times
		            }
		      }
		  }
		});
		
		int totalRevenue = method.getTotalRevenue(selectedDate);
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
        String formattedRevenue = "₱ " + formatter.format(totalRevenue);
        textField_1.setText(formattedRevenue);
        
        String mostBoughtItem = method.getMostBoughtItem(selectedDate); // Get the most bought item
        textField.setText(mostBoughtItem);
        
        String lowStockProduct = method.getLowStockProduct(selectedDate); // Get the low stock product
        if (!lowStockProduct.isEmpty()) {
            textField_2.setText(lowStockProduct); // Set in the textField_2 if a product has low stock
        } else {
            textField_2.setText(""); // Leave empty if no product is sold more than 79 times
        }
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnProducts)
		{
			dispose();
			new Admin_Products();
		}
		else if(e.getSource() == transactionsBtn)
		{
			dispose();
			new Admin_Transactions();
		}
		else if(e.getSource() == RegisterBtn)
		{
			
			dispose();
			new Admin_Register();
		}
		else if(e.getSource() == logoutBtn)
		{
			dispose();
			new AdminLogin();
		}
	}
}
