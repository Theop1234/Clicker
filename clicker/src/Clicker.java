import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Clicker implements ActionListener{
     JFrame frame;
     JPanel panel;
     JLabel label;
     int count = 0;

    public Clicker(){

        JButton button = new JButton("click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: " + count);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,10,50));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker");
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("number of clicks: " + count);
    }

    public static void main(String[] args){
        new Clicker();
    }

}
