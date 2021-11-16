/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import util.QuayLai;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author taiproduaxe
 */
public class DoiMatKhau extends javax.swing.JFrame {

    private QuayLai sign;
    public DoiMatKhau(QuayLai sign){
        this.sign = sign;
    }
    public DoiMatKhau() {
        initComponents();
        showDate();
        showTime();
        setExtendedState(MAXIMIZED_BOTH);
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
    }//End hàm
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTOP = new javax.swing.JPanel();
        lblAnnouncer = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        pLEFT = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        rdUser = new javax.swing.JRadioButton();
        rdAdmin = new javax.swing.JRadioButton();
        lblPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblNewRePassword = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtNewRePassword = new javax.swing.JPasswordField();
        pRIGHT = new javax.swing.JPanel();
        scrNote = new javax.swing.JScrollPane();
        lstNote = new javax.swing.JList<>();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm > Đổi mật khẩu");

        lblAnnouncer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAnnouncer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnnouncer.setText("VUI LÒNG ĐIỀN ĐỦ THÔNG TIN BÊN DƯỚI");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout pTOPLayout = new javax.swing.GroupLayout(pTOP);
        pTOP.setLayout(pTOPLayout);
        pTOPLayout.setHorizontalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTOPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnnouncer, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTOPLayout.setVerticalGroup(
            pTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTOPLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAnnouncer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsername.setText("Chọn người dùng đăng nhập:");

        rdUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdUser.setText("User NQLL");

        rdAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdAdmin.setText("Admin Giám đốc");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setText("Mật khẩu cũ:");

        lblNewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNewPassword.setText("Mật khẩu mới:");

        lblNewRePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNewRePassword.setText("Nhập lại mật khẩu mới");

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 204, 102));
        btnOK.setText("Xác nhận");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setText("jPasswordField1");

        txtNewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNewPassword.setText("jPasswordField2");

        txtNewRePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNewRePassword.setText("jPasswordField3");

        javax.swing.GroupLayout pLEFTLayout = new javax.swing.GroupLayout(pLEFT);
        pLEFT.setLayout(pLEFTLayout);
        pLEFTLayout.setHorizontalGroup(
            pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLEFTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword)
                    .addComponent(txtNewPassword)
                    .addComponent(txtNewRePassword)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLEFTLayout.createSequentialGroup()
                                .addComponent(rdUser)
                                .addGap(18, 18, 18)
                                .addComponent(rdAdmin))
                            .addComponent(lblUsername)
                            .addComponent(lblPassword)
                            .addComponent(lblNewPassword)
                            .addComponent(lblNewRePassword)
                            .addGroup(pLEFTLayout.createSequentialGroup()
                                .addComponent(btnOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack)))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pLEFTLayout.setVerticalGroup(
            pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLEFTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername)
                .addGap(8, 8, 8)
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdUser)
                    .addComponent(rdAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblNewPassword)
                .addGap(4, 4, 4)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNewRePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pRIGHT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhắc nhở", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lstNote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lstNote.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "- Mật khẩu mới ít nhất 8 kí tự", "- Mật khẩu mới không được trùng mật khẩu cũ", "- Phải theo regex: \\[A-Zz-z0-9!@#$%^&*()_+{}|]{8,}\\", "- Không được có ký tự khoản trắng \"space\"", "- Không sử dụng các mật khẩu kinh điển như:", "    \"123123az\"", "    \"123456789\"", "    \"abcdefgh\"" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrNote.setViewportView(lstNote);

        javax.swing.GroupLayout pRIGHTLayout = new javax.swing.GroupLayout(pRIGHT);
        pRIGHT.setLayout(pRIGHTLayout);
        pRIGHTLayout.setHorizontalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrNote, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pRIGHTLayout.setVerticalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrNote)
        );

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTime.setText("jLabel7");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDate.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLEFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(sign.getTinHieu().equals("MenuRoot"))
        {
            try {
                MenuRoot menuPage = new MenuRoot();
                this.dispose();
                menuPage.show();
            } catch (SQLException ex) {
                Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            DangNhapUser loginPage = new DangNhapUser();
            this.dispose();
            loginPage.show();
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblAnnouncer;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNewRePassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JList<String> lstNote;
    private javax.swing.JPanel pLEFT;
    private javax.swing.JPanel pRIGHT;
    private javax.swing.JPanel pTOP;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdUser;
    private javax.swing.JScrollPane scrNote;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtNewRePassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

//    public QuayLai xacDinhObjectTinHieu(QuayLai sign) {
//        return sign;
//    }
}
