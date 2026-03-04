package in.sv.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");

        // Labels
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // Text fields
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();

        // Button
        JButton loginBtn = new JButton("Login");

        // Layout
        frame.setLayout(null);

        userLabel.setBounds(50, 50, 100, 30);
        userText.setBounds(150, 50, 150, 30);

        passLabel.setBounds(50, 100, 100, 30);
        passText.setBounds(150, 100, 150, 30);

        loginBtn.setBounds(150, 150, 100, 30);

        // Add components
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginBtn);

        // Button action
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());

                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Login");
                }
            }
        });

        // Frame settings
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}