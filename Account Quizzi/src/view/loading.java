package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class loading extends JFrame {
	private JPanel contentPane;
	public JProgressBar Loading;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 */
	public loading() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 51, 800, 279);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\smile.gif"));
		contentPane.add(lblNewLabel_1);

		lblNewLabel = new JLabel("Quản Lý Tài Khoản Cá Nhân");
		lblNewLabel.setForeground(new Color(0, 104, 208));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 10, 800, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		contentPane.add(lblNewLabel);

		Loading = new JProgressBar();
		Loading.setStringPainted(true);
		Loading.setBounds(0, 362, 800, 22);
		contentPane.add(Loading);

		lblNewLabel_2 = new JLabel("Đang chạy . . . ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 340, 790, 13);
		contentPane.add(lblNewLabel_2);
	}
}
