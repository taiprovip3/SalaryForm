package model;

import java.util.Date;
import java.util.Objects;

public class DonXinNghi {

    private String maDonNghi;
    private String maNhanVien;
    private String tenNhanVien;
    private boolean loaiNhanVien;
    private String lyDo;
    private Date ngayNghi;
    private int soNgayXinNghi;
    private boolean loaiNghi;

    public String getMaDonNghi() {
        return maDonNghi;
    }

    public void setMaDonNghi(String maDonNghi) {
        this.maDonNghi = maDonNghi;
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

    public boolean isLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(boolean loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public Date getNgayNghi() {
        return ngayNghi;
    }

    public void setNgayNghi(Date ngayNghi) {
        this.ngayNghi = ngayNghi;
    }

    public int getSoNgayXinNghi() {
        return soNgayXinNghi;
    }

    public void setSoNgayXinNghi(int soNgayXinNghi) {
        this.soNgayXinNghi = soNgayXinNghi;
    }

    public boolean isLoaiNghi() {
        return loaiNghi;
    }
    
    public void setLoaiNghi(boolean loaiNghi) {    
        this.loaiNghi = loaiNghi;
    }

    public DonXinNghi() {
    }

    public DonXinNghi(String maDonNghi, String maNhanVien, String tenNhanVien, boolean loaiNhanVien, String lyDo, Date ngayNghi, int soNgayXinNghi, boolean loaiNghi) {
        this.maDonNghi = maDonNghi;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.loaiNhanVien = loaiNhanVien;
        this.lyDo = lyDo;
        this.ngayNghi = ngayNghi;
        this.soNgayXinNghi = soNgayXinNghi;
        this.loaiNghi = loaiNghi;
    }

    @Override
    public String toString() {
        return "DonXinNghi{" + "maDonNghi=" + maDonNghi + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", loaiNhanVien=" + loaiNhanVien + ", lyDo=" + lyDo + ", ngayNghi=" + ngayNghi + ", soNgayXinNghi=" + soNgayXinNghi + ", loaiNghi=" + loaiNghi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.maDonNghi);
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
        final DonXinNghi other = (DonXinNghi) obj;
        if (!Objects.equals(this.maDonNghi, other.maDonNghi)) {
            return false;
        }
        return true;
    }
    
}
