/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screen;

import Model.SanPham;
import Service.GHservice;
import Service.SPservice;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class GioHang extends javax.swing.JFrame {
    List<SanPham> listSP = new ArrayList<>();
    List<SanPham> listGH = new ArrayList<>();
    GHservice service2 = new GHservice();
    SPservice service = new SPservice();
    DefaultTableModel defaultTable = new DefaultTableModel();
    DefaultTableModel defaultTable2 = new DefaultTableModel();
    
    /**
     * Creates new form SanPham
     */
    public GioHang() {
        initComponents();
        defaultTable = (DefaultTableModel) tblQLSP.getModel();
        defaultTable2 = (DefaultTableModel) tblGioHang.getModel();
        
        service.readFromFile();
        fillToTable();
        fillToTable2();
       
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
        tbpSanPham = new javax.swing.JTabbedPane();
        jpThongTin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfMa = new javax.swing.JTextField();
        tfTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdoCu = new javax.swing.JRadioButton();
        rdoMoi = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        chkTrangThai = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        tfSoLuong = new javax.swing.JTextField();
        cbHang = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        jpGioHang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtTongTienTT = new javax.swing.JLabel();
        tbpDanhSachSP = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLSP = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("SAN PHAM");

        jLabel2.setText("Ma");

        jLabel3.setText("Ten");

        tfMa.setEnabled(false);
        tfMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaActionPerformed(evt);
            }
        });

        tfTen.setEnabled(false);

        jLabel4.setText("Hang");

        jLabel5.setText("Gia");

        tfGia.setEnabled(false);

        jLabel6.setText("Loai");

        rdoCu.setText("Cu");
        rdoCu.setEnabled(false);

        rdoMoi.setText("Moi");
        rdoMoi.setEnabled(false);
        rdoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMoiActionPerformed(evt);
            }
        });

        jLabel7.setText("Trang thai");

        chkTrangThai.setText("Con hang");
        chkTrangThai.setEnabled(false);
        chkTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTrangThaiActionPerformed(evt);
            }
        });

        jLabel8.setText("So luong");

        cbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SamSung", "Iphone", "Oppo" }));
        cbHang.setEnabled(false);

        jLabel9.setText("Tong tien:");

        txtTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 0, 0));
        txtTongTien.setText("0");

        javax.swing.GroupLayout jpThongTinLayout = new javax.swing.GroupLayout(jpThongTin);
        jpThongTin.setLayout(jpThongTinLayout);
        jpThongTinLayout.setHorizontalGroup(
            jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinLayout.createSequentialGroup()
                        .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpThongTinLayout.createSequentialGroup()
                                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpThongTinLayout.createSequentialGroup()
                                        .addComponent(rdoCu)
                                        .addGap(59, 59, 59)
                                        .addComponent(rdoMoi))
                                    .addComponent(chkTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                            .addGroup(jpThongTinLayout.createSequentialGroup()
                                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfGia)
                                    .addComponent(tfMa)
                                    .addComponent(tfTen)
                                    .addComponent(cbHang, 0, 198, Short.MAX_VALUE))))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jpThongTinLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jpThongTinLayout.setVerticalGroup(
            jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoCu)
                    .addComponent(rdoMoi))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chkTrangThai))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jpThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTongTien))
                .addContainerGap())
        );

        tbpSanPham.addTab("Thong tin", jpThongTin);

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ma", "Ten", "Hang", "So luong", "Gia", "Trang thai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGioHang);

        jLabel10.setText("Tong tien:");

        txtTongTienTT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongTienTT.setForeground(new java.awt.Color(255, 0, 51));
        txtTongTienTT.setText("0");

        javax.swing.GroupLayout jpGioHangLayout = new javax.swing.GroupLayout(jpGioHang);
        jpGioHang.setLayout(jpGioHangLayout);
        jpGioHangLayout.setHorizontalGroup(
            jpGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(txtTongTienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jpGioHangLayout.setVerticalGroup(
            jpGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGioHangLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTongTienTT))
                .addGap(25, 25, 25))
        );

        tbpSanPham.addTab("Gio hang", jpGioHang);

        tblQLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma", "Ten", "Hang", "Gia", "Trang thai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLSP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        tbpDanhSachSP.addTab("Danh sach san pham", jPanel3);

        btnThem.setText("Them");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnThanhToan.setText("Thanh toan");
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseClicked(evt);
            }
        });
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(323, 323, 323))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tbpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(tbpDanhSachSP, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnThem)
                .addGap(45, 45, 45)
                .addComponent(btnThanhToan)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpDanhSachSP)
                    .addComponent(tbpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnThanhToan)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTrangThaiActionPerformed

    private void rdoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMoiActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void tblQLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLSPMouseClicked
        int rowIndex = tblQLSP.getSelectedRow();
        if (rowIndex >= 0 && rowIndex <= listSP.size()) {
            fillToForm(rowIndex);
        }
         
    }//GEN-LAST:event_tblQLSPMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        if(varidateSL()){
            SanPham sp = getDuLieuForm();
            service2.add(sp);
            fillToTable2();
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void tfMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaActionPerformed

    private void btnThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseClicked
        int tong = 0;
        for(int i=0; i<tblGioHang.getRowCount(); i++){
            tong += Integer.parseInt(tblGioHang.getValueAt(i,4).toString());
        }
        txtTongTienTT.setText(String.valueOf(tong)+" VND"); 
    }//GEN-LAST:event_btnThanhToanMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int rowIndex = tblGioHang.getSelectedRow();
        if(rowIndex>=0){
            int confirm = JOptionPane.showConfirmDialog(this, "Ban co chac muon xoa khong?");
            if(confirm == 0){
                service2.delete(rowIndex);
                fillToTable2();
            }
        }else {
            JOptionPane.showMessageDialog(this, "Phai chon doi tuong xoa");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    private void fillToTable(){
        listSP = service.getListSanPham(); 
        defaultTable.setRowCount(0);
        for (SanPham sp : listSP) {
            defaultTable.addRow(new Object[]{sp.getMa(), sp.getTenSP(), 
                sp.getHangSP(), sp.getGiaSP(), sp.isTrangThaiSP()});
        }
    }
    private void fillToTable2(){
        listGH = service2.getListGH(); 
        defaultTable2.setRowCount(0);
        for (SanPham sp : listGH) {
            defaultTable2.addRow(new Object[]{sp.getMa(), sp.getTenSP(), 
                sp.getHangSP(), sp.getSoLuong(), sp.getTongTienSP(), sp.isTrangThaiSP()});
        }
    }
    
    private void fillToForm(int rowIndex) {
        SanPham sp = listSP.get(rowIndex);
        tfMa.setText(sp.getMa());
        tfTen.setText(sp.getTenSP());
        cbHang.setSelectedItem(sp.getHangSP());
        tfGia.setText(String.valueOf(sp.getGiaSP()));
        tfSoLuong.setText(String.valueOf(sp.getSoLuong()));
        txtTongTien.setText(String.valueOf(sp.getTongTienSP()));
        if (sp.getLoaiSP() == 1) {
            rdoCu.setSelected(true);
        } else {
            rdoMoi.setSelected(true);
        }
        chkTrangThai.setSelected(sp.isTrangThaiSP());  
       
    }
    private boolean varidateSL(){
        try {
                int soluong = Integer.parseInt(tfSoLuong.getText().trim());
                if (soluong <= 0) {
                    JOptionPane.showMessageDialog(this,"Số lượng phải là số nguyên dương!");
                    return false;
                }
            } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(this,"Số lượng phải là số nguyên!");
            }
        return true;
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
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GioHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbHang;
    private javax.swing.JCheckBox chkTrangThai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpGioHang;
    private javax.swing.JPanel jpThongTin;
    private javax.swing.JRadioButton rdoCu;
    private javax.swing.JRadioButton rdoMoi;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblQLSP;
    private javax.swing.JTabbedPane tbpDanhSachSP;
    private javax.swing.JTabbedPane tbpSanPham;
    private javax.swing.JTextField tfGia;
    private javax.swing.JTextField tfMa;
    private javax.swing.JTextField tfSoLuong;
    private javax.swing.JTextField tfTen;
    private javax.swing.JLabel txtTongTien;
    private javax.swing.JLabel txtTongTienTT;
    // End of variables declaration//GEN-END:variables
    private SanPham getDuLieuForm(){
        SanPham sp = new SanPham();
        sp.setMa(tfMa.getText().trim());
        sp.setTenSP(tfTen.getText().trim());
        sp.setHangSP(cbHang.getSelectedItem().toString());
        sp.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
        sp.setGiaSP(Integer.parseInt(tfGia.getText()));
        sp.setTongTienSP(Integer.parseInt(txtTongTien.getText()));
        if (rdoCu.isSelected()) {
            sp.setLoaiSP(1);
        } else if (rdoMoi.isSelected()) {
            sp.setLoaiSP(2);
        } else {
            sp.setLoaiSP(0);
        }
        sp.setTrangThaiSP(chkTrangThai.isSelected());
        return sp;
    }
}
