/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.Database;
import dao.DonXinNghiDao;
import dao.NhanVienDao;
import dao.PhieuLuongDao;
import dao.PhieuLuongNhanVienDao;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.DonXinNghi;
import model.NhanVien;
import model.PhieuLuongCongNhan;
import model.PhieuLuongDonVi;
import model.PhieuLuongNhanVien;
import util.HienThoiGian;
import util.NgauNhienInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TinhTienLuong extends javax.swing.JFrame{
    DefaultTableModel tabModelNhanVien, tabModelCongNhan, tableModelDonVi;
    public TinhTienLuong() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        HienThoiGian htg = new HienThoiGian(lblDate, lblTime);
        htg.showDate();
        htg.showTime();
        updateCBMonth();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbEntity = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPLCongNhan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPLDonVi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPLNhanVien = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taDetail = new javax.swing.JTextArea();
        cbChonDoiTuongLuu = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lblDanhSachPL = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMonth2 = new javax.swing.JLabel();
        lblMonth1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tính toán cho tất cả:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Chọn đối tượng:");

        cbEntity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEntity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên Hành Chính", "Công Nhân" }));

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setText("Bắt đầu");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Chọn tháng:");

        cbMonth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đầu ra là 1 phiếu lương:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("In trực tiếp");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Xóa rỗng");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuu.setText("Lưu lại");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        tblPLCongNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PL", "Tháng lương", "Mã CN", "Họ tên", "Phân xưởng", "Số NC", "Nghỉ phép", "Không phép", "Tổng SP", "Tiền SP", "Phụ cấp", "ĐVCC", "Phí phát sinh", "Ngày in", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblPLCongNhan);

        tblPLDonVi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PL", "Tháng lương", "Loại ĐV", "Mã ĐV", "Lương trả", "Phụ cấp phát sinh", "SL nhân viên", "Ngày trả", "Tổng tiền"
            }
        ));
        jScrollPane2.setViewportView(tblPLDonVi);

        tblPLNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPLNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PL", "Tháng lương", "Mã NV", "Tên NV", "Phòng ban", "Số ngày công", "Nghỉ Phép", "Ko phép", "Số giờ TC", "Tiền TC", "Phụ cấp", "ĐVCC", "Chi phí phát sinh", "Ngày in PL", "Tổng tiền"
            }
        ));
        tblPLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPLNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPLNhanVien);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ghi xuống excel", "Ghi xuống .txt" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        taDetail.setColumns(20);
        taDetail.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        taDetail.setRows(5);
        jScrollPane5.setViewportView(taDetail);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        cbChonDoiTuongLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbChonDoiTuongLuu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(299, 299, 299)
                        .addComponent(cbChonDoiTuongLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnLuu))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jComboBox3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addComponent(cbChonDoiTuongLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phiếu lương tháng cũ:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Xem");

        lblDanhSachPL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDanhSachPL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bảng lương", "Tháng", "Tổng tiền", "Ngày save"
            }
        ));
        jScrollPane4.setViewportView(lblDanhSachPL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTime.setText("jLabel5");

        lblDate.setText("jLabel6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(lblTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\Hoc ki 3\\Phat Trien Ung Dung\\user-icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ TÍNH TIỀN LƯƠNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tính toán nhanh - gọn - lẹ - chuẩn xác");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("(!) Thời gian hiện tại là tháng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("(!) Tháng lương chỉ có thể tính >= tháng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("(!) Nếu muốn tìm lại tháng lương cũ vui lòng tìm");

        lblMonth2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMonth2.setForeground(new java.awt.Color(0, 153, 102));
        lblMonth2.setText("jLabel8");

        lblMonth1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMonth1.setForeground(new java.awt.Color(0, 153, 102));
        lblMonth1.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("trong danh sách phiếu lương.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMonth1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMonth2))
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(lblMonth1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(lblMonth2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String doiTuong = cbEntity.getSelectedItem().toString();
        int thangLuong = Integer.parseInt(cbMonth.getSelectedItem().toString());
        Date ngayHienTai = new Date();
        int thangHienTai = ngayHienTai.getMonth()+1;
        if(thangLuong < thangHienTai)
            JOptionPane.showMessageDialog(rootPane, "Bạn vừa chọn tháng T"+thangLuong+"<T"+thangHienTai+", data ouput sẽ có âm do ngày công (-)");
        SimpleDateFormat mdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
        String chonThang = "31/"+thangLuong+"/2021";
        if(doiTuong.equalsIgnoreCase("nhân viên hành chính"))
        {
            try {
                Date ngayChamLuong = mdf.parse(chonThang);
                List<NhanVien> lsnv = new ArrayList<>();
                NhanVienDao nvDao = new NhanVienDao();
                lsnv = nvDao.loadDanhSachNhanVienFromDatabase();
                List<DonXinNghi> lsdn = new ArrayList<>();
                DonXinNghiDao dxnDao = new DonXinNghiDao();
                lsdn = dxnDao.loadDanhSachDonXinNghiFromDatabase();
                NhanVien nv = new NhanVien();
                tabModelNhanVien = (DefaultTableModel) tblPLNhanVien.getModel();
                tabModelNhanVien.setRowCount(0);
                List<PhieuLuongNhanVien> lsPLnv = new ArrayList<>();
                Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                String sql = "select top 1 maPhieuLuong from danhsachphieuluong where maPhieuLuong like 'PLNVHC%' order by maPhieuLuong desc";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                String ma = rs.getString("maPhieuLuong");
                String soDuoiMa = ma.substring(6);
                int soDuoiMaParsed = Integer.parseInt(soDuoiMa);
                for(int i=0; i<lsnv.size(); i++)
                {
                    int soNgayNghi = 0;
                    nv = lsnv.get(i);
                    String maNhanVien = nv.getMaNhanVien();
                    for(int j=0; j<lsdn.size(); j++)
                        if(lsdn.get(j).getMaNhanVien().equals(maNhanVien))
                        {
                            soNgayNghi = lsdn.get(j).getSoNgayXinNghi();
                            break;
                        }
                    Date ngayKhoiCong = nv.getNgayKhoiCong();
                    long diff = ngayChamLuong.getTime() - ngayKhoiCong.getTime();
                    long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                    System.out.println(days);
                    int soNgayCong = (int) (days - soNgayNghi);
                    double luongThang = 7000000 / 26 * soNgayCong;

                    soDuoiMaParsed++;
                    String.valueOf(soDuoiMaParsed);
                    tabModelNhanVien.addRow(new Object[]{   i+1, "PLNVHC"+soDuoiMaParsed, thangLuong, nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getMaPhongBan(), soNgayCong, soNgayNghi, 0, 0, 0, 0, "ngày, giờ, tháng", 10000, mdf.format(ngayHienTai), nf.format(luongThang)   });
                    PhieuLuongNhanVien o = new PhieuLuongNhanVien();
                    o.setMaPhieuLuong("PLNVHC"+i);
                    o.setThangLuong(thangLuong);
                    o.setMaNhanVien(maNhanVien);
                    o.setTenNhanVien(nv.getTenNhanVien());
                    o.setPhongBan(nv.getMaPhongBan());
                    o.setSoNgayCong(soNgayCong);
                    o.setSoNgayNghiCoPhep(soNgayNghi);
                    o.setSoNgayNghiKhongPhep(0);
                    o.setSoGioTangCa(0);
                    o.setTongTienTangCa(0);
                    o.setPhuCap(0);
                    o.setDonViChamCong("ngày, giờ, tháng");
                    o.setChiPhiPhatSinh(10000);
                    o.setNgayInPhieuLuong(ngayHienTai);
                    o.setTongTien(luongThang);
                    lsPLnv.add(o);
                }
            }
            catch (ParseException ex) {
                Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cbEntity.setSelectedIndex(0);
        cbMonth.setSelectedIndex(0);
        tabModelNhanVien.setRowCount(0);
        taDetail.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
//        TinhTienLuong_luulai ttl = new TinhTienLuong_luulai();
//        ttl.show();
        String colName2 = tblPLCongNhan.getColumnName(3).toString();
        String colName3 = tblPLDonVi.getColumnName(3).toString();
        int a = tblPLNhanVien.getSelectedRow();
        int b = tblPLCongNhan.getSelectedRow();
        int c = tblPLDonVi.getSelectedRow();
        if(a == -1 && b== -1 && c== -1)
            JOptionPane.showMessageDialog(rootPane, "Vui lòng rê chuột chọn ít nhất 1 bảng lưu");
        if(a != -1)
        {
            String checkRongA = tblPLNhanVien.getValueAt(a, 3).toString();
            if(!checkRongA.equals(""))
                System.out.println("Luu bang nhanvien");
        }
        if(b != -1)
        {
            String checkRongB = tblPLNhanVien.getValueAt(b, 3).toString();
            if(!checkRongB.equals(""))
            System.out.println("Luu bang cong nhan");
        }
        if(c != -1)
        {
            String checkRongC = tblPLNhanVien.getValueAt(c, 3).toString();
            if(!checkRongC.equals(""))
            System.out.println("Luu bang don vi");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblPLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLNhanVienMouseClicked
        int a = tblPLNhanVien.getSelectedRow();
        if(a != -1)
        {
            String getContent = tblPLNhanVien.getValueAt(a, 0).toString();
            if(!getContent.equals(""))
            {
                taDetail.setText("");
                taDetail.append("Số thứ tự: "+tblPLNhanVien.getValueAt(a, 0)+"\t\t\t\t\t\t");
                taDetail.append("Mã phiếu lương: "+tblPLNhanVien.getValueAt(a, 1));
                taDetail.append("\n");
                taDetail.append("Tháng lương: "+tblPLNhanVien.getValueAt(a, 2)+"\t\t\t\t\t\t");
                taDetail.append("Mã nhân viên: "+tblPLNhanVien.getValueAt(a, 3));
                taDetail.append("\n");
                taDetail.append("Tên nhân viên: "+tblPLNhanVien.getValueAt(a, 4)+"\t\t\t\t\t\t");
                taDetail.append("Phòng ban: "+tblPLNhanVien.getValueAt(a, 5));
                taDetail.append("\n");
                taDetail.append("Số ngày nghỉ: "+tblPLNhanVien.getValueAt(a, 6)+"\t\t\t\t\t\t");
                taDetail.append("Số ngày nghỉ có phép: "+tblPLNhanVien.getValueAt(a, 7));
                taDetail.append("\n");
                taDetail.append("Số ngày nghỉ không phép: "+tblPLNhanVien.getValueAt(a, 8)+"\t\t\t\t\t\t");
                taDetail.append("Số giờ tăng ca: "+tblPLNhanVien.getValueAt(a, 9));
                taDetail.append("\n");
                taDetail.append("Tổng tiền tăng ca: "+tblPLNhanVien.getValueAt(a, 10)+"\t\t\t\t\t\t");
                taDetail.append("Phụ cấp: "+tblPLNhanVien.getValueAt(a, 11));
                taDetail.append("\n");
                taDetail.append("Đơn vị chấm công: "+tblPLNhanVien.getValueAt(a, 12)+"\t\t\t\t\t\t");
                taDetail.append("Chi phí phát sinh: "+tblPLNhanVien.getValueAt(a, 13));
                taDetail.append("\n");
                taDetail.append("Ngày in phiếu lương: "+tblPLNhanVien.getValueAt(a, 14)+"\t\t\t\t\t\t");
                taDetail.append("Tổng tiền nhận: "+tblPLNhanVien.getValueAt(a, 15));
            }
        }
    }//GEN-LAST:event_tblPLNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(TinhTienLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TinhTienLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TinhTienLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TinhTienLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TinhTienLuong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox<String> cbChonDoiTuongLuu;
    private javax.swing.JComboBox<String> cbEntity;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable lblDanhSachPL;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMonth1;
    private javax.swing.JLabel lblMonth2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea taDetail;
    private javax.swing.JTable tblPLCongNhan;
    private javax.swing.JTable tblPLDonVi;
    private javax.swing.JTable tblPLNhanVien;
    // End of variables declaration//GEN-END:variables

    private void updateCBMonth() {
        Date d = new Date();
        int thangHienTai = d.getMonth()+1;
        for(int i=thangHienTai; i<= 12; i++)
            cbMonth.addItem(String.valueOf(i));
        lblMonth1.setText(String.valueOf(thangHienTai));
        lblMonth2.setText(lblMonth1.getText());
    }

    void luuLaiPhieuLuong() throws SQLException, ParseException {
        Connection conn = null;
        PreparedStatement stmt = null;
        
//        if(x.equalsIgnoreCase("Phiếu lương Nhân Viên"))
//        {   
//            conn = Database.getConnection();
//            String sqlInsert = "insert into phieuluongnhanvien values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            SimpleDateFormat sdf = new SimpleDateFormat();
//            System.err.println("Dang tinh toan");
//            for(int i = 0; i < tblPLNhanVien.getRowCount(); i++)
//            {
//                stmt = conn.prepareCall(sqlInsert);
//                stmt.setInt(1, Integer.parseInt(tblPLNhanVien.getValueAt(i, 0).toString()));
//                System.err.println(Integer.parseInt(tblPLNhanVien.getValueAt(i, 0).toString()));
//                stmt.setString(2, tblPLNhanVien.getValueAt(i, 1).toString());
//                stmt.setInt(3, Integer.parseInt(tblPLNhanVien.getValueAt(i, 2).toString()));
//                stmt.setString(4, tblPLNhanVien.getValueAt(i, 3).toString());
//                stmt.setString(5, tblPLNhanVien.getValueAt(i, 4).toString());
//                stmt.setString(6, tblPLNhanVien.getValueAt(i, 5).toString());
//                stmt.setInt(7, Integer.parseInt(tblPLNhanVien.getValueAt(i, 6).toString()));
//                stmt.setInt(8, Integer.parseInt(tblPLNhanVien.getValueAt(i, 7).toString()));
//                stmt.setInt(9, Integer.parseInt(tblPLNhanVien.getValueAt(i, 8).toString()));
//                stmt.setInt(10, Integer.parseInt(tblPLNhanVien.getValueAt(i, 9).toString()));
//                stmt.setDouble(11, Double.parseDouble(tblPLNhanVien.getValueAt(i, 10).toString()));
//                stmt.setDouble(12, Double.parseDouble(tblPLNhanVien.getValueAt(i, 11).toString()));
//                stmt.setString(13, tblPLNhanVien.getValueAt(i, 12).toString());
//                stmt.setDouble(14, Double.parseDouble(tblPLNhanVien.getValueAt(i, 13).toString()));
//                Timestamp ts = new Timestamp(sdf.parse(tblPLNhanVien.getValueAt(i,14).toString()).getTime());
//                stmt.setTimestamp(15, ts);
//                stmt.setDouble(16, Double.parseDouble(tblPLNhanVien.getValueAt(i, 15).toString()));
//                
//                stmt.execute();
//            }
//            JOptionPane.showMessageDialog(rootPane, "Lưu lại thành công!");
//        }
    }
}
