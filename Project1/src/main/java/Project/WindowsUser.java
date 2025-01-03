package Project;


public class WindowsUser extends javax.swing.JFrame {
    String username;

    public WindowsUser() {
        initComponents();
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        DataBuku = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        PinjamBuku = new javax.swing.JMenu();
        PengembalianBuku = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 40));

        DataBuku.setText("Data Buku");
        DataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBukuMouseClicked(evt);
            }
        });
        jMenuBar1.add(DataBuku);
        jMenuBar1.add(jMenu2);

        PinjamBuku.setText("Pinjam Buku");
        PinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PinjamBukuMouseClicked(evt);
            }
        });
        jMenuBar1.add(PinjamBuku);

        PengembalianBuku.setText("Pengembalian Buku");
        PengembalianBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengembalianBukuMouseClicked(evt);
            }
        });
        jMenuBar1.add(PengembalianBuku);

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBukuMouseClicked
        // TODO add your handling code here:
        DataBuku DB = new DataBuku();
        jDesktopPane1.add(DB);
        DB.setVisible(true);
    }//GEN-LAST:event_DataBukuMouseClicked

    private void PinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PinjamBukuMouseClicked
        // TODO add your handling code here:
        FormPeminjaman FP = new FormPeminjaman();
        FP.setUsername(username);
        jDesktopPane1.add(FP);
        FP.setVisible(true);
    }//GEN-LAST:event_PinjamBukuMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void PengembalianBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengembalianBukuMouseClicked
        // TODO add your handling code here:
        FormPengembalian FBuku = new FormPengembalian();
        FBuku.setUsername(username);
        FBuku.LoadPeminjam();  
        jDesktopPane1.add(FBuku);
        FBuku.setVisible(true);

    }//GEN-LAST:event_PengembalianBukuMouseClicked

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
            java.util.logging.Logger.getLogger(WindowsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowsUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu DataBuku;
    private javax.swing.JMenu Logout;
    private javax.swing.JMenu PengembalianBuku;
    private javax.swing.JMenu PinjamBuku;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
