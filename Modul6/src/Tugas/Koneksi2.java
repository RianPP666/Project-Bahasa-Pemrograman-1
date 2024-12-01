package Tugas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi2 {
    public static Connection con;
    
    public Koneksi2(){
        String Id, Pass, Driver, Url;
        Id = "root";
        Pass = "";
        Driver = "com.mysql.cj.jdbc.Driver";
        Url = "jdbc:mysql://localhost:3306/admin";
        
        try{
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(Url, Id, Pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e){
            System.out.println(""+e.getLocalizedMessage());
        }
    }
    public static void main(String[]args){
        Koneksi2 k = new Koneksi2();
    }
}
