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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.AcceptPendingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class quizExamStudent extends JFrame {

	public String questionId = "1";
	public String answer;
	public int min = 0;
	public int sec = 0;
	public int marks = 0;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel jLabel4;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel13;
	private JLabel jLabel11;
	private JLabel jLabel17;
	private JLabel jLabel19;
	private JLabel jLabel20;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JButton jButton1;
	private JButton jButton2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizExamStudent frame = new quizExamStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void answerCheck() {
		String studentAnswer="";
		if (jRadioButton1.isSelected()) {
			studentAnswer = jRadioButton1.getText();
		}else if (jRadioButton2.isSelected()) {
			studentAnswer = jRadioButton2.getText();
		}
		else if (jRadioButton3.isSelected()) {
			studentAnswer = jRadioButton3.getText();
		}
		else {
			studentAnswer = jRadioButton4.getText();
		}
		if (studentAnswer.equals(answer)) {
			marks = marks+1;
			String marks1 = String.valueOf(marks);
			jLabel19.setText(marks1);
			
		}
//		question number change
		int questionId1 = Integer.parseInt(questionId);
		questionId1 = questionId1+1;
		questionId = String.valueOf(questionId);
		
//		clear jRadioButton
		jRadioButton1.setSelected(false);
		jRadioButton2.setSelected(false);
		jRadioButton3.setSelected(false);
		jRadioButton4.setSelected(false);
		
//		last question hide next button
		if (questionId.equals("10" )) {
			jButton1.setVisible(false);
		}
	}

	public void question() {
		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs1 = st.executeQuery("select *from question where id='" + questionId + "'");
			while (rs1.next()) {
				jLabel17.setText(rs1.getString(1));
				jLabel20.setText(rs1.getString(2));
				jRadioButton1.setText(rs1.getString(3));
				jRadioButton2.setText(rs1.getString(4));
				jRadioButton3.setText(rs1.getString(5));
				jRadioButton4.setText(rs1.getString(6));
				answer = rs1.getString(7);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void submit() {
String rollNo = jLabel11.getText();
answerCheck();
try {
				Connection con = ConnectionProvider.getCon();
				Statement st = con.createStatement();
				st.executeUpdate("update student set marks='"+marks+"' where rollNo='"+rollNo+"'");
				String marks1 = String.valueOf(marks);
				JOptionPane.showMessageDialog(null, marks1);

} catch (Exception e) {
	JOptionPane.showMessageDialog(null, e);
}
	}

	public quizExamStudent() {
		setAlwaysOnTop(true);
		init();
	}

	Timer time;
	
	

	public quizExamStudent(String rollNo) {
		init();
		jLabel11.setText(rollNo);
//		DATE
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		jLabel4.setText(dFormat.format(date));

//		Câu hỏi đầu tiên và chi tiết sinh viên
		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from student where rollNo='" + rollNo + "'");
			while (rs.next()) {
				jLabel13.setText(rs.getString(2));
			}
			ResultSet rs1 = st.executeQuery("select *from question where id='" + questionId + "'");
			while (rs1.next()) {
				jLabel17.setText(rs1.getString(1));
				jLabel20.setText(rs1.getString(2));
				jRadioButton1.setText(rs1.getString(3));
				jRadioButton2.setText(rs1.getString(4));
				jRadioButton3.setText(rs1.getString(5));
				jRadioButton4.setText(rs1.getString(6));
				answer = rs1.getString(7);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

//		time program
		setLocationRelativeTo(this);
		time = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jLabel8.setText(String.valueOf(min));
				jLabel9.setText(String.valueOf(sec));
				if (sec == 60) {
					sec = 0;
					min++;
					if (min == 10) {
						time.stop();
						answerCheck();
						submit();
					}
				}
				sec++;
			}
		});
		time.start();
	}

	/**
	 * Create the frame.
	 */

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1119, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(0, 0, 1095, 107);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setBounds(61, 30, 182, 40);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-studentDetials.png"));

		JLabel jLabel3 = new JLabel("Date:");
		jLabel3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel3.setBounds(321, 51, 77, 13);
		panel.add(jLabel3);

		jLabel4 = new JLabel("");
		jLabel4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel4.setBounds(396, 44, 82, 26);
		panel.add(jLabel4);

		JLabel jLabel5 = new JLabel("Total Time:");
		jLabel5.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel5.setBounds(523, 10, 133, 13);
		panel.add(jLabel5);

		JLabel jLabel6 = new JLabel("10 Min");
		jLabel6.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel6.setBounds(703, 10, 68, 13);
		panel.add(jLabel6);

		JLabel jLabel7 = new JLabel("Time Taken:");
		jLabel7.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel7.setBounds(524, 44, 146, 13);
		panel.add(jLabel7);

		jLabel8 = new JLabel("00");
		jLabel8.setForeground(new Color(255, 0, 0));
		jLabel8.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel8.setBounds(703, 44, 68, 13);
		panel.add(jLabel8);

		jLabel9 = new JLabel("00");
		jLabel9.setForeground(new Color(255, 0, 0));
		jLabel9.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel9.setBounds(741, 44, 68, 13);
		panel.add(jLabel9);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(0, 104, 338, 449);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel jLabel10 = new JLabel("Roll Number:");
		jLabel10.setForeground(new Color(0, 0, 0));
		jLabel10.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel10.setBounds(39, 38, 135, 29);
		panel_1.add(jLabel10);

		jLabel11 = new JLabel("10000");
		jLabel11.setForeground(Color.BLACK);
		jLabel11.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel11.setBounds(184, 38, 135, 29);
		panel_1.add(jLabel11);

		JLabel jLabel12 = new JLabel("Name:");
		jLabel12.setForeground(Color.BLACK);
		jLabel12.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel12.setBounds(39, 88, 116, 29);
		panel_1.add(jLabel12);

		jLabel13 = new JLabel("");
		jLabel13.setForeground(Color.BLACK);
		jLabel13.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel13.setBounds(184, 88, 135, 29);
		panel_1.add(jLabel13);

		JLabel jLabel14 = new JLabel("Total Question:");
		jLabel14.setForeground(Color.BLACK);
		jLabel14.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel14.setBounds(39, 140, 148, 29);
		panel_1.add(jLabel14);

		JLabel jLabel15 = new JLabel("10");
		jLabel15.setForeground(Color.BLACK);
		jLabel15.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel15.setBounds(184, 140, 135, 29);
		panel_1.add(jLabel15);

		JLabel jLabel16 = new JLabel("Question Number:");
		jLabel16.setForeground(Color.BLACK);
		jLabel16.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel16.setBounds(39, 189, 135, 29);
		panel_1.add(jLabel16);

		jLabel17 = new JLabel("00");
		jLabel17.setForeground(Color.BLACK);
		jLabel17.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel17.setBounds(184, 189, 135, 29);
		panel_1.add(jLabel17);

		JLabel jLabel18 = new JLabel("Your Marks:");
		jLabel18.setForeground(Color.BLACK);
		jLabel18.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel18.setBounds(39, 228, 135, 29);
		panel_1.add(jLabel18);

		jLabel19 = new JLabel("00");
		jLabel19.setForeground(Color.BLACK);
		jLabel19.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel19.setBounds(184, 228, 135, 29);
		panel_1.add(jLabel19);

		jLabel20 = new JLabel("Question Demo?");
		jLabel20.setForeground(Color.BLACK);
		jLabel20.setFont(new Font("Tahoma", Font.BOLD, 18));
		jLabel20.setBounds(434, 140, 190, 29);
		contentPane.add(jLabel20);

		jRadioButton1 = new JRadioButton("New radio button");
		jRadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jRadioButton1.isSelected()) {
					jRadioButton2.setSelected(false);
					jRadioButton3.setSelected(false);
					jRadioButton4.setSelected(false);
				}
			}
		});
		jRadioButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jRadioButton1.setBounds(434, 205, 421, 21);
		contentPane.add(jRadioButton1);

		jRadioButton2 = new JRadioButton("New radio button");
		jRadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jRadioButton2.isSelected()) {
					jRadioButton3.setSelected(false);
					jRadioButton1.setSelected(false);
					jRadioButton4.setSelected(false);
				}
			}
		});
		jRadioButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jRadioButton2.setBounds(434, 264, 421, 21);
		contentPane.add(jRadioButton2);

		jRadioButton3 = new JRadioButton("New radio button");
		jRadioButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jRadioButton3.isSelected()) {
					jRadioButton2.setSelected(false);
					jRadioButton1.setSelected(false);
					jRadioButton4.setSelected(false);
				}
			}
		});
		jRadioButton3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jRadioButton3.setBounds(434, 328, 421, 21);
		contentPane.add(jRadioButton3);

		jRadioButton4 = new JRadioButton("New radio button");
		jRadioButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jRadioButton4.isSelected()) {
					jRadioButton2.setSelected(false);
					jRadioButton3.setSelected(false);
					jRadioButton1.setSelected(false);
				}
			}
		});
		jRadioButton4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jRadioButton4.setBounds(434, 380, 421, 21);
		contentPane.add(jRadioButton4);

		jButton1 = new JButton("Next");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerCheck();
				question();
			}
		});
		jButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-next.png"));
		jButton1.setBounds(481, 448, 143, 41);
		contentPane.add(jButton1);

		jButton2 = new JButton("Submit");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Submit", "Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
				answerCheck();
				submit();
				}
			}
		});
		jButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton2.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Save.png"));
		jButton2.setBounds(690, 448, 143, 41);
		contentPane.add(jButton2);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
		lblNewLabel_1.setBounds(335, 100, 760, 453);
		contentPane.add(lblNewLabel_1);
	}
}
