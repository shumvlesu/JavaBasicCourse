package Lessons.Lesson8.examples;

import javax.swing.*;

public class Ex1 extends JFrame {

    public Ex1() {
        setTitle("Test Window");
        setBounds(400, 300, 300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ex1();
    }
}
