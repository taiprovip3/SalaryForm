/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.Database;
import dao.DonXinNghiDao;
import model.BangChamCong;
import util.HienThoiGian;
import util.LayThoiGianHoatDong;
import util.QuayLai;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import model.DonXinNghi;
public class MenuRoot extends javax.swing.JFrame {
    Connection conn;
    public MenuRoot() throws SQLException {
        conn = Database.getConnection();
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        HienThoiGian htg = new HienThoiGian(lblDate, lblTime);
        htg.showDate();
        htg.showTime();
        DemTimeHoatDong();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLEFT = new javax.swing.JPanel();
        btnScript = new javax.swing.JButton();
        btnDonNghi = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnBCC = new javax.swing.JButton();
        btnCaiDat = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnTinhTienLuong = new javax.swing.JButton();
        btnLienHe = new javax.swing.JButton();
        btnTimKiem1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btnTroGiup = new javax.swing.JButton();
        pRIGHT = new javax.swing.JPanel();
        cbTuyChon = new javax.swing.JComboBox<>();
        Sep = new javax.swing.JSeparator();
        lblSubtitle = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        pHELP = new javax.swing.JPanel();
        lblHelp1 = new javax.swing.JLabel();
        lblHelp2 = new javax.swing.JLabel();
        lblHelp3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblDemo = new javax.swing.JLabel();
        pDEMO = new javax.swing.JPanel();
        lblDemo1 = new javax.swing.JLabel();
        lblDemo3 = new javax.swing.JLabel();
        lblDemo2 = new javax.swing.JLabel();
        lblDemo4 = new javax.swing.JLabel();
        lblDemo5 = new javax.swing.JLabel();
        lblDemo6 = new javax.swing.JLabel();
        lblDemo7 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDemo8 = new javax.swing.JLabel();
        pMAIL = new javax.swing.JPanel();
        btnMail = new javax.swing.JButton();
        lblMail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblActive = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalaryForm > User NQLL");

        pLEFT.setBackground(new java.awt.Color(255, 255, 255));
        pLEFT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh tác vụ:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnScript.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnScript.setText("Cập nhật script mới");
        btnScript.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnScript.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScriptActionPerformed(evt);
            }
        });

        btnDonNghi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDonNghi.setText("Quản lý Đơn nghỉ");
        btnDonNghi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDonNghi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDonNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonNghiActionPerformed(evt);
            }
        });

        btnSanPham.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSanPham.setText("Quản lý Sản phẩm");
        btnSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnBCC.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBCC.setText("Q.Lý bảng Chấm Công");
        btnBCC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBCC.setFocusable(false);
        btnBCC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCCActionPerformed(evt);
            }
        });

        btnCaiDat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCaiDat.setText("Cài đặt nâng cao ");
        btnCaiDat.setActionCommand("⚙ Cài đặt nâng cao");
        btnCaiDat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCaiDat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCaiDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaiDatActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnThongKe.setText("Thống kê bằng Bộ lọc");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnTinhTienLuong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTinhTienLuong.setText("Tính tiền lương");
        btnTinhTienLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTinhTienLuong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTinhTienLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienLuongActionPerformed(evt);
            }
        });

        btnLienHe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLienHe.setText("Liên hệ / báo lỗi");
        btnLienHe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLienHe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLienHe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLienHeActionPerformed(evt);
            }
        });

        btnTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTimKiem1.setText("Tìm kiếm bằng Bộ lọc");
        btnTimKiem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTimKiem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\bookandpen.png")); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\takeabreak.png")); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\sanPham-icon.png")); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\import0icon.png")); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\satistic.png")); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\lookUp-icon.png")); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\calculator-icon.png")); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\report-icon.png")); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\setting-icon.png")); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\help-icon.png")); // NOI18N

        btnTroGiup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTroGiup.setText("Trợ giúp");
        btnTroGiup.setActionCommand("⚙ Cài đặt nâng cao");
        btnTroGiup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTroGiup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroGiupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLEFTLayout = new javax.swing.GroupLayout(pLEFT);
        pLEFT.setLayout(pLEFTLayout);
        pLEFTLayout.setHorizontalGroup(
            pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLEFTLayout.createSequentialGroup()
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDonNghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnScript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLEFTLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroGiup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTinhTienLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimKiem1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(btnLienHe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pLEFTLayout.setVerticalGroup(
            pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLEFTLayout.createSequentialGroup()
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBCC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnDonNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnScript, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTinhTienLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLienHe, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pLEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLEFTLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTroGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRIGHT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xin chào, user NQLL (logged):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        cbTuyChon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbTuyChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tùy chọn", "Chuyển đổi user khác", "Đổi mật khẩu", "Đăng xuất" }));
        cbTuyChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTuyChonActionPerformed(evt);
            }
        });

        lblSubtitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSubtitle.setText("Xin chào, bạn đang đứng ở giao diện gốc đầu tiên.");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MENU ROOT");

        lblHelp.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(0, 153, 0));
        lblHelp.setText("TRỢ GIÚP:");

        lblHelp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHelp1.setText("▸Nếu đây là lần đầu bạn sử dụng có thể trợ giúp:");

        lblHelp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHelp2.setText("❶: Vào thanh \"Trợ giúp\" bên trái thanh tác vụ");

        lblHelp3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHelp3.setText("❷: Hoặc nhấn vào đây để mở trang trợ giúp khởi đầu");

        jButton3.setText("link");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pHELPLayout = new javax.swing.GroupLayout(pHELP);
        pHELP.setLayout(pHELPLayout);
        pHELPLayout.setHorizontalGroup(
            pHELPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHELPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHELPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelp1)
                    .addGroup(pHELPLayout.createSequentialGroup()
                        .addComponent(lblHelp3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(lblHelp2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pHELPLayout.setVerticalGroup(
            pHELPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHELPLayout.createSequentialGroup()
                .addComponent(lblHelp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHelp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pHELPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHelp3)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblDemo.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblDemo.setForeground(new java.awt.Color(0, 153, 0));
        lblDemo.setText("GIỚI THIỆU:");

        lblDemo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemo1.setText(" - Phiên bản ứng dụng: 1.0 (newest official)");

        lblDemo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemo3.setText(" - Chức năng: quản lý thông tin / dữ liệu của đơn vị \"Quản Lý Lương\"");

        lblDemo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemo2.setText(" - Lần cuối cập nhật: 02/11/2021 3:39 PM");

        lblDemo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemo4.setText(" - Nhà phát triển: tập đoàn SalaryForm");

        lblDemo5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDemo5.setText("Bản quyền:");

        lblDemo6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDemo6.setText("- Product Activated");

        lblDemo7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDemo7.setText("- Exceptional key: XXXXX-YYYYY-ZZZZZ (nhận bởi administrator)");

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTime.setText("jLabel1");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setText("jLabel2");

        lblDemo8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemo8.setText(" - Đơn vị sử dụng: đơn vị quản lý lương");

        javax.swing.GroupLayout pDEMOLayout = new javax.swing.GroupLayout(pDEMO);
        pDEMO.setLayout(pDEMOLayout);
        pDEMOLayout.setHorizontalGroup(
            pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDEMOLayout.createSequentialGroup()
                .addGroup(pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDEMOLayout.createSequentialGroup()
                        .addComponent(lblDemo5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDEMOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDEMOLayout.createSequentialGroup()
                                .addComponent(lblDemo7, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDate))
                            .addGroup(pDEMOLayout.createSequentialGroup()
                                .addComponent(lblDemo6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTime)))))
                .addContainerGap())
            .addGroup(pDEMOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDemo1)
                    .addComponent(lblDemo2)
                    .addComponent(lblDemo3)
                    .addComponent(lblDemo4)
                    .addComponent(lblDemo8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDEMOLayout.setVerticalGroup(
            pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDEMOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDemo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDemo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDemo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDemo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDemo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDemo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblDemo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDEMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblDemo7)))
        );

        btnMail.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\email-icon.png")); // NOI18N
        btnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailActionPerformed(evt);
            }
        });

        lblMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 0, 0));
        lblMail.setText("1");

        javax.swing.GroupLayout pMAILLayout = new javax.swing.GroupLayout(pMAIL);
        pMAIL.setLayout(pMAILLayout);
        pMAILLayout.setHorizontalGroup(
            pMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMAILLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pMAILLayout.setVerticalGroup(
            pMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMAILLayout.createSequentialGroup()
                .addGroup(pMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Người đang sử dụng:");

        jLabel2.setText("Tên người quản lý:");

        jLabel3.setText("Mã số:");

        jLabel4.setText("Đã hoạt động:");

        lblUser.setForeground(new java.awt.Color(0, 102, 51));
        lblUser.setText("NQLL");

        lblID.setForeground(new java.awt.Color(0, 102, 51));
        lblID.setText("SUPERVISOR2");

        lblActive.setForeground(new java.awt.Color(0, 102, 51));
        lblActive.setText("jLabel7");

        jLabel8.setText("(Nhấp)");

        javax.swing.GroupLayout pRIGHTLayout = new javax.swing.GroupLayout(pRIGHT);
        pRIGHT.setLayout(pRIGHTLayout);
        pRIGHTLayout.setHorizontalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRIGHTLayout.createSequentialGroup()
                .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTuyChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDEMO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pHELP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pRIGHTLayout.createSequentialGroup()
                .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDemo)
                    .addComponent(lblHelp))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pRIGHTLayout.createSequentialGroup()
                .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle)
                    .addGroup(pRIGHTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pRIGHTLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUser))
                            .addGroup(pRIGHTLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblID))
                            .addGroup(pRIGHTLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblActive)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Sep, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pRIGHTLayout.setVerticalGroup(
            pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRIGHTLayout.createSequentialGroup()
                .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRIGHTLayout.createSequentialGroup()
                        .addComponent(cbTuyChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pRIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblActive)))
                    .addGroup(pRIGHTLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addGap(28, 28, 28)
                .addComponent(lblSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pHELP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDemo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDEMO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQuayLai.setText("<< Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLEFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLEFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuayLai))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pRIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDonNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonNghiActionPerformed
        DonXinNghiDao donXinNghiDao = new DonXinNghiDao();
        List<DonXinNghi> donXinNghiList = donXinNghiDao.loadDanhSachDonXinNghiFromDatabase();
        QuanLyDonNghi qlDonNghi = new QuanLyDonNghi();
        qlDonNghi.fillData(donXinNghiList);
        qlDonNghi.setVisible(true);
    }//GEN-LAST:event_btnDonNghiActionPerformed

    private void btnCaiDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaiDatActionPerformed
//        CaiDatGUI cdPage = new CaiDatGUI();
//        this.dispose();
//        settingPage.show();
    }//GEN-LAST:event_btnCaiDatActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
//        QuanLyThongKeGUI thongKePage = new QuanLyThongKeGUI();
//        this.dispose();
//        thongKePage.show();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnTinhTienLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienLuongActionPerformed
            TinhTienLuong ttlGUI = new TinhTienLuong();
            this.dispose();
            ttlGUI.show();
    }//GEN-LAST:event_btnTinhTienLuongActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
