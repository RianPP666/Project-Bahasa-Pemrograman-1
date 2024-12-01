import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClass extends JFrame {

    public NewClass() {
        setTitle("Form Pemesanan Online");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 5, 5));

        // Label dan TextField untuk Nama
        JLabel labelNama = new JLabel("Nama:");
        JTextField textNama = new JTextField();

        // Label dan TextField untuk Alamat
        JLabel labelAlamat = new JLabel("Alamat:");
        JTextField textAlamat = new JTextField();

        // Label dan TextField untuk Nomor Telepon
        JLabel labelTelepon = new JLabel("No. Telepon:");
        JTextField textTelepon = new JTextField();

        // Label dan ComboBox untuk Produk
        JLabel labelProduk = new JLabel("Produk:");
        String[] produk = {"Pilih Produk", "Produk A", "Produk B", "Produk C"};
        JComboBox<String> comboProduk = new JComboBox<>(produk);

        // Label dan Spinner untuk Jumlah Produk
        JLabel labelJumlah = new JLabel("Jumlah:");
        JSpinner spinnerJumlah = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        // Label dan ComboBox untuk Metode Pembayaran
        JLabel labelPembayaran = new JLabel("Metode Pembayaran:");
        String[] pembayaran = {"Transfer Bank", "Kartu Kredit", "COD"};
        JComboBox<String> comboPembayaran = new JComboBox<>(pembayaran);

        // Tombol Submit
        JButton btnSubmit = new JButton("Pesan");
        
        // Menambahkan action ketika tombol diklik
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String alamat = textAlamat.getText();
                String telepon = textTelepon.getText();
                String produkDipilih = (String) comboProduk.getSelectedItem();
                int jumlah = (int) spinnerJumlah.getValue();
                String metodePembayaran = (String) comboPembayaran.getSelectedItem();

                // Menampilkan pesan konfirmasi
                JOptionPane.showMessageDialog(null, 
                        "=== Detail Pemesanan ===\n" +
                        "Nama: " + nama + "\n" +
                        "Alamat: " + alamat + "\n" +
                        "No. Telepon: " + telepon + "\n" +
                        "Produk: " + produkDipilih + "\n" +
                        "Jumlah: " + jumlah + "\n" +
                        "Metode Pembayaran: " + metodePembayaran,
                        "Konfirmasi Pemesanan", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Menambahkan komponen ke panel
        panel.add(labelNama); panel.add(textNama);
        panel.add(labelAlamat); panel.add(textAlamat);
        panel.add(labelTelepon); panel.add(textTelepon);
        panel.add(labelProduk); panel.add(comboProduk);
        panel.add(labelJumlah); panel.add(spinnerJumlah);
        panel.add(labelPembayaran); panel.add(comboPembayaran);
        panel.add(new JLabel()); panel.add(btnSubmit);

        // Menambahkan panel ke frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NewClass();
    }
}
