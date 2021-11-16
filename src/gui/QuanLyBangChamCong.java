package gui;

import dao.BangChamCongDao;
import model.BangChamCong;
import util.HienThoiGian;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        btnQuayLai = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        pSub = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        pRIGHT = new javax.swing.JPanel();
        scrollData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm > Quản lý bản chấm công");
        setFocusable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ BẢNG CHẤM CÔNG");
        lblTitle.setFocusable(false);

        lblTacVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các tác vụ:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setText("Thêm bảng mới");
        btnThem.setFocusable(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTaiLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTaiLai.setText("Tải lại table");
        btnTaiLai.setFocusable(false);
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("Sửa bảng chọn");
        btnSua.setFocusable(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuayLai.setText("Trở về menu");
        btnQuayLai.setFocusable(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa bảng chọn");
        btnXoa.setFocusable(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel2");

        lblTime.setText("jLabel3");

        pSub.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tính năng khác liên quan:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        pSub.setToolTipText("");

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimKiem.setText("Quản lý tìm kiếm");
        btnTimKiem.setFocusable(false);

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKe.setText("Quản lý thông kê");
        btnThongKe.setFocusable(false);

        javax.swing.GroupLayout pSubLayout = new javax.swing.GroupLayout(pSub);
        pSub.setLayout(pSubLayout);
        pSubLayout.setHorizontalGroup(
            pSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
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
        btnIn.setText("In toàn bảng");
        btnIn.setFocusable(false);
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTacVuLayout.createSequentialGroup()
                .addComponent(btnQuayLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(pSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(lblTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblTacVuLayout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRIGHT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vùng dữ liệu:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

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
                "Số thự tự", "Mã bảng chấm công", "Thời gian nộp bảng", "Mã đơn vị"
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
            .addComponent(scrollData, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pRIGHTLayout.setVerticalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollData)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTacVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTacVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        try {
            MenuRoot menuPage = new MenuRoot();
            this.dispose();
            menuPage.show();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            BangChamCong_them bccThemPage = new BangChamCong_them();
            bccThemPage.show();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int a = tblData.getSelectedRow();
        if(a == -1)
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 dòng trên bảng cần sửa");
        else{
            BangChamCong_sua bccSuaPage = new BangChamCong_sua();
            bccSuaPage.show();
            bccSuaPage.changePatternTable(tblData.getValueAt(a, 0).toString(), tblData.getValueAt(a, 1).toString(), tblData.getValueAt(a, 2).toString(), tblData.getValueAt(a, 3).toString());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        loadDataToTable();
        JOptionPane.showMessageDialog(rootPane, "Dữ liệu vừa Refresh !");
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int a = tblData.getSelectedRow();
        if(a != -1)
        {
            int cf = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa ?");
            if(cf == JOptionPane.YES_OPTION)
            {
                try {
                    BangChamCongDao bccDao = new BangChamCongDao();
                    String getMaBcc = tblData.getValueAt(a, 1).toString();
                    if(bccDao.xoaBangChamCongDuoiDatabase(getMaBcc))
                        JOptionPane.showMessageDialog(rootPane, "Xóa thành công, hãy tải lại bảng!");
                    else
                        JOptionPane.showMessageDialog(rootPane, "Lỗi không xác định khi xóa!");
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBangChamCong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dòng muốn xóa trên bảng!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Chuyển dữ liệu hiện tại đến trang in?");
        if(a==JOptionPane.YES_OPTION)
        {
            this.dispose();
            InBangChamCong inBcc = new InBangChamCong();
            inBcc.show();
        }
    }//GEN-LAST:event_btnInActionPerformed

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
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lblDate;
    private javax.swing.JPanel lblTacVu;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pRIGHT;
    private javax.swing.JPanel pSub;
    private javax.swing.JScrollPane scrollData;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void loadDataToTable() {
        BangChamCongDao bccDao = new BangChamCongDao();
        lsBcc = bccDao.loadDataToList();
        tabModel.setRowCount(0);
        for (BangChamCong bangChamCong : lsBcc) {
            tabModel.addRow(new Object[] {tabModel.getRowCount()+1, bangChamCong.getMaBangChamCong(), bangChamCong.getThoiGian(), bangChamCong.getMaPhanXuong()});
        }
    }
}
