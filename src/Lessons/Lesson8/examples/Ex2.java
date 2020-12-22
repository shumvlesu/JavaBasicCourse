package lesson8.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 {

    static class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 400);

            JButton[] jbs = new JButton[5];

            for (int i = 0; i < 5; i++) {
                jbs[i] = new JButton("#" + i);
            }

            setLayout(new BorderLayout());   // выбор компоновщика элементов
            add(jbs[0], BorderLayout.EAST);  // добавление кнопки на форму
            add(jbs[1], BorderLayout.NORTH);
            add(jbs[2], BorderLayout.CENTER);
            add(jbs[3], BorderLayout.WEST);
            add(jbs[4], BorderLayout.SOUTH);


            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}

// AWT SWING JavaFX
