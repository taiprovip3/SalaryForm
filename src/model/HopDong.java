package model;

import java.util.Date;
import java.util.Objects;

public class HopDong {
    private String maHopDong;
    private String tenDoiTac;
    private Date ngayKy;
    private double tienDatCoc;
    private double tienTra;
    private Date ngayGiaoHang;
    private String diaChiGiaoHang;
    private String maPhongBan;

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getTenDoiTac() {
        return tenDoiTac;
    }

    public void setTenDoiTac(String tenDoiTac) {
        this.tenDoiTac = tenDoiTac;
    }

    public Date getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(Date ngayKy) {
        this.ngayKy = ngayKy;
    }

    public double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public double getTienTra() {
        return tienTra;
    }

    public void setTienTra(double tienTra) {
        this.tienTra = tienTra;
    }

    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public HopDong() {
    }

    public HopDong(String maHopDong, String tenDoiTac, Date ngayKy, double tienDatCoc, double tienTra, Date ngayGiaoHang, String diaChiGiaoHang, String maPhongBan) {
        this.maHopDong = maHopDong;
        this.tenDoiTac = tenDoiTac;
        this.ngayKy = ngayKy;
        this.tienDatCoc = tienDatCoc;
        this.tienTra = tienTra;
        this.ngayGiaoHang = ngayGiaoHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.maPhongBan = maPhongBan;
    }

    @Override
    public String toString() {
        return "HopDong{" + "maHopDong=" + maHopDong + ", tenDoiTac=" + tenDoiTac + ", ngayKy=" + ngayKy + ", tienDatCoc=" + tienDatCoc + ", tienTra=" + tienTra + ", ngayGiaoHang=" + ngayGiaoHang + ", diaChiGiaoHang=" + diaChiGiaoHang + ", maPhongBan=" + maPhongBan + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.maHopDong);
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
        final HopDong other = (HopDong) obj;
        if (!Objects.equals(this.maHopDong, other.maHopDong)) {
            return false;
        }
        return true;
    }
}
