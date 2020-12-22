package Lessons.Lesson8.graphics;

import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

public class DrawingExample extends JFrame {

    public DrawingExample() {
        super("Lines Drawing Demo");

        setSize(680, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        simpleDrawLines(g);
    }

    private void simpleDrawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.drawLine(120, 50, 360, 200);

        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));

        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));

        g.setColor(Color.BLUE);
        g.drawRect(150, 150, 150, 150);

        g.setColor(Color.GREEN);
        g.fillRect(151, 151, 149, 75);


        g.drawOval(350, 150, 150, 150);
        g.setColor(Color.RED);
        g.fillOval(350, 150, 75, 75);
    }

    public static void main(String[] args) {
        new DrawingExample().setVisible(true);
    }
}