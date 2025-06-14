
package Aplikasi_niko;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yosep alfatah
 */
public class Transaksi extends javax.swing.JFrame {
    java.util.Date tglsekarang = new java.util.Date();
    private final SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private final String tanggal = smpdtfmt.format(tglsekarang);
    private Statement stat;
    private Connection Con;

    private Connection con;
private ResultSet res;
private String t;
    /**
     * Creates new form Pembeli
     */
    public Transaksi() {
        initComponents();
        tgl.setText(tanggal);
        setJam();
        koneksi();
        tabel();
        
        //Menengahkan tempat    
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
       public final void setJam(){
ActionListener taskPerformer = (ActionEvent evt) -> {
    String nol_jam = "", nol_menit = "",nol_detik = "";
    java.util.Date dateTime = new java.util.Date();
    int nilai_jam = dateTime.getHours();
    int nilai_menit = dateTime.getMinutes();
    int nilai_detik = dateTime.getSeconds();
    if(nilai_jam <= 9) nol_jam= "0";
    if(nilai_menit <= 9) nol_menit= "0";
    if(nilai_detik <= 9) nol_detik= "0";
    String jam = nol_jam + Integer.toString(nilai_jam);
    String menit = nol_menit + Integer.toString(nilai_menit);
    String detik = nol_detik + Integer.toString(nilai_detik);
    lblwktu.setText(jam+":"+menit+":"+detik+"");
};
new Timer(1000, taskPerformer).start();
}

private void koneksi(){
try {
Class.forName("com.mysql.jdbc.Driver");
con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasi_sport", "root", "");
stat=(Statement) con.createStatement();
} catch (ClassNotFoundException | SQLException e) {
JOptionPane.showMessageDialog(null, e);
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        no_faktur = new javax.swing.JTextField();
        kode_pembeli = new javax.swing.JTextField();
        kode_barang = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        nama_barang = new javax.swing.JTextField();
        merk = new javax.swing.JTextField();
        warna = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        tahun = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        no_transaksi = new javax.swing.JTextField();
        tgl = new javax.swing.JLabel();
        lblwktu = new javax.swing.JLabel();
        tgl_fktur = new javax.swing.JTextField();
        jam_fktur = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("No Faktur");

        jLabel2.setText("Jam");

        jLabel3.setText("Tanggal");

        jLabel4.setText("Nama");

        jLabel5.setText("Kode Siswa");

        no_faktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_fakturActionPerformed(evt);
            }
        });

