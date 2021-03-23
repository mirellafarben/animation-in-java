import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle extends JPanel implements ActionListener{
    public int screenWidth = 800;
    public int screenHeight = 800;
    /*start by creating screen Width and Height. In the main Class, I set the screen Size in a way it isn't resizable.
    So, if one is to change*/

    private int xPosition, yPosition;
    private int width, height;
    private int xSpeed = 3, ySpeed = 4;
    /*Those here are, respectively, the X and Y position in which the ball will be summoned
      */


    public int getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public int getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }

    /*Some getters and setters...*/


    public Circle(int xPosition, int yPosition, int width, int height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }
    /*The class constructor...*/

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(this.xPosition, this.yPosition, this.width, this.height);

    }
    /*This method will draw a button with the specified x and y positions, width and height that were given in the
      constructor.*/

    @Override
    public void actionPerformed(ActionEvent e) {

        this.xPosition += this.xSpeed;
        this.yPosition += this.ySpeed;

        if(this.yPosition < 0 || (this.yPosition + this.height + 35) > screenHeight){
            this.ySpeed *= -1;
        }
        if(this.xPosition < 0 || (this.xPosition + this.width + 10) > screenWidth ){
            this.xSpeed *= -1;
        }
    }

    /*This method here will handle the animation as well as the collision physics*/
}
