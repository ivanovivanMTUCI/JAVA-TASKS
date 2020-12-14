package Lab_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task_2 extends JFrame {
    private JButton button = new JButton("Ready");
    private JLabel label = new JLabel("Enter name:");
    private JTextField text1 = new JTextField("", 0);
    private JCheckBox check = new JCheckBox("Agree?", false);

    public Task_2()
    {
        super("Task_2");
        this.setBounds(0, 210, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2, 0, 5));
        container.add(label);
        container.add(text1);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        container.add(check);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //if check is selected and text has been entered
            if (check.isSelected() && !text1.getText().equals(""))
                //show the message box
                JOptionPane.showMessageDialog(null, text1.getText() + ": Agreed.", "Info",
                        JOptionPane.PLAIN_MESSAGE);
            //if check wasn't selected but text has been entered
            else if (!text1.getText().equals(""))
                JOptionPane.showMessageDialog(null, text1.getText() + ": Not agreed.", "Info",
                        JOptionPane.PLAIN_MESSAGE);
        }
    }
}
