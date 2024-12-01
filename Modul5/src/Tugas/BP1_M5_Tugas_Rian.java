package Tugas;

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

public class BP1_M5_Tugas_Rian extends JPanel {
    private static final int L = 400, T = 400; 
    private List<Mobil> mobil;

    public BP1_M5_Tugas_Rian() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        mobil = new ArrayList<>();
        mobil.add(new Mobil(100, 200, 5, 3)); // Menambahkan kecepatan awal (dx, dy)

        // Timer untuk animasi
        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Mobil m : mobil) {
                    m.Bergerak();
                }
                repaint();
            }
        });
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil m : mobil) {
            m.GambarMobil(g);
        }
    }
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    // Kelas internal untuk objek Mobil
    public class Mobil {
        private int x, y, dx, dy; // Posisi dan kecepatan
        private static final int WIDTH = 90, HEIGHT = 30; // Ukuran mobil

        public Mobil(int x, int y, int dx, int dy) {
            this.x = x;
            this.y = y;
            this.dx = dx; // Kecepatan horizontal
            this.dy = dy; // Kecepatan vertikal
        }

        public void GambarMobil(Graphics g) {
            g.setColor(Color.BLUE); // Atap mobil
            g.fillRect(x + 15, y - 20, 60, 15); // Atap mobil
            g.setColor(Color.YELLOW); // Badan mobil
            g.fillRect(x, y, WIDTH, HEIGHT); // Badan mobil
            g.setColor(Color.RED); // Roda mobil
            g.fillOval(x + 10, y + HEIGHT, 20, 20); // Roda depan
            g.fillOval(x + 60, y + HEIGHT, 20, 20); // Roda belakang
        }

        public void Bergerak() {
            // Update posisi
            x += dx;
            y += dy;

            // Pantulan horizontal
            if (x <= 0 || x + WIDTH >= L) {
                dx = -dx; // Membalik arah horizontal
            }

            // Pantulan vertikal
            if (y <= 0 || y + HEIGHT >= T) {
                dy = -dy; // Membalik arah vertikal
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_Tugas_Rian());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Mobil Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
