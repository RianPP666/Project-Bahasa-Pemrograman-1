package Praktikum;

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

public class BP1_M5_P1_Rian extends JPanel {
    private static final int L = 400, T = 400; // Ukuran panel
    private List<Mobil> mobil;

    public BP1_M5_P1_Rian() {
        setBackground(new Color(0, 0, 0)); // Warna latar belakang hitam
        setLayout(null);
        mobil = new ArrayList<>();
        mobil.add(new Mobil(100, 200)); // Menambahkan mobil pada posisi awal

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

    // Menggambar elemen pada panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil m : mobil) {
            m.GambarMobil(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T); // Ukuran panel
    }

    // Kelas internal untuk objek Mobil
    public class Mobil {
        private static final int INCREMENT = 5; // Kecepatan gerak
        int x, y;

        public Mobil(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void GambarMobil(Graphics g) {
            g.setColor(Color.BLUE); // Atap mobil
            g.fillRect(x + 15, y - 20, 60, 15); // Atap mobil
            g.setColor(Color.YELLOW); // Badan mobil
            g.fillRect(x, y, 90, 30); // Badan mobil
            g.setColor(Color.RED); // Roda mobil
            g.fillOval(x + 10, y + 25, 20, 20); // Roda depan
            g.fillOval(x + 60, y + 25, 20, 20); // Roda belakang
        }

        public void Bergerak() {
            if (x == L) {
                x = 1;
            } else {
                x += INCREMENT;
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_P1_Rian());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Mobil Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
