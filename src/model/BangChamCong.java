package model;
import java.util.Date;
import java.util.Objects;
public class BangChamCong {
    private String maBangChamCong;
    private Date thoiGian;
    private String maPhanXuong;
    /**
     *
     * @getter va setter BangChamCong
     */
    public String getMaBangChamCong() {
        return maBangChamCong;
    }
    public void setMaBangChamCong(String maBangChamCong) {
        this.maBangChamCong = maBangChamCong;
    }
    public Date getThoiGian() {
        return thoiGian;
    }
    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
    public String getMaPhanXuong() {
        return maPhanXuong;
    }
    public void setMaPhanXuong(String maPhanXuong) {
        this.maPhanXuong = maPhanXuong;
    }
    /**
     *
     * @ham tao BangChamCong
     */
    public BangChamCong() {
    }
    public BangChamCong(String maBangChamCong, Date thoiGian, String maPhanXuong) {
        this.maBangChamCong = maBangChamCong;
        this.thoiGian = thoiGian;
        this.maPhanXuong = maPhanXuong;
    }
    /**
     *
     * @ToString BangChamCong
     */
    @Override
    public String toString() {
        return "BangChamCong{" + "maBangChamCong=" + maBangChamCong + ", thoiGian=" + thoiGian + ", maPhanXuong=" + maPhanXuong + '}';
    }
    /**
     *
     * @hashcode equal BangChamCong
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.maBangChamCong);
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
        final BangChamCong other = (BangChamCong) obj;
        if (!Objects.equals(this.maBangChamCong, other.maBangChamCong)) {
            return false;
        }
        return true;
    }
}
