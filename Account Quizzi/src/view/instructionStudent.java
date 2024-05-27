package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class instructionStudent extends JFrame {
	public String rollNo;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JTextArea jTextAreal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructionStudent frame = new instructionStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public instructionStudent() {
		init();
		}
	public instructionStudent(String rollNo1) {
		init();
		jTextAreal.setEditable(false);
		rollNo = rollNo1;
		JOptionPane.showMessageDialog(null, rollNo);
		}

	/**
	 * Create the frame.
	 */
	private void init() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSTRUCTION");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-studentDetials.png"));
		lblNewLabel.setBounds(22, 10, 375, 70);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 78, 646, 14);
		contentPane.add(separator);
		
		jTextAreal = new JTextArea();
		jTextAreal.setFont(new Font("Monospaced", Font.BOLD, 15));
		jTextAreal.setText("Trong giờ kiểm tra:\r\n\r\n1. Học sinh không được sử dụng sách giáo khoa, ghi chú khóa học hoặc nhận\r\n sự trợ giúp từ giám thị hoặc bất kỳ nguồn bên ngoài nào khác.\r\n\r\n2. Học sinh phải hoàn thành bài thi trắc nghiệm gồm 10 câu hỏi trong thời \r\ngian 10 phút quy định cho bài thi.\r\n\r\n3. Học sinh không được dừng buổi học rồi quay lại. Điều này đặc biệt quan \r\ntrọng trong môi trường trực tuyến, nơi hệ thống sẽ \"hết thời gian\" và không \r\ncho phép học sinh hoặc bạn tham gia lại kỳ thi.\r\n\r\nSố câu hỏi: 10\r\n\r\nThời lượng thi: 10 phút");
		jTextAreal.setBounds(44, 90, 686, 293);
		contentPane.add(jTextAreal);
		
		JButton jbutton1 = new JButton("START QUIZ/EXAM");
		jbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new quizExamStudent().setVisible(true);
			}
		});
		jbutton1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbutton1.setBounds(197, 401, 229, 32);
		contentPane.add(jbutton1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
		lblNewLabel_2.setBounds(10, 10, 754, 433);
		contentPane.add(lblNewLabel_2);
	}
}
