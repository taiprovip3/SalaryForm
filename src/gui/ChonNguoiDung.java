/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.Database;
import util.LayIpsUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
public class ChonNguoiDung extends javax.swing.JFrame {
    Connection conn;
    public ChonNguoiDung() throws UnknownHostException, SQLException {
        conn = Database.getConnection();
        LayIpsUser Ips = new LayIpsUser();
        String Ip = Ips.getIp();
        String HostName = Ips.getHostName();
        if(CheckIpv4ToDatabase(Ip, HostName))
        {
            DangNhapUser loginPage = new DangNhapUser();
            this.dispose();
            loginPage.show();
            conn.close();
        }else
        {
            initComponents();
            setExtendedState(MAXIMIZED_BOTH);
            showDate();
            showTime();
        }
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        lblDateLab.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTimeLab.setText(s.format(d));
            }
        }).start();
    }//End hàm

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pTOP = new javax.swing.JPanel();
        tlAnnouncer = new javax.swing.JLabel();
        pBOTTOM = new javax.swing.JPanel();
        lblDateLab = new javax.swing.JLabel();
        lblTimeLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pContain = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        chkUser = new javax.swing.JCheckBox();
        btnAdmin = new javax.swing.JButton();
        chkAdmin = new javax.swing.JCheckBox();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm");

        tlAnnouncer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tlAnnouncer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tlAnnouncer.setText("VUI LÒNG CHỌN NGƯỜI DÙNG:");

        javax.swing.GroupLayout pTOPLayout = new javax.swing.GroupLayout(pTOP);
        pTOP.setLayout(pTOPLayout);
        pTOPLayout.setHorizontalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlAnnouncer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTOPLayout.setVerticalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlAnnouncer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        lblDateLab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDateLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateLab.setText("28/10/2021");

        lblTimeLab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTimeLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeLab.setText("9:52");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("(!) Bạn có thể bỏ lưu luôn chọn trong phần cài đặt sau");

        javax.swing.GroupLayout pBOTTOMLayout = new javax.swing.GroupLayout(pBOTTOM);
        pBOTTOM.setLayout(pBOTTOMLayout);
        pBOTTOMLayout.setHorizontalGroup(
            pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBOTTOMLayout.createSequentialGroup()
                .addGroup(pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pBOTTOMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBOTTOMLayout.setVerticalGroup(
            pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBOTTOMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimeLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDateLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUser.setText("Người Quản Lý Lương");
        btnUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        chkUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkUser.setText("Luôn chọn cho lần sau");
        chkUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUserActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdmin.setText("Giám đốc");
        btnAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        chkAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkAdmin.setText("Luôn chọn cho lần sau");
        chkAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pContainLayout = new javax.swing.GroupLayout(pContain);
        pContain.setLayout(pContainLayout);
        pContainLayout.setHorizontalGroup(
            pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContainLayout.createSequentialGroup()
                .addGroup(pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAdmin)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pContainLayout.setVerticalGroup(
            pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkUser)
                    .addComponent(chkAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBOTTOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pContain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBOTTOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        if(chkUser.isSelected())
        {
            LayIpsUser ips = new LayIpsUser();
            try {
                Statement stmt = conn.createStatement();
                String ip = ips.getIp();
                String hostname = ips.getHostName();
                String sql = "insert into usersaver values ('"+ip+"', '"+hostname+"')";
                stmt.execute(sql);
                System.out.println("Đã lưu địa chỉ IP máy đang sử dụng, bỏ qua chọn user cho lần sau!");
            } catch (UnknownHostException | SQLException ex) {
                Logger.getLogger(ChonNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DangNhapUser loginPage = new DangNhapUser();
        this.dispose();
        loginPage.show();
    }//GEN-LAST:event_btnUserActionPerformed

    private void chkUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUserActionPerformed
        if(chkUser.isSelected())
        {
            chkAdmin.setEnabled(false);
        }else
            chkAdmin.setEnabled(true);
    }//GEN-LAST:event_chkUserActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void chkAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdminActionPerformed

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
            java.util.logging.Logger.getLogger(ChonNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChonNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChonNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChonNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChonNguoiDung().setVisible(true);
                } catch (UnknownHostException | SQLException ex) {
                    Logger.getLogger(ChonNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnUser;
    private javax.swing.JCheckBox chkAdmin;
    private javax.swing.JCheckBox chkUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDateLab;
    private javax.swing.JLabel lblTimeLab;
    private javax.swing.JPanel pBOTTOM;
    private javax.swing.JPanel pContain;
    private javax.swing.JPanel pTOP;
    private javax.swing.JLabel tlAnnouncer;
    // End of variables declaration//GEN-END:variables

    private boolean CheckIpv4ToDatabase(String Ip, String HostName) {
        Connection conn = Database.getConnection();
        boolean isResultSet = false;
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from usersaver where ipv4 like '"+Ip+"' or hostname like '"+HostName+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next() == false)
                return false;
            else
                isResultSet = true;
        } catch (SQLException ex) {
            Logger.getLogger(ChonNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isResultSet;
    }
}
