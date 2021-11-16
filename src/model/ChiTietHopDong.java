package model;
public class ChiTietHopDong {
    private String maHopDong;
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private String yeuCau;
/**
 * 
 * @Getter va setter ChiTietHopDong
 */
    public String getMaHopDong() {
        return maHopDong;
    }
    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }
/**
 * Hàm tạo ChiTietHopDong
 */
    public ChiTietHopDong() {
    }

    public ChiTietHopDong(String maHopDong, String maSanPham, String tenSanPham, int soLuong, String yeuCau) {
        this.maHopDong = maHopDong;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.yeuCau = yeuCau;
    }
/**
 * 
 * @Hàm toString ChiTietHopDong
 */
    @Override
    public String toString() {
        return "ChiTietHopDong{" + "maHopDong=" + maHopDong + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", yeuCau=" + yeuCau + '}';
    }
    
}
