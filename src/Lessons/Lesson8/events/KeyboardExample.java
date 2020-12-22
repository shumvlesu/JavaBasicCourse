package Lessons.Lesson8.events;

import javax.swing.*;
import java.awt.event.*;

public class KeyboardExample {

  static public class MyWindow extends JFrame {
    String str;

    public MyWindow() {
      setBounds(500, 500, 400, 300);
      setTitle("Demo");
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      JTextField field = new JTextField();
      add(field);

      //1 способ отлавливание события
      //field.addActionListener(new KeyboardListener());


      //2 способ отлавливание события с помощью лямбда выражения
           /* field.addActionListener(e -> {
                System.out.println(field.getText());
                field.setText("");
            });*/

      //3 способ отлавливание события с помощью анонимного класса
           /* field.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(field.getText());
                    field.setText("");
                }
            });*/

        //4 способ, отлавливаем нажатие клавиши
        /*field.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                   if (e.isShiftDown()) {
                       System.out.println("SHIFT!");
                   }
                   else {
                       System.out.println(e.getKeyChar() + " down");
                   }
                }
            });*/

      setVisible(true);
    }
  }


  public static void main(String[] args) {
    new MyWindow();
  }

}