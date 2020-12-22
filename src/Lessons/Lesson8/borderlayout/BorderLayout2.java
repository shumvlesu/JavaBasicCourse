package lesson8.borderlayout;

import javax.swing.*;

public class BorderLayout2 {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500,500,500,300);
            setTitle("BoxLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JButton[] jbs = new JButton[10];

            setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                jbs[i].setAlignmentY(TOP_ALIGNMENT);
                add(jbs[i]);
            }
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}