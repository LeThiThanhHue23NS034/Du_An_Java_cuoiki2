package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Project.ConnectionProvider;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deleteQuestion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteQuestion frame = new deleteQuestion();
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
	public deleteQuestion() {
		setLocation(new Point(150, 183));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE QUESTION");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-deteteQuestion.png"));
		lblNewLabel.setBounds(32, 10, 338, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminHome.open = 0;
				setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Exit.png"));
		lblNewLabel_1.setBounds(579, 0, 45, 53);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 73, 525, 13);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Question ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(86, 84, 141, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Question:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(86, 127, 116, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Option 1:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(86, 154, 116, 27);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Option 2:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(86, 191, 130, 33);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Option 3:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(86, 223, 116, 39);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Option 4:");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(86, 272, 130, 41);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Answer:");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6.setBounds(86, 323, 116, 23);
		contentPane.add(lblNewLabel_2_6);
		
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField1.setBounds(237, 88, 133, 23);
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);
		
		jTextField2 = new JTextField();
		jTextField2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField2.setColumns(10);
		jTextField2.setBounds(237, 128, 387, 19);
		contentPane.add(jTextField2);
		
		jTextField3 = new JTextField();
		jTextField3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField3.setColumns(10);
		jTextField3.setBounds(237, 157, 387, 19);
		contentPane.add(jTextField3);
		
		jTextField4 = new JTextField();
		jTextField4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField4.setColumns(10);
		jTextField4.setBounds(237, 197, 387, 19);
		contentPane.add(jTextField4);
		
		jTextField5 = new JTextField();
		jTextField5.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField5.setColumns(10);
		jTextField5.setBounds(237, 243, 387, 19);
		contentPane.add(jTextField5);
		
		jTextField6 = new JTextField();
		jTextField6.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField6.setColumns(10);
		jTextField6.setBounds(237, 282, 387, 19);
		contentPane.add(jTextField6);
		
		jTextField7 = new JTextField();
		jTextField7.setFont(new Font("Tahoma", Font.BOLD, 18));
		jTextField7.setColumns(10);
		jTextField7.setBounds(237, 324, 387, 19);
		contentPane.add(jTextField7);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = jTextField1.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					ResultSet rs = st.executeQuery("select *from question where id ='"+id+"'");
					if (rs.first()) {
						jTextField2.setText(rs.getString(2));
						jTextField3.setText(rs.getString(3));
						jTextField4.setText(rs.getString(4));
						jTextField5.setText(rs.getString(5));
						jTextField6.setText(rs.getString(6));
						jTextField7.setText(rs.getString(7));
						jTextField1.setEditable(false);
					} else {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question Id does not Exist");
					}
					
				} catch (Exception e2) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,e2);

				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Search.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(390, 84, 146, 33);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = jTextField1.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("delete from question where id=?");
					ps.setString(1, id);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully Deleted");
					setVisible(false);
					new deleteQuestion().setVisible(true);
				} catch (Exception e2) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e2);
				}
			}
		});
		btnDelete.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-deleteQuestion1.png"));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(116, 360, 159, 33);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField1.setText("");
				jTextField2.setText("");
				jTextField3.setText("");
				jTextField4.setText("");
				jTextField5.setText("");
				jTextField6.setText("");
				jTextField7.setText("");
				jTextField1.setEditable(true);
			}
		});
		btnClear.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-clear.png"));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(374, 360, 166, 33);
		contentPane.add(btnClear);
	}
}
