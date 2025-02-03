package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import models.product;

public class Admin_Products extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField category;
	private JTextField brand;
	private JTextField product_name;
	private JTextField price;
	private JTable table;
	private JTextField search;
	private JTextField stock_quantity;
	private JButton AddBtn;
	private JButton UpdateBtn;
	private JButton DeleteBtn;
	private JButton DashboardBtn;
	private JButton btnProducts;
	private JButton registerBtn;
	private JButton LogoutBtn;
	private JButton transactionBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Products frame = new Admin_Products();
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
	
	product product = new product();
	public Admin_Products() {
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
		
	    DashboardBtn = new JButton("DASHBOARD");
		DashboardBtn.setBackground(new Color(109, 41, 50));
		DashboardBtn.setForeground(new Color(232, 216, 196));
		DashboardBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		DashboardBtn.setBounds(0, 254, 243, 63);
		DashboardBtn.addActionListener(this);
		panel_3.add(DashboardBtn);
		
	    btnProducts = new JButton("PRODUCTS");
	    btnProducts.setEnabled(false);
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 327, 243, 63);
		btnProducts.addActionListener(this);
		panel_3.add(btnProducts);
		
	    registerBtn = new JButton("REGISTER");
		registerBtn.setForeground(new Color(232, 216, 196));
		registerBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		registerBtn.setBackground(new Color(109, 41, 50));
		registerBtn.setBounds(0, 400, 243, 63);
		registerBtn.addActionListener(this);
		panel_3.add(registerBtn);
		
	    LogoutBtn = new JButton("LOG OUT");
		LogoutBtn.setForeground(new Color(232, 216, 196));
		LogoutBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		LogoutBtn.setBackground(new Color(109, 41, 50));
		LogoutBtn.setBounds(0, 596, 243, 63);
		LogoutBtn.addActionListener(this);
		panel_3.add(LogoutBtn);
		
	    transactionBtn = new JButton("TRANSACTIONS");
		transactionBtn.setForeground(new Color(232, 216, 196));
		transactionBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		transactionBtn.setBackground(new Color(109, 41, 50));
		transactionBtn.setBounds(0, 473, 243, 63);
		panel_3.add(transactionBtn);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(-23, 412, 280, 339);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(142, 60, 71));
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(264, 22, 365, 681);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		category = new JTextField();
		category.setFont(new Font("Tahoma", Font.PLAIN, 12));
		category.setForeground(new Color(0, 0, 0));
		category.setColumns(10);
		category.setBackground(new Color(232, 216, 196));
		category.setBounds(159, 222, 172, 34);
		panel_5.add(category);
		
		brand = new JTextField();
		brand.setForeground(new Color(0, 0, 0));
		brand.setColumns(10);
		brand.setBackground(new Color(232, 216, 196));
		brand.setBounds(159, 282, 172, 34);
		panel_5.add(brand);
		
		product_name = new JTextField();
		product_name.setForeground(new Color(0, 0, 0));
		product_name.setColumns(10);
		product_name.setBackground(new Color(232, 216, 196));
		product_name.setBounds(159, 162, 172, 34);
		panel_5.add(product_name);
		
		price = new JTextField();
		price.setForeground(new Color(0, 0, 0));
		price.setColumns(10);
		price.setBackground(new Color(232, 216, 196));
		price.setBounds(159, 403, 172, 34);
		panel_5.add(price);
		
		JLabel lblNewLabel_3_2 = new JLabel("CATEGORY:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(39, 232, 98, 13);
		panel_5.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("BRAND:");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(39, 291, 98, 13);
		panel_5.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("PRODUCT NAME:");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1.setBounds(24, 171, 113, 13);
		panel_5.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("PRICE:");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1.setBounds(39, 412, 98, 13);
		panel_5.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("STOCK QUANTITY:");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_2.setBounds(10, 353, 127, 13);
		panel_5.add(lblNewLabel_3_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(107, 46, 53));
		panel_2.setBounds(24, 489, 142, 55);
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
	    AddBtn = new JButton("ADD");
		AddBtn.setForeground(new Color(232, 216, 196));
		AddBtn.setBackground(new Color(82, 35, 41));
		AddBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		AddBtn.setBounds(10, 10, 122, 35);
		AddBtn.addActionListener(this);
		panel_2.add(AddBtn);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(new Color(107, 46, 53));
		panel_2_1.setBounds(199, 489, 142, 55);
		panel_5.add(panel_2_1);
		
	    UpdateBtn = new JButton("UPDATE");
		UpdateBtn.setForeground(new Color(232, 216, 196));
		UpdateBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		UpdateBtn.setBackground(new Color(82, 35, 41));
		UpdateBtn.setBounds(10, 10, 122, 35);
		UpdateBtn.addActionListener(this);
		panel_2_1.add(UpdateBtn);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(new Color(107, 46, 53));
		panel_2_1_1.setBounds(109, 567, 142, 55);
		panel_5.add(panel_2_1_1);
		
	    DeleteBtn = new JButton("DELETE");
		DeleteBtn.setForeground(new Color(232, 216, 196));
		DeleteBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		DeleteBtn.setBackground(new Color(82, 35, 41));
		DeleteBtn.setBounds(10, 10, 122, 35);
		DeleteBtn.addActionListener(this);
		panel_2_1_1.add(DeleteBtn);
		
		stock_quantity = new JTextField();
		stock_quantity.setForeground(Color.BLACK);
		stock_quantity.setColumns(10);
		stock_quantity.setBackground(new Color(232, 216, 196));
		stock_quantity.setBounds(159, 344, 172, 34);
		stock_quantity.addActionListener(this);
		panel_5.add(stock_quantity);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1.setBackground(new Color(142, 60, 71));
		panel_5_1.setBounds(651, 22, 615, 681);
		panel_1.add(panel_5_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 595, 562);
		panel_5_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(215, 215, 215));
		table.setModel(new DefaultTableModel(
			new Object[][] {			},
			new String[] {
				"Category", "Product Name", "Brand","Price", "Quantity"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(85, 43, 51));
		panel_4.setBounds(130, 35, 302, 51);
		panel_5_1.add(panel_4);
		panel_4.setLayout(null);
		
		search = new JTextField();
		search.setBackground(new Color(255, 242, 213));
		search.setBounds(10, 10, 282, 31);
		panel_4.add(search);
		search.setColumns(10);
		
		JLabel lblNewLabel_3_4 = new JLabel("SEARCH:");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(22, 54, 98, 13);
		panel_5_1.add(lblNewLabel_3_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.PINK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sort by", "ID", "A to Z"}));
		comboBox.setBounds(536, 78, 69, 21);
		panel_5_1.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
		setLocationRelativeTo(null);
		setVisible(true);
		
		product.loadProductintoTable(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == DashboardBtn)
		{
			dispose();
			new Admin_Dashboard();
		}
		else if(e.getSource() ==  transactionBtn)
		{
			dispose();
			new Admin_Transactions();
		}
		else if(e.getSource() == registerBtn)
		{
			dispose();
		}
		else if(e.getSource() == LogoutBtn)
		{
			dispose();
			new AdminLogin();
		}
		else if(e.getSource() == AddBtn)
		{
			String productCategory = category.getText();
			String brands = brand.getText();
			String productName = product_name.getText();
			String productPrice = price.getText();
			String stockquantity = stock_quantity.getText();
			
			product.Addproduct(productCategory, productName, productPrice, stockquantity, brands);
	
			category.setText("");
			brand.setText("");
			product_name.setText("");
			price.setText("");
			stock_quantity.setText("");
			product.loadProductintoTable(table);
		}
		else if(e.getSource() == UpdateBtn)
		{
			String productCategory = category.getText();
			String brands = brand.getText();
			String productName = product_name.getText();
			String productPrice = price.getText();
			String stockquantity = stock_quantity.getText();
			product.Updateproduct(productCategory, productName, productPrice, stockquantity, brands);
	
			category.setText("");
			brand.setText("");
			product_name.setText("");
			price.setText("");
			stock_quantity.setText("");
			product.loadProductintoTable(table);
		}
		
		else if(e.getSource() == DeleteBtn)
		{
			String productName = product_name.getText();
			product.Deleteproduct(productName);
			product.loadProductintoTable(table);
		}
		else if(e.getSource() == search)
		{
			
		}
		
	}
}