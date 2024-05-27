package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Project.ConnectionProvider;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.ImageIcon;
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

public class updateQuestion extends JFrame {

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
                    updateQuestion frame = new updateQuestion();
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
    public updateQuestion() {
        setLocation(new Point(150, 183));
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 776, 443);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("UPDATE QUESTION");
        lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-updateQuestion.png"));
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
        lblNewLabel.setBounds(10, 0, 335, 85);
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
        lblNewLabel_1.setBounds(681, 10, 32, 39);
        contentPane.add(lblNewLabel_1);

        JSeparator separator = new JSeparator();
        separator.setBounds(0, 83, 656, 14);
        contentPane.add(separator);

        JLabel lblNewLabel_2 = new JLabel("Question ID:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2.setBounds(26, 107, 160, 23);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Question:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1.setBounds(26, 140, 160, 23);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_1_1 = new JLabel("Option 1:");
        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1_1.setBounds(26, 181, 160, 23);
        contentPane.add(lblNewLabel_2_1_1);

        JLabel lblNewLabel_2_1_2 = new JLabel("Option 2:");
        lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1_2.setBounds(26, 220, 160, 23);
        contentPane.add(lblNewLabel_2_1_2);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("Option 3:");
        lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1_1_1.setBounds(26, 253, 160, 23);
        contentPane.add(lblNewLabel_2_1_1_1);

        JLabel lblNewLabel_2_1_1_2 = new JLabel("Option 4:");
        lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1_1_2.setBounds(26, 289, 160, 23);
        contentPane.add(lblNewLabel_2_1_1_2);

        JLabel lblNewLabel_2_1_1_3 = new JLabel("Answer:");
        lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1_1_3.setBounds(26, 329, 160, 23);
        contentPane.add(lblNewLabel_2_1_1_3);

        jTextField1 = new JTextField();
        jTextField1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField1.setBounds(197, 108, 117, 19);
        contentPane.add(jTextField1);
        jTextField1.setColumns(10);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Search.png"));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = jTextField1.getText();
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    ResultSet rs = st.executeQuery("select * from question where id='" + id + "'");
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
                        JOptionPane.showMessageDialog(jf, "Question ID does not exist!");
                    }
                } catch (Exception e3) {
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, e3);
                }
            }
        });
        btnNewButton.setBounds(384, 102, 135, 33);
        contentPane.add(btnNewButton);

        jTextField2 = new JTextField();
        jTextField2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField2.setBounds(197, 142, 516, 19);
        contentPane.add(jTextField2);
        jTextField2.setColumns(10);

        jTextField3 = new JTextField();
        jTextField3.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField3.setColumns(10);
        jTextField3.setBounds(197, 183, 516, 19);
        contentPane.add(jTextField3);

        jTextField4 = new JTextField();
        jTextField4.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField4.setColumns(10);
        jTextField4.setBounds(197, 222, 516, 19);
        contentPane.add(jTextField4);

        jTextField5 = new JTextField();
        jTextField5.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField5.setColumns(10);
        jTextField5.setBounds(197, 255, 516, 19);
        contentPane.add(jTextField5);

        jTextField6 = new JTextField();
        jTextField6.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField6.setColumns(10);
        jTextField6.setBounds(197, 291, 516, 19);
        contentPane.add(jTextField6);

        jTextField7 = new JTextField();
        jTextField7.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField7.setColumns(10);
        jTextField7.setBounds(197, 331, 516, 19);
        contentPane.add(jTextField7);

        JButton btnNewButton_1 = new JButton("Update");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = jTextField1.getText();
                String name = jTextField2.getText();
                String opt1 = jTextField3.getText();
                String opt2 = jTextField4.getText();
                String opt3 = jTextField5.getText();
                String opt4 = jTextField6.getText();
                String answer = jTextField7.getText();
                try {
                    Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement(
                            "update question set name=?, opt1=?, opt2=?, opt3=?, opt4=?, answer=? where id=?");
                    ps.setString(1, name);
                    ps.setString(2, opt1);
                    ps.setString(3, opt2);
                    ps.setString(4, opt3);
                    ps.setString(5, opt4);
                    ps.setString(6, answer);
                    ps.setString(7, id);
                    ps.executeUpdate();
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, "Successfully Updated");
                    setVisible(false);
                    new updateQuestion().setVisible(true);
                } catch (Exception e2) {
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, e2);
                }
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Save.png"));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_1.setBounds(205, 360, 140, 21);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("Clear");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField1.setEditable(true);
            }
        });
        btnNewButton_1_1.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Clear.png"));
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton_1_1.setBounds(401, 360, 126, 21);
        contentPane.add(btnNewButton_1_1);

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
        lblNewLabel_3.setBounds(0, 0, 752, 406);
        contentPane.add(lblNewLabel_3);
    }
}
