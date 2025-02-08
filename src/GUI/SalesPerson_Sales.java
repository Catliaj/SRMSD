package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

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
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.text.DecimalFormat;
import models.salesPerson_Sales;
import models.SalesPerson_POSBackend;
public class SalesPerson_Sales extends JFrame implements ActionListener 
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTable table;
	private JTextField TotalRevenueTextField;
	private JButton POSBtn;
	private JButton MyPerformanceBtn;
	private JButton LogoutBtn;
	private JLabel name;
	private String userName;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesPerson_Sales frame = new SalesPerson_Sales(null);
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
	
	SalesPerson_POSBackend pos = new SalesPerson_POSBackend();
	
	
	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public SalesPerson_Sales(String UserName) 
	{
		
		setUserName(UserName);	
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
		lblNewLabel_2.setBounds(51, 104, 172, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(12, 182, 211, 32);
		panel_3.add(lblNewLabel_2_1_1);
		
	    POSBtn = new JButton("POS");
		POSBtn.setBackground(new Color(109, 41, 50));
		POSBtn.setForeground(new Color(232, 216, 196));
		POSBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		POSBtn.setBounds(0, 294, 243, 63);
		POSBtn.addActionListener(this);
		panel_3.add(POSBtn);
		
		JButton btnProducts = new JButton("SALES");
		btnProducts.setEnabled(false);
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 367, 243, 63);
		panel_3.add(btnProducts);
		
	    LogoutBtn = new JButton("LOG OUT");
		LogoutBtn.setForeground(new Color(232, 216, 196));
		LogoutBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		LogoutBtn.setBackground(new Color(109, 41, 50));
		LogoutBtn.setBounds(0, 533, 243, 63);
		LogoutBtn.addActionListener(this);
		panel_3.add(LogoutBtn);
		
	    name = new JLabel("SALES PERSON");
		name.setForeground(new Color(232, 216, 196));
		name.setFont(new Font("Tahoma", Font.BOLD, 25));
		name.setBounds(22, 124, 211, 80);
		panel_3.add(name);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 497, 280, 216);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(142, 60, 71));
		panel_4.setBounds(264, 20, 1000, 392);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 980, 292);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Product", "Sold Quantity", "Sales Date", "Total Sales"
			}
		));
	
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(125, 53, 63));
		panel_2.setBounds(10, 10, 980, 69);
		panel_4.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design2.png")));
		lblNewLabel_4.setBounds(142, -124, 62, 314);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("STARTING DATE:");
		lblNewLabel_3.setForeground(new Color(227, 207, 183));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(179, 18, 145, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("ENDING DATE:");
		lblNewLabel_3_2.setForeground(new Color(227, 207, 183));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(523, 18, 145, 35);
		panel_2.add(lblNewLabel_3_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(314, 13, 174, 40);
		panel_2.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(641, 13, 183, 40);
		panel_2.add(dateChooser_1);
		
		// Add KeyListener to detect Enter key press
		dateChooser.getDateEditor().getUiComponent().addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyPressed(java.awt.event.KeyEvent e) {
		        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
		            searchSalesByDate(dateChooser, dateChooser_1);
		        }
		    }
		});

		dateChooser_1.getDateEditor().getUiComponent().addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyPressed(java.awt.event.KeyEvent e) {
		        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
		            searchSalesByDate(dateChooser, dateChooser_1);
		        }
		    }
		});

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(SalesPerson_Sales.class.getResource("/Resources/people (1).png")));
		lblNewLabel_6.setBounds(121, 4, 62, 49);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBackground(new Color(142, 60, 71));
		panel_5.setBounds(610, 440, 302, 138);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(109, 46, 54));
		panel_6.setBounds(10, 10, 282, 118);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("TOTAL REVENUE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(227, 207, 183));
		lblNewLabel_5.setBounds(59, 61, 189, 57);
		panel_6.add(lblNewLabel_5);
		
		TotalRevenueTextField = new JTextField();
		TotalRevenueTextField.setText("0");
		TotalRevenueTextField.setForeground(Color.WHITE);
		TotalRevenueTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		TotalRevenueTextField.setBackground(new Color(109, 46, 54));
		TotalRevenueTextField.setBounds(59, 20, 165, 57);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        
        
        
		
		panel_6.add(TotalRevenueTextField);
		TotalRevenueTextField.setColumns(10);
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5_1.setBackground(new Color(142, 60, 71));
		panel_5_1.setBounds(515, 603, 495, 86);
		panel_1.add(panel_5_1);
		panel_5_1.setLayout(null);
		
	    MyPerformanceBtn = new JButton("MY PERFORMANCE");
		MyPerformanceBtn.setForeground(new Color(227, 207, 183));
		MyPerformanceBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		MyPerformanceBtn.setBackground(new Color(109, 46, 54));
		MyPerformanceBtn.setBounds(10, 10, 475, 66);
		MyPerformanceBtn.addActionListener(this);
		panel_5_1.add(MyPerformanceBtn);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(351, 476, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_1.setBounds(974, 476, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("______________");
		lblNewLabel_2_1_1_1_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_2.setBounds(296, 518, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_2_1.setBounds(1022, 518, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("______________");
		lblNewLabel_2_1_1_1_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_3.setBounds(296, 434, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_3_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_3_1.setBounds(1022, 434, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_3_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1276, 713);
		panel_1.add(lblNewLabel);
		setLocationRelativeTo(null);
		
		
		//Populate Table
		salesPerson_Sales sales = new salesPerson_Sales(UserName);
		List<String[]> salesData = sales.getTableData();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (String[] row : salesData) 
	    {
			model.addRow(row);
		}
		double TotalRevenue = sales.getTotalSales();
		TotalRevenueTextField.setText( " ₱ " + String.valueOf(TotalRevenue));
		String formattedRevenue = "₱ " + formatter.format(TotalRevenue);
		TotalRevenueTextField.setText(formattedRevenue);
		UpdateLabelName(UserName);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == POSBtn)
		{
			dispose();
			new SalesPerson_POS(getUserName());
		}
		else if(e.getSource() == LogoutBtn)
		{
			dispose();
			new UserLogin();
		}
		else if(e.getSource() == MyPerformanceBtn)
		{
			new SalesPerson_Performance();
		}
		
	}
	
	public void UpdateLabelName(String username)
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
	
	private void searchSalesByDate(JDateChooser startDateChooser, JDateChooser endDateChooser) {
	    Date startDate = startDateChooser.getDate();
	    Date endDate = endDateChooser.getDate();

	    if (startDate == null || endDate == null) {
	        JOptionPane.showMessageDialog(null, "Please select both start and end dates.");
	        return;
	    }

	    LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

	    if (endLocalDate.isBefore(startLocalDate)) {
	        JOptionPane.showMessageDialog(null, "End date must be after the start date.");
	        return;
	    }

	    // Retrieve all sales data
	    salesPerson_Sales sales = new salesPerson_Sales(userName);
	    List<String[]> salesData = sales.getTableData();

	    double totalRevenue = 0;
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0); // Clear table before adding filtered data

	    for (String[] row : salesData) {
	        try {
	            LocalDate salesDate = LocalDate.parse(row[2], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	            if ((salesDate.isAfter(startLocalDate) || salesDate.isEqual(startLocalDate)) &&
	                (salesDate.isBefore(endLocalDate) || salesDate.isEqual(endLocalDate))) {
	                model.addRow(row); // Add row if within date range
	                totalRevenue += Double.parseDouble(row[3]); // Add revenue
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // Update revenue field
	    TotalRevenueTextField.setText(" ₱ " + totalRevenue);
	}

}