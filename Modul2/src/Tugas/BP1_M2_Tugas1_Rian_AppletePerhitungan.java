package Tugas;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_Tugas1_Rian_AppletePerhitungan extends Applet implements ActionListener {
    
    TextField Angka1, Angka2, Hasil;
    Button Tambah, Kurang, Kali, Bagi;

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));
        
        // TextField
        Angka1 = new TextField(10);
        Angka2 = new TextField(10);
        Hasil = new TextField(10);
        
        // Font untuk TextField
        Font fontTextField = new Font("Arial", Font.PLAIN, 40);
        Angka1.setFont(fontTextField);
        Angka2.setFont(fontTextField);
        Hasil.setFont(fontTextField);
        
        // Tombol
        Tambah = new Button("+");
        Kurang = new Button("-");
        Kali = new Button("*");
        Bagi = new Button("/");

        // Font Tombol
        Font fontButton = new Font("Arial", Font.BOLD, 30);
        Tambah.setFont(fontButton);
        Kurang.setFont(fontButton);
        Kali.setFont(fontButton);
        Bagi.setFont(fontButton);
        
        // Font Label
        Font fontLabel = new Font("Arial", Font.PLAIN, 30);
        Label labelAngka1 = new Label("Angka 1 : ");
        labelAngka1.setFont(fontLabel);

        Label labelAngka2 = new Label("Angka 2 : ");
        labelAngka2.setFont(fontLabel);

        Label labelHasil = new Label("Hasil : ");
        labelHasil.setFont(fontLabel);
        
        // Add Item dan Label
        add(labelAngka1);
        add(Angka1);
        add(labelAngka2);
        add(Angka2);
        add(Tambah);
        add(Kurang);
        add(Kali);
        add(Bagi);
        add(labelHasil);
        add(Hasil);
        
        // Action Listener
        Tambah.addActionListener(this);
        Kurang.addActionListener(this);
        Kali.addActionListener(this);
        Bagi.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (isNumeric(Angka1.getText()) && isNumeric(Angka2.getText())) {
            double angka1 = Double.parseDouble(Angka1.getText());
            double angka2 = Double.parseDouble(Angka2.getText());
            double hasil = 0;

            if (e.getSource() == Tambah) {
                hasil = angka1 + angka2;
            } else if (e.getSource() == Kurang) {
                hasil = angka1 - angka2;
            } else if (e.getSource() == Kali) {
                hasil = angka1 * angka2;
            } else if (e.getSource() == Bagi) {
             
            }
            Hasil.setText(String.valueOf(hasil));
        }
    }

    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
