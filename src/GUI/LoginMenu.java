package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu frame = new LoginMenu();
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
	public LoginMenu() {
		setForeground(new Color(0, 0, 0));
		setTitle("IM Activity 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 28, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
        setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginMenu.class.getResource("/Resources/Login.png")));
		lblNewLabel.setBounds(0, 0, 685, 490);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 685, 490);
		panel.setOpaque(false); // Makes the panel transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background
		lblNewLabel.add(panel);
		panel.setLayout(null);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(LoginMenu.class.getResource("/Resources/user.png")));
		// Make the background transparent
		btnUser.setContentAreaFilled(false);
		btnUser.setBorderPainted(false);
		btnUser.setFocusPainted(false);
		btnUser.setBounds(181, 166, 98, 95);
		panel.add(btnUser);
		
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Close the current Transactions frame
                UserLogin usersFrame = new UserLogin(); // Open the Customers frame
                usersFrame.setVisible(true); // Set the Customers frame visible
			}
		});
		
		JButton btnAdmin = new JButton("");
		btnAdmin.setIcon(new ImageIcon(LoginMenu.class.getResource("/Resources/admin.png")));
		// Make the background transparent
		btnAdmin.setContentAreaFilled(false);
		btnAdmin.setBorderPainted(false);
		btnAdmin.setFocusPainted(false);		
		btnAdmin.setBounds(406, 166, 98, 95);
		panel.add(btnAdmin);
		
		JLabel lblNewLabel_1 = new JLabel("SALESPERSON");
		lblNewLabel_1.setForeground(new Color(227, 221, 200));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(162, 350, 184, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ADMIN");
		lblNewLabel_1_1.setForeground(new Color(227, 221, 200));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(416, 350, 184, 25);
		panel.add(lblNewLabel_1_1);
		
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Close the current Transactions frame
				AdminLogin adminsFrame = new AdminLogin(); // Open the Customers frame
                adminsFrame.setVisible(true); // Set the Customers frame visible
			}
		});
		
		setVisible(true);
		
	}
}
