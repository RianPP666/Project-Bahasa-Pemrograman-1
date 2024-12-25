package Project;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class FormLogin extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    Koneksi koneksi;

    public FormLogin() {
        initComponents();
        koneksi = new Koneksi();
    }
    
    private void LoginUser() {
        String User = jTextField1.getText();
        String Pass = jTextField2.getText();
        boolean userExists = false;
        boolean loginSuccess = false;

         try {
             st = Koneksi.con.createStatement();
             rs = st.executeQuery("SELECT username, password FROM tabelUser");

             while (rs.next()) {
                 String Username = rs.getString("Username");
                 String Password = rs.getString("Password");
                 
                 if (User.equals(Username)) {
                    userExists = true; // Username ditemukan
                    if (Pass.equals(Password)) {   
                        loginSuccess = true; // Username dan password cocok
                    }
                    break;
                 }
             }
         }catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }

        // Validasi 
        if (User.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (loginSuccess) {
            JOptionPane.showMessageDialog(null, "Login Sukses Sebagai " + User, "Login", JOptionPane.INFORMATION_MESSAGE);
            new WindowsUser().setVisible(true);
            this.dispose();
        } else if (userExists) {
            JOptionPane.showMessageDialog(null, "Password salah", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void LoginAdmin() {
        String User = jTextField1.getText();
        String Pass = jTextField2.getText();
        boolean userExists = false;
        boolean loginSuccess = false;

        try {
            st = Koneksi.con.createStatement();
            rs = st.executeQuery("SELECT username, password FROM tabelAdmin");

            while (rs.next()) {
                String Username = rs.getString("Username");
                String Password = rs.getString("Password");

                if (User.equals(Username)) {
                    userExists = true; // Username ditemukan
                    if (Pass.equals(Password)) {
                        loginSuccess = true; // Username dan password cocok
                    }
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // Validasi 
        if (User.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (loginSuccess) {
            JOptionPane.showMessageDialog(null, "Login Sukses Sebagai " + User, "Login", JOptionPane.INFORMATION_MESSAGE);
            new WindowsAdmin().setVisible(true);
            this.dispose();
        } else if (userExists) {
            JOptionPane.showMessageDialog(null, "Password salah", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Registrasi(){
        try {
            st = Koneksi.con.createStatement();
            // Validasi input
            if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Harus Diisi", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validasi ComboBox hanya untuk User
            String level = (String) jComboBox1.getSelectedItem();
            if (!level.equals("User")) {
                JOptionPane.showMessageDialog(this, "Registrasi hanya dapat dilakukan oleh User.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO tabeluser (Username, Password) VALUES ('" 
            + jTextField1.getText() + "', '" + jTextField2.getText() + "')";

            // Opsi Simpan Data
            int Opsi = JOptionPane.showConfirmDialog(this, "Apakah Anda Akan Menyimpan Data?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

            if (Opsi == JOptionPane.YES_OPTION) {
                st.execute(sql);
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
                Clear(); // Bersihkan inputan setelah data disimpan
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak disimpan.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void Clear(){
        jTextField1.setText("");
        jTextField2.setText("");
    }

    private void Login() {
        String level = (String) jComboBox1.getSelectedItem();
        if (level.equals("Admin")) {
            LoginAdmin();
        } else {
            LoginUser();
        }
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Registrasi = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 255, 255));

        jLabel2.setText("Level");

        jLabel4.setText("Password");

        Registrasi.setText("Registrasi");
        Registrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrasiMouseClicked(evt);
            }
        });

        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });

        jLabel1.setText("FORM LOGIN");

        Close.setText("CLose");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel3.setText("Username");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Login)
                                .addGap(18, 18, 18)
                                .addComponent(Registrasi)
                                .addGap(18, 18, 18)
                                .addComponent(Close))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(Close)
                    .addComponent(Registrasi))
                .addContainerGap(89, Short.MAX_VALUE))
        );

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

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
        Login();      
    }//GEN-LAST:event_LoginMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void RegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrasiMouseClicked
        // TODO add your handling code here:
        Registrasi();
    }//GEN-LAST:event_RegistrasiMouseClicked

 
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Login;
    private javax.swing.JButton Registrasi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
