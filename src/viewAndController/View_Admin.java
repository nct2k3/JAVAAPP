/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewAndController;

import viewAndController.View_KhoHang;
import viewAndController.View_KiemKe;
import viewAndController.View_LSNhap;
import viewAndController.View_LSXuat;
import viewAndController.View_SuaXoa;

/**
 *
 * @author pc
 */
public class View_Admin extends javax.swing.JFrame {

    private View_LSNhap vInputList;
    private View_LSXuat vOutputList;
    private View_KhoHang vKhoHang;
    private View_SuaXoa vSuaXoa;
    private View_KiemKe vKiemKe;

    /**
     * Creates new form View_Admin
     */
    public View_Admin() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        khoHang = new javax.swing.JLabel();
        sua = new javax.swing.JLabel();
        kiemKe = new javax.swing.JLabel();
        taiKhoan = new javax.swing.JLabel();
        lichSuXuat = new javax.swing.JLabel();
        LichSuNhap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("MENU ADMIN");

        khoHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/Warehouse-icon.png"))); // NOI18N
        khoHang.setText("Kho hang");
        khoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khoHangMouseClicked(evt);
            }
        });

        sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/File-Delete-icon.png"))); // NOI18N
        sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suaMouseClicked(evt);
            }
        });

        kiemKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/Search-icon.png"))); // NOI18N
        kiemKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kiemKeMouseClicked(evt);
            }
        });

        taiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/users-icon.png"))); // NOI18N

        lichSuXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/document-remove-icon.png"))); // NOI18N
        lichSuXuat.setText("LichSu");
        lichSuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lichSuXuatMouseClicked(evt);
            }
        });

        LichSuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewAndController/document-add-icon.png"))); // NOI18N
        LichSuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LichSuNhapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sua)
                    .addComponent(khoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lichSuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LichSuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(kiemKe, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(khoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LichSuNhap)
                    .addComponent(lichSuXuat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sua)
                    .addComponent(kiemKe)
                    .addComponent(taiKhoan))
                .addGap(36, 36, 36))
        );

        khoHang.getAccessibleContext().setAccessibleName("khoHang");
        sua.getAccessibleContext().setAccessibleName("suaXoa");
        kiemKe.getAccessibleContext().setAccessibleName("kiemKe");
        taiKhoan.getAccessibleContext().setAccessibleName("taiKhoan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(453, 453, 453)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoHangMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        vKhoHang = new View_KhoHang();
        vKhoHang.setVisible(true);
    }//GEN-LAST:event_khoHangMouseClicked

    private void suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        vSuaXoa = new View_SuaXoa();
        vSuaXoa.setVisible(true);
    }//GEN-LAST:event_suaMouseClicked

    private void kiemKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kiemKeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        vKiemKe = new View_KiemKe();
        vKiemKe.setVisible(true);
    }//GEN-LAST:event_kiemKeMouseClicked

    private void lichSuXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lichSuXuatMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        vOutputList = new View_LSXuat();
        vOutputList.setVisible(true);
    }//GEN-LAST:event_lichSuXuatMouseClicked

    private void LichSuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LichSuNhapMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        vInputList = new View_LSNhap();
        vInputList.setVisible(true);
    }//GEN-LAST:event_LichSuNhapMouseClicked

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
            java.util.logging.Logger.getLogger(View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LichSuNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel khoHang;
    private javax.swing.JLabel kiemKe;
    private javax.swing.JLabel lichSuXuat;
    private javax.swing.JLabel sua;
    private javax.swing.JLabel taiKhoan;
    // End of variables declaration//GEN-END:variables
}
