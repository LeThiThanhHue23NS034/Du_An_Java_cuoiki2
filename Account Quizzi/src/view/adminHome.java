package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminHome extends JFrame {

	static int open  =0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 557);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "NAVIGATION BAR", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		menuBar.setMargin(new Insets(0, 5, 0, 30));
		setJMenuBar(menuBar);
		
		JMenu Navigation = new JMenu("Add New Question");
		Navigation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open == 0) {
					new addNewQuestion().setVisible(true);
					open=1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is allready Open");
				}
			}
		});
		Navigation.setFont(new Font("Segoe UI", Font.BOLD, 14));
		Navigation.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-addQuestion.png"));
		menuBar.add(Navigation);
		
		JMenu mnEdit = new JMenu("Update Question");
		mnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open == 0) {
					new updateQuestion().setVisible(true);
					open=1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is allready Open");
				}
			}
		});
		mnEdit.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnEdit.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-updateQuestion.png"));
		menuBar.add(mnEdit);
		
		JMenu mnAllQuestion = new JMenu("All Question");
		mnAllQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open == 0) {
					new allQuestion().setVisible(true);
					open=1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is allready Open");
				}
			}
		});
		mnAllQuestion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnAllQuestion.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-allQuestion.png"));
		menuBar.add(mnAllQuestion);
		
		JMenu mnDeleteQuestion = new JMenu("Delete Question");
		mnDeleteQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open == 0) {
					new deleteQuestion().setVisible(true);
					open=1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is allready Open");
				}
			}
		});
		mnDeleteQuestion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnDeleteQuestion.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-deteteQuestion.png"));
		menuBar.add(mnDeleteQuestion);
		
		JMenu mnAllStudentResult = new JMenu("All Student Result");
		mnAllStudentResult.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnAllStudentResult.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-resultQuestion.png"));
		menuBar.add(mnAllStudentResult);
		
		JMenu mnLogout = new JMenu("Logout");
		mnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf = new JFrame();
				jf.setAlwaysOnTop(true);
				int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout","Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
					setVisible(false);
					new logginAdmin().setVisible(true);
				}
			}
		});
		mnLogout.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Logout.png"));
		mnLogout.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnLogout);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf = new JFrame();
				jf.setAlwaysOnTop(true);
				int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Exit Application","Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
					System.exit(0);
				}
			}
		});
		mnExit.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnExit.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Exit.png"));
		menuBar.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\bai-kt.jpg"));
		lblNewLabel.setBounds(0, 0, 996, 463);
		contentPane.add(lblNewLabel);
	}
}
