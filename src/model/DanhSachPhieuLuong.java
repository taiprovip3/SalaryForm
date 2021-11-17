package model;

import java.util.Date;
import java.util.Objects;

public class DanhSachPhieuLuong {
    private String maPhieuLuong;
     private int thangLuong;
     private double luongDaTra;
     private Date ngayLuu;
     private String loaiPhieuLuong;

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

    public String getLoaiPhieuLuong() {
        return loaiPhieuLuong;
    }

    public void setLoaiPhieuLuong(String loaiPhieuLuong) {
        this.loaiPhieuLuong = loaiPhieuLuong;
    }

    public DanhSachPhieuLuong() {
    }

    public DanhSachPhieuLuong(String maPhieuLuong, int thangLuong, double luongDaTra, Date ngayLuu, String loaiPhieuLuong) {
        this.maPhieuLuong = maPhieuLuong;
        this.thangLuong = thangLuong;
        this.luongDaTra = luongDaTra;
        this.ngayLuu = ngayLuu;
        this.loaiPhieuLuong = loaiPhieuLuong;
    }

    @Override
    public String toString() {
        return "DanhSachPhieuLuong{" + "maPhieuLuong=" + maPhieuLuong + ", thangLuong=" + thangLuong + ", luongDaTra=" + luongDaTra + ", ngayLuu=" + ngayLuu + ", loaiPhieuLuong=" + loaiPhieuLuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maPhieuLuong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DanhSachPhieuLuong other = (DanhSachPhieuLuong) obj;
        if (!Objects.equals(this.maPhieuLuong, other.maPhieuLuong)) {
            return false;
        }
        return true;
    }


     
}
