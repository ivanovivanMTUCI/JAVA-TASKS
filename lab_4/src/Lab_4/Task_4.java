package Lab_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task_4 extends JFrame {
    private JButton button = new JButton("Show");
    private JTextField input1 = new JTextField("", 0);

    public Task_4()
    {
        super("Диалоговое окно");
        this.setBounds(0, 530, 200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1, 0, 5));
        container.add(input1);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //text box has to not be empty
            if (!input1.getText().equals(""))
                //message box with text from text box
                JOptionPane.showMessageDialog(null, input1.getText(), "Info", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
