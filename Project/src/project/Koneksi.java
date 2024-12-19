package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    public static Connection con;
    
    public Koneksi(){
        String Id, Pass, Driver, Url;
        Id = "root";
        Pass = "";
        Driver = "com.mysql.cj.jdbc.Driver";
        Url = "jdbc:mysql://localhost:3306/perpustakaan";
        
        try{
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(Url, Id, Pass);
        } catch (Exception e){
            System.out.println(""+e.getLocalizedMessage());
        }
    }
    public static void main(String[]args){
        Koneksi k = new Koneksi();
    }
}
