
package rstudio.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private final String URL = "jdbc:mysql://localhost:3306/pbo?"+"serverTimezone=Asia/Makassar";
    private final String USER = "root";
    private final String PASS = "kadatahu";
    
    public Connection getConnection(){
        Connection con;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Berhasil");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error" + ex.toString());
        } catch (SQLException ex) {
            System.err.println("Error" + ex.toString());
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
