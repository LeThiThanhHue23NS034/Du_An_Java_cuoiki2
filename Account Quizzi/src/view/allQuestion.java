package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class allQuestion extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable jTable;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    allQuestion frame = new allQuestion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public allQuestion() {
        init();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from question");
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            // Rename column headers
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setColumnIdentifiers(new String[] {
                "ID", "Câu hỏi", "Đáp án 1", "Đáp án 2", "Đáp án 3", "Đáp án 4", "Câu trả lời"
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void init() {
        setLocation(new Point(150, 183));
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 701, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ALL QUESTION");
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
        lblNewLabel.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\icon-allQuestion.png"));
        lblNewLabel.setBounds(37, 10, 339, 54);
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
        lblNewLabel_1.setBounds(603, 0, 40, 74);
        contentPane.add(lblNewLabel_1);

        JSeparator separator = new JSeparator();
        separator.setBounds(23, 84, 618, 16);
        contentPane.add(separator);

        jTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setBounds(23, 97, 606, 272);
        contentPane.add(scrollPane);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("D:\\BAITAP\\Account Quizzi\\img\\back-ground.jpg"));
        lblNewLabel_2.setBounds(0, 10, 677, 401);
        contentPane.add(lblNewLabel_2);
    }
}
