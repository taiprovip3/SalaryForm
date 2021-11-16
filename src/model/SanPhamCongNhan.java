package model;

import java.util.Date;

public class SanPhamCongNhan {
    private String maCongNhan;
    private Date ngayLamViec;
    private String maCongDoan;
    private int soLuongSanPham;
    private double donGia;

    public String getMaCongNhan() {
        return maCongNhan;
    }

    public void setMaCongNhan(String maCongNhan) {
        this.maCongNhan = maCongNhan;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
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

    public SanPhamCongNhan() {
    }

    public SanPhamCongNhan(String maCongNhan, Date ngayLamViec, String maCongDoan, int soLuongSanPham, double donGia) {
        this.maCongNhan = maCongNhan;
        this.ngayLamViec = ngayLamViec;
        this.maCongDoan = maCongDoan;
        this.soLuongSanPham = soLuongSanPham;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPhamCongNhan{" + "maCongNhan=" + maCongNhan + ", ngayLamViec=" + ngayLamViec + ", maCongDoan=" + maCongDoan + ", soLuongSanPham=" + soLuongSanPham + ", donGia=" + donGia + '}';
    }
    
}
