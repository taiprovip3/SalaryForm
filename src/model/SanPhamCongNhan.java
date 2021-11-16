package model;

import java.util.Date;

public class SanPhamCongNhan {
    private String maCongNhan;
    private String maCongDoan;
    private int soLuongSanPham;
    private double donGia;
    private Date ngayCong;

    public String getMaCongNhan() {
        return maCongNhan;
    }

    public void setMaCongNhan(String maCongNhan) {
        this.maCongNhan = maCongNhan;
    }

    public String getMaCongDoan() {
        return maCongDoan;
    }

    public void setMaCongDoan(String maCongDoan) {
        this.maCongDoan = maCongDoan;
    }

    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(Date ngayCong) {
        this.ngayCong = ngayCong;
    }

    public SanPhamCongNhan() {
    }

    public SanPhamCongNhan(String maCongNhan, String maCongDoan, int soLuongSanPham, double donGia, Date ngayCong) {
        this.maCongNhan = maCongNhan;
        this.maCongDoan = maCongDoan;
        this.soLuongSanPham = soLuongSanPham;
        this.donGia = donGia;
        this.ngayCong = ngayCong;
    }

    @Override
    public String toString() {
        return "SanPhamCongNhan{" + "maCongNhan=" + maCongNhan + ", maCongDoan=" + maCongDoan + ", soLuongSanPham=" + soLuongSanPham + ", donGia=" + donGia + ", ngayCong=" + ngayCong + '}';
    }
    
}
