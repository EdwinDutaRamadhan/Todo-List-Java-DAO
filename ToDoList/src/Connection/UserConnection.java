/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class UserConnection {
    public Connection koneksi = null;
    public Connection getConnection(){
        try {
        MysqlDataSource user = new MysqlDataSource();
        user.setServerName("localhost");
        user.setPortNumber(3306);
        user.setUser("root");
        user.setPassword("");
        user.setDatabaseName("db_pedes");
        //
        koneksi = user.getConnection();
          //koneksi = DriverManager.getConnection("jdbc:mysql://sql108.epizy.com/epiz_32552430_db_pedes","epiz_32552430","DSSvGk5JKu");
            System.out.println("koneksi berhasil!");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return koneksi;        
    }
}