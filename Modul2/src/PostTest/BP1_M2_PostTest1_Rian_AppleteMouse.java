package PostTest;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_PostTest1_Rian_AppleteMouse extends Applet implements MouseListener {
    private int mouseX = -1; // Posisi X Mouse
    private int mouseY = -1; // Posisi Y Mouse

    @Override
    public void init() {
        setSize(400, 400); // Ukuran Applet
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if (mouseX != -1 && mouseY != -1) {
            g.setColor(Color.BLACK);
            g.drawString("Koordinat: (" + mouseX + ", " + mouseY + ")", mouseX, mouseY);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint(); // Meminta Applet Untuk Gambar Ulang
    }

//  Harus Menyertakan Method Dibawah Ini
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
