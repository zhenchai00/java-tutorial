import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public static void main (String[] args) {
        new GUI();
    }

    public GUI () {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click me");
        label = new JLabel("Number of clicks: 0");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Page");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
