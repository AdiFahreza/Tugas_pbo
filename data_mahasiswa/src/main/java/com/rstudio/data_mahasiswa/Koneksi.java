
package com.rstudio.data_mahasiswa;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    String url = "jdbc:mysql://localhost/pbo";
    public Connection getKoneksi(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,"root","kadatahu");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
