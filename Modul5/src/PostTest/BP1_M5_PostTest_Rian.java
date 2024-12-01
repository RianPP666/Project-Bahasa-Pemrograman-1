package PostTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class BP1_M5_PostTest_Rian extends JPanel {
    private static final int L = 400, T = 400; // Ukuran panel
    private List<Lingkaran> lingkaran;

    public BP1_M5_PostTest_Rian() {
        setBackground(Color.BLACK); // Warna latar belakang
        setLayout(null);
        lingkaran = new ArrayList<>();
        
        // Menambahkan dua lingkaran pada posisi awal
        lingkaran.add(new Lingkaran(50, 100, Color.RED, 5)); 
        lingkaran.add(new Lingkaran(50, 200, Color.GREEN, 5)); 

        // Timer untuk animasi
        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Lingkaran l : lingkaran) {
                    l.Bergerak();
                }
                repaint();
            }
        });
        timer.start();
    }

    // Menggambar elemen pada panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Lingkaran l : lingkaran) {
            l.GambarLingkaran(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T); // Ukuran panel
    }

    // Kelas internal untuk objek Lingkaran
    public class Lingkaran {
        private static final int DIAMETER = 30; // Diameter lingkaran
        int x, y, d;
        Color warna;

        public Lingkaran(int x, int y, Color warna, int d) {
            this.x = x;
            this.y = y;
            this.warna = warna;
            this.d = d;
        }

        public void GambarLingkaran(Graphics g) {
            g.setColor(warna);
            g.fillOval(x, y, DIAMETER, DIAMETER);
        }

        public void Bergerak() {
            x += d;

            // Pantulan di tepi kiri atau kanan
            if (x <= 0 || x + DIAMETER >= L) {
                d = -d; // Membalik arah
            }
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_PostTest_Rian());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Lingkaran Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