        kode_pembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pembeliActionPerformed(evt);
            }
        });

        kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_barangActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/gtk-save-as.png"))); // NOI18N
        jButton4.setText("SIMPAN");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Kode SPP");

        jLabel8.setText("Nama Siswa");

        jLabel9.setText("Kelas");

        jLabel10.setText("Bulan");

        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setText("Tahun");

        jLabel12.setText("Nominal");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/Zoom.png"))); // NOI18N
        jButton7.setText("Cari");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel13.setText("No transaksi");

        tgl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tgl.setText("jLabel14");

        lblwktu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblwktu.setText("jLabel15");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/Print.png"))); // NOI18N
        jButton1.setText("CETAK");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/gtk-edit.png"))); // NOI18N
        jButton2.setText("EDIT");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/document_delete.png"))); // NOI18N
        jButton3.setText("HAPUS");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/Zoom.png"))); // NOI18N
        jButton8.setText("Cari");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi_niko/application-exit.png"))); // NOI18N
        jButton9.setText("KEMBALI");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FORM TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(333, 333, 333))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(32, 32, 32)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kode_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tgl_fktur, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jam_fktur))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no_faktur, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblwktu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgl_fktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jam_fktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(no_faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tgl)
                            .addComponent(lblwktu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void no_fakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_fakturActionPerformed
        // TODO add your handling code here:
         try { 
res=stat.executeQuery("select * from faktur where "+ "faktur='" +no_faktur.getText()
+"'" ); while (res.next()) 
{ no_faktur.setText(res.getString("no faktur")); 
tgl_fktur.setText(res.getString("tanggal"));
jam_fktur.setText(res.getString("jam"));
    }                                        
 }
        
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 
    }//GEN-LAST:event_no_fakturActionPerformed

    private void kode_pembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_pembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_pembeliActionPerformed

    private void kode_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new cetak_faktur().setVisible(true);
        try {
 stat.executeUpdate("insert into transaksi values (" 
+ "'" + no_transaksi.getText()+"'," 
+ "'" + no_faktur.getText()+"'," 
+ "'" + tgl_fktur.getText()+"'," 
+ "'" + jam_fktur.getText()+ "'," 
+ "'" + kode_pembeli.getText()+"',"         
+ "'" + nama.getText()+ "',"          
+ "'" + kode_barang.getText()+ "',"
+ "'" + nama_barang.getText()+ "',"
+ "'" + merk.getText()+ "',"
+ "'" + warna.getText()+ "',"
+ "'" + tahun.getText()+ "',"
+ "'" + harga.getText()+ "')");    
JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data"); 
} catch (SQLException | HeadlessException e) { 
JOptionPane.showMessageDialog(null, "Perintah Salah : "+e);
 } finally{
         tabel();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try { 
res=stat.executeQuery("select * from faktur where "+ "no_faktur='" +no_faktur.getText()
+"'" ); while (res.next()) 
{ no_faktur.setText(res.getString("no_faktur")); 
tgl_fktur.setText(res.getString("tgl_fktur"));
jam_fktur.setText(res.getString("jam_fktur"));
kode_pembeli.setText(res.getString("kode_pembeli"));
kode_barang.setText(res.getString("kode_barang"));
    }//GEN-LAST:event_jButton5ActionPerformed
 }       
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 
    }  
 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try { 
res=stat.executeQuery("select * from pembeli where "+ "kode_pembeli='" +kode_pembeli.getText()
+"'" ); while (res.next()) 
{ kode_pembeli.setText(res.getString("kode_pembeli")); 
nama.setText(res.getString("nama"));
    }                                        
 }       
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try { 
res=stat.executeQuery("select * from barang where "+ "kode_barang='" +kode_barang.getText()
+"'" ); while (res.next()) 
{ kode_barang.setText(res.getString("kode_barang")); 
nama_barang.setText(res.getString("nama_barang"));
merk.setText(res.getString("merk"));
warna.setText(res.getString("warna"));
tahun.setText(res.getString("ukuran"));
harga.setText(res.getString("harga"));
}                                        
 }       
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
} 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new cetak_faktur().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            stat.executeUpdate("update transaksi set "
                + "no_transaksi='"+no_transaksi.getText()+"',"
                + "no_faktur='"+no_faktur.getText()+"',"
                + "tgl_fktur='"+tgl_fktur.getText()+"',"
                + "jam_fktur='"+jam_fktur.getText()+"',"
                + "kode_pembeli='"+kode_pembeli.getText()+"',"
                + "nama='"+nama.getText()+"',"
                + "kode_barang='"+kode_barang.getText()+"',"
                + "nama_barang='"+nama_barang.getText()+"',"
                + "merk='"+merk.getText()+"',"
                + "warna='"+warna.getText()+"',"
                + "ukuran='"+tahun.getText()+"',"
                + "harga='"+harga.getText()+"'"

                + " where " + "no_transaksi='"+no_transaksi.getText()+"'" );
            JOptionPane.showMessageDialog(rootPane, "Data berhasil Diupdate");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }finally{
         tabel();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
        try { 
res=stat.executeQuery("select * from transaksi where "+ "nama_barang='" +no_transaksi.getText()
+"'" ); while (res.next()) 
{ no_transaksi.setText(res.getString("no_transaksi")); 
no_faktur.setText(res.getString("no_faktur"));
tgl_fktur.setText(res.getString("tgl_fktur"));
jam_fktur.setText(res.getString("jam_fktur"));
kode_pembeli.setText(res.getString("kode_pembeli")); 
nama.setText(res.getString("nama"));
kode_barang.setText(res.getString("kode_barang")); 
nama_barang.setText(res.getString("nama_barang"));
merk.setText(res.getString("merk"));
warna.setText(res.getString("warna"));
tahun.setText(res.getString("ukuran"));
harga.setText(res.getString("harga"));
}                                        
 }       
catch (Exception e) { 
JOptionPane.showMessageDialog(rootPane, e); 
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          try { 
stat.executeUpdate("delete from transaksi where " 
+ "no_transaksi='"+no_transaksi.getText()
+"'" ); 
JOptionPane.showMessageDialog(null, "Berhasil");
 } catch (SQLException | HeadlessException e) { 
JOptionPane.showMessageDialog(null, "pesan salah : "+e);
 } finally{
         tabel();
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
            new Penjualan().setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tabel(){ 
DefaultTableModel t= new DefaultTableModel();
 t.addColumn("No Transaksi"); 
 t.addColumn("No Faktur"); 
 t.addColumn("Tanggal");
 t.addColumn("Jam"); 
 t.addColumn("Kode Siswa"); 
 t.addColumn("Nama"); 
 t.addColumn("Kode SPP"); 
 t.addColumn("Nama Siswa"); 
 t.addColumn("Kelas");
 t.addColumn("Bulan"); 
 t.addColumn("Tahun"); 
 t.addColumn("Nominal"); 
 tbl.setModel(t); try{ res=stat.executeQuery("select * from transaksi"); 
 while (res.next()) { 
 t.addRow(new Object[]{ res.getString("no_transaksi"),
 res.getString("no_faktur"), 
  res.getString("tgl_fktur"), 
 res.getString("jam_fktur"), 
  res.getString("kode_pembeli"), 
    res.getString("nama"),
    res.getString("kode_barang"), 
 res.getString("nama_barang"),   
  res.getString("merk"), 
 res.getString("warna"), 
  res.getString("ukuran"), 
    res.getString("harga") 
 }); 
 }
 }catch (Exception e) { 
 JOptionPane.showMessageDialog(rootPane, e); 
 } 
}
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jam_fktur;
    private javax.swing.JTextField kode_barang;
    private javax.swing.JTextField kode_pembeli;
    private javax.swing.JLabel lblwktu;
    private javax.swing.JTextField merk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JTextField no_faktur;
    private javax.swing.JTextField no_transaksi;
    private javax.swing.JTextField tahun;
    private javax.swing.JTable tbl;
    private javax.swing.JLabel tgl;
    private javax.swing.JTextField tgl_fktur;
    private javax.swing.JTextField warna;
    // End of variables declaration//GEN-END:variables
}
