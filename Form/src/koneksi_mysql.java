import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi_mysql {
        Connection koneksi;
        public Connection getConnection(){
            try{
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_buku", "root", "");
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal","informasi", JOptionPane.INFORMATION_MESSAGE);
                
            }
            return koneksi;
        }
}
