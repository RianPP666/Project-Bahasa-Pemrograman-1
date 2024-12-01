package Tugas;

import java.applet.Applet;
import java.awt.*;

public class BP1_M2_Tugas2_Rian_AppleteAnimasi extends Applet implements Runnable {
    int x1 = 0;               
    int y1 = 150;           
    int diameter1 = 50;      
    int speed1 = 5;         
    boolean moveRight1 = true;

    int x2 = 150;          
    int y2 = 0;           
    int diameter2 = 50;      
    boolean moveDown1 = true; 

    Thread animasiThread;

    @Override
    public void init() {
        setSize(400, 200);   
        animasiThread = new Thread(this); 
        animasiThread.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);  
        g.fillOval(x1, y1, diameter1, diameter1); 
        
        g.setColor(Color.RED);
        g.fillOval(x2, y2, diameter2, diameter2);
    }

    @Override
    public void run() {
        while (true) {

            if (moveRight1) {
                x1 += speed1;
                if (x1 >= getWidth() - diameter1) { 
                    moveRight1 = false; 
                }
            } else {
                x1 -= speed1;
                if (x1 <= 0) { 
                    moveRight1 = true; 
                }
            }

            
            if (moveDown1) {
                y2 += speed1; 
                if (y2 >= getHeight() - diameter2) { 
                    moveDown1 = false; 
                }
            } else {
                y2 -= speed1; 
                if (y2 <= 0) { 
                    moveDown1 = true;
                }
            }

            repaint(); 
            try {
                Thread.sleep(30); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