//        LienHeGUI lienHePage = new LienHeGUI();
//        this.dispose();
//        lienHePage.show();
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailActionPerformed
//        MailBoxGUI mailBoxPage = new MailBoxGUI();
//        this.dispose();
//        mailBoxPage.show();
    }//GEN-LAST:event_btnMailActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DangNhapUser back = new DangNhapUser();
        back.show();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnBCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCCActionPerformed
        QuanLyBangChamCong bccPage = new QuanLyBangChamCong();
        this.dispose();
        bccPage.show();
    }//GEN-LAST:event_btnBCCActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
//        QuanLySanPhamGUI sanPhamPage = new QuanLySanPhamGUI();
//        this.dispose();
//        sanPhamPage.show();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScriptActionPerformed
//        QuanLyScriptGUI scriptPage = new QuanLyScriptGUI();
//        this.dispose();
//        scriptPage.show();
    }//GEN-LAST:event_btnScriptActionPerformed

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BoLocTimKiem boLoc = new BoLocTimKiem();
        boLoc.setVisible(true);
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

    private void cbTuyChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTuyChonActionPerformed
        // TODO add your handling code here:
        int x = Integer.valueOf(cbTuyChon.getSelectedIndex());
        if(x==1)
        {
            MenuRoot_doiuser doiuserPage = new MenuRoot_doiuser();
            doiuserPage.show();
            this.dispose();
        }else{
            if(x==2)
            {
                QuayLai sign = new QuayLai("MenuRoot");
                this.dispose();
                DoiMatKhau dmkPage = new DoiMatKhau(sign);
                DoiMatKhau dmk2Page = new DoiMatKhau();
                dmk2Page.show();
            }
            if(x==3)
            {
                this.dispose();
                ConfirmDangXuat logoutPage = new ConfirmDangXuat();
                logoutPage.show();
            }
        }
    }//GEN-LAST:event_cbTuyChonActionPerformed

    private void btnTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroGiupActionPerformed
        // TODO add your handling code here:
        TroGiup troGiup = new TroGiup();
        troGiup.setVisible(true);
    }//GEN-LAST:event_btnTroGiupActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuRoot().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuRoot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Sep;
    private javax.swing.JButton btnBCC;
    private javax.swing.JButton btnCaiDat;
    private javax.swing.JButton btnDonNghi;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JButton btnMail;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnScript;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnTinhTienLuong;
    private javax.swing.JButton btnTroGiup;
    private javax.swing.JComboBox<String> cbTuyChon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblActive;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDemo;
    private javax.swing.JLabel lblDemo1;
    private javax.swing.JLabel lblDemo2;
    private javax.swing.JLabel lblDemo3;
    private javax.swing.JLabel lblDemo4;
    private javax.swing.JLabel lblDemo5;
    private javax.swing.JLabel lblDemo6;
    private javax.swing.JLabel lblDemo7;
    private javax.swing.JLabel lblDemo8;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblHelp1;
    private javax.swing.JLabel lblHelp2;
    private javax.swing.JLabel lblHelp3;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pDEMO;
    private javax.swing.JPanel pHELP;
    private javax.swing.JPanel pLEFT;
    private javax.swing.JPanel pMAIL;
    private javax.swing.JPanel pRIGHT;
    // End of variables declaration//GEN-END:variables

    private void DemTimeHoatDong() throws SQLException {
        String getUsername = lblUser.getText();
        int getTimed = LayThoiGianHoatDong.getTimed(getUsername);
        Thread t2;
            t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int want = 0;
                for(int i = getTimed; i <= 2147483647 ; i++)
                {
                    try {
                        want++;
                        if(want == 60)
                        {
                            Statement stmt = conn.createStatement();
                            String sql = "update taikhoan set thoiGianHoatDong = thoiGianHoatDong + 60 where username = '"+getUsername+"'";
                            stmt.execute(sql);
                            want = 0;
                        }
                        lblActive.setText(" "+i+"s");
                        Thread.sleep(1000);
                    } catch (InterruptedException | SQLException ex) {
                        Logger.getLogger(MenuRoot.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            });  
            t2.start();
    }//End hàm
}
