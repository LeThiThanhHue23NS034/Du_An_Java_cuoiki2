package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentDetials extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;
	private JTextField jTextField10;
	private JTextField jTextField11;
	private JTextField jTextField12;
	private JTextField jTextField13;
	private JTextField jTextField14;
	private JTextField jTextField15;
	private JTextField jTextField16;
	private JTextArea jTextAreal;
	private JLabel jLabel4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDetials frame = new studentDetials();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */public studentDetials() {
		 init();
		 jTextAreal.setEditable(false);
		 SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		 Date date = new Date();
		 jLabel4.setText(dFormat.format(date));
		 
	 }
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILL OF THE FORM");
		lblNewLabel.setBounds(53, 22, 325, 69);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-studentDetials.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date:\r\n");
		lblNewLabel_1.setBounds(429, 22, 146, 69);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		jLabel4 = new JLabel("New label");
		jLabel4.setBounds(536, 50, 112, 13);
		jLabel4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(jLabel4);
		
		JLabel lblNewLabel_3 = new JLabel("Back");
		lblNewLabel_3.setBounds(827, 22, 87, 37);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new index().setVisible(true);
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-back.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(939, 22, 60, 37);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application","Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
					System.exit(0);
				}
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Exit.png"));
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 89, 846, 13);
		contentPane.add(separator);
		
		JLabel lblNewLabel_5 = new JLabel("Roll Number");
		lblNewLabel_5.setBounds(11, 112, 154, 13);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name");
		lblNewLabel_5_1.setBounds(10, 150, 155, 13);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Gender");
		lblNewLabel_5_2.setBounds(10, 272, 155, 13);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Mother Name");
		lblNewLabel_5_3.setBounds(10, 229, 155, 13);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Father Name");
		lblNewLabel_5_4.setBounds(10, 195, 155, 13);
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Email");
		lblNewLabel_5_5.setBounds(11, 346, 154, 13);
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact Number");
		lblNewLabel_6.setBounds(10, 311, 155, 25);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_6 = new JLabel("10th");
		lblNewLabel_5_6.setBounds(10, 392, 155, 13);
		lblNewLabel_5_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("12th");
		lblNewLabel_5_7.setBounds(10, 431, 155, 13);
		lblNewLabel_5_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("Graduation");
		lblNewLabel_5_8.setBounds(10, 474, 155, 13);
		lblNewLabel_5_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_5_9 = new JLabel("Address");
		lblNewLabel_5_9.setBounds(10, 517, 155, 13);
		lblNewLabel_5_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5_9);
		
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField1.setBounds(192, 116, 286, 19);
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);
		
		jTextField2 = new JTextField();
		jTextField2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField2.setBounds(192, 154, 286, 19);
		jTextField2.setColumns(10);
		contentPane.add(jTextField2);
		
		jTextField3 = new JTextField();
		jTextField3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField3.setBounds(192, 199, 286, 19);
		jTextField3.setColumns(10);
		contentPane.add(jTextField3);
		
		jTextField4 = new JTextField();
		jTextField4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField4.setBounds(192, 224, 286, 19);
		jTextField4.setColumns(10);
		contentPane.add(jTextField4);
		
		jTextField5 = new JTextField();
		jTextField5.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField5.setBounds(192, 306, 286, 19);
		jTextField5.setColumns(10);
		contentPane.add(jTextField5);
		
		jTextField6 = new JTextField();
		jTextField6.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField6.setBounds(192, 346, 286, 19);
		jTextField6.setColumns(10);
		contentPane.add(jTextField6);
		
		jTextField7 = new JTextField();
		jTextField7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField7.getText().equals("Enter University Name")) {
					jTextField7.setText("");
					jTextField7.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField7.getText().equals("")) {
					jTextField7.setText("Enter University Name");
					jTextField7.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField7.setForeground(new Color(198, 198, 198));
		jTextField7.setText("Enter University Name");
		jTextField7.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField7.setBounds(175, 392, 286, 25);
		jTextField7.setColumns(10);
		contentPane.add(jTextField7);
		
		jTextField8 = new JTextField();
		jTextField8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField8.getText().equals("Enter Percentage")) {
					jTextField8.setText("");
					jTextField8.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField8.getText().equals("")) {
					jTextField8.setText("Enter Percentage");
					jTextField8.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField8.setForeground(new Color(198, 198, 198));
		jTextField8.setText("Enter Percentage");
		jTextField8.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField8.setBounds(524, 392, 203, 25);
		jTextField8.setColumns(10);
		contentPane.add(jTextField8);
		
		jTextField9 = new JTextField();
		jTextField9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField9.getText().equals("Enter Passout Year")) {
					jTextField9.setText("");
					jTextField9.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField9.getText().equals("")) {
					jTextField9.setText("Enter Passout Year");
					jTextField9.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField9.setForeground(new Color(198, 198, 198));
		jTextField9.setText("Enter Passout Year");
		jTextField9.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField9.setBounds(770, 392, 213, 25);
		jTextField9.setColumns(10);
		contentPane.add(jTextField9);
		
		jTextField10 = new JTextField();
		jTextField10.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField10.getText().equals("Enter University Name")) {
					jTextField10.setText("");
					jTextField10.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField10.getText().equals("")) {
					jTextField10.setText("Enter University Name");
					jTextField10.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField10.setForeground(new Color(198, 198, 198));
		jTextField10.setText("Enter University Name");
		jTextField10.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField10.setBounds(175, 427, 286, 25);
		jTextField10.setColumns(10);
		contentPane.add(jTextField10);
		
		jTextField11 = new JTextField();
		jTextField11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField11.getText().equals("Enter Percentage")) {
					jTextField11.setText("");
					jTextField11.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField11.getText().equals("")) {
					jTextField11.setText("Enter Percentage");
					jTextField11.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField11.setForeground(new Color(198, 198, 198));
		jTextField11.setText("Enter Percentage");
		jTextField11.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField11.setBounds(524, 427, 203, 25);
		jTextField11.setColumns(10);
		contentPane.add(jTextField11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(192, 271, 112, 21);
		contentPane.add(comboBox);
		
		jTextField12 = new JTextField();
		jTextField12.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField12.getText().equals("Enter Passout Year")) {
					jTextField12.setText("");
					jTextField12.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField12.getText().equals("")) {
					jTextField12.setText("Enter Passout Year");
					jTextField12.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField12.setForeground(new Color(198, 198, 198));
		jTextField12.setText("Enter Passout Year");
		jTextField12.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField12.setColumns(10);
		jTextField12.setBounds(787, 430, 212, 22);
		contentPane.add(jTextField12);
		
		jTextField13 = new JTextField();
		jTextField13.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField13.getText().equals("Enter University Name")) {
					jTextField13.setText("");
					jTextField13.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField13.getText().equals("")) {
					jTextField13.setText("Enter University Name");
					jTextField13.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField13.setForeground(new Color(198, 198, 198));
		jTextField13.setText("Enter University Name");
		jTextField13.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField13.setColumns(10);
		jTextField13.setBounds(175, 470, 286, 25);
		contentPane.add(jTextField13);
		
		jTextField14 = new JTextField();
		jTextField14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField14.getText().equals("Enter Percentage")) {
					jTextField14.setText("");
					jTextField14.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField14.getText().equals("")) {
					jTextField14.setText("Enter Percentage");
					jTextField14.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField14.setForeground(new Color(198, 198, 198));
		jTextField14.setText("Enter Percentage");
		jTextField14.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField14.setColumns(10);
		jTextField14.setBounds(524, 470, 203, 25);
		contentPane.add(jTextField14);
		
		jTextField15 = new JTextField();
		jTextField15.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (jTextField15.getText().equals("Enter Passout Year")) {
					jTextField15.setText("");
					jTextField15.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(jTextField15.getText().equals("")) {
					jTextField15.setText("Enter Passout Year");
					jTextField15.setForeground(new Color (153, 153, 153));
				}
			}
		});
		jTextField15.setForeground(new Color(198, 198, 198));
		jTextField15.setText("Enter Passout Year");
		jTextField15.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField15.setColumns(10);
		jTextField15.setBounds(786, 470, 213, 25);
		contentPane.add(jTextField15);
		
		jTextField16 = new JTextField();
		jTextField16.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField16.setColumns(10);
		jTextField16.setBounds(192, 513, 627, 35);
		contentPane.add(jTextField16);
		
		JButton btn = new JButton("Save\r\n & Next");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollNo = jTextField1.getText();
				String name = jTextField2.getText();
				String fatherName = jTextField3.getText();
				String motherName = jTextField4.getText();
				String gender = (String) comboBox.getSelectedItem();
				String contactNo = jTextField5.getText();
				String email = jTextField6.getText();
				String tenthUniversityName = jTextField7.getText();
				String tenthPercentage = jTextField8.getText();
				String tenthPassoutYear = jTextField9.getText();
				String twelveUniversityName = jTextField10.getText();
				String twelvePercentage = jTextField11.getText();
				String twelvePassoutYear = jTextField12.getText();
				String graduationUniversityName = jTextField13.getText();
				String graduationPercentage = jTextField14.getText();
				String graduationPassoutYear = jTextField15.getText();
				String address = jTextField16.getText();
				String marks = "0";
				
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString (1, rollNo);
					ps.setString (2, name);
					ps.setString (3, fatherName);
					ps.setString (4, motherName);
					ps.setString (5, gender);
					ps.setString (6, contactNo);
					ps.setString (7, email);
					ps.setString (8, tenthUniversityName);
					ps.setString (9, tenthPercentage);
					ps.setString (10, tenthPassoutYear);
					ps.setString (11, twelveUniversityName);
					ps.setString (12, twelvePercentage);
					ps.setString (13, twelvePassoutYear);
					ps.setString (14, graduationUniversityName);
					ps.setString (15, graduationPercentage);
					ps.setString (16, graduationPassoutYear);
					ps.setString (17, address);
					ps.setString (18, marks);
					ps.executeUpdate();
					setVisible(false);
					new instructionStudent(rollNo).setVisible(true);
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
//					e2.printStackTrace();
					
				}
			}
		});
		btn.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Save.png"));
		btn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn.setBounds(195, 566, 624, 35);
		contentPane.add(btn);
		
		jTextAreal = new JTextArea();
		jTextAreal.setFont(new Font("Monospaced", Font.BOLD, 18));
		jTextAreal.setText("HỆ THỐNG QUẢN LÝ KỲ THI ĐANG QUẢN LÝ \r\nTẤT CẢ CÁC HOẠT ĐỘNG LIÊN QUAN ĐẾN \r\nQUẢN LÝ KỲ THI NGAY TỪ KHI NHẬN PHIẾU \r\nĐĂNG KÝ VÀ PHIẾU THI CHO ĐẾN VIỆC \r\nXỬ LÝ KẾT QUẢ, CHỨNG CHỈ VÀ CHẤM ĐIỂM \r\nBÁO CÁO.");
		jTextAreal.setBounds(534, 142, 420, 186);
		contentPane.add(jTextAreal);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1009, 611);
		contentPane.add(lblNewLabel_7);
	}
}
