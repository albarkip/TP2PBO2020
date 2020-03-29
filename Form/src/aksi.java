
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albari
 */
public class aksi {
    public void masuk(String as, String bs, String cs, String ds, String es){
        try{
            Connection kon = new koneksi_mysql().getConnection();
            String sql = "insert into buku (kode_buku, nama_buku, nama_peminjam, tanggal_pinjam, tanggal_kembali) values ('%s', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, as, bs, cs, ds, es);
            Statement stat = kon.createStatement();
            stat.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal minjem");
            
        }
    }
    public void hapus(String as){
        try{
            
            String sqls = "delete from buku where kode_buku = '%s'";
            sqls = String.format(sqls, as);
            Connection a = new koneksi_mysql().getConnection();
            Statement stat = a.createStatement();
            sqls = String.format(sqls);
            stat.execute(sqls); 
            a.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal mengembalikan");
            System.err.print("gagal "+e.getMessage());
        }
    }
    public void cekbuku(String as){
        String sqlb = "select * from buku order by kode_buku asc";
        int j = 0;
        try{
            Connection kons = new koneksi_mysql().getConnection();
            Statement stata = kons.createStatement();
            ResultSet hasilb = stata.executeQuery(sqlb);
            
            while (hasilb.next()){
                String kode_buku = hasilb.getString("kode_buku");
                if(kode_buku.equals(as)){
                    j = 1;
                }
            }
            kons.close();
        }catch (Exception e){
        }
            if(j == 0){
               JOptionPane.showMessageDialog(null, "kode gaada"); 
            }
    }
    
    public void panjang(String ds, String es){
        String durasis = "";
        String sql = "select * from buku order by kode_buku asc";
        int i = 0;
        try{
            Connection kon = new koneksi_mysql().getConnection();
            Statement stat = kon.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()){
                String kode_buku = hasil.getString("kode_buku");
                if(kode_buku.equals(ds)){
                    durasis = hasil.getString("tanggal_kembali");
                    i = 1;
                }
            }
            kon.close();
        }catch (Exception e){
        }
        try{
                
                
                int dur = Integer.parseInt(es);
                int dura = Integer.parseInt(durasis);
                int jum = (dur + dura) % 30;
                String durfix = String.valueOf(jum);

                    String sqls = "update buku set kode_buku = kode_buku, nama_buku = nama_buku, nama_peminjam = nama_peminjam, tanggal_pinjam = tanggal_pinjam, tanggal_kembali = '%s' where kode_buku = '%s'";
                    sqls = String.format(sqls, durfix, ds);
                    Connection g = new koneksi_mysql().getConnection();
                    Statement stats = g.createStatement();
                    stats.execute(sqls);
            g.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal perpanjang");
            System.err.print("gagal"+e.getMessage());
        }
    }
    
    
}
