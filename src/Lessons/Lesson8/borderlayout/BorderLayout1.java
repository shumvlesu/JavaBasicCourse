package Lessons.Lesson8.borderlayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayout1 extends JFrame {

           public BorderLayout1() {
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 400);

            JButton button = new JButton("Button 1 (PAGE_START)");

            add(button, BorderLayout.PAGE_START);

            button = new JButton("Button 2 (CENTER)");
            button.setPreferredSize(new Dimension(200, 100));
            add(button, BorderLayout.CENTER);
            button = new JButton("Button 3 (LINE_START)");
            add(button, BorderLayout.LINE_START);
            button = new JButton("Long-Named Button 4 (PAGE_END)");
            add(button, BorderLayout.PAGE_END);
            button = new JButton("5 (LINE_END)");
            add(button, BorderLayout.LINE_END);
            setVisible(true);
        }


    public static void main(String[] args) {
        new BorderLayout1();
    }

}