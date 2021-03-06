/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.Database;
import dao.CongNhanDao;
import dao.DonXinNghiDao;
import dao.NhanVienDao;
import dao.PhieuLuongDao;
import dao.PhieuLuongNhanVienDao;
import dao.TinhTienLuongDao;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
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
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BangChamCong;
import model.CongNhan;
import model.DanhSachPhieuLuong;

public class TinhTienLuong extends javax.swing.JFrame{
    DefaultTableModel tabModelNhanVien, tabModelCongNhan, tableModelDonVi, tableModelDanhSachPhieuLuong;
    public TinhTienLuong() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        HienThoiGian htg = new HienThoiGian(lblDate, lblTime);
        htg.showDate();
        htg.showTime();
        updateCBMonth();
        loadDanhSachPhieuLuong();
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
        btnXoaRong = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPLCongNhan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPLDonVi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPLNhanVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taDetail = new javax.swing.JTextArea();
        cbChonDoiTuongXuat = new javax.swing.JComboBox<>();
        btnExport = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnTaiLai = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDanhSachPL = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMonth2 = new javax.swing.JLabel();
        lblMonth1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??nh to??n cho t???t c???:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ch???n ?????i t?????ng:");

        cbEntity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEntity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nh??n Vi??n H??nh Ch??nh", "C??ng Nh??n" }));

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setText("B???t ?????u");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ch???n th??ng:");

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "?????u ra l?? 1 phi???u l????ng:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("In tr???c ti???p");

