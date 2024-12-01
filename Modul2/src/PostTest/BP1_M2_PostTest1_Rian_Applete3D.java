package PostTest;
import java.applet.Applet;
import java.awt.*;

public class BP1_M2_PostTest1_Rian_Applete3D extends Applet {
    @Override
    public void init() {
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        int xOffset = 100;
        int yOffset = 100;
        int size = 100;

        // Koordinat Persegi Depan
        int x1 = xOffset, y1 = yOffset;
        int x2 = xOffset + size, y2 = yOffset;
        int x3 = xOffset + size, y3 = yOffset + size;
        int x4 = xOffset, y4 = yOffset + size;
        
        // Koordinat Persegi Belakang
        int x5 = xOffset + 30, y5 = yOffset + 30;
        int x6 = xOffset + size + 30, y6 = yOffset + 30;
        int x7 = xOffset + size + 30, y7 = yOffset + size + 30;
        int x8 = xOffset + 30, y8 = yOffset + size + 30;
        

        g.setColor(Color.BLUE);

        // Gambar Persegi Depan
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x3, y3, x2, y2);
        g.drawLine(x4, y4, x1, y1);
       
        //Gambar Persegi Belakang
        g.drawLine(x5, y5, x6, y6);
        g.drawLine(x6, y6, x7, y7);
        g.drawLine(x7, y7, x8, y8);
        g.drawLine(x8, y8, x5, y5);
        
        // Garis Penghubung
        g.drawLine(x1, y1, x5, y5);
        g.drawLine(x2, y2, x6, y6);
        g.drawLine(x3, y3, x7, y7);
        g.drawLine(x4, y4, x8, y8);
    }
}
