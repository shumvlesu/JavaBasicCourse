package lesson8.borderlayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayout4 {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500,500,500,500);
            setTitle("GridLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JButton[] jbs = new JButton[100];
            setLayout(new GridLayout(10, 10));

            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                jbs[i].setText("•");
                add(jbs[i]);
            }
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}