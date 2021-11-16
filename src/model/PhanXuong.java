package model;

public class PhanXuong {
    private int maPhanXuong;
    private String tenPhanXuong;
    private String tenNguoiDaiDien;
    private String maCongDoan;
    private String viTri;
    private int soLuongCongNhan;
    /**
     *
     * @getter va setter PhanXuong
     */
    public int getMaPhanXuong() {
        return maPhanXuong;
    }
    public void setMaPhanXuong(int maPhanXuong) {
        this.maPhanXuong = maPhanXuong;
    }
    public String getTenPhanXuong() {
        return tenPhanXuong;
    }
    public void setTenPhanXuong(String tenPhanXuong) {
        this.tenPhanXuong = tenPhanXuong;
    }
    public String getTenNguoiDaiDien() {
        return tenNguoiDaiDien;
    }
    public void setTenNguoiDaiDien(String tenNguoiDaiDien) {
        this.tenNguoiDaiDien = tenNguoiDaiDien;
    }
    public String getMaCongDoan() {
        return maCongDoan;
    }
    public void setMaCongDoan(String maCongDoan) {
        this.maCongDoan = maCongDoan;
    }
    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public int getSoLuongCongNhan() {
        return soLuongCongNhan;
    }
    public void setSoLuongCongNhan(int soLuongCongNhan) {
        this.soLuongCongNhan = soLuongCongNhan;
    }
    /**
     * Ham tao PhanXuong
     */
    public PhanXuong() {
    }
    public PhanXuong(int maPhanXuong, String tenPhanXuong, String tenNguoiDaiDien, String maCongDoan, String viTri, int soLuongCongNhan) {
        this.maPhanXuong = maPhanXuong;
        this.tenPhanXuong = tenPhanXuong;
        this.tenNguoiDaiDien = tenNguoiDaiDien;
        this.maCongDoan = maCongDoan;
        this.viTri = viTri;
        this.soLuongCongNhan = soLuongCongNhan;
    }
    /**
     *
     * @toString PhanXuong
     */
    @Override
    public String toString() {
        return "PhanXuong{" + "maPhanXuong=" + maPhanXuong + ", tenPhanXuong=" + tenPhanXuong + ", tenNguoiDaiDien=" + tenNguoiDaiDien + ", maCongDoan=" + maCongDoan + ", viTri=" + viTri + ", soLuongCongNhan=" + soLuongCongNhan + '}';
    }
    /**
     *
     * @Hashcode equal PhanXuong
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.maPhanXuong;
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
        final PhanXuong other = (PhanXuong) obj;
        if (this.maPhanXuong != other.maPhanXuong) {
            return false;
        }
        return true;
    }
}
