import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI2 implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel, passwordLabel, success;
    private static JTextField userText, passwordText;
    private static JButton button;

    public static void main (String[] args) {
        panel = new JPanel();
        frame = new JFrame();

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI2());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {
        String user = userText.getText();
        String password = passwordText.getText();

        System.out.println(user + ", " + password);
        if (user.equals("test") && password.equals("test123")) {
            success.setText("Login Successfully!");
        }
    }
}
