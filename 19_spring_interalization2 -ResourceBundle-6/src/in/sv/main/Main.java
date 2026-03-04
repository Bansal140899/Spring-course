package in.sv.main;
import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("en", "US"); // change to fr_FR for French
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);

        JFrame frame = new JFrame(bundle.getString("title"));

        JLabel userLabel = new JLabel(bundle.getString("username"));
        JLabel passLabel = new JLabel(bundle.getString("password"));

        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        JButton loginBtn = new JButton(bundle.getString("login"));

        frame.setLayout(null);

        userLabel.setBounds(50, 50, 100, 30);
        userText.setBounds(150, 50, 150, 30);

        passLabel.setBounds(50, 100, 100, 30);
        passText.setBounds(150, 100, 150, 30);

        loginBtn.setBounds(150, 150, 100, 30);

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginBtn);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
