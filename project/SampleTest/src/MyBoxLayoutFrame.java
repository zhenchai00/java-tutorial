import javax.swing.*;
import java.awt.*;

public class MyBoxLayoutFrame extends JFrame {
    public MyBoxLayoutFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel with BoxLayout along the Y_AXIS
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create the first section panel with BoxLayout along the X_AXIS
        JPanel firstSectionPanel = new JPanel();
        firstSectionPanel.setLayout(new BoxLayout(firstSectionPanel, BoxLayout.X_AXIS));

        // Left panel for the first section
        JPanel leftPanel = new JPanel();
        leftPanel.add(new JButton("Left Button")); // Add your components here

        // Right panel for the first section
        JPanel rightPanel = new JPanel();
        rightPanel.add(new JButton("Right Button")); // Add your components here

        // Add left and right panels to the first section panel
        firstSectionPanel.add(leftPanel);
        firstSectionPanel.add(rightPanel);

        // Second section panel
        JPanel secondSectionPanel = new JPanel();
        secondSectionPanel.add(new JButton("Bottom Button")); // Add your components here

        // Add the first and second section panels to the main panel
        mainPanel.add(firstSectionPanel);
        mainPanel.add(secondSectionPanel);

        // Add the main panel to the frame
        add(mainPanel);

        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyBoxLayoutFrame());
    }
}
