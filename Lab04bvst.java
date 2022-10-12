// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g) {
        // DRAW CUBE



        // DRAW SPHERE


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE


        // DRAW APCS


        // DRAW PACMEN FLower
    //cube
        g.drawLine(100,150,100,400);
        g.drawLine(200,225,200,475);
        g.drawLine(100,400,200,475);
        g.drawLine(100,150,200,225);
        g.drawLine(200,225,400,225);
        g.drawLine(200,475,400,475);
        g.drawLine(400,225,400,475);
        g.drawLine(400,475,300,400);
        g.drawLine(300,400,100,400);
        g.drawLine(300,150,300,400);
        g.drawLine(300,150, 400, 225);
        g.drawLine(100,150, 300, 150);

        g.fillRect(175,525,25,125);
        g.fillRect(225,525,25,125);
        g.fillRect(200,525, 25,25);
        g.fillRect(200,575,25,25);
        g.fillRect(275,525,25,125);
        g.fillRect(275,525,75,25);
        g.fillRect(325,525,25,75);
        g.fillRect(275,575,75,25);
    }

}


