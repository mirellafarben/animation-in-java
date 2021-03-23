import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstAnimation extends JPanel implements ActionListener {
    Timer tm = new Timer(5, this);
    Circle cOne = new Circle(400, 400, 50, 50);

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        cOne.paintComponent(g);
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cOne.actionPerformed(e);
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
