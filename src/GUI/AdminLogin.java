package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.loginAuth;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class AdminLogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnBack;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("IM Activity 1");
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 28, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
        setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(LoginMenu.class.getResource("/Resources/Adminlogin.png")));
		lblNewLabel.setBounds(0, 0, 685, 490);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 685, 490);
		panel.setOpaque(false); // Makes the panel transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background
		lblNewLabel.add(panel);
		panel.setLayout(null);
		
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.BOLD, 10));
		usernameField.setBackground(new Color(232, 216, 196));
		usernameField.setBounds(273, 202, 171, 24);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(232, 216, 196));
		passwordField.setBounds(273, 249, 171, 25);
		panel.add(passwordField);
		
		
	    btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(86, 28, 36));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(this);
		btnLogin.setBounds(295, 305, 117, 20);
		panel.add(btnLogin);
		
	    btnBack = new JButton("BACK");
		btnBack.addActionListener(this);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(86, 28, 36));
		btnBack.setBounds(295, 335, 117, 20);
		panel.add(btnBack);
		
		JLabel adminloginlbl = new JLabel("ADMIN LOGIN");
		adminloginlbl.setForeground(new Color(62, 19, 28));
		adminloginlbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		adminloginlbl.setBounds(283, 144, 335, 26);
		panel.add(adminloginlbl);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(273, 189, 77, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setForeground(new Color(232, 216, 196));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(273, 236, 77, 13);
		panel.add(lblNewLabel_1_1);
		
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== btnLogin)
		{
			loginAuth authentication  = new loginAuth();
			String username = usernameField.getText();
			String password = String.valueOf(passwordField.getPassword());
			authentication.adminLogin(username, password);
			if(authentication.loginSuccess())
			{
				dispose();
				new Admin_Dashboard();
			}
			else
			{
				usernameField.setText("");
				passwordField.setText("");
			}
		}
		// back action button
		else if(e.getSource() == btnBack)
		{
			dispose();
			new LoginMenu();
		}
	}
}
