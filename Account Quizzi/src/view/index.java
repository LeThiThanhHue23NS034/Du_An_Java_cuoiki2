package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class index extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jButton1 = new JLabel("Student");
		jButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new studentDetials().setVisible(true);
			}
		});
		jButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-studentDetials.png"));
		jButton1.setBounds(94, 21, 188, 51);
		contentPane.add(jButton1);
		
		JLabel jButton2 = new JLabel("Admin");
		jButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible (false);
				new logginAdmin().setVisible(true);
			}
		});
		jButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton2.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-admin.png"));
		jButton2.setBounds(292, 21, 229, 51);
		contentPane.add(jButton2);
		
		JLabel jButton3 = new JLabel("");
		jButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application","Select", JOptionPane.YES_NO_OPTION);
				if (a==0) {
					System.exit(0);
				}
			}
		});
		jButton3.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Exit.png"));
		jButton3.setBounds(545, 0, 79, 51);
		contentPane.add(jButton3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\bai-kt.jpg"));
		lblNewLabel.setBounds(-251, 0, 875, 409);
		contentPane.add(lblNewLabel);
	}

}
