package Lessons.Lesson8.examples;

import javax.swing.*;

public class Ex1 extends JFrame { //В JFrame, J говорит о том что наш класс наследуется от библиотеки swing а вот обычный Frame от awt.
    //JFrame наследуется от Frame , т.е. swing происходит от awt.

    public Ex1() {
        setTitle("Test Window"); //заголовок окна
        setBounds(400, 300, 300, 400); //начальное расположение окна и размер самого окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //кнопки в заголовке окна
        setVisible(true);//показать форму окна

    }

    public static void main(String[] args) {
        new Ex1();
    }
}
