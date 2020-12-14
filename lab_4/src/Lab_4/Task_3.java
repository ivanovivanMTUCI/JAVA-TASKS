package Lab_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task_3 extends JFrame {
    private JButton button = new JButton("Mask the field");
    private JLabel label = new JLabel("Enter number:");
    private JTextField text1 = new JTextField("", 0);

    public Task_3()
    {
        super("Task_3");
        this.setBounds(0, 370, 200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2, 0, 5));
        container.add(label);
        //setting the background color
        text1.setBackground(Color.red);
        container.add(text1);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //check the state of visibility and change accordingly
            if (text1.isVisible())
            {
                text1.setVisible(false);
                button.setText("Show field");
            }
            else
            {
                text1.setVisible(true);
                button.setText("Mask field");
            }
        }

    }
}
