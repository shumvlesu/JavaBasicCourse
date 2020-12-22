package Lessons.Lesson8.events;

import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500, 500, 400, 300);
            setTitle("Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JPanel pan = new JPanel();
            add(pan);

            //отлавливаем события мышки
            pan.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    System.out.println("Mouse Position: " + e.getX() + " " + e.getY());
                }
            });

            setVisible(true);
        }
    }


    public static void main(String[] args) {
        new MyWindow();
    }

}