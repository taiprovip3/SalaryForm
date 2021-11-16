/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.Database;
import util.QuayLai;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author taiproduaxe
 */
public class DangNhapUser extends javax.swing.JFrame {
    Connection conn;
    public DangNhapUser() {
        conn = Database.getConnection();
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(s.format(d));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        pTOP = new javax.swing.JPanel();
        tlAnnouncer = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        pCENTER = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        btnForgot = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jCheckBox2 = new javax.swing.JCheckBox();
        pBOTTOM = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm > User login");

        tlAnnouncer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tlAnnouncer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tlAnnouncer.setText("BẠN VỪA CHỌN ĐĂNG NHẬP USER");

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 153, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("NQLL");

        javax.swing.GroupLayout pTOPLayout = new javax.swing.GroupLayout(pTOP);
        pTOP.setLayout(pTOPLayout);
        pTOPLayout.setHorizontalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlAnnouncer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTOPLayout.setVerticalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTOPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tlAnnouncer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setText("Vui lòng nhập mật khẩu:");

        lblNote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 0, 51));
        lblNote.setText("(!) Chỉ được sai tối đa 5 lần");

        btnForgot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnForgot.setText("Quên mật khẩu");
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChangePassword.setText("Đổi mật khẩu");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 204, 51));
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox2.setText("Mật khẩu");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCENTERLayout = new javax.swing.GroupLayout(pCENTER);
        pCENTER.setLayout(pCENTERLayout);
        pCENTERLayout.setHorizontalGroup(
            pCENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCENTERLayout.createSequentialGroup()
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNote))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCENTERLayout.createSequentialGroup()
                .addComponent(jCheckBox2)
                .addGap(34, 34, 34)
                .addComponent(btnForgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePassword))
            .addComponent(txtPassword)
            .addGroup(pCENTERLayout.createSequentialGroup()
                .addComponent(btnLogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pCENTERLayout.setVerticalGroup(
            pCENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCENTERLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pCENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(lblNote))
                .addGap(17, 17, 17)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForgot)
                    .addComponent(btnChangePassword)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDate.setText("jLabel1");

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTime.setText("jLabel2");

        javax.swing.GroupLayout pBOTTOMLayout = new javax.swing.GroupLayout(pBOTTOM);
        pBOTTOM.setLayout(pBOTTOMLayout);
        pBOTTOMLayout.setHorizontalGroup(
            pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBOTTOMLayout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pBOTTOMLayout.setVerticalGroup(
            pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBOTTOMLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(pBOTTOMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBOTTOMLayout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pBOTTOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(pCENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBOTTOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        QuenMatKhau qmkPage = new QuenMatKhau();
        this.dispose();
        qmkPage.show();
        
    }//GEN-LAST:event_btnForgotActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String x = txtPassword.getText();
        if (x.equalsIgnoreCase("") || x.length() < 8)
            JOptionPane.showMessageDialog(this, "Mật khẩu ít nhất là 8 kí tự!");
        else
        {
            String getUser = lblUser.getText();
            String passWord = txtPassword.getText();
            try {
                Statement stmt = conn.createStatement();
                String sql = "select password from taikhoan where username = '"+getUser+"'";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                String pw = rs.getString(1);
                if(pw.equals(passWord))
                {
                    if(getUser.equalsIgnoreCase("nqll"))
                    {
                        try {
                        JOptionPane pane = new JOptionPane("Đăng nhập thành công!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog dialog = pane.createDialog(null, "Đang xử lý...");
                        dialog.setModal(false);
                        dialog.setVisible(true);
                        Thread.sleep(1700);
                        dialog.setVisible(false);
                        this.dispose();
                        MenuRoot mn = new MenuRoot();
                        mn.show();
                        conn.close();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DangNhapUser.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else{
                        JOptionPane.showMessageDialog(rootPane, "Chưa làm");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu!");
                    txtPassword.setText("");
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(DangNhapUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        QuayLai sign = new QuayLai("DangNhapUser");
        DoiMatKhau dmkPage = new DoiMatKhau(sign);
        DoiMatKhau dmk2Page = new DoiMatKhau();
        this.dispose();
        dmk2Page.show();
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            ChonNguoiDung user = new ChonNguoiDung();
            this.dispose();
            user.show();
        } catch (UnknownHostException | SQLException ex) {
            Logger.getLogger(DangNhapUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new DangNhapUser().setVisible(true);
                DangNhapUser dn = new DangNhapUser();
                dn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pBOTTOM;
    private javax.swing.JPanel pCENTER;
    private javax.swing.JPanel pTOP;
    private javax.swing.JLabel tlAnnouncer;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
