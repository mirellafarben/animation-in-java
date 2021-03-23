import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstAnimation extends JPanel implements ActionListener {
    Timer tm = new Timer(5, this);

    Circle[] circles = new Circle[] {
                new Circle(200, 400, 50, 50),
                new Circle(400, 400, 50, 50),
                new Circle(600, 400, 50, 50)
    };


    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (Circle circle : circles) {
            circle.paintComponent(g);
        }

        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Circle circle : circles){
            circle.actionPerformed(e);
        }

//        circles[0].checkCollisionBetweenBalls(circles[1]);
//        circles[0].checkCollisionBetweenBalls(circles[2]);
//        circles[1].checkCollisionBetweenBalls(circles[2]);
//        Find a way to make this work through a loop method
        repaint();
    }


    public static void main(String[] args) {
        FirstAnimation fa = new FirstAnimation();
        JFrame jf = new JFrame();
        jf.setTitle("Animation");
        jf.setSize(800, 800);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(fa);
    }
}
