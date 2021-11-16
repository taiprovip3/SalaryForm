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
public class CongNhan {
    private String maCongNhan;
    private String tenCongNhan;
    private int namSinh;
    private boolean gioiTinh;
    private Date ngayKhoiCong;
    private String soDienThoai;
    private String maPhanXuong;

    public String getMaCongNhan() {
        return maCongNhan;
    }

    public void setMaCongNhan(String maCongNhan) {
        this.maCongNhan = maCongNhan;
    }

    public String getTenCongNhan() {
        return tenCongNhan;
    }

    public void setTenCongNhan(String tenCongNhan) {
        this.tenCongNhan = tenCongNhan;
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

    public String getMaPhanXuong() {
        return maPhanXuong;
    }

    public void setMaPhanXuong(String maPhanXuong) {
        this.maPhanXuong = maPhanXuong;
    }

    public CongNhan() {
    }

    public CongNhan(String maCongNhan, String tenCongNhan, int namSinh, boolean gioiTinh, Date ngayKhoiCong, String soDienThoai, String maPhanXuong) {
        this.maCongNhan = maCongNhan;
        this.tenCongNhan = tenCongNhan;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.ngayKhoiCong = ngayKhoiCong;
        this.soDienThoai = soDienThoai;
        this.maPhanXuong = maPhanXuong;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "maCongNhan=" + maCongNhan + ", tenCongNhan=" + tenCongNhan + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", ngayKhoiCong=" + ngayKhoiCong + ", soDienThoai=" + soDienThoai + ", maPhanXuong=" + maPhanXuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.maCongNhan);
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
        final CongNhan other = (CongNhan) obj;
        if (!Objects.equals(this.maCongNhan, other.maCongNhan)) {
            return false;
        }
        return true;
    }
}
