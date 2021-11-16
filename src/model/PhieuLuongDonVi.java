/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author taiproduaxe
 */
public class PhieuLuongDonVi {
    private String maPhieuLuong;
    private int thangLuong;
    private boolean loaiDonVi;
    private String maDonVi;
    private double luongTra;
    private double phuCapPhatSinh;
    private int soLuongNhanVien;
    private Date ngayTra;
    private double tongTien;

    public String getMaPhieuLuong() {
        return maPhieuLuong;
    }

    public void setMaPhieuLuong(String maPhieuLuong) {
        this.maPhieuLuong = maPhieuLuong;
    }

    public int getThangLuong() {
        return thangLuong;
    }

    public void setThangLuong(int thangLuong) {
        this.thangLuong = thangLuong;
    }

    public boolean isLoaiDonVi() {
        return loaiDonVi;
    }

    public void setLoaiDonVi(boolean loaiDonVi) {
        this.loaiDonVi = loaiDonVi;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public double getLuongTra() {
        return luongTra;
    }

    public void setLuongTra(double luongTra) {
        this.luongTra = luongTra;
    }

    public double getPhuCapPhatSinh() {
        return phuCapPhatSinh;
    }

    public void setPhuCapPhatSinh(double phuCapPhatSinh) {
        this.phuCapPhatSinh = phuCapPhatSinh;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public PhieuLuongDonVi() {
    }

    public PhieuLuongDonVi(String maPhieuLuong, int thangLuong, boolean loaiDonVi, String maDonVi, double luongTra, double phuCapPhatSinh, int soLuongNhanVien, Date ngayTra, double tongTien) {
        this.maPhieuLuong = maPhieuLuong;
        this.thangLuong = thangLuong;
        this.loaiDonVi = loaiDonVi;
        this.maDonVi = maDonVi;
        this.luongTra = luongTra;
        this.phuCapPhatSinh = phuCapPhatSinh;
        this.soLuongNhanVien = soLuongNhanVien;
        this.ngayTra = ngayTra;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuLuongDonVi{" + "maPhieuLuong=" + maPhieuLuong + ", thangLuong=" + thangLuong + ", loaiDonVi=" + loaiDonVi + ", maDonVi=" + maDonVi + ", luongTra=" + luongTra + ", phuCapPhatSinh=" + phuCapPhatSinh + ", soLuongNhanVien=" + soLuongNhanVien + ", ngayTra=" + ngayTra + ", tongTien=" + tongTien + '}';
    }
    
}
