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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addNewQuestion extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JLabel jLabel14;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    addNewQuestion frame = new addNewQuestion();
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
    public addNewQuestion() {
        init();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select count(id) from question");
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                jLabel14.setText(str);
            } else {
                jLabel14.setText("1");
            }
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showConfirmDialog(jf, e);
            e.printStackTrace();
        }
    }

    private void init() {
        setLocation(new Point(150, 183));
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 895, 504);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Add new Question");
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
        lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-addQuestion.png"));
        lblNewLabel.setBounds(53, 10, 361, 69);
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
        lblNewLabel_1.setBounds(836, 0, 45, 51);
        contentPane.add(lblNewLabel_1);

        JSeparator separator = new JSeparator();
        separator.setBounds(0, 78, 881, 19);
        contentPane.add(separator);

        JLabel lblNewLabel_2 = new JLabel("Question ID:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2.setBounds(79, 117, 121, 25);
        contentPane.add(lblNewLabel_2);

        jLabel14 = new JLabel("00");
        jLabel14.setForeground(new Color(255, 0, 0));
        jLabel14.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel14.setBounds(239, 120, 45, 13);
        contentPane.add(jLabel14);

        JLabel lblNewLabel_2_1 = new JLabel("Question:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_1.setBounds(79, 157, 94, 25);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_2 = new JLabel("Option 1:");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_2.setBounds(79, 201, 94, 30);
        contentPane.add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_2_1 = new JLabel("Option 2:");
        lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_2_1.setBounds(79, 241, 94, 25);
        contentPane.add(lblNewLabel_2_2_1);

        JLabel lblNewLabel_2_2_2 = new JLabel("Option 3:");
        lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_2_2.setBounds(79, 274, 94, 24);
        contentPane.add(lblNewLabel_2_2_2);

        JLabel lblNewLabel_2_2_3 = new JLabel("Option 4:");
        lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_2_3.setBounds(79, 314, 94, 25);
        contentPane.add(lblNewLabel_2_2_3);

        JLabel lblNewLabel_2_2_6 = new JLabel("Answer:");
        lblNewLabel_2_2_6.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_2_2_6.setBounds(79, 355, 94, 25);
        contentPane.add(lblNewLabel_2_2_6);

        jTextField1 = new JTextField();
        jTextField1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField1.setBounds(208, 157, 572, 24);
        contentPane.add(jTextField1);
        jTextField1.setColumns(10);

        jTextField2 = new JTextField();
        jTextField2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField2.setColumns(10);
        jTextField2.setBounds(208, 201, 572, 24);
        contentPane.add(jTextField2);

        jTextField3 = new JTextField();
        jTextField3.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField3.setColumns(10);
        jTextField3.setBounds(208, 238, 572, 24);
        contentPane.add(jTextField3);

        jTextField4 = new JTextField();
        jTextField4.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField4.setColumns(10);
        jTextField4.setBounds(208, 273, 572, 24);
        contentPane.add(jTextField4);

        jTextField5 = new JTextField();
        jTextField5.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField5.setColumns(10);
        jTextField5.setBounds(208, 314, 572, 24);
        contentPane.add(jTextField5);

        jTextField6 = new JTextField();
        jTextField6.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTextField6.setColumns(10);
        jTextField6.setBounds(208, 355, 572, 24);
        contentPane.add(jTextField6);

        
        JButton btnSave = new JButton("Save");
        btnSave.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-save.png"));
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = jLabel14.getText();
                String name = jTextField1.getText();
                String opt1 = jTextField2.getText();
                String opt2 = jTextField3.getText();
                String opt3 = jTextField4.getText();
                String opt4 = jTextField5.getText();
                String answer = jTextField6.getText();
                try {
                    Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
                    ps.setString(1, id);
                    ps.setString(2, name);
                    ps.setString(3, opt1);
                    ps.setString(4, opt2);
                    ps.setString(5, opt3);
                    ps.setString(6, opt4);
                    ps.setString(7, answer);
                    ps.executeUpdate();
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, "Successfully Updated");
                    setVisible(false);
                    new addNewQuestion().setVisible(true);
                } catch (Exception e1) {
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, e1);
                }
            }
        });
        btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnSave.setBounds(225, 410, 141, 41);
        contentPane.add(btnSave);
        
        JButton btnNewButton = new JButton("Clear");
        btnNewButton.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-Clear.png"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.setBounds(426, 410, 141, 41);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
        lblNewLabel_3.setBounds(0, 0, 881, 467);
        contentPane.add(lblNewLabel_3);
    }
}
