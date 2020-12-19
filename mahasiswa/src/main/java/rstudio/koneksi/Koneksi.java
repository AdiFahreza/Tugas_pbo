package rstudio.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Koneksi {

    public static Connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private final String url="jdbc:mysql://localhost/mahasiswa";
 public Connection getKoneksi(){
     Connection conn = null;
     try {
         conn = DriverManager.getConnection(url, "root" , "kadatahu");
     } catch (SQLException ex) {
         Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
     }
     return conn;
 }
}