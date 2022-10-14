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
        g.fillRect(375,525,25,125);
        g.fillRect(375,525,75,25);
        g.fillRect(375,625,75,25);
        g.fillRect(475,525,75,25);
        g.fillRect(475,525,25,75);
        g.fillRect(475,575,75,25);
        g.fillRect(525,575,25,75);
        g.fillRect(475,625,75,25);

        //flower
        g.fillArc(775,100,75,75,580,280);
        g.fillArc(875,100,75,75,760,280);
        g.fillArc(825,50,75,75,490,280);
        g.fillArc(825,150,75,75, -50,280);

        //inscibe
        g.drawOval(675,375,200,200);
        g.drawLine(680,450,860,425);
        g.drawLine(680,450,750,570);
        g.drawLine(750,570,860,425);
        g.drawOval(710,440,90,90);

        //circle
        g.drawOval(525,75,200,200);
        g.drawOval(525,150,200,50);
        g.drawOval(600,75,50,200);
        g.drawOval(525,125,200,100);
        g.drawOval(525,100,200,150);
        g.drawOval(575,75,100,200);
        g.drawOval(550,75,150,200);

        //:)
    }

}