        btnXoaRong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoaRong.setText("X??a r???ng");
        btnXoaRong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaRongActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuu.setText("L??u l???i");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        tblPLCongNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? PL", "Th??ng l????ng", "M?? CN", "H??? t??n", "Ph??n x?????ng", "Ng??y KC", "S??? NC", "Ngh??? ph??p", "Kh??ng ph??p", "T???ng SP", "Ti???n SP", "Ph??? c???p", "??VCC", "Ph?? ph??t sinh", "Ng??y in", "T???ng ti???n"
            }
        ));
        tblPLCongNhan.getTableHeader().setResizingAllowed(false);
        tblPLCongNhan.getTableHeader().setReorderingAllowed(false);
        tblPLCongNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPLCongNhanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPLCongNhanMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPLCongNhanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPLCongNhan);

        tblPLDonVi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? PL", "Th??ng l????ng", "Lo???i ??V", "M?? ??V", "L????ng tr???", "Ph??? c???p ph??t sinh", "SL nh??n vi??n", "Ng??y tr???", "T???ng ti???n"
            }
        ));
        tblPLDonVi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPLDonViMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblPLDonVi);

        tblPLNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPLNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? PL", "Th??ng l????ng", "M?? NV", "T??n NV", "Ph??ng ban", "S??? ng??y c??ng", "Ngh??? Ph??p", "Ko ph??p", "S??? gi??? TC", "Ti???n TC", "Ph??? c???p", "??VCC", "Chi ph?? ph??t sinh", "Ng??y in PL", "T???ng ti???n"
            }
        ));
        tblPLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPLNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPLNhanVienMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblPLNhanVien);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi ti???t:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

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

        cbChonDoiTuongXuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbChonDoiTuongXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T??nh phi???u l????ng Ph??ng Ban", "T??nh phi???u l????ng Ph??n X?????ng" }));
        cbChonDoiTuongXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChonDoiTuongXuatItemStateChanged(evt);
            }
        });
        cbChonDoiTuongXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonDoiTuongXuatActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExport.setText("Xu???t ra t???p .txt");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

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
                        .addComponent(btnExport)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaRong, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbChonDoiTuongXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuu))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaRong)
                        .addComponent(cbChonDoiTuongXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh s??ch phi???u l????ng th??ng c??:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnTaiLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTaiLai.setText("T???i l???i");
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        tblDanhSachPL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDanhSachPL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? PL", "Th??ng", "T???ng ti???n", "Ng??y save", "Lo???i PL"
            }
        ));
        tblDanhSachPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachPLMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDanhSachPL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaiLai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaiLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
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

        btnUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\taito\\Documents\\NetBeansProjects\\n11_qllsp\\data\\img-Icon\\user-icon.png")); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QU???N L?? T??NH TI???N L????NG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("T??nh to??n nhanh - g???n - l??? - chu???n x??c");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("(!) Th???i gian hi???n t???i l?? th??ng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("(!) Th??ng l????ng ch??? c?? th??? t??nh >= th??ng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("(!) N???u mu???n t??m l???i th??ng l????ng c?? vui l??ng t??m");

        lblMonth2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMonth2.setForeground(new java.awt.Color(0, 153, 102));
        lblMonth2.setText("jLabel8");

        lblMonth1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMonth1.setForeground(new java.awt.Color(0, 153, 102));
        lblMonth1.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("trong danh s??ch phi???u l????ng.");

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
            JOptionPane.showMessageDialog(rootPane, "B???n v???a ch???n th??ng T"+thangLuong+"<T"+thangHienTai+", data ouput s??? c?? ??m do ng??y c??ng (-)");
        SimpleDateFormat mdf = new SimpleDateFormat("dd/MM/yyyy");
        String chonThang = "31/"+thangLuong+"/2021";
        if(doiTuong.equalsIgnoreCase("nh??n vi??n h??nh ch??nh")){
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
                String sql = "select top 1 stt from phieuluongnhanvien where maPhieuLuong like 'PLNVHC%' order by stt desc";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                int soDuoiMaParsed = rs.getInt("stt");
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
                    tabModelNhanVien.addRow(new Object[]{   soDuoiMaParsed, "PLNVHC", thangLuong, nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getMaPhongBan(), soNgayCong, soNgayNghi, 0, 0, 0, 0, "ng??y, gi???, th??ng", 10000, mdf.format(ngayHienTai), luongThang   });
                    PhieuLuongNhanVien o = new PhieuLuongNhanVien();
                    o.setMaPhieuLuong("PLNVHC");
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
                    o.setDonViChamCong("ng??y, gi???, th??ng");
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
        if(doiTuong.equalsIgnoreCase("c??ng nh??n")){
            try {
                Date ngayChamLuong = mdf.parse(chonThang);
                List<CongNhan> lscn = new ArrayList<>();//Tao list congnhan
                CongNhanDao cnDao = new CongNhanDao();
                lscn = cnDao.loadDanhSachCongNhanFromDatabase();//Load congnhan len LIst
                List<DonXinNghi> lsdn = new ArrayList<>();
                DonXinNghiDao dxnDao = new DonXinNghiDao();
                lsdn = dxnDao.loadDanhSachDonXinNghiFromDatabase();//Load danh sach don nghi
                CongNhan cn = new CongNhan();
                tabModelCongNhan = (DefaultTableModel) tblPLCongNhan.getModel();
                tabModelCongNhan.setRowCount(0);
                Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                String sql = "select top 1 stt from phieuluongcongnhan where maPhieuLuong like 'PLCN%' order by stt desc";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                int soTT = rs.getInt("stt");
                for(int i=0; i<lscn.size(); i++)
                {
                    cn = lscn.get(i);
                    soTT++;
                    //Tinh so ngay cong
                    int soNgayNghi = 0;
                    String maCongNhan = cn.getMaCongNhan();
                    for(int j=0; j<lsdn.size(); j++)
                        if(lsdn.get(j).getMaNhanVien().equals(maCongNhan))
                        {
                            soNgayNghi += lsdn.get(j).getSoNgayXinNghi();
                            break;
                        }
                    Date ngayKhoiCong = cn.getNgayKhoiCong();
                    long diff = ngayChamLuong.getTime() - ngayKhoiCong.getTime();
                    long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                    int soNgayCong = (int) (days - soNgayNghi);
                    System.out.println(soNgayCong);
                    //Di tim tong so luong san pham
                    String sqlTimTongSP = "select sum(soLuongSanPham) from sanphamcongnhan where MONTH(ngayCong)="+thangLuong+" and maCongNhan = '"+maCongNhan+"'";
                    rs = stmt.executeQuery(sqlTimTongSP);
                    rs.next();
                    int tongSoLuongSP = rs.getInt(1);
                    //??i tim tong tien SP
                    String sqlLayTongTienSP = "select sum(soLuongSanPham*donGia) from sanphamcongnhan where MONTH(ngayCong)="+thangLuong+" and maCongNhan = '"+maCongNhan+"'";
                    rs = stmt.executeQuery(sqlLayTongTienSP);
                    rs.next();
                    BigDecimal tongTienSP = rs.getBigDecimal(1);
                    System.out.println("Tongtien sp"+tongTienSP);
                    tabModelCongNhan.addRow(new Object[]{   soTT, "PLCN", thangLuong, cn.getMaCongNhan(), cn.getTenCongNhan(), cn.getMaPhanXuong(), cn.getNgayKhoiCong(), String.valueOf(soNgayCong), 0, 0, tongSoLuongSP, tongTienSP, 0, "s???n ph???m",0, ngayHienTai, tongTienSP  });
                }//End v???i m???i cn
        }   catch (ParseException | SQLException ex) {
                Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnStartActionPerformed
    }
    private void btnXoaRongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaRongActionPerformed
        cbEntity.setSelectedIndex(0);
        cbMonth.setSelectedIndex(0);
        tabModelNhanVien.setRowCount(0);
        tabModelCongNhan.setRowCount(0);
        tableModelDonVi.setRowCount(0);
        taDetail.setText("");
    }//GEN-LAST:event_btnXoaRongActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
//        TinhTienLuong_luulai ttl = new TinhTienLuong_luulai();
//        ttl.show();
        int a = tblPLNhanVien.getSelectedRow();
        int b = tblPLCongNhan.getSelectedRow();
        if(a == -1 && b== -1)
            JOptionPane.showMessageDialog(rootPane, "Vui l??ng r?? chu???t ch???n ??t nh???t 1 b???ng l??u");
        else{
            String checkRongA = tblPLNhanVien.getValueAt(a, 3).toString();
            if(!checkRongA.equals(""))
            {
                try {
                    luuLaiPhieuLuong();
                } catch (SQLException | ParseException ex) {
                    Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            String checkRongB = tblPLNhanVien.getValueAt(b, 3).toString();
            if(!checkRongB.equals(""))
            {
                System.out.println("Luu bang cong nhan");
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblPLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLNhanVienMouseClicked
       
    }//GEN-LAST:event_tblPLNhanVienMouseClicked

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        tableModelDanhSachPhieuLuong = (DefaultTableModel) tblDanhSachPL.getModel();
        tableModelDanhSachPhieuLuong.setRowCount(0);
        loadDanhSachPhieuLuong();
        JOptionPane.showMessageDialog(rootPane, "T???i l???i th??nh c??ng!");
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void tblDanhSachPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachPLMouseClicked
        int dsplRow = tblDanhSachPL.getSelectedRow();
        if(dsplRow != -1)
        {
            String getContent = tblDanhSachPL.getValueAt(dsplRow, 0).toString();
            if(!getContent.equals(""))
            {
                try {
                    Locale localeVN = new Locale("vi", "VN");
                    NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);

                    String tongTienTra = nf.format(tblDanhSachPL.getValueAt(dsplRow, 2));

                    //format ngayTraLuong khi dua len taDetails
                    DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
                    Date date = (Date)formatter.parse(tblDanhSachPL.getValueAt(dsplRow, 3).toString());
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
                    taDetail.setText("");
                    taDetail.append("M?? phi???u l????ng: "+tblDanhSachPL.getValueAt(dsplRow, 0)+"\n");
                    taDetail.append("Th??ng l????ng: "+tblDanhSachPL.getValueAt(dsplRow, 1)+"\n");
                    taDetail.append("T???ng ti???n tr??? cho phi???u l????ng n??y: "+tongTienTra+"\n");
                    taDetail.append("Ng??y tr??? l????ng: "+formatedDate+"\n");
                    taDetail.append("?????i t?????ng tr??? l????ng: "+tblDanhSachPL.getValueAt(dsplRow, 4)+"\n");
                } catch (ParseException ex) {
                    Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tblDanhSachPLMouseClicked

    private void tblPLCongNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLCongNhanMouseClicked

    }//GEN-LAST:event_tblPLCongNhanMouseClicked

    private void tblPLNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLNhanVienMousePressed
            int a = tblPLNhanVien.getSelectedRow();
            cbChonDoiTuongXuat.setSelectedIndex(0);
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
            TinhTienLuongDao ttlDao = new TinhTienLuongDao();
            taDetail.setText("");
            taDetail.append("S??? th??? t???: "+tblPLNhanVien.getValueAt(a, 0)+"\t\t\t\t\t\t");
            taDetail.append("Lo???i phi???u l????ng: "+tblPLNhanVien.getValueAt(a, 1));
            taDetail.append("\n");
            taDetail.append("Th??ng l????ng: "+tblPLNhanVien.getValueAt(a, 2)+"\t\t\t\t\t\t");
            taDetail.append("M?? nh??n vi??n: "+tblPLNhanVien.getValueAt(a, 3));
            taDetail.append("\n");
            taDetail.append("T??n nh??n vi??n: "+tblPLNhanVien.getValueAt(a, 4)+"\t\t\t\t\t\t");
            taDetail.append("Ph??ng ban: "+tblPLNhanVien.getValueAt(a, 5));
            taDetail.append("\n");
            taDetail.append("S??? ng??y ngh???: "+tblPLNhanVien.getValueAt(a, 6)+"\t\t\t\t\t\t");
            taDetail.append("S??? ng??y ngh??? c?? ph??p: "+tblPLNhanVien.getValueAt(a, 7));
            taDetail.append("\n");
            taDetail.append("S??? ng??y ngh??? kh??ng ph??p: "+tblPLNhanVien.getValueAt(a, 8)+"\t\t\t\t\t\t");
            taDetail.append("S??? gi??? t??ng ca: "+tblPLNhanVien.getValueAt(a, 9));
            taDetail.append("\n");
            taDetail.append("T???ng ti???n t??ng ca: "+nf.format(tblPLNhanVien.getValueAt(a, 10))+"\t\t\t\t\t\t");
            taDetail.append("Ph??? c???p: "+nf.format(tblPLNhanVien.getValueAt(a, 11)));
            taDetail.append("\n");
            taDetail.append("????n v??? ch???m c??ng: "+tblPLNhanVien.getValueAt(a, 12)+"\t\t\t\t\t\t");
            taDetail.append("Chi ph?? ph??t sinh: "+nf.format(tblPLNhanVien.getValueAt(a, 13)));
            taDetail.append("\n");
            taDetail.append("Ng??y in phi???u l????ng: "+tblPLNhanVien.getValueAt(a, 14)+"\t\t\t\t\t\t");
            taDetail.append("T???ng ti???n nh???n: "+nf.format(tblPLNhanVien.getValueAt(a, 15)));
    }//GEN-LAST:event_tblPLNhanVienMousePressed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        int a = tblPLCongNhan.getSelectedRow();
        FileWriter fw;
        BufferedWriter bw;
        if(a != -1)
        {
            if(tblPLCongNhan.getRowCount() > 0)
            {
                int cf = JOptionPane.showConfirmDialog(rootPane, "?????ng ?? xu???t phi???u l????ng PLCN ra t???p .txt ?");
                if(cf == JOptionPane.YES_OPTION)
                {
                    try {
                        File file = new File("data/PhieuLuongCongNhan.txt");
                        if(!file.exists())
                            file.createNewFile();
                        fw = new FileWriter(file);
                        bw = new BufferedWriter(fw);
                        for (int i = 0; i < tblPLCongNhan.getRowCount(); i++) {
                            for (int j = 0; j < tblPLCongNhan.getColumnCount(); j++) {
                                bw.write(tblPLCongNhan.getValueAt(i, j).toString()+"\t");
                            }
                            bw.write("\n------------------------------------------------------------------------------------------------------------------\n");
                        }
                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(this, "Xu???t ra t???p PhieuLuongCongNhan.txt th??nh c??ng!");
                    } catch (HeadlessException | IOException e) {
                    }
                }
            }
        }else{
            if(tblPLNhanVien.getRowCount() > 0)
            {
                int cf = JOptionPane.showConfirmDialog(rootPane, "?????ng ?? xu???t phi???u l????ng PLNV ra t???p .txt ?");
                if(cf == JOptionPane.YES_OPTION)
                {
                    try {
                        File file = new File("data/PhieuLuongNhanVien.txt");
                        if(!file.exists())
                            file.createNewFile();
                        fw = new FileWriter(file);
                        bw = new BufferedWriter(fw);
                        for (int i = 0; i < tblPLNhanVien.getRowCount(); i++) {
                            for (int j = 0; j < tblPLNhanVien.getColumnCount(); j++) {
                                bw.write(tblPLNhanVien.getValueAt(i, j).toString()+"\t");
                            }
                            bw.write("\n------------------------------------------------------------------------------------------------------------------\n");
                        }
                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(this, "Xu???t ra t???p PhieuLuongCongNhan.txt th??nh c??ng!");
                    } catch (IOException ex) {
                        Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }//end Else        
    }//GEN-LAST:event_btnExportActionPerformed
        
    private void tblPLCongNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLCongNhanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPLCongNhanMouseEntered

    private void tblPLCongNhanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLCongNhanMousePressed
        int a = tblPLCongNhan.getSelectedRow();
        cbChonDoiTuongXuat.setSelectedIndex(0);
        taDetail.setText("");
        taDetail.append("S??? th??? t???: "+tblPLCongNhan.getValueAt(a, 0)+"\t\t\t\t\t\t");
        taDetail.append("Lo???i phi???u l????ng: "+tblPLCongNhan.getValueAt(a, 1));
        taDetail.append("\n");
        taDetail.append("Th??ng l????ng: "+tblPLCongNhan.getValueAt(a, 2)+"\t\t\t\t\t\t");
        taDetail.append("M?? c??ng nh??n: "+tblPLCongNhan.getValueAt(a, 3));
        taDetail.append("\n");
        taDetail.append("H??? t??n c??ng nh??n: "+tblPLCongNhan.getValueAt(a, 4)+"\t\t\t\t\t\t");
        taDetail.append("Ph??n x?????ng: "+tblPLCongNhan.getValueAt(a, 5));
        taDetail.append("\n");
        taDetail.append("Ng??y kh???i c??ng: "+tblPLCongNhan.getValueAt(a, 6)+"\t\t\t\t\t\t");
        taDetail.append("S??? ng??y c??ng: "+tblPLCongNhan.getValueAt(a, 7));
        taDetail.append("\n");
        taDetail.append("S??? ng??y ngh??? ph??p: "+tblPLCongNhan.getValueAt(a, 8)+"\t\t\t\t\t\t");
        taDetail.append("S??? ng??y ngh??? kh??ng ph??p: "+tblPLCongNhan.getValueAt(a, 9));
        taDetail.append("\n");
        taDetail.append("T???ng s???n ph???m: "+tblPLCongNhan.getValueAt(a, 10)+"\t\t\t\t\t\t");
        taDetail.append("T???ng ti???n: "+tblPLCongNhan.getValueAt(a, 11));
        taDetail.append("\n");
        taDetail.append("Ph??? c???p: "+tblPLCongNhan.getValueAt(a, 12)+"\t\t\t\t\t\t");
        taDetail.append("????n v??? ch???m c??ng: "+tblPLCongNhan.getValueAt(a, 13));
        taDetail.append("\n");
        taDetail.append("Ph?? ph??t sinh: "+tblPLCongNhan.getValueAt(a, 14)+"\t\t\t\t\t\t");
        taDetail.append("Ng??y in: "+tblPLCongNhan.getValueAt(a, 15));
        taDetail.append("\n");
        taDetail.append("T???ng ti???n: "+tblPLCongNhan.getValueAt(a, 16));
    }//GEN-LAST:event_tblPLCongNhanMousePressed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        TuyChonIcon optionPage = new TuyChonIcon("ttlPage");
        optionPage.show();
        this.dispose();
    }//GEN-LAST:event_btnUserActionPerformed

    private void cbChonDoiTuongXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonDoiTuongXuatActionPerformed
   
    }//GEN-LAST:event_cbChonDoiTuongXuatActionPerformed

    private void tblPLDonViMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPLDonViMousePressed
        try {
            int a = tblPLDonVi.getSelectedRow();
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
            //Format ngayTraLuong
            DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
            Date date = (Date)formatter.parse(tblPLDonVi.getValueAt(a, 8).toString());
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            String ngayTraLuong = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
            //Format loaiDOnVi.
            String loaiDonVi = "Ph??ng ban";
            int getLoaiDonVi = Integer.parseInt(tblPLDonVi.getValueAt(a, 3).toString());
            if(getLoaiDonVi == 1)
                loaiDonVi = "Ph??n x?????ng";
            taDetail.setText("");
            taDetail.append("S??? th??? t???: "+tblPLDonVi.getValueAt(a, 0)+"\t\t\t\t\t\t");
            taDetail.append("Lo???i phi???u l????ng: "+tblPLDonVi.getValueAt(a, 1));
            taDetail.append("\n");
            taDetail.append("Th??ng l????ng: "+tblPLDonVi.getValueAt(a, 2)+"\t\t\t\t\t\t");
            taDetail.append("Lo???i ????n v??? "+loaiDonVi);
            taDetail.append("\n");
            taDetail.append("M?? ????n v???: "+tblPLDonVi.getValueAt(a, 4)+"\t\t\t\t\t\t");
            taDetail.append("L????ng ph???i tr???: "+tblPLDonVi.getValueAt(a, 5));
            taDetail.append("\n");
            taDetail.append("Ph??? c???p ph??t sinh: "+tblPLDonVi.getValueAt(a, 6)+"\t\t\t\t\t\t");
            taDetail.append("S??? l?????ng nh??n vi??n: "+tblPLDonVi.getValueAt(a, 7));
            taDetail.append("\n");
            taDetail.append("Ng??y tr??? l????ng: "+ngayTraLuong+"\t\t\t\t\t\t");
            taDetail.append("T???ng ti???n ph???i tr???: "+nf.format(tblPLDonVi.getValueAt(a, 9)));
        } catch (ParseException ex) {
            Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblPLDonViMousePressed

    private void cbChonDoiTuongXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChonDoiTuongXuatItemStateChanged
            try {
            Connection conn = Database.getConnection();
            PreparedStatement prestmt = null;
            Statement stmt = conn.createStatement();
            String s = cbChonDoiTuongXuat.getSelectedItem().toString();
            if(s.equalsIgnoreCase("T??nh phi???u l????ng Ph??ng Ban")){
                if(tblPLNhanVien.getRowCount() > 0){
                    try {
                        tableModelDonVi = (DefaultTableModel) tblPLDonVi.getModel();
                        //L???y STT
                        String sqlStt = "select top 1 stt from phieuluongdonvi order by stt desc";
                        ResultSet rs = stmt.executeQuery(sqlStt);
                        rs.next();
                        int stt = rs.getInt(1);
                        //Lay thangLuong
                        String thangLuong = cbMonth.getSelectedItem().toString();
                        Double tongTienPB = 0.0;
                        
                        for (int i = 1; i <= 10; i++) {
                            //Lay tongTienCacNVHC
                            for (int j = 0; j < tblPLNhanVien.getRowCount(); j++) {
                                if(tblPLNhanVien.getValueAt(j, 5).toString().equals("PB"+i))
                                {
                                    String getColTien = tblPLNhanVien.getValueAt(j, 15).toString();
                                    tongTienPB += Double.parseDouble(getColTien);
                                }
                            }
                            //Lay soLuongNv
                            String sqlSLNV = "select soLuongNhanVien from phongban where maPhongBan = 'PB"+i+"'";
                            rs = stmt.executeQuery(sqlSLNV);
                            rs.next();
                            int soLuongNhanVien = rs.getInt(1);
                            //Lay ngayTraLuong
                            Date d = new Date();
                            tableModelDonVi.addRow(new Object[]{  ++stt,"PLDV", thangLuong, 0, "PB"+i, tongTienPB, 0, soLuongNhanVien, d, tongTienPB});
                        }//Xong 10 ph??ng ban
                        JOptionPane.showMessageDialog(rootPane, "Th??nh c??ng");
                    } catch (SQLException ex) {
                        Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                if(s.equalsIgnoreCase("T??nh phi???u l????ng Ph??n X?????ng")){
                    if(tblPLCongNhan.getRowCount() > 0){
                        
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TinhTienLuong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbChonDoiTuongXuatItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TinhTienLuong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnXoaRong;
    private javax.swing.JComboBox<String> cbChonDoiTuongXuat;
    private javax.swing.JComboBox<String> cbEntity;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMonth1;
    private javax.swing.JLabel lblMonth2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea taDetail;
    private javax.swing.JTable tblDanhSachPL;
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
        Statement stmt = null;
        
//        if(x.equalsIgnoreCase("Phi???u l????ng Nh??n Vi??n"))
//        {   
            conn = Database.getConnection();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            int tongTienPL = 0;
            for(int i = 0; i < tblPLNhanVien.getRowCount(); i++)
            {
                int colSTT = Integer.parseInt(tblPLNhanVien.getValueAt(i, 0).toString());
                String colMaPL = tblPLNhanVien.getValueAt(i, 1).toString();
                int colThangLuong = Integer.parseInt(tblPLNhanVien.getValueAt(i, 2).toString());
                String colMaNhanVien = tblPLNhanVien.getValueAt(i, 3).toString();
                String colTenNhanVien = tblPLNhanVien.getValueAt(i, 4).toString();
                String colPB = tblPLNhanVien.getValueAt(i, 5).toString();
                int colSNC = Integer.parseInt(tblPLNhanVien.getValueAt(i, 6).toString());
                int colSNNCP = Integer.parseInt(tblPLNhanVien.getValueAt(i, 7).toString());
                int colSNNKP = Integer.parseInt(tblPLNhanVien.getValueAt(i, 8).toString());
                int colSoGioTC = Integer.parseInt(tblPLNhanVien.getValueAt(i, 9).toString());
                double colTongTienTC = Double.valueOf(tblPLNhanVien.getValueAt(i, 10).toString());
                double colPhuCap = Double.valueOf(tblPLNhanVien.getValueAt(i, 11).toString());
                String colDVCC = tblPLNhanVien.getValueAt(i, 12).toString();
                double colCPPS = Double.valueOf(tblPLNhanVien.getValueAt(i, 13).toString());
                Date colNgayIn = sdf.parse(tblPLNhanVien.getValueAt(i,14).toString());
                Timestamp ts = new Timestamp(colNgayIn.getTime());
                double colTongTien = Double.valueOf(tblPLNhanVien.getValueAt(i, 15).toString());
                stmt = conn.createStatement();
                String sqlInsert = "insert into phieuluongnhanvien values ("+colSTT+",'"+colMaPL+"',"+colThangLuong+",'"+colMaNhanVien+"',N'"+colTenNhanVien+"','"+colPB+"',"+colSNC+","+colSNNCP+","+colSNNKP+","+colSoGioTC+","+colTongTienTC+","+colPhuCap+",N'"+colDVCC+"',"+colCPPS+",'"+ts+"',"+colTongTien+")";
                stmt.execute(sqlInsert);
                tongTienPL += colTongTien;
            }
            String sql = "select top 1 stt from danhsachphieuluong where maPhieuLuong like 'PL%' order by stt desc";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int sttNow = rs.getInt(1);
            sttNow++;
            Statement stmtInsert = conn.createStatement();
            int thangLuong = Integer.parseInt(cbMonth.getSelectedItem().toString());
            Date d = new Date();
            Timestamp ts = new Timestamp(d.getTime());
            String sqlInsert = "insert into danhsachphieuluong values ("+sttNow+",'PL"+sttNow+"',"+thangLuong+","+tongTienPL+",'"+ts+"','PLNVHC')";
            stmtInsert.execute(sqlInsert);
            JOptionPane.showMessageDialog(rootPane, "L??u l???i th??nh c??ng!");
//        }
    }

    private void loadDanhSachPhieuLuong() {
        TinhTienLuongDao ttlDao = new TinhTienLuongDao();
        List<DanhSachPhieuLuong> lspl = ttlDao.loadDanhSachPhieuLuong();
        tableModelDanhSachPhieuLuong = (DefaultTableModel) tblDanhSachPL.getModel();
        tableModelDanhSachPhieuLuong.setRowCount(0);
        for (DanhSachPhieuLuong pl : lspl) {
            tableModelDanhSachPhieuLuong.addRow(new Object[] { pl.getMaPhieuLuong(), pl.getThangLuong(),pl.getLuongDaTra(), pl.getNgayLuu(), pl.getLoaiPhieuLuong()});
        }
    }
}
