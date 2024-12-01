package Tugas;

public class Tugas extends javax.swing.JFrame {

    public Tugas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Segitiga = new javax.swing.JMenuItem();
        Persegi = new javax.swing.JMenuItem();
        Lingkaran = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Kubus = new javax.swing.JMenuItem();
        Balok = new javax.swing.JMenuItem();
        Tabung = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORM PERHITUNGAN BANGUN DATAR DAN BANGUN RUANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jMenu3.setText("File");

        jMenuItem7.setText("Buka");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Simpan");
        jMenu3.add(jMenuItem8);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Bangun Datar");

        Segitiga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Segitiga.setText("Segitiga");
        Segitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegitigaActionPerformed(evt);
            }
        });
        jMenu4.add(Segitiga);

        Persegi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Persegi.setText("Persegi");
        Persegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersegiActionPerformed(evt);
            }
        });
        jMenu4.add(Persegi);

        Lingkaran.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Lingkaran.setText("Lingkaran");
        Lingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LingkaranActionPerformed(evt);
            }
        });
        jMenu4.add(Lingkaran);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Bangun Ruang");

        Kubus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Kubus.setText("Kubus");
        Kubus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KubusActionPerformed(evt);
            }
        });
        jMenu5.add(Kubus);

        Balok.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Balok.setText("Balok");
        Balok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalokActionPerformed(evt);
            }
        });
        jMenu5.add(Balok);

        Tabung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Tabung.setText("Tabung");
        Tabung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabungActionPerformed(evt);
            }
        });
        jMenu5.add(Tabung);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegitigaActionPerformed
        // TODO add your handling code here:
        Segitiga S = new Segitiga();
        S.setVisible(true);
    }//GEN-LAST:event_SegitigaActionPerformed

    private void PersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersegiActionPerformed
        // TODO add your handling code here:
        Persegi P = new Persegi();
        P.setVisible(true);
    }//GEN-LAST:event_PersegiActionPerformed

    private void LingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LingkaranActionPerformed
        // TODO add your handling code here:
        Lingkaran L = new Lingkaran();
        L.setVisible(true);
    }//GEN-LAST:event_LingkaranActionPerformed

    private void KubusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KubusActionPerformed
        // TODO add your handling code here:
        Kubus K = new Kubus();
        K.setVisible(true);
    }//GEN-LAST:event_KubusActionPerformed

    private void BalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalokActionPerformed
        // TODO add your handling code here:
        Balok B = new Balok();
        B.setVisible(true);
    }//GEN-LAST:event_BalokActionPerformed

    private void TabungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabungActionPerformed
        // TODO add your handling code here:
        Tabung T = new Tabung();
        T.setVisible(true);
    }//GEN-LAST:event_TabungActionPerformed

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
    private javax.swing.JMenuItem Balok;
    private javax.swing.JMenuItem Kubus;
    private javax.swing.JMenuItem Lingkaran;
    private javax.swing.JMenuItem Persegi;
    private javax.swing.JMenuItem Segitiga;
    private javax.swing.JMenuItem Tabung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
