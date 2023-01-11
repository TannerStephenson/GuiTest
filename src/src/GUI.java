import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    int count = 0;
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JPanel panel;
    public GUI(){

        //Making buttons
        JButton button = new JButton("Click here");
        button.addActionListener(this);
        label = new JLabel(("Number of clicks: 00"));


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 40, 50, 40));
        panel.setLayout((new GridLayout(0, 1)));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Testing GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
