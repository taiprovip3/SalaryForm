package model;

import java.util.Date;

public class PhieuLuongNhanVien {
    private String maPhieuLuong;
    private int thangLuong;
    private String maNhanVien;
    private String tenNhanVien;
    private String phongBan;
    private int soNgayCong;
    private int soNgayNghiCoPhep;
    private int soNgayNghiKhongPhep;
    private float soGioTangCa;
    private double tongTienTangCa;
    private double phuCap;
    private String donViChamCong;
    private double chiPhiPhatSinh;
    private Date ngayInPhieuLuong;
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

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
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

    public float getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(float soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    public double getTongTienTangCa() {
        return tongTienTangCa;
    }

    public void setTongTienTangCa(double tongTienTangCa) {
        this.tongTienTangCa = tongTienTangCa;
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

    public double getChiPhiPhatSinh() {
        return chiPhiPhatSinh;
    }

    public void setChiPhiPhatSinh(double choPhiPhatSinh) {
        this.chiPhiPhatSinh = choPhiPhatSinh;
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

    public PhieuLuongNhanVien() {
    }

    public PhieuLuongNhanVien(String maPhieuLuong, int thangLuong, String maNhanVien, String tenNhanVien, String phongBan, int soNgayCong, int soNgayNghiCoPhep, int soNgayNghiKhongPhep, float soGioTangCa, double tongTienTangCa, double phuCap, String donViChamCong, double choPhiPhatSinh, Date ngayInPhieuLuong, double tongTien) {
        this.maPhieuLuong = maPhieuLuong;
        this.thangLuong = thangLuong;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.phongBan = phongBan;
        this.soNgayCong = soNgayCong;
        this.soNgayNghiCoPhep = soNgayNghiCoPhep;
        this.soNgayNghiKhongPhep = soNgayNghiKhongPhep;
        this.soGioTangCa = soGioTangCa;
        this.tongTienTangCa = tongTienTangCa;
        this.phuCap = phuCap;
        this.donViChamCong = donViChamCong;
        this.chiPhiPhatSinh = choPhiPhatSinh;
        this.ngayInPhieuLuong = ngayInPhieuLuong;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuLuongNhanVien{" + "maPhieuLuong=" + maPhieuLuong + ", thangLuong=" + thangLuong + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", phongBan=" + phongBan + ", soNgayCong=" + soNgayCong + ", soNgayNghiCoPhep=" + soNgayNghiCoPhep + ", soNgayNghiKhongPhep=" + soNgayNghiKhongPhep + ", soGioTangCa=" + soGioTangCa + ", tongTienTangCa=" + tongTienTangCa + ", phuCap=" + phuCap + ", donViChamCong=" + donViChamCong + ", choPhiPhatSinh=" + chiPhiPhatSinh + ", ngayInPhieuLuong=" + ngayInPhieuLuong + ", tongTien=" + tongTien + '}';
    }
}
