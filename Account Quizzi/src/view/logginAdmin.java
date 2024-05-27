package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logginAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jTextField1;
	private JPasswordField passwordField;
	private JCheckBox jCheckBox1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logginAdmin frame = new logginAdmin();
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
	public logginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(344, 74, 92, 33);
		contentPane.add(lblNewLabel);
		
		jTextField1 = new JTextField();
		jTextField1.setBounds(285, 117, 186, 19);
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(344, 146, 182, 33);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(285, 189, 186, 19);
		contentPane.add(passwordField);
		
		jCheckBox1 = new JCheckBox("Show Password");
		jCheckBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jCheckBox1.isSelected()) {
					passwordField.setEchoChar((char)0);
				} else {
					passwordField.setEchoChar('*');
				}
			}
		});
		jCheckBox1.setBounds(344, 236, 110, 21);
		contentPane.add(jCheckBox1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField1.getText().equals("giang") && passwordField.getText().equals("123"))
				{
					setVisible(false);
					new adminHome().setVisible(true);
					
				}else {
					ImageIcon icon = new ImageIcon("Incorrect Password.svg");
					JOptionPane.showMessageDialog(null, "<html><b style=\"color: red; font-size:10px\">Incorrect <br> Username or Password</b></html>","Show",JOptionPane.INFORMATION_MESSAGE,icon);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-login.png"));
		btnNewButton.setBounds(253, 293, 127, 41);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new index().setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-back.png"));
		btnBack.setBounds(415, 293, 111, 41);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground-loggin.jpg"));
		lblNewLabel_1.setBounds(-207, 0, 1062, 381);
		contentPane.add(lblNewLabel_1);
	}
}
