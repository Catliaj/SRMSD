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
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Admin_Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Register frame = new Admin_Register();
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
	public Admin_Register() {
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
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 488, 280, 225);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
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
		
		JButton btnNewButton = new JButton("DASHBOARD");
		btnNewButton.setBackground(new Color(109, 41, 50));
		btnNewButton.setForeground(new Color(232, 216, 196));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(0, 216, 243, 63);
		panel_3.add(btnNewButton);
		
		JButton btnProducts = new JButton("PRODUCTS");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 289, 243, 63);
		panel_3.add(btnProducts);
		
		JButton btnNewButton_1_1 = new JButton("REGISTER");


		btnNewButton_1_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(109, 41, 50));
		btnNewButton_1_1.setBounds(0, 362, 243, 63);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("LOG OUT");
		btnNewButton_1_1_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(109, 41, 50));
		btnNewButton_1_1_1.setBounds(0, 570, 243, 63);
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("TRANSACTIONS");
		btnNewButton_1_1_2.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_2.setBackground(new Color(109, 41, 50));
		btnNewButton_1_1_2.setBounds(0, 435, 243, 63);
		panel_3.add(btnNewButton_1_1_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(142, 60, 71));
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(264, 431, 1001, 272);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(232, 216, 196));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(232, 216, 196));
		textField_1.setBounds(463, 133, 164, 34);
		panel_5.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(232, 216, 196));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(232, 216, 196));
		textField_2.setBounds(765, 133, 172, 34);
		panel_5.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(232, 216, 196));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(232, 216, 196));
		textField_3.setBounds(147, 51, 172, 34);
		panel_5.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(232, 216, 196));
		comboBox.setBounds(147, 133, 172, 34);
		panel_5.add(comboBox);
		
		JLabel lblNewLabel_3_2 = new JLabel("USERNAME:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(343, 143, 98, 13);
		panel_5.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("PASSWORD:");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(645, 142, 98, 13);
		panel_5.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("ROLE:");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1.setBounds(24, 143, 113, 13);
		panel_5.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("FIRST NAME:");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1.setBounds(39, 60, 98, 13);
		panel_5.add(lblNewLabel_3_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(107, 46, 53));
		panel_2.setBounds(41, 199, 142, 55);
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1.setBackground(new Color(82, 35, 41));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 10, 122, 35);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(new Color(107, 46, 53));
		panel_2_1.setBounds(278, 199, 142, 55);
		panel_5.add(panel_2_1);
		
		JButton btnNewButton_1_2 = new JButton("UPDATE");
		btnNewButton_1_2.setForeground(new Color(232, 216, 196));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(82, 35, 41));
		btnNewButton_1_2.setBounds(10, 10, 122, 35);
		panel_2_1.add(btnNewButton_1_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_2.setBackground(new Color(107, 46, 53));
		panel_2_2.setBounds(531, 199, 142, 55);
		panel_5.add(panel_2_2);
		
		JButton btnNewButton_1_3 = new JButton("DELETE");
		btnNewButton_1_3.setForeground(new Color(232, 216, 196));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(82, 35, 41));
		btnNewButton_1_3.setBounds(10, 10, 122, 35);
		panel_2_2.add(btnNewButton_1_3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(new Color(107, 46, 53));
		panel_2_1_1.setBounds(817, 199, 142, 55);
		panel_5.add(panel_2_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("CLEAR");
		btnNewButton_1_2_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1.setBackground(new Color(82, 35, 41));
		btnNewButton_1_2_1.setBounds(10, 10, 122, 35);
		panel_2_1_1.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("MIDDLE NAME:");
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1_1.setBounds(349, 60, 98, 13);
		panel_5.add(lblNewLabel_3_3_1_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(232, 216, 196));
		textField.setColumns(10);
		textField.setBackground(new Color(232, 216, 196));
		textField.setBounds(457, 51, 172, 34);
		panel_5.add(textField);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("SURNAME:");
		lblNewLabel_3_3_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_1_1_1.setBounds(657, 60, 98, 13);
		panel_5.add(lblNewLabel_3_3_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(232, 216, 196));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(232, 216, 196));
		textField_4.setBounds(765, 51, 172, 34);
		panel_5.add(textField_4);
		
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
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Username", "First Name", "Middle Name", "Surname", "Role", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setBackground(new Color(85, 43, 51));
		panel_4_1.setBounds(403, 15, 302, 51);
		panel_4.add(panel_4_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 242, 213));
		textField_6.setBounds(10, 10, 282, 31);
		panel_4_1.add(textField_6);
		
		JLabel lblNewLabel_3_4 = new JLabel("SEARCH:");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(301, 34, 98, 13);
		panel_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
	}
}