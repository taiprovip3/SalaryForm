package model;

import java.util.Date;

public class PhieuLuongCongNhan {
    private String maPhieuLuong;
    private int thangLuong;
    private String maCongNhan;
    private String hoTen;
    private String phanXuong;
    private Date ngayKhoiCong;
    private int soNgayCong;
    private int soNgayNghiCoPhep;
    private int soNgayNghiKhongPhep;
    private int tongSoLuongSanPham;
    private double tongTienSanPham;
    private double phuCap;
    private String donViChamCong;
    private double phiPhatSinh;
    private Date ngayInPhieuLuong;
    private double tongTien ;

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

    public String getMaCongNhan() {
        return maCongNhan;
    }

    public void setMaCongNhan(String maCongNhan) {
        this.maCongNhan = maCongNhan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhanXuong() {
        return phanXuong;
    }

    public void setPhanXuong(String phanXuong) {
        this.phanXuong = phanXuong;
    }

    public Date getNgayKhoiCong() {
        return ngayKhoiCong;
    }

    public void setNgayKhoiCong(Date ngayKhoiCong) {
        this.ngayKhoiCong = ngayKhoiCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayNghiCoPhep() {
        return soNgayNghiCoPhep;
    }

    public void setSoNgayNghiCoPhep(int soNgayNghiCoPhep) {
        this.soNgayNghiCoPhep = soNgayNghiCoPhep;
    }

    public int getSoNgayNghiKhongPhep() {
        return soNgayNghiKhongPhep;
    }

    public void setSoNgayNghiKhongPhep(int soNgayNghiKhongPhep) {
        this.soNgayNghiKhongPhep = soNgayNghiKhongPhep;
    }

    public int getTongSoLuongSanPham() {
        return tongSoLuongSanPham;
    }

    public void setTongSoLuongSanPham(int tongSoLuongSanPham) {
        this.tongSoLuongSanPham = tongSoLuongSanPham;
    }

    public double getTongTienSanPham() {
        return tongTienSanPham;
    }

    public void setTongTienSanPham(double tongTienSanPham) {
        this.tongTienSanPham = tongTienSanPham;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public String getDonViChamCong() {
        return donViChamCong;
    }

    public void setDonViChamCong(String donViChamCong) {
        this.donViChamCong = donViChamCong;
    }

    public double getPhiPhatSinh() {
        return phiPhatSinh;
    }

    public void setPhiPhatSinh(double phiPhatSinh) {
        this.phiPhatSinh = phiPhatSinh;
    }

    public Date getNgayInPhieuLuong() {
        return ngayInPhieuLuong;
    }

    public void setNgayInPhieuLuong(Date ngayInPhieuLuong) {
        this.ngayInPhieuLuong = ngayInPhieuLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public PhieuLuongCongNhan() {
    }

    public PhieuLuongCongNhan(String maPhieuLuong, int thangLuong, String maCongNhan, String hoTen, String phanXuong, Date ngayKhoiCong, int soNgayCong, int soNgayNghiCoPhep, int soNgayNghiKhongPhep, int tongSoLuongSanPham, double tongTienSanPham, double phuCap, String donViChamCong, double phiPhatSinh, Date ngayInPhieuLuong, double tongTien) {
        this.maPhieuLuong = maPhieuLuong;
        this.thangLuong = thangLuong;
        this.maCongNhan = maCongNhan;
        this.hoTen = hoTen;
        this.phanXuong = phanXuong;
        this.ngayKhoiCong = ngayKhoiCong;
        this.soNgayCong = soNgayCong;
        this.soNgayNghiCoPhep = soNgayNghiCoPhep;
        this.soNgayNghiKhongPhep = soNgayNghiKhongPhep;
        this.tongSoLuongSanPham = tongSoLuongSanPham;
        this.tongTienSanPham = tongTienSanPham;
        this.phuCap = phuCap;
        this.donViChamCong = donViChamCong;
        this.phiPhatSinh = phiPhatSinh;
        this.ngayInPhieuLuong = ngayInPhieuLuong;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuLuongCongNhan{" + "maPhieuLuong=" + maPhieuLuong + ", thangLuong=" + thangLuong + ", maCongNhan=" + maCongNhan + ", hoTen=" + hoTen + ", phanXuong=" + phanXuong + ", ngayKhoiCong=" + ngayKhoiCong + ", soNgayCong=" + soNgayCong + ", soNgayNghiCoPhep=" + soNgayNghiCoPhep + ", soNgayNghiKhongPhep=" + soNgayNghiKhongPhep + ", tongSoLuongSanPham=" + tongSoLuongSanPham + ", tongTienSanPham=" + tongTienSanPham + ", phuCap=" + phuCap + ", donViChamCong=" + donViChamCong + ", phiPhatSinh=" + phiPhatSinh + ", ngayInPhieuLuong=" + ngayInPhieuLuong + ", tongTien=" + tongTien + '}';
    }
    
}
