package Lab_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//JFrame is a top-level window with a title and a border
public class Task_1 extends JFrame {
    //creating JFrame objects: 2 empty text fields and 1 "Start" button
    private JButton button = new JButton("Start");
    private JTextField text1 = new JTextField("", 0);
    private JTextField text2 = new JTextField("", 0);

    public Task_1()
    {
        //name of the window
        super("Task 1");
        //setting the size of a window
        this.setBounds(0, 0, 200, 200);
        //simply closing the program
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating a container to keep the JFrame objects
        Container container = this.getContentPane();
        //setting the layout of the objects
        container.setLayout(new GridLayout(3, 1, 0, 5));
        //finally adding the objects
        container.add(text1);
        container.add(text2);
        //expecting the push of a button
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    //the listener interface for receiving action events
    class ButtonEventListener implements ActionListener
    {
        //what to do when the button is pushed
        public void actionPerformed(ActionEvent e)
        {
            text1.setText("Hello");
            text2.setText("World!");
        }
    }
}
