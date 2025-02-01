package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Admin_Transactions extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
	public Admin_Transactions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1335, 758);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Transactions.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 13020, 720);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1320, 745);
		panel.setOpaque(false); // Makes the panel transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background
		lblNewLabel.add(panel);
		panel.setLayout(null);
		
		
		JButton btnDashboard = new JButton("DASHBOARD");
		btnDashboard.setBackground(new Color(109, 41, 50));
		btnDashboard.setForeground(new Color(232, 216, 196));
		btnDashboard.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDashboard.setBounds(0, 254, 243, 63);
		panel.add(btnDashboard);

		
		JButton btnProducts = new JButton("PRODUCTS");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 327, 243, 63);
		panel.add(btnProducts);
		
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setForeground(new Color(232, 216, 196));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBackground(new Color(109, 41, 50));
		btnRegister.setBounds(0, 400, 243, 63);
		panel.add(btnRegister);
		
		
		JButton btnTransactions = new JButton("TRANSACTIONS");
		btnTransactions.setForeground(new Color(232, 216, 196));
		btnTransactions.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTransactions.setBackground(new Color(109, 41, 50));
		btnTransactions.setBounds(0, 473, 243, 63);
		panel.add(btnTransactions);
		
		btnTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setForeground(new Color(232, 216, 196));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogOut.setBackground(new Color(109, 41, 50));
		btnLogOut.setBounds(0, 587, 243, 63);
		panel.add(btnLogOut);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(529, 28, 289, 46);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(925, 28, 289, 46);
		panel.add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(278, 87, 1030, 345);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(506, 473, 161, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(427, 538, 258, 36);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(428, 596, 147, 36);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(871, 538, 40, 36);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(736, 596, 175, 36);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(382, 659, 129, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(538, 659, 129, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(697, 97, 85, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(697, 659, 129, 40);
		panel.add(btnNewButton_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(981, 598, 292, 69);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		
		
	}
}
