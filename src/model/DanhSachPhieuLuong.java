package model;

import java.util.Date;

public class DanhSachPhieuLuong {
    private String maPhieuLuong;
     private int thangLuong;
     private double luongDaTra;
     private Date ngayLuu;

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

    public double getLuongDaTra() {
        return luongDaTra;
    }

    public void setLuongDaTra(double luongDaTra) {
        this.luongDaTra = luongDaTra;
    }

    public Date getNgayLuu() {
        return ngayLuu;
    }

    public void setNgayLuu(Date ngayLuu) {
        this.ngayLuu = ngayLuu;
    }

    public DanhSachPhieuLuong() {
    }

    public DanhSachPhieuLuong(String maPhieuLuong, int thangLuong, double luongDaTra, Date ngayLuu) {
        this.maPhieuLuong = maPhieuLuong;
        this.thangLuong = thangLuong;
        this.luongDaTra = luongDaTra;
        this.ngayLuu = ngayLuu;
    }

    @Override
    public String toString() {
        return "DanhSachPhieuLuong{" + "maPhieuLuong=" + maPhieuLuong + ", thangLuong=" + thangLuong + ", luongDaTra=" + luongDaTra + ", ngayLuu=" + ngayLuu + '}';
    }
     
}
