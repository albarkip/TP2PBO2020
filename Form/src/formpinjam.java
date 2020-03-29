

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albari
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class formpinjam extends javax.swing.JFrame {
    String[] isian = {"", "", "", "", ""};
    
    private DefaultTableModel tabmodel;
    
    
    private void tampil_buku(){
        Object[]baris = {"kode buku", "nama buku", "nama peminjam", "tanggal pinjam", "tanggal pengembalian"};
        tabmodel = new DefaultTableModel(null, baris);
        tabelpinjam.setModel(tabmodel);
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

    /**
     * Creates new form formpinjam
     */
    public formpinjam() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tbkodebuku = new javax.swing.JTextField();
        tbnamabuku = new javax.swing.JTextField();
        tbnamapinjam = new javax.swing.JTextField();
        tbpinjam = new javax.swing.JTextField();
        tbkembali = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpinjam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("1806384 - ALBARI BERKI PRADHANA");

        jLabel2.setText("kode buku");

        jLabel3.setText("nama buku");

        jLabel4.setText("nama peminjam");

        jLabel5.setText("tanggal pinjam");

        jLabel6.setText("tanggal pengembalian");

        jButton2.setText("PINJAM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbkodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkodebukuActionPerformed(evt);
            }
        });

        tbnamabuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnamabukuActionPerformed(evt);
            }
        });

        tbnamapinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnamapinjamActionPerformed(evt);
            }
        });

        tbpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbpinjamActionPerformed(evt);
            }
        });

        tbkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkembaliActionPerformed(evt);
            }
        });

        tabelpinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelpinjam);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbnamabuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(tbnamapinjam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbpinjam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbkembali, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbkodebuku))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(504, 504, 504)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbnamabuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbnamapinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tbpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("backbtn");
        jButton2.getAccessibleContext().setAccessibleName("pinjambtn");
        tbkodebuku.getAccessibleContext().setAccessibleName("tbkodebuku");
        tbnamabuku.getAccessibleContext().setAccessibleName("tbnamabuku");
        tbnamapinjam.getAccessibleContext().setAccessibleName("tbnamapinjam");
        tbpinjam.getAccessibleContext().setAccessibleName("tbpinjam");
        tbkembali.getAccessibleContext().setAccessibleName("tbkembali");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        form1 a = new form1();
        a.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbpinjamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String as = tbkodebuku.getText();
        String bs = tbnamabuku.getText();
        String cs = tbnamapinjam.getText();
        String ds = tbpinjam.getText();
        String es = tbkembali.getText();
        try{
            Connection kon = new koneksi_mysql().getConnection();
            String sql = "insert into buku (kode_buku, nama_buku, nama_peminjam, tanggal_pinjam, tanggal_kembali) values ('%s', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, as, bs, cs, ds, es);
            Statement stat = kon.createStatement();
            stat.execute(sql);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal minjem");
            
        }
        formpinjam a = new formpinjam();
        a.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbkodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkodebukuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbkodebukuActionPerformed

    private void tbnamabukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnamabukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnamabukuActionPerformed

    private void tbnamapinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnamapinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnamapinjamActionPerformed

    private void tbkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbkembaliActionPerformed
    
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
            java.util.logging.Logger.getLogger(formpinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formpinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelpinjam;
    private javax.swing.JTextField tbkembali;
    private javax.swing.JTextField tbkodebuku;
    private javax.swing.JTextField tbnamabuku;
    private javax.swing.JTextField tbnamapinjam;
    private javax.swing.JTextField tbpinjam;
    // End of variables declaration//GEN-END:variables
}
