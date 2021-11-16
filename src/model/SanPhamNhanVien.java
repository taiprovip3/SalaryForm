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
public class SanPhamNhanVien {
    private String maNhanVien;
    private int soGioTangCa;
    private int loaiTangCa;
    private Date ngayCong;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(int soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    public int getLoaiTangCa() {
        return loaiTangCa;
    }

    public void setLoaiTangCa(int loaiTangCa) {
        this.loaiTangCa = loaiTangCa;
    }

    public Date getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(Date ngayCong) {
        this.ngayCong = ngayCong;
    }

    public SanPhamNhanVien() {
    }

    public SanPhamNhanVien(String maNhanVien, int soGioTangCa, int loaiTangCa, Date ngayCong) {
        this.maNhanVien = maNhanVien;
        this.soGioTangCa = soGioTangCa;
        this.loaiTangCa = loaiTangCa;
        this.ngayCong = ngayCong;
    }

    @Override
    public String toString() {
        return "SanPhamNhanVien{" + "maNhanVien=" + maNhanVien + ", soGioTangCa=" + soGioTangCa + ", loaiTangCa=" + loaiTangCa + ", ngayCong=" + ngayCong + '}';
    }
    
}
