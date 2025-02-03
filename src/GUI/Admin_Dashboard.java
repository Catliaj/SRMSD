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
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(188, 120, 129));
		panel_2.setBounds(278, 23, 303, 168);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(142, 60, 71));
		panel_4.setBounds(9, 11, 283, 147);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("TOP-SELLING PRODUCT");
		lblNewLabel_3_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3.setBounds(98, 128, 182, 13);
		panel_4.add(lblNewLabel_3_3);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(127, 38, 134, 64);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(7, 26, 110, 399);
		panel_4.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/topicon.png")));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(188, 120, 129));
		panel_2_1.setBounds(613, 21, 303, 168);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(142, 60, 71));
		panel_4_1.setBounds(10, 10, 283, 147);
		panel_2_1.add(panel_4_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("TOTAL REVENUE TODAY");
		lblNewLabel_3_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3_1.setBounds(103, 129, 182, 13);
		panel_4_1.add(lblNewLabel_3_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 37, 134, 64);
		panel_4_1.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, -148, 497, 766);
		panel_4_1.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/revenueicon.png")));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2.setBackground(new Color(188, 120, 129));
		panel_2_2.setBounds(947, 20, 303, 168);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(new Color(142, 60, 71));
		panel_4_1_1.setBounds(10, 12, 283, 147);
		panel_2_2.add(panel_4_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("LOW STOCK ALERT");
		lblNewLabel_3_3_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3_1_1.setBounds(134, 130, 182, 13);
		panel_4_1_1.add(lblNewLabel_3_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 36, 134, 64);
		panel_4_1_1.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/alerticon.png")));
		lblNewLabel_5.setBounds(10, 22, 125, 415);
		panel_4_1_1.add(lblNewLabel_5);
		
		JPanel salestrendpanel = new JPanel();
		salestrendpanel.setBackground(new Color(232, 216, 196));
		salestrendpanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		salestrendpanel.setBounds(298, 219, 446, 392);
		panel_1.add(salestrendpanel);
		salestrendpanel.setLayout(null);
		
		JPanel performancepanel = new JPanel();
		performancepanel.setLayout(null);
		performancepanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		performancepanel.setBackground(new Color(232, 216, 196));
		performancepanel.setBounds(775, 218, 446, 393);
		panel_1.add(performancepanel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(190, 167, 139));
		panel_6.setBounds(400, 629, 227, 59);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBackground(new Color(232, 216, 196));
		panel_7.setBounds(7, 8, 211, 43);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("SALES TRENDS");
		lblNewLabel_3.setForeground(new Color(85, 32, 38));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(51, 17, 120, 13);
		panel_7.add(lblNewLabel_3);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(190, 167, 139));
		panel_6_1.setBounds(860, 629, 285, 59);
		panel_1.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(new Color(232, 216, 196));
		panel_7_1.setBounds(8, 8, 269, 43);
		panel_6_1.add(panel_7_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("SALESPERSON PERFORMANCE");
		lblNewLabel_3_2.setForeground(new Color(85, 32, 38));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(27, 17, 227, 13);
		panel_7_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("________________________________________________________________");
		lblNewLabel_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(288, 176, 950, 32);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
		
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
		}
		else if(e.getSource() == logoutBtn)
		{
			dispose();
			new AdminLogin();
			
			
		}
	}
}
