package gui;

public class TuyChonIcon extends javax.swing.JFrame {

    private String source;
    public TuyChonIcon(String source) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.source = source;
        pack();
        setLocationRelativeTo(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDoiMK = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDoiUser = new javax.swing.JButton();
        btnLogOut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        btnDoiMK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.setFocusable(false);

        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 51, 0));
        btnLogOut.setText("Đóng");
        btnLogOut.setFocusable(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setText("Đến trợ giúp");
        jButton3.setFocusable(false);

        btnDoiUser.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDoiUser.setText("Chuyển đổi User");
        btnDoiUser.setFocusable(false);
        btnDoiUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiUserActionPerformed(evt);
            }
        });

        btnLogOut1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogOut1.setText("Đăng xuất");
        btnLogOut1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDoiUser, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addComponent(btnDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDoiUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiUserActionPerformed
        
    }//GEN-LAST:event_btnDoiUserActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        System.out.println(source);
        if(source.equalsIgnoreCase("qlBccPage")){
            QuanLyBangChamCong qlBccPage = new QuanLyBangChamCong();
            qlBccPage.show();
        }else{
            if(source.equalsIgnoreCase("ttlPage")){
            TinhTienLuong ttlPage = new TinhTienLuong();
            ttlPage.show();
            }
            if(source.equalsIgnoreCase("qlDxn"))
            {
                QuanLyDonNghi qlDxnPage = new QuanLyDonNghi();
                qlDxnPage.show();
            }
            if(source.equalsIgnoreCase("blTk"))
            {
                BoLocTimKiem blTkPage = new BoLocTimKiem();
                blTkPage.show();
            }
            if(source.equalsIgnoreCase("blThongKe"))
            {
                BoLocThongKe blThongKePage = new BoLocThongKe();
                blThongKePage.show();
            }
        }      
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuyChonIcon("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnDoiUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
