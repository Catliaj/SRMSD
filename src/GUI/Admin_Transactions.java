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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import javax.swing.DefaultComboBoxModel;

import models.userRegistration;

public class Admin_Transactions extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField userName;
	private JTextField password;
	private JTextField firstName;
	private JTextField middleName;
	private JTextField surName;
	private JTable table;
	private JTextField search;
	private JButton DashboardBtn;
	private JButton btnProducts;
	private JButton register;
	private JButton Logout;
	private JButton Transactions;
	private JButton UpdateBtn;
	private JButton DeleteBtn;
	private JButton clearBtn;
	private JComboBox comboBoxRole;
	private JComboBox comboBoxStartDate;
	private JComboBox comboBoxEndDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Transactions frame = new Admin_Transactions();
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
	userRegistration user = new userRegistration();
	private JTextField textField;
	private JTextField textField_1;
	public Admin_Transactions() {
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
		
		JLabel lblNewLabel_1 = new JLabel(" ");
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
		DashboardBtn.setBounds(0, 216, 243, 63);
		DashboardBtn.addActionListener(this);
		panel_3.add(DashboardBtn);
		
	    btnProducts = new JButton("PRODUCTS");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 289, 243, 63);
		btnProducts.addActionListener(this);
		panel_3.add(btnProducts);
		
	    register = new JButton("REGISTER");
		register.setForeground(new Color(232, 216, 196));
		register.setFont(new Font("Tahoma", Font.BOLD, 20));
		register.setBackground(new Color(109, 41, 50));
		register.setBounds(0, 362, 243, 63);
		register.addActionListener(this);
		panel_3.add(register);
		
	    Logout = new JButton("LOG OUT");
		Logout.setForeground(new Color(232, 216, 196));
		Logout.setFont(new Font("Tahoma", Font.BOLD, 20));
		Logout.setBackground(new Color(109, 41, 50));
		Logout.setBounds(0, 570, 243, 63);
		Logout.addActionListener(this);
		panel_3.add(Logout);
		
	    Transactions = new JButton("TRANSACTIONS");
	    Transactions.setEnabled(false);
		Transactions.setForeground(new Color(232, 216, 196));
		Transactions.setFont(new Font("Tahoma", Font.BOLD, 20));
		Transactions.setBackground(new Color(109, 41, 50));
		Transactions.setBounds(0, 435, 243, 63);
		Transactions.addActionListener(this);
		panel_3.add(Transactions);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 488, 280, 225);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(142, 60, 71));
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(264, 431, 651, 274);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		userName = new JTextField();
		userName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userName.setForeground(new Color(0, 0, 0));
		userName.setColumns(10);
		userName.setBackground(new Color(232, 216, 196));
		userName.setBounds(146, 137, 147, 36);
		
		panel_5.add(userName);
		
		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password.setForeground(new Color(0, 0, 0));
		password.setColumns(10);
		password.setBackground(new Color(232, 216, 196));
		password.setBounds(436, 137, 175, 36);
		panel_5.add(password);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstName.setForeground(new Color(0, 0, 0));
		firstName.setColumns(10);
		firstName.setBackground(new Color(232, 216, 196));
		firstName.setBounds(234, 24, 261, 36);
		panel_5.add(firstName);
		
		JLabel lblNewLabel_3_2 = new JLabel("SALES DATE:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(38, 147, 98, 13);
		panel_5.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("TOTAL SALES:");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(316, 146, 98, 13);
		panel_5.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("SALES PERSON:");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1.setBounds(126, 36, 98, 13);
		panel_5.add(lblNewLabel_3_3_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(new Color(107, 46, 53));
		panel_2_1.setBounds(98, 199, 142, 55);
		panel_5.add(panel_2_1);
		
	    UpdateBtn = new JButton("UPDATE");
		UpdateBtn.setForeground(new Color(232, 216, 196));
		UpdateBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		UpdateBtn.setBackground(new Color(82, 35, 41));
		UpdateBtn.setBounds(10, 10, 122, 35);
		UpdateBtn.addActionListener(this);
		panel_2_1.add(UpdateBtn);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_2.setBackground(new Color(107, 46, 53));
		panel_2_2.setBounds(253, 199, 142, 55);
		panel_5.add(panel_2_2);
		
	    DeleteBtn = new JButton("DELETE");
		DeleteBtn.setForeground(new Color(232, 216, 196));
		DeleteBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		DeleteBtn.setBackground(new Color(82, 35, 41));
		DeleteBtn.setBounds(10, 10, 122, 35);
		DeleteBtn.addActionListener(this);
		panel_2_2.add(DeleteBtn);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(new Color(107, 46, 53));
		panel_2_1_1.setBounds(405, 199, 142, 55);
		panel_5.add(panel_2_1_1);
		
	    clearBtn = new JButton("CLEAR");
		clearBtn.setForeground(new Color(232, 216, 196));
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		clearBtn.setBackground(new Color(82, 35, 41));
		clearBtn.setBounds(10, 10, 122, 35);
		panel_2_1_1.add(clearBtn);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("PRODUCT NAME:");
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1_1.setBounds(25, 91, 113, 13);
		panel_5.add(lblNewLabel_3_3_1_1);
		
		middleName = new JTextField();
		middleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		middleName.setForeground(new Color(0, 0, 0));
		middleName.setColumns(10);
		middleName.setBackground(new Color(232, 216, 196));
		middleName.setBounds(146, 82, 258, 36);
		panel_5.add(middleName);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("SOLD QUANTITY:");
		lblNewLabel_3_3_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1_1_1.setBounds(433, 91, 113, 13);
		panel_5.add(lblNewLabel_3_3_1_1_1);
		
		surName = new JTextField();
		surName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		surName.setForeground(new Color(0, 0, 0));
		surName.setColumns(10);
		surName.setBackground(new Color(232, 216, 196));
		surName.setBounds(556, 82, 55, 36);
		panel_5.add(surName);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(142, 60, 71));
		panel_4.setBounds(264, 10, 1001, 411);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 81, 1001, 330);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Username", "First Name", "Middle Name", "Surname", "Role", "Password"
			}
		));
		
		table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    // Fill text fields with selected row data
                	firstName.setText(table.getValueAt(selectedRow, 0).toString());
                	middleName.setText(table.getValueAt(selectedRow, 1).toString());
                	surName.setText(table.getValueAt(selectedRow, 2).toString());
                	userName.setText(table.getValueAt(selectedRow, 3).toString());
                	password.setText(table.getValueAt(selectedRow, 4).toString());
                	comboBoxRole.setSelectedItem(table.getValueAt(selectedRow, 5).toString());
                }
            }
        });
		scrollPane.setViewportView(table);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setBackground(new Color(85, 43, 51));
		panel_4_1.setBounds(197, 17, 302, 51);
		panel_4.add(panel_4_1);
		
		comboBoxStartDate = new JComboBox();
		comboBoxStartDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxStartDate.setModel(new DefaultComboBoxModel(new String[] {" ", "dates"}));
		comboBoxStartDate.setBackground(new Color(255, 242, 213));
		comboBoxStartDate.setBounds(10, 10, 282, 31);
		panel_4_1.add(comboBoxStartDate);
		
		JLabel lblNewLabel_3_4 = new JLabel("STARTING DATE:");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(61, 36, 132, 13);
		panel_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
		user.loadUserTable(table);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("ENDING DATE:");
		lblNewLabel_3_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4_1.setBounds(506, 36, 132, 13);
		panel_4.add(lblNewLabel_3_4_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1_1.setBackground(new Color(85, 43, 51));
		panel_4_1_1.setBounds(642, 17, 302, 51);
		panel_4.add(panel_4_1_1);
		
		comboBoxEndDate = new JComboBox();
		comboBoxEndDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEndDate.setModel(new DefaultComboBoxModel(new String[] {" ", "dates"}));
		comboBoxEndDate.setBackground(new Color(255, 242, 213));
		comboBoxEndDate.setBounds(10, 10, 282, 31);
		panel_4_1_1.add(comboBoxEndDate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(928, 466, 335, 204);
		panel_2.setBackground(new Color(142, 60, 71));
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_3_1_2_1 = new JLabel("TOTAL REVENEU FOR THE");
		lblNewLabel_3_3_1_2_1.setBounds(32, 28, 271, 26);
		lblNewLabel_3_3_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_2.add(lblNewLabel_3_3_1_2_1);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("FILTERED TIME PERIOD:");
		lblNewLabel_3_3_1_2.setBounds(32, 55, 262, 26);
		lblNewLabel_3_3_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_2.add(lblNewLabel_3_3_1_2);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		textField_1.setText("$ 000,000,000.00");
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(232, 216, 196));
		textField_1.setBounds(32, 89, 271, 82);
		panel_2.add(textField_1);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		// side panel Action listener
		if(e.getSource() == DashboardBtn)
		{
			dispose();
			new Admin_Dashboard();
		}
		else if(e.getSource() == btnProducts)
		{
			dispose();
			new Admin_Products();
		}
		else if(e.getSource() == Transactions)
		{
			dispose();
			new Admin_Transactions();
		}
		else if(e.getSource() == Logout)
		{
			dispose();
			new AdminLogin();
		}
		else if(e.getSource() == register)
		{
			dispose();
			new Admin_Register();
		}
		// Register ACtion Listerner
		else if(e.getSource() == UpdateBtn)
		{
			String FirstName = firstName.getText();
			String MiddleInitial = middleName.getText();
			String LastName = surName.getText();
			String UserName = userName.getText();
			String Password = password.getText();
			String Role = (String) comboBoxRole.getSelectedItem();
			int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Update this user?");
			if (confirm == JOptionPane.YES_OPTION) 
			{
				user.updateUser(FirstName, MiddleInitial, LastName, UserName, Password, Role);
				user.loadUserTable(table);
			}
		}
		else if(e.getSource() == DeleteBtn)
		{
			String UserName = userName.getText();
			int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Delete this user?");
			if (confirm == JOptionPane.YES_OPTION) 
			{
				user.deleteUser(UserName);
				user.loadUserTable(table);
			}
		}
		else if(e.getSource() == search)
		{
			String query = search.getText().toLowerCase();
			//searchUsers(query);
		}
		
	}
}