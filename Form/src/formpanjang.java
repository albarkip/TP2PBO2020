/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albari
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class formpanjang extends javax.swing.JFrame {
    private DefaultTableModel tabmodel;
    
    private void tampil_buku(){
        Object[]baris = {"kode buku", "nama buku", "nama peminjam", "tanggal pinjam", "tanggal pengembalian"};
        tabmodel = new DefaultTableModel(null, baris);
        tabelpanjang.setModel(tabmodel);
        String sql = "select * from buku order by kode_buku asc";
        try{
            Connection kon = new koneksi_mysql().getConnection();
            Statement stat = kon.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_buku = hasil.getString("kode_buku");
                String nama_buku = hasil.getString("nama_buku");
                String nama_peminjam = hasil.getString("nama_peminjam");
                String tanggal_pinjam = hasil.getString("tanggal_pinjam");
                String tanggal_pengembalian = hasil.getString("tanggal_kembali");
                String[]data = {kode_buku, nama_buku, nama_peminjam, tanggal_pinjam, tanggal_pengembalian};
                tabmodel.addRow(data);
            }
            kon.close();
        }catch (Exception e){
        }
    }   

    public formpanjang() {
        initComponents();
        tampil_buku();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbkodebuku = new javax.swing.JTextField();
        tbdurasi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpanjang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("1806384 - ALBARI BERKI PRADHANA");

        jLabel2.setText("kode buku");

        jLabel3.setText("durasi pinjam");

        tbkodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkodebukuActionPerformed(evt);
            }
        });

        jButton2.setText("PERPANJANG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabelpanjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelpanjang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbdurasi, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(tbkodebuku)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbdurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("backbtn");
        tbkodebuku.getAccessibleContext().setAccessibleName("tbkode");
        tbdurasi.getAccessibleContext().setAccessibleName("tbdurasi");
        jButton2.getAccessibleContext().setAccessibleName("panjangbtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        form1 a = new form1();
        a.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbkodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbkodebukuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String durasis = "";
        String sql = "select * from buku order by kode_buku asc";
        int i = 0;
        try{
            Connection kon = new koneksi_mysql().getConnection();
            Statement stat = kon.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()){
                String kode_buku = hasil.getString("kode_buku");
                if(kode_buku.equals(tbkodebuku.getText())){
                    durasis = hasil.getString("tanggal_kembali");
                    i = 1;
                }
            }
            kon.close();
        }catch (Exception e){
        }
            if(i == 0){
               JOptionPane.showMessageDialog(null, "kode gaada"); 
            }
        try{
                
                String ds = tbkodebuku.getText();
                String es = tbdurasi.getText();
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
        formpanjang a = new formpanjang();
        a.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(formpanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formpanjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpanjang;
    private javax.swing.JTextField tbdurasi;
    private javax.swing.JTextField tbkodebuku;
    // End of variables declaration//GEN-END:variables
}
