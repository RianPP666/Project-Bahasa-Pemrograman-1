package PreTest;

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

public class Animasi extends JPanel {
    private static final int L = 400, T = 400;
    private List<Lingkaran> lingkaran;

    public Animasi() {
        setBackground(Color.BLACK); // Latar belakang hitam
        lingkaran = new ArrayList<>();

        // Menambahkan lingkaran pertama dengan posisi dan kecepatan acak
        lingkaran.add(new Lingkaran(50, 100, Color.RED));

        // Timer untuk animasi setiap 30ms
        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Lingkaran l : lingkaran) {
                    l.Bergerak(); // Memperbarui posisi lingkaran
                }
                repaint(); // Menggambar ulang panel
            }
        });
        timer.start();
    }

    // Menggambar semua lingkaran pada panel
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
        private static final int INCREMENT = 5; // Kecepatan gerak
        int x, y; // Posisi dan kecepatan lingkaran
        Color warna;

        // Konstruktor lingkaran dengan kecepatan acak
        public Lingkaran(int x, int y, Color warna) {
            this.x = x;
            this.y = y;
            this.warna = warna;
        }

        // Menggambar lingkaran di panel
        public void GambarLingkaran(Graphics g) {
            g.setColor(warna);
            g.fillOval(x, y, DIAMETER, DIAMETER);
        }

        public void Bergerak() {
            if (x == L) {
                x = 1;
            } else {
                x += INCREMENT;
            }
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Animasi Lingkaran Bergerak");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Animasi());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
