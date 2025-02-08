package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.*;

import models.adminDashboard;



public class LowStock_Popup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LowStock_Popup frame = new LowStock_Popup();
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
	public LowStock_Popup() {
		adminDashboard method = new adminDashboard();

		setForeground(new Color(0, 0, 0));
		setTitle("IM Activity 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 705);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 28, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
        setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TopSelling_Popup.class.getResource("/Resources/Popup_Background.png")));
		lblNewLabel.setBounds(0, 0, 460, 668);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 474, 690);
		panel.setOpaque(false); // Makes the panel transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background
		lblNewLabel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_main = new JPanel();
		panel_main.setBackground(new Color(109, 41, 50));
		panel_main.setBounds(18, 17, 425, 642);
		panel.add(panel_main);
		panel_main.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(88, 28, 36));
		panel_1.setBounds(18, 18, 391, 107);
		panel_main.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(142, 60, 71));
		panel_1_2.setBounds(10, 10, 371, 87);
		panel_1.add(panel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("LOW STOCK");
		lblNewLabel_2.setBounds(148, 17, 152, 26);
		panel_1_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(232, 216, 196));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(74, 10, 64, 64);
		panel_1_2.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(LowStock_Popup.class.getResource("/Resources/alerticon.png")));
		
		JLabel lblNewLabel_2_1 = new JLabel("ALERT");
		lblNewLabel_2_1.setBounds(148, 43, 152, 26);
		panel_1_2.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(88, 28, 36));
		panel_1_1.setBounds(141, 565, 153, 63);
		panel_main.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(142, 60, 71));
		panel_2.setBounds(6, 6, 142, 51);
		panel_1_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBackground(new Color(232, 216, 196));
		btnNewButton.setForeground(new Color(142, 60, 71));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(8, 7, 126, 35);
		panel_2.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Close the current Transactions frame
				
			}
		});
		
		
		// Scroll Pane for Table
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(18, 134, 391, 420);
	    panel_main.add(scrollPane);

	    table = new JTable();
	    table.setFont(new Font("Tahoma", Font.BOLD, 10));

	    // Set model from adminDashboard
	    table.setModel(method.updateLowStockTable());

	    table.setFillsViewportHeight(true);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.setRowHeight(66);

	    table.getColumnModel().getColumn(0).setPreferredWidth(50);  // Rank
	    table.getColumnModel().getColumn(1).setPreferredWidth(250); // Product Name
	    table.getColumnModel().getColumn(2).setPreferredWidth(50);  // Qty.

	    // Center align all columns
	    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
	    for (int i = 0; i < table.getColumnCount(); i++) {
	        table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
	    }
		
		scrollPane.setViewportView(table);
		
		setVisible(true);
		
	}
}
