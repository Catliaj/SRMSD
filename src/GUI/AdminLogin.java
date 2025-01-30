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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

import models.loginAuth;

public class AdminLogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton btnReset;
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
		lblNewLabel.setIcon(new ImageIcon(LoginMenu.class.getResource("/Resources/AdminLogin_Background.png")));
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
		usernameField.setBounds(259, 182, 171, 24);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(232, 216, 196));
		passwordField.setBounds(259, 237, 171, 25);
		panel.add(passwordField);
		
		
	    btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(86, 28, 36));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(this);
		btnReset.setBounds(287, 269, 117, 20);
		panel.add(btnReset);
		
		
	    btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(86, 28, 36));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(this);
		btnLogin.setBounds(287, 294, 117, 20);
		panel.add(btnLogin);
		
	    btnBack = new JButton("BACK");
		btnBack.addActionListener(this);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(86, 28, 36));
		btnBack.setBounds(287, 319, 117, 20);
		panel.add(btnBack);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		// reset action button
		if(e.getSource() == btnReset)
		{
			usernameField.setText("");
			passwordField.setText("");
		}
		// login action button
		else if(e.getSource()== btnLogin)
		{
			loginAuth authentication  = new loginAuth();
			String username = usernameField.getText();
			String password = String.valueOf(passwordField.getPassword());
			authentication.adminLogin(username, password);
			if(authentication.loginSuccess())
			{
				dispose();
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
