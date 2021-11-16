/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author taiproduaxe
 */
public class CongDoan {
    private String maCongDoan;
    private String tenCongDoan;
    private String maSanPham;
    private Date thoiGianHoatDong;
    private int soLuongSanPham;
    public String getMaCongDoan() {
        return maCongDoan;
    }
    public void setMaCongDoan(String maCongDoan) {
        this.maCongDoan = maCongDoan;
    }
    public String getTenCongDoan() {
        return tenCongDoan;
    }
    public void setTenCongDoan(String tenCongDoan) {
        this.tenCongDoan = tenCongDoan;
    }
    public String getMaSanPham() {
        return maSanPham;
    }
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    public Date getThoiGianHoatDong() {
        return thoiGianHoatDong;
    }
    public void setThoiGianHoatDong(Date thoiGianHoatDong) {
        this.thoiGianHoatDong = thoiGianHoatDong;
    }
    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }
    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }
    public CongDoan() {
    }
    public CongDoan(String maCongDoan, String tenCongDoan, String maSanPham, Date thoiGianHoatDong, int soLuongSanPham) {
        this.maCongDoan = maCongDoan;
        this.tenCongDoan = tenCongDoan;
        this.maSanPham = maSanPham;
        this.thoiGianHoatDong = thoiGianHoatDong;
        this.soLuongSanPham = soLuongSanPham;
    }

    @Override
    public String toString() {
        return "CongDoan{" + "maCongDoan=" + maCongDoan + ", tenCongDoan=" + tenCongDoan + ", maSanPham=" + maSanPham + ", thoiGianHoatDong=" + thoiGianHoatDong + ", soLuongSanPham=" + soLuongSanPham + '}';
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.maCongDoan);
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
        final CongDoan other = (CongDoan) obj;
        if (!Objects.equals(this.maCongDoan, other.maCongDoan)) {
            return false;
        }
        return true;
    }
}
