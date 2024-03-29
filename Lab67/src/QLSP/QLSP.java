/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLSP;

import Model.QuanAo;
import Service.SPservice;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class QLSP extends javax.swing.JFrame implements Runnable {
    List<QuanAo> listSP = new ArrayList<>();
    SPservice service = new SPservice();
    DefaultTableModel defaultTable = new DefaultTableModel();
    private static int sec = 0;
    private static int min = 0;
    private static int hour = 0;
    private static boolean RUN_TIMER = false;
    private Thread runTimer;
    
    
    /**
     * Creates new form QLSP
     */
    public QLSP() {
        initComponents();
        defaultTable = (DefaultTableModel) tblQLQA.getModel(); //khởi tạo gtri cho defaultTable
        fillToTable();
        //hien thi phan tu o vi tri thu 2
        fillToForm(0);
        runTimer = new Thread(this);
        RUN_TIMER = true;
        runTimer.start();
    }
    @Override
    public void run() {
        try{
            while(RUN_TIMER){
            sec++;
            if(sec==60){
               min+=1;
               sec=0;
            }
            if(min==60){
               hour+=1;
               min=0;
            }
            txtsec.setText(String.valueOf(sec));
            txtMin.setText(String.valueOf(min));
            txtHour.setText(String.valueOf(hour));
            Thread.sleep(1000);
            }
        }catch(Exception ex){
            ex.printStackTrace();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfMa = new javax.swing.JTextField();
        tfTen = new javax.swing.JTextField();
        rdoQuan = new javax.swing.JRadioButton();
        rdoAo = new javax.swing.JRadioButton();
        cbSize = new javax.swing.JComboBox<>();
        tfGia = new javax.swing.JTextField();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLQA = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        txtHour = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMin = new javax.swing.JLabel();
        txtsec = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("QUAN LY KKO QUAN AO");

        jLabel2.setText("Ma");

        jLabel3.setText("Ten");

        jLabel4.setText("Loai");

        jLabel5.setText("Size");

        jLabel6.setText("Gia");

        tfTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoQuan);
        rdoQuan.setText("Quan");

        buttonGroup1.add(rdoAo);
        rdoAo.setText("Ao");
        rdoAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAoActionPerformed(evt);
            }
        });

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));

        btnGhi.setText("Ghi");
        btnGhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGhiMouseClicked(evt);
            }
        });

        btnMo.setText("Mo");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        tblQLQA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ma", "Ten", "Loai", "Size", "Gia ", "Trang thai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQLQA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLQAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLQA);

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHour.setForeground(new java.awt.Color(255, 0, 0));
        txtHour.setText("00");

        jLabel9.setText(":");

        txtMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMin.setForeground(new java.awt.Color(255, 51, 51));
        txtMin.setText("00");

        txtsec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsec.setForeground(new java.awt.Color(255, 0, 0));
        txtsec.setText("00");

        jLabel12.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoQuan)
                                .addGap(78, 78, 78)
                                .addComponent(rdoAo))
                            .addComponent(tfGia)
                            .addComponent(tfTen)
                            .addComponent(cbSize, 0, 204, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoQuan)
                    .addComponent(rdoAo)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHour)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtMin, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtsec, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenActionPerformed

    private void rdoAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoAoActionPerformed

    private void btnGhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGhiMouseClicked
        if(validateND()){// TODO add your handling code here:
        QuanAo nd = getDuLieuTuForm();
            service.add(nd);
            fillToTable();
        }
        service.saveToFile();
    }//GEN-LAST:event_btnGhiMouseClicked

    private void tblQLQAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLQAMouseClicked
    int rowIndex = tblQLQA.getSelectedRow();
        //do du lieu len bang
        if (rowIndex >= 0 && rowIndex <= listSP.size()) {
            fillToForm(rowIndex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblQLQAMouseClicked

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
    if(service.readFromFile()){
            fillToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Mo file khong thanh cong");
        }//        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int rowIndex = tblQLQA.getSelectedRow();
        if(rowIndex>=0){
            int confirm = JOptionPane.showConfirmDialog(this, "Ban co chac muon xoa khong?");
            if(confirm == 0){
                service.delete(rowIndex);
                fillToTable();
            }
        }else {
            JOptionPane.showMessageDialog(this, "Phai chon doi tuong xoa");
        }
        service.saveToFile();
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    private void fillToTable() {
        listSP = service.getListSanPham(); //lấy ds người dùng từ service
        //đổi dữ liệu từ dòng đầu tiên
        defaultTable.setRowCount(0);
        for (QuanAo nd : listSP) {
            defaultTable.addRow(new Object[]{nd.getMa(), nd.getTen(), nd.getLoai()== 1 ? "Quan" : "Ao", nd.getSize(),
                nd.getGia(), nd.getTrangThai(nd.getGia())});
        }
    }
    private void fillToForm(int rowIndex) {
        //lay ra doi tuonng nguoi dung tai rfowindex
        QuanAo nd = listSP.get(rowIndex);
        //do thuoc tinh username 
        tfMa.setText(nd.getMa());
        tfTen.setText(nd.getTen());
        //chojn user khi quyen bawng 1
        if (nd.getLoai() == 1) {
            rdoQuan.setSelected(true);
        } else {
            rdoAo.setSelected(true);
        }
        cbSize.setSelectedItem(nd.getSize());
        tfGia.setText(String.valueOf(nd.getGia()));
    }
    private boolean validateND() {
        if (tfMa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ma khong duoc de trong");
            return false;
        } else if (tfTen.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten khong duoc de trong");
            return false;
        } else if (tfGia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gia khong duoc de trong");
            return false;
        }
        try {
                int gia = Integer.parseInt(tfGia.getText().trim());
                if (gia <= 0) {
                    JOptionPane.showMessageDialog(this,"Gia phai la so duong!");
                    return false;
                }
            } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(this,"Gia phai la so!");
            }
        return true;
    }
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
            java.util.logging.Logger.getLogger(QLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoAo;
    private javax.swing.JRadioButton rdoQuan;
    private javax.swing.JTable tblQLQA;
    private javax.swing.JTextField tfGia;
    private javax.swing.JTextField tfMa;
    private javax.swing.JTextField tfTen;
    private javax.swing.JLabel txtHour;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtsec;
    // End of variables declaration//GEN-END:variables
    private QuanAo getDuLieuTuForm() {
        QuanAo nd = new QuanAo();
        //Lấy giá trị từ txtUser.getText gan cho thuộc tính UserName
        nd.setMa(tfMa.getText().trim());
        nd.setTen(tfTen.getText().trim());
        //C1:
        if (rdoQuan.isSelected()) {
            nd.setLoai(1);
        } else if (rdoAo.isSelected()) {
            nd.setLoai(2);
        } else {
            nd.setLoai(0);
        }
        nd.setSize(cbSize.getSelectedItem().toString());
        nd.setGia(Integer.parseInt(tfGia.getText()));
        
        return nd;
    }

    
    
}

