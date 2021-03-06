package gui;

import dao.BangChamCongDao;
import model.BangChamCong;
import util.HienThoiGian;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.LayLogTime;

public class QuanLyBangChamCong extends javax.swing.JFrame {

    DefaultTableModel tabModel;
    List<BangChamCong> lsBcc;
    public QuanLyBangChamCong() {
        lsBcc = new ArrayList<>();
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        HienThoiGian htg = new HienThoiGian(lblDate, lblTime);
        htg.showDate();
        htg.showTime();
        tabModel = (DefaultTableModel) tblData.getModel();
        loadDataToTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTacVu = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnTaiLai = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        pSub = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        pRIGHT = new javax.swing.JPanel();
        scrollData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        taLogs = new javax.swing.JTextArea();
        btnUser = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnXoaLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm > Qu???n l?? b???n ch???m c??ng");
        setFocusable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QU???N L?? B???NG CH???M C??NG");
        lblTitle.setFocusable(false);

        lblTacVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "C??c t??c v???:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setText("Th??m b???ng m???i");
        btnThem.setFocusable(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTaiLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTaiLai.setText("T???i l???i table");
        btnTaiLai.setFocusable(false);
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("S???a b???ng ch???n");
        btnSua.setFocusable(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("X??a b???ng ch???n");
        btnXoa.setFocusable(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        pSub.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??nh n??ng kh??c li??n quan:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        pSub.setToolTipText("");

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimKiem.setText("Qu???n l?? t??m ki???m");
        btnTimKiem.setFocusable(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKe.setText("Qu???n l?? th??ng k??");
        btnThongKe.setFocusable(false);

        javax.swing.GroupLayout pSubLayout = new javax.swing.GroupLayout(pSub);
        pSub.setLayout(pSubLayout);
        pSubLayout.setHorizontalGroup(
            pSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        pSubLayout.setVerticalGroup(
            pSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSubLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIn.setText("In to??n b???ng");
        btnIn.setFocusable(false);
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuayLai.setText("Quay l???i");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblTacVuLayout = new javax.swing.GroupLayout(lblTacVu);
        lblTacVu.setLayout(lblTacVuLayout);
        lblTacVuLayout.setHorizontalGroup(
            lblTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTaiLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lblTacVuLayout.createSequentialGroup()
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lblTacVuLayout.setVerticalGroup(
            lblTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTacVuLayout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        pRIGHT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "V??ng d??? li???u:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        tblData.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S??? th??? t???", "M?? b???ng ch???m c??ng", "Th???i gian n???p b???ng", "M?? ????n v???"
            }
        ));
        tblData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblData.setRowHeight(30);
        tblData.getTableHeader().setResizingAllowed(false);
        tblData.getTableHeader().setReorderingAllowed(false);
        scrollData.setViewportView(tblData);

        javax.swing.GroupLayout pRIGHTLayout = new javax.swing.GroupLayout(pRIGHT);
        pRIGHT.setLayout(pRIGHTLayout);
        pRIGHTLayout.setHorizontalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollData)
        );
        pRIGHTLayout.setVerticalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logs:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        taLogs.setColumns(20);
        taLogs.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        taLogs.setRows(10);
        jScrollPane10.setViewportView(taLogs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\taito\\Documents\\NetBeansProjects\\n11_qllsp\\data\\img-Icon\\user-icon.png")); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel2");

        lblTime.setText("jLabel3");

        btnXoaLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoaLog.setText("X??a log");
        btnXoaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTacVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime)
                            .addComponent(lblDate)))
                    .addComponent(btnXoaLog, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTacVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnXoaLog)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            BangChamCong_them bccThemPage = new BangChamCong_them();
            bccThemPage.show();
            taLogs.append(LayLogTime.getLogTime()+": ch???n th??m bcc m???i\n");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int a = tblData.getSelectedRow();
        if(a == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Vui l??ng ch???n 1 d??ng tr??n b???ng c???n s???a");
            taLogs.append(LayLogTime.getLogTime()+": ch??a ch???n d??ng c???n s???a\n");
        }
        else{
            BangChamCong_sua bccSuaPage = new BangChamCong_sua();
            bccSuaPage.show();
            bccSuaPage.changePatternTable(tblData.getValueAt(a, 0).toString(), tblData.getValueAt(a, 1).toString(), tblData.getValueAt(a, 2).toString(), tblData.getValueAt(a, 3).toString());
            taLogs.append(LayLogTime.getLogTime()+": ch???n s???a bcc m??:"+tblData.getValueAt(a, 1)+"\n");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        loadDataToTable();
        JOptionPane.showMessageDialog(rootPane, "D??? li???u v???a Refresh !");
        taLogs.append(LayLogTime.getLogTime()+": t???i l???i b???ng d??? li???u th??nh c??ng\n");
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int a = tblData.getSelectedRow();
        if(a != -1)
        {
            int cf = JOptionPane.showConfirmDialog(rootPane, "B???n c?? ch???c mu???n x??a ?");
            if(cf == JOptionPane.YES_OPTION)
            {
                try {
                    BangChamCongDao bccDao = new BangChamCongDao();
                    String getMaBcc = tblData.getValueAt(a, 1).toString();
                    
                    if(bccDao.xoaBangChamCongDuoiDatabase(getMaBcc))
                    {
                        JOptionPane.showMessageDialog(rootPane, "X??a th??nh c??ng, h??y t???i l???i b???ng!");
                        taLogs.append(LayLogTime.getLogTime()+": x??a th??nh c??ng 1 d??ng tr??n b???ng\n");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "L???i kh??ng x??c ?????nh khi x??a!");
                        taLogs.append(LayLogTime.getLogTime()+": x??a th???t b???i, l???i kh??ng x??c ?????nh\n");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
                    taLogs.append(LayLogTime.getLogTime()+": l???i kh??ng x??c ?????nh ???? x???y ra\n");
                }
            }
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui l??ng ch???n d??ng mu???n x??a tr??n b???ng!");
            taLogs.append(LayLogTime.getLogTime()+": ch??a ch???n d??ng x??a\n");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed

        int a = JOptionPane.showConfirmDialog(rootPane, "Chuy???n d??? li???u hi???n t???i ?????n trang in?");
        if(a==JOptionPane.YES_OPTION)
        {
            this.dispose();
            InBangChamCong inBcc = new InBangChamCong();
            inBcc.show();
        } else
            taLogs.append(LayLogTime.getLogTime()+": ch??a ch???n d??ng x??a\n");
    }//GEN-LAST:event_btnInActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed

        try {
            MenuRoot menuPage = new MenuRoot();
            this.dispose();
            menuPage.show();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXoaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLogActionPerformed
        taLogs.setText("");
    }//GEN-LAST:event_btnXoaLogActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        TuyChonIcon optionPage = new TuyChonIcon("qlBccPage");
        optionPage.show();
        this.dispose();
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        BoLocTimKiem searchPage = new BoLocTimKiem();
        dispose();
        searchPage.show();
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBangChamCong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JLabel lblDate;
    private javax.swing.JPanel lblTacVu;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pRIGHT;
    private javax.swing.JPanel pSub;
    private javax.swing.JScrollPane scrollData;
    private javax.swing.JTextArea taLogs;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void loadDataToTable() {
        BangChamCongDao bccDao = new BangChamCongDao();
        lsBcc = bccDao.loadDataToList();
        tabModel.setRowCount(0);
        for (BangChamCong bangChamCong : lsBcc) {
            tabModel.addRow(new Object[] {tabModel.getRowCount()+1, bangChamCong.getMaBangChamCong(), bangChamCong.getMaDonVi(), bangChamCong.getNgayChamCong()});
        }
    }
}
