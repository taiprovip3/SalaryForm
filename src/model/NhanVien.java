package model;

import java.util.Date;
import java.util.Objects;

public class NhanVien {

    private String maNhanVien;
    private String tenNhanVien;
    private int namSinh;
    private boolean gioiTinh;
    private Date ngayKhoiCong;
    private String soDienThoai;
    private String maPhongBan;

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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgayKhoiCong() {
        return ngayKhoiCong;
    }

    public void setNgayKhoiCong(Date ngayKhoiCong) {
        this.ngayKhoiCong = ngayKhoiCong;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, int namSinh, boolean gioiTinh, Date ngayKhoiCong, String soDienThoai, String maPhongBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.ngayKhoiCong = ngayKhoiCong;
        this.soDienThoai = soDienThoai;
        this.maPhongBan = maPhongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", ngayKhoiCong=" + ngayKhoiCong + ", soDienThoai=" + soDienThoai + ", maPhongBan=" + maPhongBan + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.maNhanVien);
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
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.maNhanVien, other.maNhanVien)) {
            return false;
        }
        return true;
    }


}
