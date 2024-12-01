package Tugas;

import javax.swing.JOptionPane;

public class Tugas extends javax.swing.JFrame {

    public Tugas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        InputMahasiswa = new javax.swing.JMenuItem();
        LihatData = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        InputMatkul = new javax.swing.JMenuItem();
        TabelMatkul = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        InputNilai = new javax.swing.JMenuItem();
        TabelNilai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu3.setText("File");

        jMenuItem7.setText("Buka");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Simpan");
        jMenu3.add(jMenuItem8);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Data Mahasiswa");

        InputMahasiswa.setText("Input Data");
        InputMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMahasiswaActionPerformed(evt);
            }
        });
        jMenu4.add(InputMahasiswa);

        LihatData.setText("Lihat Data");
        LihatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatDataActionPerformed(evt);
            }
        });
        jMenu4.add(LihatData);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Data Mata Kuliah");

        InputMatkul.setText("Input Data");
        InputMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMatkulActionPerformed(evt);
            }
        });
        jMenu5.add(InputMatkul);

        TabelMatkul.setText("Daftar Mata Kuliah");
        TabelMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelMatkulActionPerformed(evt);
            }
        });
        jMenu5.add(TabelMatkul);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Data Nilai");

        InputNilai.setText("Input Data");
        InputNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNilaiActionPerformed(evt);
            }
        });
        jMenu6.add(InputNilai);

        TabelNilai.setText("Data Nilai");
        TabelNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelNilaiActionPerformed(evt);
            }
        });
        jMenu6.add(TabelNilai);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMahasiswaActionPerformed
        // TODO add your handling code here:
        DataMahasiswa dm = new DataMahasiswa();
        dm.setVisible(true);
    }//GEN-LAST:event_InputMahasiswaActionPerformed

    private void InputMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMatkulActionPerformed
        // TODO add your handling code here:
        DataMataKuliah dmk = new DataMataKuliah();
        dmk.setVisible(true);
    }//GEN-LAST:event_InputMatkulActionPerformed

    private void InputNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNilaiActionPerformed
        // TODO add your handling code here:
        DataNilai dn = new DataNilai();
        dn.setVisible(true);
    }//GEN-LAST:event_InputNilaiActionPerformed

    private void TabelMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelMatkulActionPerformed
        // TODO add your handling code here:
        TabelMK tmk = new TabelMK();
        tmk.setVisible(true);
    }//GEN-LAST:event_TabelMatkulActionPerformed

    private void TabelNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelNilaiActionPerformed
        // TODO add your handling code here:
        TabelNilai tn = new TabelNilai();
        tn.setVisible(true);
    }//GEN-LAST:event_TabelNilaiActionPerformed

    private void LihatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatDataActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Nama : \nNIM   : \nKelas : ", "Informasi Identitas", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_LihatDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InputMahasiswa;
    private javax.swing.JMenuItem InputMatkul;
    private javax.swing.JMenuItem InputNilai;
    private javax.swing.JMenuItem LihatData;
    private javax.swing.JMenuItem TabelMatkul;
    private javax.swing.JMenuItem TabelNilai;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
