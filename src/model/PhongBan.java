package model;

/**
 * 1. Zo là demo Chức năng xử lý chính 2. Demo tính năng tính lương 3. Thêm xóa
 * sửa là phụ 4. Chức năng thống kê có thể tạm hoãn, nếu chắn hết mấy phần kia
 * 5. Full frame tự động khi chạy 6. Hiển thị thông tin NQLL khi login vào page
 * MenuRoot 7. Mỗi frame chỉ thực hiện 1 chức năng 8. Phông chữ to rõ, 9. Phần
 * nhập thông tin thêm xóa sữa dùng combo box
 *
 * Tối nay: - làm lại script - thiết kế class
 */
public class PhongBan {
    private int maPhongBan;
    private String tenPhongBan;
    private String viTri;
    private int soLuongNhanVien;
    private String tenNguoiDaiDien;
    private String nghiepVu;
    /**
     *
     * @Getter and Setter PhongBan
     */
    public int getMaPhongBan() {
        return maPhongBan;
    }
    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }
    public String getTenPhongBan() {
        return tenPhongBan;
    }
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }
    public String getTenNguoiDaiDien() {
        return tenNguoiDaiDien;
    }
    public void setTenNguoiDaiDien(String tenNguoiDaiDien) {
        this.tenNguoiDaiDien = tenNguoiDaiDien;
    }
    public String getNghiepVu() {
        return nghiepVu;
    }
    public void setNghiepVu(String nghiepVu) {
        this.nghiepVu = nghiepVu;
    }
    /**
     * @Constructor hàm tạo PhongBan
     */
    public PhongBan() {
    }
    public PhongBan(int maPhongBan, String tenPhongBan, String viTri, int soLuongNhanVien, String tenNguoiDaiDien, String nghiepVu) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.viTri = viTri;
        this.soLuongNhanVien = soLuongNhanVien;
        this.tenNguoiDaiDien = tenNguoiDaiDien;
        this.nghiepVu = nghiepVu;
    }
    /**
     *
     * @toString PhongBan
     */
    @Override
    public String toString() {
        return "PhongBan{" + "maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", viTri=" + viTri + ", soLuongNhanVien=" + soLuongNhanVien + ", tenNguoiDaiDien=" + tenNguoiDaiDien + ", nghiepVu=" + nghiepVu + '}';
    }
    /**
     *
     * @Hascode equal PhongBan
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.maPhongBan;
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
        final PhongBan other = (PhongBan) obj;
        if (this.maPhongBan != other.maPhongBan) {
            return false;
        }
        return true;
    }
}
