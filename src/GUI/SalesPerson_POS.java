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

public class SalesPerson_POS extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesPerson_POS frame = new SalesPerson_POS();
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
	public SalesPerson_POS() {
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
		lblNewLabel_2.setBounds(51, 124, 172, 32);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(12, 182, 211, 32);
		panel_3.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton = new JButton("POS");
		btnNewButton.setBackground(new Color(109, 41, 50));
		btnNewButton.setForeground(new Color(232, 216, 196));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(0, 333, 243, 63);
		panel_3.add(btnNewButton);
		
		JButton btnProducts = new JButton("SALES");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 406, 243, 63);
		panel_3.add(btnProducts);
		
		JButton btnNewButton_1_1_1 = new JButton("LOG OUT");
		btnNewButton_1_1_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(109, 41, 50));
		btnNewButton_1_1_1.setBounds(0, 533, 243, 63);
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnDashboard = new JButton("DASHBOARD");
		btnDashboard.setForeground(new Color(232, 216, 196));
		btnDashboard.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDashboard.setBackground(new Color(109, 41, 50));
		btnDashboard.setBounds(0, 260, 243, 63);
		panel_3.add(btnDashboard);
		
		JLabel lblNewLabel_2_1 = new JLabel("SALES PERSON");
		lblNewLabel_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(22, 159, 211, 32);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 497, 280, 216);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1.setBackground(new Color(142, 60, 71));
		panel_5_1.setBounds(264, 21, 545, 671);
		panel_1.add(panel_5_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 525, 651);
		panel_5_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Category", "Product Name", "Quantity", "Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1_1.setBackground(new Color(142, 60, 71));
		panel_5_1_1.setBounds(834, 21, 431, 671);
		panel_1.add(panel_5_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(257, 219, 142, 55);
		panel_5_1_1.add(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(107, 46, 53));
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1.setBackground(new Color(82, 35, 41));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 10, 122, 35);
		panel_2.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(232, 216, 196));
		comboBox.setBounds(198, 36, 201, 36);
		panel_5_1_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(232, 216, 196));
		comboBox_1.setBounds(198, 97, 201, 36);
		panel_5_1_1.add(comboBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(new Color(232, 216, 196));
		spinner.setBounds(198, 156, 86, 36);
		panel_5_1_1.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("CATEGORY:");
		lblNewLabel_3.setForeground(new Color(232, 216, 196));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(67, 41, 114, 24);
		panel_5_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("PRODUCT NAME:");
		lblNewLabel_3_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(27, 104, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("QUANTITY:");
		lblNewLabel_3_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBounds(69, 162, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("TOTAL:");
		lblNewLabel_3_2_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_1_1.setBounds(100, 326, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(232, 216, 196));
		textField.setBounds(198, 314, 121, 44);
		panel_5_1_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("AMOUNT:");
		lblNewLabel_3_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_2_1_1_1.setBounds(79, 407, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(232, 216, 196));
		textField_1.setBounds(177, 400, 174, 36);
		panel_5_1_1.add(textField_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("CHANGE:");
		lblNewLabel_3_2_1_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_2_1_1_1_1.setBounds(79, 461, 154, 24);
		panel_5_1_1.add(lblNewLabel_3_2_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(232, 216, 196));
		textField_2.setBounds(177, 454, 126, 36);
		panel_5_1_1.add(textField_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(new Color(107, 46, 53));
		panel_2_1.setBounds(39, 530, 142, 55);
		panel_5_1_1.add(panel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("RECEIPT");
		btnNewButton_1_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(82, 35, 41));
		btnNewButton_1_1.setBounds(10, 10, 122, 35);
		panel_2_1.add(btnNewButton_1_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(new Color(107, 46, 53));
		panel_2_1_1.setBounds(257, 530, 142, 55);
		panel_5_1_1.add(panel_2_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("PAY");
		btnNewButton_1_1_2.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_2.setBackground(new Color(82, 35, 41));
		btnNewButton_1_1_2.setBounds(10, 10, 122, 35);
		panel_2_1_1.add(btnNewButton_1_1_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_2.setBackground(new Color(107, 46, 53));
		panel_2_1_2.setBounds(160, 595, 142, 55);
		panel_5_1_1.add(panel_2_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("RESET");
		btnNewButton_1_1_3.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_3.setBackground(new Color(82, 35, 41));
		btnNewButton_1_1_3.setBounds(10, 10, 122, 35);
		panel_2_1_2.add(btnNewButton_1_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}