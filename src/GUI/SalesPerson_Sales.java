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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class SalesPerson_Sales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_3 = new JPanel();
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesPerson_Sales frame = new SalesPerson_Sales();
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
	public SalesPerson_Sales() {
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
		lblNewLabel_3_1.setBounds(0, 497, 280, 216);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/design1.png")));
		
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
		lblNewLabel_2_1_1.setBounds(10, 204, 211, 32);
		panel_3.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton = new JButton("POS");
		btnNewButton.setBackground(new Color(109, 41, 50));
		btnNewButton.setForeground(new Color(232, 216, 196));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(0, 306, 243, 63);
		panel_3.add(btnNewButton);
		
		JButton btnProducts = new JButton("SALES");
		btnProducts.setForeground(new Color(232, 216, 196));
		btnProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProducts.setBackground(new Color(109, 41, 50));
		btnProducts.setBounds(0, 379, 243, 63);
		panel_3.add(btnProducts);
		
		JButton btnNewButton_1_1_1 = new JButton("LOG OUT");
		btnNewButton_1_1_1.setForeground(new Color(232, 216, 196));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(109, 41, 50));
		btnNewButton_1_1_1.setBounds(0, 533, 243, 63);
		panel_3.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("SALES PERSON");
		lblNewLabel_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(22, 159, 211, 32);
		panel_3.add(lblNewLabel_2_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5_1.setBackground(new Color(142, 60, 71));
		panel_5_1.setBounds(264, 83, 994, 385);
		panel_1.add(panel_5_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 974, 365);
		panel_5_1.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {			},
			new String[] {
				"Product", "Sold Quantity", "Sales Date", "Total Sales"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(146, 75, 84));
		panel_2.setBounds(264, 11, 994, 62);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("STARTING DATE:");
		lblNewLabel_2_1_2.setBounds(137, 15, 211, 32);
		panel_2.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(277, 15, 236, 32);
		panel_2.add(dateChooser);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("ENDING DATE:");
		lblNewLabel_2_1_2_1.setBounds(557, 15, 211, 32);
		panel_2.add(lblNewLabel_2_1_2_1);
		lblNewLabel_2_1_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(SalesPerson_Sales.class.getResource("/Resources/people (1).png")));
		lblNewLabel_3.setBounds(71, 10, 71, 42);
		panel_2.add(lblNewLabel_3);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(682, 15, 229, 32);
		panel_2.add(dateChooser_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(83, 36, 43));
		panel_4.setBounds(579, 479, 326, 132);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 66, 77));
		panel_5.setBounds(10, 10, 306, 112);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("TOTAL REVENUE");
		lblNewLabel_2_1_2_2.setBounds(68, 70, 211, 32);
		panel_5.add(lblNewLabel_2_1_2_2);
		lblNewLabel_2_1_2_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setForeground(new Color(222, 214, 175));
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBackground(new Color(153, 66, 77));
		textField.setBounds(68, 10, 167, 61);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setBackground(new Color(83, 36, 43));
		panel_4_1.setBounds(517, 629, 445, 62);
		panel_1.add(panel_4_1);
		
		JButton btnNewButton_1 = new JButton("MY PERFORMANCE");
		btnNewButton_1.setForeground(new Color(231, 222, 190));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBackground(new Color(153, 68, 83));
		btnNewButton_1.setBounds(10, 10, 422, 42);
		panel_4_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1.setBounds(318, 523, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_1.setBounds(960, 523, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("______________");
		lblNewLabel_2_1_1_1_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_2.setBounds(285, 558, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("______________");
		lblNewLabel_2_1_1_1_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2_1_1_1_2_1.setBounds(1006, 558, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_2 = new JLabel("============");
		lblNewLabel_2_1_1_1_2_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_2_2.setBounds(351, 491, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2_2);
		
		JLabel lblNewLabel_2_1_1_1_2_2_1 = new JLabel("============");
		lblNewLabel_2_1_1_1_2_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1_1_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_2_2_1.setBounds(934, 491, 211, 32);
		panel_1.add(lblNewLabel_2_1_1_1_2_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Dashboard.class.getResource("/Resources/MainBackground.png")));
		lblNewLabel.setBounds(0, 0, 1311, 713);
		panel_1.add(lblNewLabel);
	}
}