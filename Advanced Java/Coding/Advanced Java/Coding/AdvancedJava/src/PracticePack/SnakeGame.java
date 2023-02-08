package PracticePack;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SnakeGame extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SnakeGame frame = new SnakeGame();
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
    public SnakeGame() throws Exception {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(60, 72, 68, 14);
        contentPane.add(lblUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(60, 112, 68, 14);
        contentPane.add(lblPassword);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(138, 69, 200, 20);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(138, 109, 200, 20);
        contentPane.add(txtPassword);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                char[] password = txtPassword.getPassword();
                // Validate the input username and password
            }
        });
        btnLogin.setBounds(138, 150, 89, 23);
        contentPane.add(btnLogin);
    }
}
