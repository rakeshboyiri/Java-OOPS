import javax.swing.*;
import java.awt.event.*;

public class JframeTerminate {

    public JframeTerminate(){
        JFrame frame = new JFrame("Close Button Example");
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application when frame is closed
        frame.setSize(300, 200);
        frame.setLayout(null);

        closeButton.setBounds(100, 50, 100, 30);
        frame.add(closeButton);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JframeTerminate();
    }
}